package com.atlihao.jdk.base.one.classes;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableList;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author lihao
 * @ClassName ArraysTest
 * @Since 2020/2/2
 * @Description   Arrays类的测试例子
 */
@Slf4j
public class ArraysTest {

    /**
     * 1、测试例子1：测试Arrays类的排序方法
     * Arrays.sort
     */
    @Test
    public void testSort(){
        List<SortDTO> list = ImmutableList.of(
                new SortDTO("300"),
                new SortDTO("50"),
                new SortDTO("200"),
                new SortDTO("220")
        );
        // 我们先把数组的大小初始化成 list 的大小，保证能够正确执行 toArray
        SortDTO[] array = new SortDTO[list.size()];
        list.toArray(array);

        log.info("排序之前：{}", JSON.toJSONString(array));
        Arrays.sort(array, Comparator.comparing(SortDTO::getSortTarget));
        log.info("排序之后：{}", JSON.toJSONString(array));
    }

    /**
     * 2、测试例子2：测试Arrays类的二分查找方法
     * Arrays.binarySearch
     */
    @Test
    public void testBinarySearch(){
        //测试数据
        List<SortDTO> list = ImmutableList.of(
                new SortDTO("300"),
                new SortDTO("50"),
                new SortDTO("200"),
                new SortDTO("220")
        );

        SortDTO[] array = new SortDTO[list.size()];
        list.toArray(array);

        log.info("搜索之前：{}", JSON.toJSONString(array));
        //排序
        Arrays.sort(array, Comparator.comparing(SortDTO::getSortTarget));
        log.info("先排序，结果为：{}", JSON.toJSONString(array));

        //二分查找sortTarget为200的对象的下标
        int index = Arrays.binarySearch(array, new SortDTO("200"),
                Comparator.comparing(SortDTO::getSortTarget));

        //下标小于0的话，表示不存在
        if(index<0){
            throw new RuntimeException("没有找到 200");
        }
        log.info("搜索结果：{}", JSON.toJSONString(array[index]));
    }

}

/**
 * 自定义类
 */
@Data
class SortDTO {
    private String sortTarget;

    public SortDTO(String sortTarget) {
        this.sortTarget = sortTarget;
    }
}
