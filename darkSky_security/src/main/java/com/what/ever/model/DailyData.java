package com.what.ever.model;

public class DailyData {

    // Currently, Minutely, & Hourly variables:

    long time;
    String summary;
    String icon;
    long sunriseTime;
    long sunsetTime;
    double moonPhase;
    double precipIntensity;
    double precipIntensityMax;
    long precipIntensityMaxTime;
    double precipProbability;
    double precipAccumulation;
    String precipType;
    double temperatureHigh;
    long temperatureHighTime;
    double temperatureLow;
    long temperatureLowTime;
    double apparentTemperatureHigh;
    long apparentTemperatureHighTime;
    double apparentTemperatureLow;
    long apparentTemperatureLowTime;
    double dewPoint;
    double humidity;
    double pressure;
    double windSpeed;
    double windGust;
    long windGustTime;
    int windBearing;
    double cloudCover;
    int uvIndex;
    long uvIndexTime;
    double visibility;
    double ozone;
    double temperatureMin;
    long temperatureMinTime;
    double temperatureMax;
    long temperatureMaxTime;
    double apparentTemperatureMin;
    long apparentTemperatureMinTime;
    double apparentTemperatureMax;
    long apparentTemperatureMaxTime;

    public DailyData() {
    }

    public DailyData(long time, String summary, String icon, long sunriseTime, long sunsetTime, double moonPhase, double precipIntensity, double precipIntensityMax, long precipIntensityMaxTime, double precipProbability, double precipAccumulation, String precipType, double temperatureHigh, long temperatureHighTime, double temperatureLow, long temperatureLowTime, double apparentTemperatureHigh, long apparentTemperatureHighTime, double apparentTemperatureLow, long apparentTemperatureLowTime, double dewPoint, double humidity, double pressure, double windSpeed, double windGust, long windGustTime, int windBearing, double cloudCover, int uvIndex, long uvIndexTime, double visibility, double ozone, double temperatureMin, long temperatureMinTime, double temperatureMax, long temperatureMaxTime, double apparentTemperatureMin, long apparentTemperatureMinTime, double apparentTemperatureMax, long apparentTemperatureMaxTime) {
        this.time = time;
        this.summary = summary;
        this.icon = icon;
        this.sunriseTime = sunriseTime;
        this.sunsetTime = sunsetTime;
        this.moonPhase = moonPhase;
        this.precipIntensity = precipIntensity;
        this.precipIntensityMax = precipIntensityMax;
        this.precipIntensityMaxTime = precipIntensityMaxTime;
        this.precipProbability = precipProbability;
        this.precipAccumulation = precipAccumulation;
        this.precipType = precipType;
        this.temperatureHigh = temperatureHigh;
        this.temperatureHighTime = temperatureHighTime;
        this.temperatureLow = temperatureLow;
        this.temperatureLowTime = temperatureLowTime;
        this.apparentTemperatureHigh = apparentTemperatureHigh;
        this.apparentTemperatureHighTime = apparentTemperatureHighTime;
        this.apparentTemperatureLow = apparentTemperatureLow;
        this.apparentTemperatureLowTime = apparentTemperatureLowTime;
        this.dewPoint = dewPoint;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.windGust = windGust;
        this.windGustTime = windGustTime;
        this.windBearing = windBearing;
        this.cloudCover = cloudCover;
        this.uvIndex = uvIndex;
        this.uvIndexTime = uvIndexTime;
        this.visibility = visibility;
        this.ozone = ozone;
        this.temperatureMin = temperatureMin;
        this.temperatureMinTime = temperatureMinTime;
        this.temperatureMax = temperatureMax;
        this.temperatureMaxTime = temperatureMaxTime;
        this.apparentTemperatureMin = apparentTemperatureMin;
        this.apparentTemperatureMinTime = apparentTemperatureMinTime;
        this.apparentTemperatureMax = apparentTemperatureMax;
        this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public long getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(long sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public long getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(long sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    public double getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(double moonPhase) {
        this.moonPhase = moonPhase;
    }

    public double getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public double getPrecipIntensityMax() {
        return precipIntensityMax;
    }

    public void setPrecipIntensityMax(double precipIntensityMax) {
        this.precipIntensityMax = precipIntensityMax;
    }

    public long getPrecipIntensityMaxTime() {
        return precipIntensityMaxTime;
    }

    public void setPrecipIntensityMaxTime(long precipIntensityMaxTime) {
        this.precipIntensityMaxTime = precipIntensityMaxTime;
    }

    public double getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(double precipProbability) {
        this.precipProbability = precipProbability;
    }

    public double getPrecipAccumulation() {
        return precipAccumulation;
    }

    public void setPrecipAccumulation(double precipAccumulation) {
        this.precipAccumulation = precipAccumulation;
    }

    public String getPrecipType() {
        return precipType;
    }

    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    public double getTemperatureHigh() {
        return temperatureHigh;
    }

    public void setTemperatureHigh(double temperatureHigh) {
        this.temperatureHigh = temperatureHigh;
    }

    public long getTemperatureHighTime() {
        return temperatureHighTime;
    }

    public void setTemperatureHighTime(long temperatureHighTime) {
        this.temperatureHighTime = temperatureHighTime;
    }

    public double getTemperatureLow() {
        return temperatureLow;
    }

    public void setTemperatureLow(double temperatureLow) {
        this.temperatureLow = temperatureLow;
    }

    public long getTemperatureLowTime() {
        return temperatureLowTime;
    }

    public void setTemperatureLowTime(long temperatureLowTime) {
        this.temperatureLowTime = temperatureLowTime;
    }

    public double getApparentTemperatureHigh() {
        return apparentTemperatureHigh;
    }

    public void setApparentTemperatureHigh(double apparentTemperatureHigh) {
        this.apparentTemperatureHigh = apparentTemperatureHigh;
    }

    public long getApparentTemperatureHighTime() {
        return apparentTemperatureHighTime;
    }

    public void setApparentTemperatureHighTime(long apparentTemperatureHighTime) {
        this.apparentTemperatureHighTime = apparentTemperatureHighTime;
    }

    public double getApparentTemperatureLow() {
        return apparentTemperatureLow;
    }

    public void setApparentTemperatureLow(double apparentTemperatureLow) {
        this.apparentTemperatureLow = apparentTemperatureLow;
    }

    public long getApparentTemperatureLowTime() {
        return apparentTemperatureLowTime;
    }

    public void setApparentTemperatureLowTime(long apparentTemperatureLowTime) {
        this.apparentTemperatureLowTime = apparentTemperatureLowTime;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getWindGust() {
        return windGust;
    }

    public void setWindGust(double windGust) {
        this.windGust = windGust;
    }

    public long getWindGustTime() {
        return windGustTime;
    }

    public void setWindGustTime(long windGustTime) {
        this.windGustTime = windGustTime;
    }

    public int getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(int windBearing) {
        this.windBearing = windBearing;
    }

    public double getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public int getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
    }

    public long getUvIndexTime() {
        return uvIndexTime;
    }

    public void setUvIndexTime(long uvIndexTime) {
        this.uvIndexTime = uvIndexTime;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public double getOzone() {
        return ozone;
    }

    public void setOzone(double ozone) {
        this.ozone = ozone;
    }

    public double getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public long getTemperatureMinTime() {
        return temperatureMinTime;
    }

    public void setTemperatureMinTime(long temperatureMinTime) {
        this.temperatureMinTime = temperatureMinTime;
    }

    public double getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public long getTemperatureMaxTime() {
        return temperatureMaxTime;
    }

    public void setTemperatureMaxTime(long temperatureMaxTime) {
        this.temperatureMaxTime = temperatureMaxTime;
    }

    public double getApparentTemperatureMin() {
        return apparentTemperatureMin;
    }

    public void setApparentTemperatureMin(double apparentTemperatureMin) {
        this.apparentTemperatureMin = apparentTemperatureMin;
    }

    public long getApparentTemperatureMinTime() {
        return apparentTemperatureMinTime;
    }

    public void setApparentTemperatureMinTime(long apparentTemperatureMinTime) {
        this.apparentTemperatureMinTime = apparentTemperatureMinTime;
    }

    public double getApparentTemperatureMax() {
        return apparentTemperatureMax;
    }

    public void setApparentTemperatureMax(double apparentTemperatureMax) {
        this.apparentTemperatureMax = apparentTemperatureMax;
    }

    public long getApparentTemperatureMaxTime() {
        return apparentTemperatureMaxTime;
    }

    public void setApparentTemperatureMaxTime(long apparentTemperatureMaxTime) {
        this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
    }
}




