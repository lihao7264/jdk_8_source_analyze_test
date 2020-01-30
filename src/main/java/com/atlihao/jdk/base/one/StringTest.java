package com.atlihao.jdk.base.one;

/**
 * @author lihao
 * @ClassName StringTest
 * @Since 2020/1/30
 * @Description String类的测试代码
 */
public class StringTest {

    /**
     * 1、测试例子1：String是不变性类示例
     *  解析：
     *   a、从代码上来看，s的值好像被修改了。
     *   b、但从 debug 的日志来看，其实是s的内存地址已经被修改了，
     *     也就说s=“world”这个看似简单的赋值，其实已经把s的引用指向了新的String了
     * @param args
     */
//    public static void main(String[] args) {
//        String s = "hello";
//        System.out.println(s);
//        s = "world";
//        System.out.println(s);
//    }

    /**
     * 2、测试例子2：replace方法正确使用例子
     *
     * @param args
     */
//    public static void main(String[] args){
//       String str="hello world!!";
//        //下面这种写法是替换不掉的，必须接受replace方法返回的参数才行
//       str.replace("l","dd");
//        System.out.println(str);
//        str=str.replace("l","dd");
//        System.out.println(str);
//    }

    /**
     * 3、测试例子3：字符串的乱码演示代码
     *   输出：打印的结果为？？，这就是常见的乱码表现形式。
     *   解析：主要是因为 ISO-8859-1
     *      这种编码对中文的支持有限，导致中文会显示乱码。唯一的解决办法，就是在所有需要用到编码
     *      的地方，都统一使用 UTF-8，对于 String 来说，getBytes 和 new String 两个方法都会使用
     *      到编码，我们把这两处的编码替换成 UTF-8 后，打印出的结果就正常了
     * @param args
     */
//    public static void main(String[] args){
//        String str ="nihao 你好 喬亂";
//        // 字符串转化成 byte 数组
//        byte[] bytes = new byte[0];
//        try {
////            bytes = str.getBytes("ISO-8859-1");
////              bytes = str.getBytes("UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        // byte 数组转化成字符串
//        String s2 = new String(bytes);
//        System.out.println(s2);
//    }

    /**
     * 4、测试例子4：substring方法的演示代码
     *
     * @param args
     */
//    public static void main(String[] args) {
//        //substring的方法一: beginIndex：开始位置，endIndex：结束位置；
//        String name = "World";
//        name=name.substring(0, 1).toLowerCase() + name.substring(1);
//        System.out.println(name);
//
//        //substring的方法二:beginIndex：开始位置，结束位置为文本末尾。
//        String substring = name.substring(1);
//        System.out.println(substring);
//    }

    public static void main(String[] args){
        System.out.println(-1 >>> 1);
    }
}
