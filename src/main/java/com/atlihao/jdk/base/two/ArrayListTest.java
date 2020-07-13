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


    /**
     * 2、测试例子2：1 有一个 ArrayList，数据是 2、3、3、3、4，中间有三个 3，现在我通过下面代码的方式，想把值是3的元素删除
     *   结果：不能删除干净，最终删除的结果是 2、3、4，有一个 3 删除不掉。
     *   原因：每次删除一个元素后，该元素后面的元素就会往前移动，而此时循环的i在不断地增长，最终会使每次删除3的后一个3被遗漏，导致删除不掉
     */
    @Test
    public void testRemove(){
        List<String> list = new ArrayList<String>() {{
            add("2");
            add("3");
            add("3");
            add("3");
            add("4");
        }};
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("3")) {
                list.remove(i);
            }
        }
        log.info("test remove result:{}",list);
    }
}
