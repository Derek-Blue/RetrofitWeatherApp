package com.example.retrofitweatherapp.CustomView;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.retrofitweatherapp.R;

public class ImageDialog extends Dialog {

    //自定義Dialog 點擊氣象詳情用

    private Window window = null;

    private ImageView imageView;
    private TextView textView, date_txt, pop_txt, rh_txt, at_txt, county_txt;

    private int resid ;
    private String tag, date, pop, rh, at, county;

    public ImageDialog(@NonNull Context context) {
        super(context);
    }

    //Override this
    public ImageDialog(@NonNull Context context, int themeResId ,int x,int y, int resid, String tag,
                       String date, String pop, String rh, String at, String county) {
        super(context, themeResId);
        //add
        windowDeploy(x,y);
        this.resid = resid;
        this.tag = tag;
        this.date = date;
        this.pop = pop;
        this.rh = rh;
        this.at = at;
        this.county = county;
    }

    protected ImageDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    //Override
    protected void onCreate(Bundle savedInstanceState){
        View view = LayoutInflater.from(getContext()).inflate(R.layout.imagedialog_view, null);

        imageView = view.findViewById(R.id.image_set);
        textView = view.findViewById(R.id.text_set);
        date_txt = view.findViewById(R.id.date);
        pop_txt = view.findViewById(R.id.pop);
        rh_txt = view.findViewById(R.id.rh);
        at_txt = view.findViewById(R.id.at);
        county_txt = view.findViewById(R.id.county);

        imageView.setImageResource(resid);
        textView.setText(tag);
        date_txt.setText(date);
        pop_txt.setText(pop);
        rh_txt.setText(rh);
        at_txt.setText(at);
        county_txt.setText(county);

        setContentView(view);

        super.onCreate(savedInstanceState);
    }

    //add
    public void windowDeploy(int x, int y){
        window = getWindow();
        window.setWindowAnimations(R.style.dialogAnim);//設定彈出動畫
        window.setBackgroundDrawableResource(android.R.color.transparent);//設定背景透明
        WindowManager.LayoutParams params = window.getAttributes();
        params.x = x;
        params.y = y;
        window.setAttributes(params);
    }

    //Override
    public void show(){
        setCanceledOnTouchOutside(true);//可點擊dialog以外區域消除
        super.show();
    }

}
