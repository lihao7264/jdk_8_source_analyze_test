package com.atlihao.jdk.base.four;

import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

/**
 * @author lihao
 * @ClassName StringUtilsTest
 * @Since 2020/7/12
 * @Description
 */
public class StringUtilsTest {

    public static final String FACTORIES_RESOURCE_LOCATION = "META-INF/spring.factories";

    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = StringUtilsTest.class.getClassLoader();
        // 使用 classLoader 去加载了指定常量路径下的资源
        Enumeration<URL> urls = (classLoader != null ?
                // 利用classLoader读取资源
                classLoader.getResources(FACTORIES_RESOURCE_LOCATION) :
                // 利用系统的classLoader读取资源
                ClassLoader.getSystemResources(FACTORIES_RESOURCE_LOCATION));
        MultiValueMap<String, String> result = new LinkedMultiValueMap<>();
        // 遍历
        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            UrlResource resource = new UrlResource(url);
            // 加载资源
            Properties properties = PropertiesLoaderUtils.loadProperties(resource);
            // 遍历文件中的资源
            for (Map.Entry<?, ?> entry : properties.entrySet()) {
                // 取出前后空格
                String factoryClassName = ((String) entry.getKey()).trim();
                // 将配置值根据","进行拆分
                // 比如:"老李,老王"---->"老李"和"老王"两个字符串
                for (String factoryName : StringUtils.commaDelimitedListToStringArray((String) entry.getValue())) {
                    // 将对应的结果保存到结果中
                    result.add(factoryClassName, factoryName.trim());
                }
            }
        }
    }
}
