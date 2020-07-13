package com.atlihao.jdk.base.three;

import java.net.URL;

/**
 * @author lihao
 * @ClassName ClassLoaderTest
 * @Since 2020/7/12
 * @Description ClassLoader测试类
 * 三个获取项目文件资源方法
 */
public class ClassLoaderTest {

    /**
     * 1. class的getResource不加"/"，会从class这个类所在的路径开始往下搜索资源，如果加上"/",会从工程的根目录，也就是截图里的target/classes这个路径下开始搜索资源
     * 2. classloader的getResource不加"/"，会从工程的根目录，也就是截图里的target/classes这个路径下开始搜索资源，如果加上"/"，就会返回null。
     * 3. classLoader的getSystemResource方法类似于classLoader的方法，相当于使用系统的classLoader然后调用getResource。

     * @param clazz
     * @param classLoader
     * @param path
     * @return
     */
    public static URL getResource(Class clazz, ClassLoader classLoader, String path) {
        if (clazz != null) {
            return clazz.getResource(path);
        } else if (classLoader != null) {
            return classLoader.getResource(path);
        } else {
            return ClassLoader.getSystemResource(path);
        }
    }

    public static void main(String[] args){
        URL resource = getResource(null, ClassLoaderTest.class.getClassLoader(), "application.properties");
        System.out.println(resource);
    }
}
