package com.example.retrofitweatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.retrofitweatherapp.Adapter.WeatherAdapter;
import com.example.retrofitweatherapp.Model.Factor;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    APIservice apIservice;

    private WeatherAdapter weatherAdapter;
    private List<Factor> factors;
    private RecyclerView recyclerView;

    private Spinner spinner;

    Call<Post> call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);;

        recyclerView = findViewById(R.id.recycleview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        factors = new ArrayList<>();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://opendata.cwb.gov.tw/api/v1/rest/datastore/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apIservice = retrofit.create(APIservice.class);
        call = apIservice.getTaipei();

        spinner.setOnItemSelectedListener(selectedListener);
    }

    private void getJson(){

        call.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                if (!response.isSuccessful()){
                    Log.d("D101","Code = "+ response.code());
                    return;
                }

                Post post = response.body();

                assert post != null;
                List<Post.RecordsBean.LocationsBean.LocationBean.WeatherElementBean.TimeBean> timeBeans_pop =
                        post.getRecords().getLocations().get(0).getLocation().get(0).getWeatherElement().get(0).getTime();

                List<Post.RecordsBean.LocationsBean.LocationBean.WeatherElementBean.TimeBean> timeBeans_rh =
                        post.getRecords().getLocations().get(0).getLocation().get(0).getWeatherElement().get(1).getTime();

                List<Post.RecordsBean.LocationsBean.LocationBean.WeatherElementBean.TimeBean> timeBeans_maxt =
                        post.getRecords().getLocations().get(0).getLocation().get(0).getWeatherElement().get(2).getTime();

                List<Post.RecordsBean.LocationsBean.LocationBean.WeatherElementBean.TimeBean> timeBeans_disc =
                        post.getRecords().getLocations().get(0).getLocation().get(0).getWeatherElement().get(3).getTime();

                List<Post.RecordsBean.LocationsBean.LocationBean.WeatherElementBean.TimeBean> timeBeans_mint =
                        post.getRecords().getLocations().get(0).getLocation().get(0).getWeatherElement().get(4).getTime();

                factors.clear();
                int count = timeBeans_pop.size();
                Log.d("W20", ""+count);
                for (int i=0; i<count; i++){
                    String date = timeBeans_pop.get(i).getStartTime();
                    String pop = timeBeans_pop.get(i).getElementValue().get(0).getValue();
                    String rh = timeBeans_rh.get(i).getElementValue().get(0).getValue();
                    String maxt = timeBeans_maxt.get(i).getElementValue().get(0).getValue();
                    String disc = timeBeans_disc.get(i).getElementValue().get(0).getValue();
                    String mint = timeBeans_mint.get(i).getElementValue().get(0).getValue();

                    factors.add(new Factor(date,pop,rh,maxt,mint,disc));
                }
                weatherAdapter = new WeatherAdapter(MainActivity.this, factors);
                recyclerView.setAdapter(weatherAdapter);
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                Log.d("D102",""+t.getMessage());
            }
        });
    }

    private Spinner.OnItemSelectedListener selectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            switch (position){
                case 0:
                    call = apIservice.getTaipei();
                    getJson();
                    break;
                case 1:
                    call = apIservice.getKaohsiung();
                    getJson();
                    break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            getJson();
        }
    };
}
