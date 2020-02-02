package com.example.retrofitweatherapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIservice {
    // 代入各縣市後段網址
    // {F-D0047-???} 開放文件編號
    // Authorization={CWB-220B71FA-1B5B-48B6-8B07-***...} 氣象局會員權限金鑰
    // locationName={%E8%87%BA%E5%8C%97%E5%B8%82} 縣市區域
    // elementName={MaxAT,MinAT,PoP12h,RH,Wx} 氣象單位因子

    //臺北市 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E8%87%BA%E5%8C%97%E5%B8%82&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getTaipei();

    //新北市 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E6%96%B0%E5%8C%97%E5%B8%82&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getHsinbei();

    //桃園市 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E6%A1%83%E5%9C%92%E5%B8%82&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getTauyaun();

    //高雄市 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E9%AB%98%E9%9B%84%E5%B8%82&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getKaohsiung();

}
