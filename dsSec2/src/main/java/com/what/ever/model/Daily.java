package com.what.ever.model;

public class Daily {

    String summary;
    String icon;
    DailyData data[];

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

    public DailyData[] getData() {
        return data;
    }

    public void setData(DailyData[] data) {
        this.data = data;
    }
}
