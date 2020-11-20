package com.gm.webadmin.common.utils;



import java.util.UUID;

/**
 * @program: esgov-bysbxt-webapi
 * @description: uuid生成工具类
 * @author: winney
 **/

public class UUIDUtil {

    public  static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}