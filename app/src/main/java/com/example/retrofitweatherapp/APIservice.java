package com.example.retrofitweatherapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIservice {

    //臺北市 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E8%87%BA%E5%8C%97%E5%B8%82&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getTaipei();

    //高雄市 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E9%AB%98%E9%9B%84%E5%B8%82&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getKaohsiung();


}
