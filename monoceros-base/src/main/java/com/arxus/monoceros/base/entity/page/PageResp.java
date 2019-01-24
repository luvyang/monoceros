package com.arxus.monoceros.base.entity.page;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * 分页返回实体
 *
 * @param <T>
 * @Author : YangXuyue
 * @Date : 2019/1/24 11:24
 */
public class PageResp<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 当前页
     */
    private int page;
    /**
     * 每页数据量
     */
    private int pageSize;
    /**
     * 数据总数
     */
    private long total;
    /**
     * 数据
     */
    private List<T> rows;

    public PageResp() {
    }

    public PageResp(List<T> target) {
        this.rows = target;
        this.total = (long) target.size();
        this.pageSize = target.size();
        this.page = (target.size() + pageSize - 1) / pageSize;
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

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
