package com.atlihao.jdk.base.one.keywords;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lihao
 * @ClassName StaticTest
 * @Since 2020/2/1
 * @Description static关键字的测试代码
 */
@Slf4j
public class StaticTest {

    public static List<String> list = new ArrayList();

    // 1、测试用例1： static代码块进行一些初始化的工作
    static {
        list.add("1");
    }

    /**
     * 1、测试例子1： static代码块的测试方法
     */
    @Test
    public void testStatic1(){
        log.info("list:{}",list);
    }
}
