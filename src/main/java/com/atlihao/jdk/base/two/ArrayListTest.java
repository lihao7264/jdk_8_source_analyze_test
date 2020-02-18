package com.atlihao.jdk.base.two;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lihao
 * @ClassName ArrayListTest
 * @Since 2020/2/16
 * @Description ArrayList的测试例子
 */
@Slf4j
public class ArrayListTest {

    /**
     * 1、测试例子1：测试ArrayList在指定初始数据初始化时，看注释 see 6260652(这是 Java 的一个 bug)
     * a、意思是当给定集合内的元素不是 Object 类型时，我们会转化成 Object 的类型。
     * b、BUG复现的情况：
     * 一般情况下都不会触发此 bug，只有在下列场景下才会触发：ArrayList 初始化之后（ArrayList 元素非 Object 类型），再次调用 toArray 方法，得到 Object 数组，并且往 Object 数组赋值时，才会触发此 bug
     * c、代码如下
     * d、原因:因为ArrayList中的数据是具体类型的不是Object类型，
     * jvm不清楚你存储的Object真实类型是不是该类型。
     * e、官网地址：https://bugs.java.com/bugdatabase/view_bug.do?bug_id=6260652
     */
    @Test
    public void testBugFor6260652() {
        //Arrays.asList返回的是具体的类型
        List<String> list = Arrays.asList("hello,world");
        Object[] objArray = list.toArray();
        log.info(objArray.getClass().getSimpleName());
        // objArray元素的类型是String，存储Object就会报错
        // 因为jvm不清楚你存储的Object真实类型是不是String
        objArray[0] = new Object();
    }
}
