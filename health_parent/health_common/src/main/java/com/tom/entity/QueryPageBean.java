package com.tom.entity;

import java.io.Serializable;

/**
 * @ClassName QueryPageBean
 * @Description
 * @Author miaomiaole
 * @Date 2019/8/5 10:47
 * Version 1.0
 **/
public class QueryPageBean implements Serializable {
    private Integer currentPage;//页码
    private Integer pageSize;//每页记录数
    private String queryString;//查询条件

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

}
