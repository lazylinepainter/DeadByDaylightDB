
package com.dbddb.model;

import com.squareup.moshi.Json;

public class dbdVO {

    @Json(name = "data")
    private dbdDataVO data;

    public dbdVO(dbdDataVO data) {
        this.data = data;
    }

    public dbdDataVO getData() {
        return data;
    }
}
