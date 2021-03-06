package com.atlihao.jdk.base.one.classes;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * @author lihao
 * @ClassName StringTest
 * @Since 2020/1/30
 * @Description String类的测试代码
 */
@Slf4j
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

    /**
     * 10、测试例子10： 得到指定下标处的字符（Unicode值）。
     * String类的codePointAt
     */
    @Test
    public void testCodePointAt() {
        String s = "lihao";
        int codePointAt = s.codePointAt(4);
        log.info("test codePointAt ,unicode:{},char:{}", codePointAt, (char) codePointAt);
    }

    /**
     * 11、测试例子11： 得到指定下标值前一个字符的unicode值。
     * String类的codePointBefore
     */
    @Test
    public void testCodePointBefore() {
        String s = "lihao";
        int codePointBefore = s.codePointBefore(4);
        log.info("test codePointBefore ,unicode:{},char:{}", codePointBefore, (char) codePointBefore);
    }

    /**
     * 11、测试例子11： 得到此String的指定文本范围内的字符个数(指定下标范围内)
     * String类的codePointCount
     */
    @Test
    public void testCodePointCount() {
        String s = "lihao";
        int count = s.codePointCount(1, 4);
        log.info("test codePointCount ,count:{}", count);
    }

    /**
     * 12、测试例子12：得到String中的下标，该下标与给定的index偏移codePointOffset个代码点
     * String类的offsetByCodePoints
     */
    @Test
    public void testOffsetByCodePoints() {
        String s = "lihao";
        int count = s.offsetByCodePoints(1, 3);
        log.info("test offsetByCodePoints ,offsetByCodePoints:{}", count);
    }

    /**
     * 13、测试例子13：将字符串中的字符复制到目标字符数组中。
     * String类的getChars
     */
    @Test
    public void testGetChars() {
        String s = "lihao";
        char dest[] = new char[2];
        s.getChars(1, 3, dest, 0);
        log.info("test getChars ,dest:{}", dest);
    }

    /**
     * 14、测试例子14：使用命名的字符集将此字符串编码为字节序列，并将结果存储到新的字节数组中。
     * String类的getBytes
     */
    @Test
    public void testGetBytes() throws UnsupportedEncodingException {
        String s = "lihao";
        byte[] bytes = s.getBytes("utf-8");
        log.info("test getBytes ,bytes:{}", bytes);
    }

    /**
     * 15、测试例子15：将此字符串与指定的StringBuffer比较
     * String类的contentEquals
     */
    @Test
    public void testContentEquals() {
        String s = "lihao";
        StringBuffer stringBuffer = new StringBuffer();
        boolean equals = s.contentEquals(stringBuffer);
        log.info("test contentEquals ,equals:{}", equals);
    }

    /**
     * 16、测试例子16：忽略大小写比较字符串
     * String类的equalsIgnoreCase
     */
    @Test
    public void testEqualsIgnoreCase() {
        String s1 = "lihao";
        String s2 = "Lihao";
        boolean equals = s1.equalsIgnoreCase(s2);
        log.info("test equalsIgnoreCase ,equals:{}", equals);
    }

    /**
     * 17、测试例子17：比较两个字符串
     * String类的compareTo
     */
    @Test
    public void testCompareTo() {
        String s1 = "lihao1";
        String s2 = "lihao";
        int difference = s1.compareTo(s2);
        log.info("test compareTo,difference:{}", difference);
    }

    /**
     * 18、测试例子18：比较两个字符串(忽略大小写差异)
     * String类的compareToIgnoreCase
     */
    @Test
    public void testCompareToIgnoreCase() {
        String s1 = "lihao1";
        String s2 = "Lihao";
        int difference = s1.compareToIgnoreCase(s2);
        log.info("test compareToIgnoreCase,difference:{}", difference);
    }

    /**
     * 19、测试例子19：检测字符串是否以某个前缀开始（从某个偏移开始）
     * String类的startsWith
     */
    @Test
    public void testStartsWith() {
        String s1 = "lihao1";
        String s2 = "ihao";
        boolean istSuccess = s1.startsWith(s2, 1);
        log.info("test startsWith,istSuccess:{}", istSuccess);
    }

    /**
     * 20、测试例子20：检查是否以某个字符串结尾
     * String类的endsWith
     */
    @Test
    public void testEndsWith() {
        String s1 = "lihao1";
        String s2 = "1";
        boolean isSuccess = s1.endsWith(s2);
        log.info("test endsWith,isSuccess:{}", isSuccess);
    }

    /**
     * 21、测试例子21：获得字符串的哈希码
     * String类的hashCode
     */
    @Test
    public void testHashCode() {
        String s1 = "lihao1";
        int hashCode = s1.hashCode();
        log.info("test hashCode,hashCode:{}", hashCode);
    }

    /**
     * 22、测试例子22：获得指定字符首次出现在此字符串中的下标
     * String类的indexOf
     */
    @Test
    public void testIndexOf() {
        String s1 = "lihao1";
        //a字符(97)的下标
        int index = s1.indexOf(97);
        log.info("test indexOf,index:{}", index);
    }

    /**
     * 23、测试例子23：返回指定字符在此字符串内最后一次出现的下标
     * String类的lastIndexOf
     */
    @Test
    public void testLastIndexOf() {
        String s1 = "lihaao1";
        //返回a字符(97)在此字符串内最后一次出现的下标
        int lastIndex = s1.lastIndexOf(97);
        log.info("test lastIndexOf,lastIndex:{}", lastIndex);
    }

    /**
     * 24、测试例子24：返回一个字符串的子字符串
     * String类的substring
     */
    @Test
    public void testSubstring() {
        String s1 = "lihao1";
        //获取hao1字符串
        String substring = s1.substring(2);
        log.info("test substring,substring:{}", substring);
    }

    /**
     * 25、测试例子25：返回一个字符串的子字符序列
     * String类的subSequence
     */
    @Test
    public void testSubSequence() {
        String s1 = "lihao1";
        //获取ha的字符序列(包括下标2，不包括下标4)
        CharSequence charSequence = s1.subSequence(2, 4);
        log.info("test subSequence,charSequence:{}", charSequence);
    }

    /**
     * 26、测试例子26：将入参字符串连接到当前字符串末尾
     * String类的concat
     */
    @Test
    public void testConcat() {
        String s1 = "lihao";
        String s2 = "1";
        //将s2字符串连接到s1末尾
        String concatStr = s1.concat(s2);
        log.info("test concat,concatStr:{}", concatStr);
    }

    /**
     * 27、测试例子27：字符串中是否含有某些字符(根据正则表达式来匹配)
     * String类的matches
     */
    @Test
    public void testMatches() {
        String s1 = "lihao";
        String s2 = "^*l*";
        //将s2字符串连接到s1末尾
        boolean match = s1.matches(s2);
        log.info("test matches,match:{}", match);
    }

    /**
     * 28、测试例子28：字符串是否包含某个字符序列
     * String类的contains
     */
    @Test
    public void testContains() {
        String s1 = "lihao";
        //将s2字符串连接到s1末尾
        boolean contain = s1.contains("ha");
        log.info("test contains,contain:{}", contain);
    }

    /**
     * 29、测试例子29：去除字符串前后的空格
     * String类的trim()
     */
    @Test
    public void testTrim() {
        String s1 = " lihao ";
        //去除s1字符串前后的空格
        String trimStr = s1.trim();
        log.info("test trim,trimStr:{}", trimStr);
    }

    /**
     * 30、测试例子30：获取字符串的字符数组
     * String类的toCharArray()
     */
    @Test
    public void testToCharArray() {
        String s1 = "lihao";
        //获取s1字符串的字符数组
        char[] chars = s1.toCharArray();
        log.info("test toCharArray,chars:{}", chars);
    }

    /**
     * 31、测试例子31：字符转为字符串
     * String类的valueOf
     */
    @Test
    public void testValueOf() {
        //字符l转为字符串
        String str = String.valueOf('l');
        log.info("test valueOf,str:{}", str);
    }

    /**
     * 31、测试例子31：字符串的intern方法
     * String类的intern
     */
    @Test
    public void testIntern() {
        String s1 = "lihao";
        //字符l转为字符串
        String internStr = s1.intern();
        log.info("test intern,internStr:{}", internStr);
    }


}
