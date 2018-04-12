package com.what.ever.model;

public class WeatherUrl {

    private double latitude;
    private double longitude;
    private String apiKey;

    public WeatherUrl(double latitude, double longitude, String apiKey) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.apiKey = apiKey;
    }

    public WeatherUrl() {
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getapiKey() {
        return apiKey;
    }

    public void setapiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
