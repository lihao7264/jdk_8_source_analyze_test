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

//    public static void main(String[] args){
//        System.out.println(-1 >>> 1);
//    }

    /**
     * 5、测试例子5：三种替换相关的方法的演示代码
     *  replace 、replaceAll、replaceFirst
     */
//    public static void main(String[] args){
//        String str ="hello word !!";
//        System.out.println("替换之前 :"+str);
//
//        //替换掉所有的l为d ---- 字符''
//        str = str.replace('l','d');
//        System.out.println("替换所有字符 :"+str);
//        //替换掉所有的d为l ---- 字符串""
//        str = str.replaceAll("d","l");
//        System.out.println("替换全部 :"+str);
//
//        //替换掉第一个l字符
//        str = str.replaceFirst("l","");
//        System.out.println("替换第一个 l :"+str);
//    }

    /**
     * 6、测试例子6：拆分方法的演示代码
     * split
     */
//    public static void main(String[] args) {
//        String s = "boo:and:foo";
//        // 我们对 s 进行了各种拆分，演示的代码和结果是：
//        String[] split1 = s.split(":");
//        String[] split2 = s.split(":", 2);
//        String[] split3 = s.split(":", 5);
//        String[] split4 = s.split(":", -2);
//        String[] split5 = s.split("o");
//        String[] split6 = s.split("o", 2);
//        printArray(split1);
//        printArray(split2);
//        printArray(split3);
//        printArray(split4);
//        printArray(split5);
//        printArray(split6);
//
//        //如果字符串里面有一些空值呢，拆分的结果
//        String a =",a,,b,";
//        String[] split7 = a.split(",");
//        printArray(split7);
//    }
//
//    private static void printArray(String[] split) {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("结果是:[");
//        for (int i = 0; i <= split.length - 1; i++) {
//            stringBuilder.append('"');
//            stringBuilder.append(split[i]);
//            stringBuilder.append('"');
//            if (i < split.length - 1) {
//                stringBuilder.append(",");
//            }
//        }
//        stringBuilder.append("]");
//        System.out.println(stringBuilder.toString());
//    }

    /**
     * 7、测试例子7：Guava拆分字符串，快速去掉空值
     * Splitter
     */
//    public static void main(String[] args) {
//        String a = ",a, ,  b  c ,";
//        // Splitter 是 Guava 提供的 API
//        List<String> list = Splitter.on(',')
//                .trimResults()// 去掉空格
//                .omitEmptyStrings()// 去掉空值
//                .splitToList(a);
//        System.out.println("Guava 去掉空格的分割方法" + JSON.toJSONString(list));
//    }

    /**
     * 8、测试例子8：字符串合并
     * join
     * @param args
     */
//    public static void main(String[] args) {
//        String s = "lihao";
//        String s1 = "wangjingweng";
//        String s2=String.join(",", s);
//        System.out.println(s2);
//    }

    /**
     * 9、测试例子9：Guava支持多个字符串的合并，还帮助我们去掉了 List 中的空值
     *  Joiner
     * @param args
     */
//    public static void main(String[] args) {
//        // 依次 join 多个字符串，Joiner 是 Guava 提供的 API
//        Joiner joiner = Joiner.on(",").skipNulls();
//        String result = joiner.join("hello", null, "china");
//        System.out.println("依次 join 多个字符串:" + result);
//
//        List<String> list = Lists.newArrayList(new String[]{"hello", "china", null});
//        System.out.println("自动删除 list 中空值:" + joiner.join(list));
//    }
}
