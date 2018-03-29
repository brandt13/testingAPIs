package mybatis.model;

public class DBtempLatLong {

    double temperature;
    double latitude;
    double longitude;

    public DBtempLatLong() {
    }

    public DBtempLatLong(DSRoot dsRoot, Currently currently) {
        this.latitude = dsRoot.getLatitude();
        this.longitude = dsRoot.getLongitude();
        this.temperature = currently.getTemperature();
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
