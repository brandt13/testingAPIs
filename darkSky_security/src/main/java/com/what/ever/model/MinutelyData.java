package com.what.ever.model;

public class MinutelyData {

    long    time;
    double  precipIntensity;
    double  precipProbability;

    public MinutelyData(long time, double precipIntensity, double precipProbability) {
        this.time = time;
        this.precipIntensity = precipIntensity;
        this.precipProbability = precipProbability;
    }

    public MinutelyData() {
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public double getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public double getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(double precipProbability) {
        this.precipProbability = precipProbability;
    }
}
