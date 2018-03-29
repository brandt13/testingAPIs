package mybatis.model;

public class Flags {

    String[] sources;
    String[] isd_stations;
    String units;

    public Flags(String[] sources, String[] isd_stations, String units) {
        this.sources = sources;
        this.isd_stations = isd_stations;
        this.units = units;
    }

    public Flags() {
    }

    public String[] getSources() {
        return sources;
    }

    public void setSources(String[] sources) {
        this.sources = sources;
    }

    public String[] getIsd_stations() {
        return isd_stations;
    }

    public void setIsd_stations(String[] isd_stations) {
        this.isd_stations = isd_stations;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}
