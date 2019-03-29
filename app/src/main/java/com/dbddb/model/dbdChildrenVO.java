package com.dbddb.model;

import com.squareup.moshi.Json;

public class dbdChildrenVO {

    @Json(name = "data")
    public dbdChildDataVO childData;

    public dbdChildrenVO(dbdChildDataVO data) {
        this.childData = data;
    }

    public dbdChildDataVO getData() {
        return childData;
    }

    public void setData(dbdChildDataVO data) {
        this.childData = data;
    }
}
