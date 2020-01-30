package com.example.retrofitweatherapp.Adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitweatherapp.Model.Weather;
import com.example.retrofitweatherapp.R;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {

    private Context context;
    private List<Weather> weathers;

    public WeatherAdapter(Context context, List<Weather> weathers) {
        this.context = context;
        this.weathers = weathers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_main,parent,false);
        return new WeatherAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Weather weather = weathers.get(position);

        holder.text_date.setText(weather.getTime().subSequence(5,16));

        holder.text_t.setText(weather.getT()+" ℃");

        if (weather.getPop().equals(" ")){
            holder.text_pop.setText("-");
        }else {
            holder.text_pop.setText(weather.getPop()+" %");
        }
    }

    @Override
    public int getItemCount() {
        return weathers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView text_date, text_t, text_pop;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            text_date = itemView.findViewById(R.id.text_date);
            text_t = itemView.findViewById(R.id.text_t);
            text_pop = itemView.findViewById(R.id.text_pop);
        }
    }
}
