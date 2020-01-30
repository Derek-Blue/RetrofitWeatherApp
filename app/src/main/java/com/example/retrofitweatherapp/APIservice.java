package com.example.retrofitweatherapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIservice {

    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E9%AB%98%E9%9B%84%E5%B8%82&elementName=PoP12h,T")
    Call<Post_T> getpost_t();
}
