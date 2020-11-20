package com.gm.webadmin.common.entity;

import java.util.HashMap;
import java.util.Map;

public class PageRequest {

    private int pageNum = 1;

    private int pageSize =10;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Object getParam(String key) {
        return param.get(key);
    }

    public void setParam(String key,Object value) {
        this.param.put(key,value);
    }

    private Map<String,Object> param = new HashMap<>();
}
