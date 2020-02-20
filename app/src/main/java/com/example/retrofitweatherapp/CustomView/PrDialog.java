package com.example.retrofitweatherapp.CustomView;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.retrofitweatherapp.R;


public class PrDialog extends Dialog {

    private Window window = null;
    public PrDialog(@NonNull Context context) {
        super(context);
    }

    public PrDialog(@NonNull Context context, int themeResId, int x, int y) {
        super(context, themeResId);

        setwindow(x, y);
    }

    protected PrDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.prdialog_view, null);
        setContentView(view);
        super.onCreate(savedInstanceState);
    }

    private void setwindow(int x, int y){
        window = getWindow();
        window.setBackgroundDrawableResource(android.R.color.transparent);
        WindowManager.LayoutParams params = window.getAttributes();
        params.x = x;
        params.y = y;
        window.setAttributes(params);
    }
}
