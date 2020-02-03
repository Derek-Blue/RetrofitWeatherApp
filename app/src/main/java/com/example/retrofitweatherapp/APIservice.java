package com.example.retrofitweatherapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIservice {
    // 代入各縣市後段網址
    // {F-D0047-???} 開放文件編號
    // Authorization={CWB-220B71FA-1B5B-48B6-8B07-***...} 氣象局會員權限金鑰
    // locationName={%E8%87%BA%E5%8C%97%E5%B8%82} 縣市區域
    // elementName={MaxAT,MinAT,PoP12h,RH,Wx} 氣象單位因子

    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&elementName=MinCI")
    Call<Post> getLocation();

    //Query JSON檔案裡的locationName參數 設定回傳 String區域名稱
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getWeather(@Query("locationName") String location);

}
