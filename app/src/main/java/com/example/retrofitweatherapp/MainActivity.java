package com.example.retrofitweatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.retrofitweatherapp.Adapter.WeatherAdapter;
import com.example.retrofitweatherapp.Model.Weather;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    APIservice apIservice;

    private WeatherAdapter weatherAdapter;
    private List<Weather> weathers;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        weathers = new ArrayList<>();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://opendata.cwb.gov.tw/api/v1/rest/datastore/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apIservice = retrofit.create(APIservice.class);
        Call<Post_T> call = apIservice.getpost_t();
        call.enqueue(new Callback<Post_T>() {
            @Override
            public void onResponse(Call<Post_T> call, Response<Post_T> response) {
                if (!response.isSuccessful()){
                    Log.d("D101","Code = "+ response.code());
                    return;
                }

                Post_T post_t = response.body();

                List<Post_T.RecordsBean.LocationsBean.LocationBean.WeatherElementBean.TimeBean> timeBean_pop =
                        post_t.getRecords().getLocations().get(0).getLocation().get(0).getWeatherElement().get(0).getTime();

                List<Post_T.RecordsBean.LocationsBean.LocationBean.WeatherElementBean.TimeBean> timeBean_t =
                        post_t.getRecords().getLocations().get(0).getLocation().get(0).getWeatherElement().get(1).getTime();

                weathers.clear();
                int count = timeBean_t.size();
                Log.d("W20", ""+count);
                for (int i=0; i<count; i++){
                    String date = timeBean_pop.get(i).getStartTime();
                    String t = timeBean_t.get(i).getElementValue().get(0).getValue();
                    String pop = timeBean_pop.get(i).getElementValue().get(0).getValue();

                    weathers.add(new Weather(date, t, pop));
                }
                weatherAdapter = new WeatherAdapter(MainActivity.this, weathers);
                recyclerView.setAdapter(weatherAdapter);
            }

            @Override
            public void onFailure(Call<Post_T> call, Throwable t) {
                Log.d("D102",""+t.getMessage());
            }
        });
    }
}
