package com.example.retrofitweatherapp.Adapter;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitweatherapp.ImageDialog;
import com.example.retrofitweatherapp.MainActivity;
import com.example.retrofitweatherapp.Model.Factor;
import com.example.retrofitweatherapp.MyImageView;
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
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        final Factor factor = factors.get(position);

        holder.text_date.setText(factor.getTime().subSequence(5,13)+"H");
        holder.text_mt.setText(factor.getMin_t()+"~"+factor.getMax_t()+"℃");
        holder.text_rh.setText(factor.getRh()+"%");

        if (factor.getPop().equals(" ")){
            holder.text_pop.setText("-");
        }else {
            holder.text_pop.setText(factor.getPop()+"%");
        }

        int i = Integer.parseInt(factor.getDiscription());
        if (i == 1){
            holder.dis_image.setImageResource(R.mipmap.w01);
        }else if (i>=2 && i<=3){
            holder.dis_image.setImageResource(R.mipmap.w02_03);
        }else if (i>=4 && i<=7){
            holder.dis_image.setImageResource(R.mipmap.w04_07);
        }else if (i>=8 && i<=12){
            holder.dis_image.setImageResource(R.mipmap.w08_12);
        }else if (i>=13 && i<=14){
            holder.dis_image.setImageResource(R.mipmap.w13_14);
        }else if (i == 15){
            holder.dis_image.setImageResource(R.mipmap.w15);
        }else if (i>=16 && i<=18){
            holder.dis_image.setImageResource(R.mipmap.w16_18);
        }else if (i>=19 && i<=20){
            holder.dis_image.setImageResource(R.mipmap.w19_w20);
        }else if (i>=21 && i<=22){
            holder.dis_image.setImageResource(R.mipmap.w21_22);
        }else if (i == 23){
            holder.dis_image.setImageResource(R.mipmap.w23);
        }else if (i>=24 && i<=27){
            holder.dis_image.setImageResource(R.mipmap.w24_27);
        }else if (i == 28){
            holder.dis_image.setImageResource(R.mipmap.w28);
        }else if (i>=29 && i<=32){
            holder.dis_image.setImageResource(R.mipmap.w29_32);
        }else if (i>=33 && i<=36){
            holder.dis_image.setImageResource(R.mipmap.w33_36);
        }else if (i>=37 && i<=42){
            holder.dis_image.setImageResource(R.mipmap.w37_42);
        }

        //傳入圖片文字詳情(隱藏式)
        holder.dis_image.setTag(factor.getDiscription_txt());

        //點小圖放大
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //取得選擇區域
                String county = ((MainActivity)context).spinner.getSelectedItem().toString();

                //取得螢幕高度
                DisplayMetrics metrics = new DisplayMetrics();
                ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(metrics);
                int window_hight = metrics.heightPixels;

                //取得itemview的 XY 座標
                int[] location =new int[2];
                v.getLocationInWindow(location);

                //使用自定義Dialog
                ImageDialog imageDialog = new ImageDialog(context, R.style.Theme_AppCompat_DayNight_Dialog,
                        0,location[1]-(window_hight/2), //設定dialog出現的位置
                        holder.dis_image.getLastResourceId(), holder.dis_image.getTag().toString(),
                        factor.getTime().subSequence(0,16).toString(),holder.text_pop.getText().toString(),
                        holder.text_rh.getText().toString(), holder.text_mt.getText().toString(),
                        county);

                imageDialog.show();

//                Log.v("X201",""+holder.dis_image.getLastResourceId());
//                Log.v("X200", ""+location[0]+" , "+location[1]);
            }
        });

    }

    @Override
    public int getItemCount() {
        return factors.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView text_date, text_mt, text_rh, text_pop;
        public MyImageView dis_image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            text_date = itemView.findViewById(R.id.text_date);
            text_mt = itemView.findViewById(R.id.text_mt);
            text_rh = itemView.findViewById(R.id.text_rh);
            text_pop = itemView.findViewById(R.id.text_pop);
            dis_image = itemView.findViewById(R.id.dis_image);
        }
    }
}
