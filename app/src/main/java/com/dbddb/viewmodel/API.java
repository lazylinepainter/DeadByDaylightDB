package com.dbddb.viewmodel;


import com.dbddb.model.dbdVO;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {

    String BASE_URL = "https://www.reddit.com/r/";

    @GET("deadbydaylight.json")
    Call<dbdVO> getData();

}
