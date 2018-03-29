package mybatis.model;

public class Hourly {

    String summary;
    String icon;
    HourlyData hourlyData[];

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

    public HourlyData[] getHourlyData() {
        return hourlyData;
    }

    public void setHourlyData(HourlyData[] hourlyData) {
        this.hourlyData = hourlyData;
    }
}
