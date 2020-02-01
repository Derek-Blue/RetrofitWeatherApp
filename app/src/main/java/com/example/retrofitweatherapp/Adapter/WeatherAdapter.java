package com.example.retrofitweatherapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitweatherapp.Model.Factor;
import com.example.retrofitweatherapp.R;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {

    private Context context;
    private List<Factor> factors;

    public WeatherAdapter(Context context, List<Factor> factors) {
        this.context = context;
        this.factors = factors;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_main,parent,false);
        return new WeatherAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Factor factor = factors.get(position);

        holder.text_date.setText(factor.getTime().subSequence(5,13)+"H");
        holder.text_mt.setText(factor.getMin_t()+"~"+factor.getMax_t()+"℃");
        holder.text_rh.setText(factor.getRh()+"%");

        if (factor.getPop().equals(" ")){
            holder.text_pop.setText("-");
        }else {
            holder.text_pop.setText(factor.getPop()+"%");
        }

        holder.discription.setText(factor.getDiscription());
    }

    @Override
    public int getItemCount() {
        return factors.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView text_date, text_mt, text_rh, text_pop, discription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            text_date = itemView.findViewById(R.id.text_date);
            text_mt = itemView.findViewById(R.id.text_mt);
            text_rh = itemView.findViewById(R.id.text_rh);
            text_pop = itemView.findViewById(R.id.text_pop);
            discription = itemView.findViewById(R.id.discription);
        }
    }
}
