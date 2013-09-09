/**
 * 
 */
package com.clay.japanese.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 28, 2013
 * @version 0.1
 */
public class Pager<T> {
    private long offset = 0;
    private long limit = 10;

    private List<T> data = new ArrayList<T>();

    public Pager() {}

    public Pager(long offset, long limit) {
        this.offset = offset;
        this.limit = limit;
    }

    public Pager(List<T> data) {
        this.data = data;
    }

    public Pager(long offset, long limit, List<T> data) {
        this.offset = offset;
        this.limit = limit;
        this.data = data;
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    public int getSize() {
        return this.data.size();
    }

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }

    public long getLimit() {
        return limit;
    }

    public void setLimit(long limit) {
        this.limit = limit;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
