package com.example.retrofitweatherapp.Model;

public class Weather {

    private String time;
    private String t;
    private String pop;

    public Weather(String time, String t, String pop) {
        this.time = time;
        this.t = t;
        this.pop = pop;
    }

    public Weather() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }
}
