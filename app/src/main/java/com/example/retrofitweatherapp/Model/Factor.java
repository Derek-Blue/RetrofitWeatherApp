package com.example.retrofitweatherapp.Model;

public class Factor {
    String time;
    String pop;
    String rh;
    String max_t;
    String min_t;
    String discription;
    String discription_txt;

    public Factor(String time, String pop, String rh, String max_t, String min_t, String discription, String discription_txt) {
        this.time = time;
        this.pop = pop;
        this.rh = rh;
        this.max_t = max_t;
        this.min_t = min_t;
        this.discription = discription;
        this.discription_txt = discription_txt;
    }

    public Factor() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getMax_t() {
        return max_t;
    }

    public void setMax_t(String max_t) {
        this.max_t = max_t;
    }

    public String getMin_t() {
        return min_t;
    }

    public void setMin_t(String min_t) {
        this.min_t = min_t;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getDiscription_txt() {
        return discription_txt;
    }

    public void setDiscription_txt(String discription_txt) {
        this.discription_txt = discription_txt;
    }
}
