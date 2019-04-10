package com.dbddb.model;

import com.squareup.moshi.Json;

public class dbdChildrenVO {

    @Json(name = "data")
    private dbdChildDataVO childData;

    public dbdChildrenVO(dbdChildDataVO data) {
        this.childData = data;
    }

    public dbdChildDataVO getChildData() {
        return childData;
    }
}
