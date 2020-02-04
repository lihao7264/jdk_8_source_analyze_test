package com.atlihao.jdk.base.one.keywords;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lihao
 * @ClassName StaticClass
 * @Since 2020/2/1
 * @Description  static 修饰的类变量、方法块、和静态方法以及非代码块的初始化时机的测试代码
 */
@Slf4j
public class StaticClass extends ParentStaticClass{

    static {
        log.info("子类静态块初始化");
    }

    {
        log.info("子类代码块初始化");
    }

    public StaticClass() {
        log.info("子类构造器初始化");
    }

    public static void testStatic() {
        log.info("子类静态方法被调用");
    }


    public static void main(String[] args) {
        log.info("main 方法执行");
        new StaticClass();
    }

}
