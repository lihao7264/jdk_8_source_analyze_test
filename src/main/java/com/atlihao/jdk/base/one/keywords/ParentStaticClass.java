package com.atlihao.jdk.base.one.keywords;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lihao
 * @ClassName ParentStaticClass
 * @Since 2020/2/1
 * @Description  static 修饰的类变量、方法块和静态方法的初始化时机中的测试代码的父类
 */
@Slf4j
public class ParentStaticClass {

    public static List<String> PARENT_LIST = new ArrayList(){{
        log.info("父类静态变量初始化");
    }};

    static {
        log.info("父类静态块初始化");
    }

    {
        log.info("父类代码块初始化");
    }

    public ParentStaticClass() {
        log.info("父类构造器初始化");
    }

    public static void testStatic() {
        log.info("父类静态方法被调用");
    }

    public final void testFinal(){

    }
}
