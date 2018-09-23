package com.doit.fahid.demoretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by FAHID on 9/23/2018.
 */

public interface Apiinterface {
   @POST("syl13-14.php")
    Call<List<Model>>getsession();
}
