package com.kuang.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/20 16:22
 */
@SuppressWarnings("all")
public class IDutils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test(){
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
    }
}
