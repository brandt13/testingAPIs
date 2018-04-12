package com.what.ever.model;

public class Minutely {

    String summary;
    String icon;
    MinutelyData minutelyData[];

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

    public MinutelyData[] getMinutelyData() {
        return minutelyData;
    }

    public void setMinutelyData(MinutelyData[] minutelyData) {
        this.minutelyData = minutelyData;
    }
}
