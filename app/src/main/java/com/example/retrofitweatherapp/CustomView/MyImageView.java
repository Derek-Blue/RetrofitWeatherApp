package com.example.retrofitweatherapp.CustomView;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class MyImageView extends ImageView {

    //自定義Imageview  增加可以回call image resource id 的方法

    //add
    int lastResourceId;

    public MyImageView(Context context) {
        super(context);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void setImageResource(int resId) {
        super.setImageResource(resId);

        // add
        this.lastResourceId = resId;
    }

    //add
    public int getLastResourceId(){
        return lastResourceId;
    }
}
