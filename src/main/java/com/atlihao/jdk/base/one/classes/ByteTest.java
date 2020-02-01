package com.atlihao.jdk.base.one.classes;

/**
 * @author lihao
 * @ClassName ByteTest
 * @Since 2020/2/1
 * @Description Byte类的测试代码
 */
public class ByteTest {

    /**
     * 1、测试例子1：Byte类转换字节
     *  Byte类的parseByte方法
     * @param args
     */
//    public static void main(String[] args){
//        //表示十进制的-100，所以值为-100
//        byte a = Byte.parseByte("-100", 10);
//        System.out.println(a);
//
//        //表示二进制的+100，所以值为4
//        byte b = Byte.parseByte("+100", 2);
//        System.out.println(b);
//
//        //十进制的1000不在-128到127的范围内，则会抛出java.lang.NumberFormatException异常。
//        byte c = Byte.parseByte("1000", 10);
//        System.out.println(c);
//    }

    /**
     * 2、测试例子2：Byte类解码字符串
     *  Byte类的decode方法
     * @param args
     */
    public static void main(String[] args){
        //十进制
        Byte e = Byte.decode("10");
        System.out.println(e);
        //十六进制
        Byte a = Byte.decode("0x10");
        System.out.println(a);
        //十六进制
        Byte b = Byte.decode("0X10");
        System.out.println(b);
        //十六进制
        Byte c = Byte.decode("#10");
        System.out.println(c);
        //八进制
        Byte d = Byte.decode("010");
        System.out.println(d);
    }
}
