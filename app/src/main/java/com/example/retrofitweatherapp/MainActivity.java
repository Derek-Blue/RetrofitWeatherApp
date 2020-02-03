package com.example.retrofitweatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
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

    public Spinner spinner;

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
                .baseUrl("https://opendata.cwb.gov.tw/api/v1/rest/datastore/") // 氣象局開放資料平台網址(前段)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apIservice = retrofit.create(APIservice.class);

        //記憶上回選擇的縣市(取)
        SharedPreferences sharedPreferences = getSharedPreferences("SpinnerNum", MODE_PRIVATE);
        int page = sharedPreferences.getInt("position", 0);

        spinner.setSelection(page);

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
                        post.getRecords().getLocations().get(0).getLocation().get(0).getWeatherElement().get(0).getTime(); //取得 PoP12H 降雨機率

                List<Post.RecordsBean.LocationsBean.LocationBean.WeatherElementBean.TimeBean> timeBeans_rh =
                        post.getRecords().getLocations().get(0).getLocation().get(0).getWeatherElement().get(1).getTime(); //取得 RH 相對濕度

                List<Post.RecordsBean.LocationsBean.LocationBean.WeatherElementBean.TimeBean> timeBeans_maxt =
                        post.getRecords().getLocations().get(0).getLocation().get(0).getWeatherElement().get(2).getTime(); //取得 MaxAT 最高體感溫度

                List<Post.RecordsBean.LocationsBean.LocationBean.WeatherElementBean.TimeBean> timeBeans_disc =
                        post.getRecords().getLocations().get(0).getLocation().get(0).getWeatherElement().get(3).getTime(); //取得 Wx 天氣現象

                List<Post.RecordsBean.LocationsBean.LocationBean.WeatherElementBean.TimeBean> timeBeans_mint =
                        post.getRecords().getLocations().get(0).getLocation().get(0).getWeatherElement().get(4).getTime(); //取得 MinAT 最低體感溫度

                factors.clear();
                int count = timeBeans_pop.size();
                //Log.d("W20", ""+count);
                for (int i=0; i<count; i++){
                    String date = timeBeans_pop.get(i).getStartTime();
                    String pop = timeBeans_pop.get(i).getElementValue().get(0).getValue();
                    String rh = timeBeans_rh.get(i).getElementValue().get(0).getValue();
                    String maxt = timeBeans_maxt.get(i).getElementValue().get(0).getValue();
                    String disc_txt = timeBeans_disc.get(i).getElementValue().get(0).getValue();
                    String disc = timeBeans_disc.get(i).getElementValue().get(1).getValue();
                    String mint = timeBeans_mint.get(i).getElementValue().get(0).getValue();

                    factors.add(new Factor(date,pop,rh,maxt,mint,disc,disc_txt));
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

            //記憶上回選擇的縣市(存)
            SharedPreferences.Editor editor = getSharedPreferences("SpinnerNum", MODE_PRIVATE).edit();
            editor.putInt("position",position);
            editor.apply();

            //取得Spinner 被選擇的內容
            String s = parent.getSelectedItem().toString();
            Log.d("Q200=",""+s);
            switch (s){
                case "台北市":
                    call = apIservice.getTaipei();
                    getJson();
                    break;
                case "新北市":
                    call = apIservice.getHsinbei();
                    getJson();
                    break;
                case "桃園市":
                    call = apIservice.getTauyaun();
                    getJson();
                    break;
                case "高雄市":
                    call = apIservice.getKaohsiung();
                    getJson();
                    break;
                case "基隆市":
                    call = apIservice.getKeelung();
                    getJson();
                    break;
                case "新竹縣":
                    call = apIservice.getHsinchuCounty();
                    getJson();
                    break;
                case "新竹市":
                    call = apIservice.getHsinchuCity();
                    getJson();
                    break;
                case "苗栗縣":
                    call = apIservice.getMiaoli();
                    getJson();
                    break;
                case "台中市":
                    call = apIservice.getTaichung();
                    getJson();
                    break;
                case "彰化縣":
                    call = apIservice.getChanghwa();
                    getJson();
                    break;
                case "南投縣":
                    call = apIservice.getNantou();
                    getJson();
                    break;
                case "雲林縣":
                    call = apIservice.getYunlin();
                    getJson();
                    break;
                case "嘉義縣":
                    call = apIservice.getChayiCounty();
                    getJson();
                    break;
                case "嘉義市":
                    call = apIservice.getChayiCity();
                    getJson();
                    break;
                case "台南市":
                    call = apIservice.getTainan();
                    getJson();
                    break;
                case "宜蘭縣":
                    call = apIservice.getYilan();
                    getJson();
                    break;
                case "花蓮縣":
                    call = apIservice.getHualian();
                    getJson();
                    break;
                case "台東縣":
                    call = apIservice.getTaidong();
                    getJson();
                    break;
                case "屏東縣":
                    call = apIservice.getPingtung();
                    getJson();
                    break;
                case "澎湖縣":
                    call = apIservice.getPenghu();
                    getJson();
                    break;
                case "金門縣":
                    call = apIservice.getKinmen();
                    getJson();
                    break;
                case "連江縣":
                    call = apIservice.getLianzian();
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
