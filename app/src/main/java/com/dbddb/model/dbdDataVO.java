package com.dbddb.model;

import com.squareup.moshi.Json;

import java.util.List;

public class dbdDataVO {

    @Json(name = "children")
    public List<dbdChildrenVO> children;
    @Json(name = "after")
    public String after;

    public dbdDataVO(List<dbdChildrenVO> children, String after) {
        this.children = children;
        this.after = after;
    }

    public List<dbdChildrenVO> getChildren() {
        return children;
    }

    public void setChildren(List<dbdChildrenVO> children) {
        this.children = children;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }
}