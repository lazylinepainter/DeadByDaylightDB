package com.dbddb.model;

import com.squareup.moshi.Json;

import java.util.List;

public class dbdDataVO {

    @Json(name = "children")
    private List<dbdChildrenVO> children;
    @Json(name = "after")
    private String after;

    public dbdDataVO(List<dbdChildrenVO> children, String after) {
        this.children = children;
        this.after = after;
    }

    public List<dbdChildrenVO> getChildren() {
        return children;
    }

    public String getAfter() {
        return after;
    }

}