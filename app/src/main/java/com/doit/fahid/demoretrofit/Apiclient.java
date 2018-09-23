package com.doit.fahid.demoretrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by FAHID on 9/23/2018.
 */

public class Apiclient {

    public static final String BASE_URL="https://ffahid11.000webhostapp.com/";
    public static Retrofit retrofit=null;

    public static Retrofit getApiclient(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;

    }
}
