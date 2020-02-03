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

    //宜蘭縣 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E5%AE%9C%E8%98%AD%E7%B8%A3&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getYilan();

    //花蓮縣 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E8%8A%B1%E8%93%AE%E7%B8%A3&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getHualian();

    //台東縣 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E8%87%BA%E6%9D%B1%E7%B8%A3&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getTaidong();

    //澎湖縣 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E6%BE%8E%E6%B9%96%E7%B8%A3&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getPenghu();

    //金門縣 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E9%87%91%E9%96%80%E7%B8%A3&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getKinmen();

    //連江縣 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E9%80%A3%E6%B1%9F%E7%B8%A3&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getLianzian();

    //台中市 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E8%87%BA%E4%B8%AD%E5%B8%82&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getTaichung();

    //台南市 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E8%87%BA%E5%8D%97%E5%B8%82&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getTainan();

    //基隆市 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E5%9F%BA%E9%9A%86%E5%B8%82&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getKeelung();

    //新竹縣 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E6%96%B0%E7%AB%B9%E7%B8%A3&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getHsinchuCounty();

    //新竹市 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E6%96%B0%E7%AB%B9%E5%B8%82&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getHsinchuCity();

    //苗栗縣 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E8%8B%97%E6%A0%97%E7%B8%A3&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getMiaoli();

    //彰化縣 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E5%BD%B0%E5%8C%96%E7%B8%A3&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getChanghwa();

    //南投縣 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E5%8D%97%E6%8A%95%E7%B8%A3&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getNantou();

    //雲林縣 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E9%9B%B2%E6%9E%97%E7%B8%A3&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getYunlin();

    //嘉義縣 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E5%98%89%E7%BE%A9%E7%B8%A3&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getChayiCounty();

    //嘉義市 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E5%98%89%E7%BE%A9%E5%B8%82&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getChayiCity();

    //屏東縣 逐12小時   MaxAT  MinAT  PoP12h  RH  Wx
    @GET("F-D0047-091?Authorization=CWB-220B71FA-1B5B-48B6-8B07-8C1938FC1C96&locationName=%E5%B1%8F%E6%9D%B1%E7%B8%A3&elementName=MaxAT,MinAT,PoP12h,RH,Wx")
    Call<Post> getPingtung();
}
