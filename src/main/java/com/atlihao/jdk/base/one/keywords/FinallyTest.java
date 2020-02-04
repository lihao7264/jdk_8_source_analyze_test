package com.atlihao.jdk.base.one.keywords;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author lihao
 * @ClassName FinallyTest
 * @Since 2020/2/2
 * @Description try、catch、finally关键字的使用
 */
@Slf4j
public class FinallyTest {

    /**
     * 1、测试例子1：在 try、catch 中都遇到了异常，代码的执行顺序为try -> catch -> finally
     */
    @Test
    public void testCatchFinally() {
        try {
            log.info("try is run");
            if (Boolean.TRUE) {
                throw new RuntimeException("try exception");
            }
        } catch (Exception e) {
            log.info("catch is run");
            if (Boolean.TRUE) {
                throw new RuntimeException("catch exception");
            }
        } finally {
            log.info("finally is run");
        }
    }
}
