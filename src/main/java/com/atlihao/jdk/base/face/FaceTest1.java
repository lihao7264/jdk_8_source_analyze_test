package com.atlihao.jdk.base.face;

import org.junit.Test;

/**
 * @author lihao
 * @ClassName FaceTest1
 * @Since 2020/7/13
 * @Description 游侠客面试题
 */
public class FaceTest1 {

    /**
     * 游侠客笔试题--- Integer、int判断
     * 参考地址：https://blog.csdn.net/Design407/article/details/100068046
     */
    @Test
    public void testInt() {
        // 在编译时，会翻译成为 Integer i1 = Integer.valueOf(2)
        Integer i1 = 2;
        Integer i2 = 2;
        Integer i3 = new Integer(2);
        Integer i4 = new Integer(2);
        int i5 = 2;

        // Integer变量 指向的是 java 常量池 中的对象
        // 两个Integer 变量比较，如果两个变量的值在区间-128到127 之间，则比较结果为true，
        // 如果两个变量的值不在此区间，则比较结果为 false 。
        // java对于-128到127之间的数，会进行缓存。
        System.out.println(i1 == i2);  //true

        // Integer变量 指向的是 java 常量池 中的对象，
        // 而 new Integer() 的变量指向 堆中 新建的对象，两者在内存中的地址不同。
        System.out.println(i1 == i3);  //false

        // 包装类Integer 和 基本数据类型int 比较时，java会自动拆包装为int ，
        // 然后进行比较，实际上就变为两个int变量的比较。
        System.out.println(i1 == i5);  //true

        // 比较堆内存地址
        System.out.println(i3 == i4);  //false

        // 包装类Integer 和 基本数据类型int 比较时，java会自动拆包装为int ，
        // 然后进行比较，实际上就变为两个int变量的比较。
        System.out.println(i3 == i5);  //true
    }

    /**
     * 游侠客笔试题--- String判断
     * 参考地址：https://www.cnblogs.com/aspirant/p/9193112.html
     *          https://blog.csdn.net/u011803341/article/details/79814918
     * 常量池:指的是在编译期确定，并被保存在已编译的字节码文件中的一些数据，
     * 它包括类、方法、接口等中的常量，存放字符串常量和基本类型常量（public static final）。
     * 栈（stack:主要保存基本数据类型（或者叫内置类型）（char、byte、short、int、long、float、double、boolean）和对象的引用，
     * 数据可以共享，速度仅次于寄存器（register），快于堆。
     * 堆（heap）：用于存储对象
     * ==：引用是否指向同一个对象
     * equals（）：比较里面的数值是否相等时
     */
    @Test
    public void testString() {
        String s1 = "test1test2";
        String s2 = new String("test1test2");
        String s3 = "test1" + "test2";
        String s4 = "test1test2";
        // 编译时，String s1="test1test2" 会把"test1test2"放到常量池中，再定义s4时，因为常量池中已存在"test1test2"，
        // 所以不会再创建，运行时JVM(JAVA虚拟机)则认为这两个变量赋的是同一个对象，所以返回true。
        System.out.println(s1 == s4);//true

        // 编译过程会把字符串"test1test2"放到在常量池中。
        // 用构造器创建的对象，是生成不同的对象。每new一次JVM就会在堆中创建一个对象。String s1,s2只是内容相同罢了。
        // 用equals()或者System.out.print(a.intern()==b.intern());就返回true了。
        // (intern() 方法返回字符串对象的规范化表示形式)
        // new String("test1test2")是根据"test1test2"这个String对象再次构造一个String对象;在堆中从新new一块儿内存，把指针赋给栈。
        // new String("test1test2")会创建2（1）个对象  --- 堆和常量池中
        // "hello"创建1（0）个对象  --- 常量池中
        System.out.println(s1 == s2);  //false

        // 而intern中说的”如果有的话就直接返回其引用“，指的是会把字面量对象的引用直接返回给定义的对象。这个过程是不会在 Java 堆中再创建一个 String 对象的。
        // intern()是把堆中的引用丢入常量池中，然后返回这个引用。当常量池中已经存在这个引用，就直接返回这个引用。
        System.out.println(s1 == s2.intern());  //true

        // 字符串如果是常量相加，是先加，然后在常量池找，如果有就直接返回，否则，就创建。
        System.out.println(s1 == s3);  //true
        System.out.println(s3 == s2);  //false
    }

    /**
     * 游侠客笔试题--- Double和Float判断
     */
    @Test
    public void testDoubleAndFloat() {
        Double d = 2.44d;
        Float f = 2.44f;
        System.out.println(d.floatValue() == f);  //向上转型   true
        System.out.println(d == f.doubleValue()); //向下转型   false
    }

    /**
     * 游侠客笔试题--- short判断
     * 会编译报错,精度的问题,得转int
     */
    @Test
    public void testShort() {
        short s1 = 2;
//        s1 = s1 + s1;
    }
}
