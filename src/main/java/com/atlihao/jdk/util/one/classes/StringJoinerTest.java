package com.atlihao.jdk.util.one.classes;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.StringJoiner;

/**
 * @author lihao
 * @ClassName StringJoinerTest
 * @Since 2020/2/8
 * @Description StringJoiner类的测试例子
 */
@Slf4j
public class StringJoinerTest {

    /**
     * 1、测试例子1：测试Arrays类的排序方法
     * Arrays.sort
     */
    @Test
    public void testAdd() {
        StringJoiner sj = new StringJoiner(":", "[", "]");
        sj.add("George").add("Sally").add("Fred");
        String desiredString = sj.toString();
        log.info("test StringJoiner.add,desiredString:{},joinerLength:{},strLength:{}",desiredString,sj.length(),desiredString.length());
    }

}
