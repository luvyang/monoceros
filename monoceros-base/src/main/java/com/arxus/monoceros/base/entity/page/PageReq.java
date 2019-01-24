package com.arxus.monoceros.base.entity.page;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 分页请求实体
 *
 * @Author : YangXuyue
 * @Date : 2019/1/24 11:23
 */
public class PageReq implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 当前页
     */
    private int page = 1;
    /**
     * 每页数据量
     */
    private int pageSize = 10;
    /**
     * 排序字段
     */
    private String sortField = "";
    /**
     * 排序方式
     */
    private String sort = "";
    /**
     * 关键字
     */
    private String keyword = "";

    public PageReq() {
    }

    public PageReq(int page, int pageSize, String sortField, String sort,
                   String keyword) {
        this.page = page;
        this.pageSize = pageSize;
        this.sortField = sortField;
        this.sort = sort;
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
