package com.what.ever.model;

public class DBtempLatLong {

    double temperature;
    double latitude;
    double longitude;
    String apiKey;

    public DBtempLatLong() {
    }

    public DBtempLatLong(double temperature, double latitude, double longitude, String apiKey) {
        this.temperature = temperature;
        this.latitude = latitude;
        this.longitude = longitude;
        this.apiKey = apiKey;
    }

    public String getapiKey() {
        return apiKey;
    }

    public void setapiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
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

    @Override
    public String toString() {
        return "DBtempLatLong{" +
                "temperature=" + temperature +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
