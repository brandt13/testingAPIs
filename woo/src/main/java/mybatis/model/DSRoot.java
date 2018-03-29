package mybatis.model;

public class DSRoot {

    double latitude;
    double longitude;
    String timezone;
    Currently currently;
    Minutely minutely;
    Hourly hourly;
    Daily daily;
    Flags flags;
    DBtempLatLong dBtempLatLong;


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

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Currently getCurrently() {
        return currently;
    }

    public void setCurrently(Currently currently) {
        this.currently = currently;
    }

    public Minutely getMinutely() {
        return minutely;
    }

    public void setMinutely(Minutely minutely) {
        this.minutely = minutely;
    }

    public Hourly getHourly() {
        return hourly;
    }

    public void setHourly(Hourly hourly) {
        this.hourly = hourly;
    }

    public Daily getDaily() {
        return daily;
    }

    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public DBtempLatLong getdBtempLatLong() {
        return dBtempLatLong;
    }

    public void setdBtempLatLong(DBtempLatLong dBtempLatLong) {
        this.dBtempLatLong = dBtempLatLong;
    }
}
