package mybatis.services;

import mybatis.mappers.DSMapper;
import mybatis.model.DBtempLatLong;
import mybatis.model.DSRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class DSService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DSMapper dsMapper;

    public DSRoot getAndSaveWeather(double latit, double longit, boolean save){

        String weatherQuery = "https://api.darksky.net/forecast/key/" + latit + "," + longit;

        DSRoot obj = restTemplate.getForObject(weatherQuery, DSRoot.class);

        DBtempLatLong weather = new DBtempLatLong();
        weather.setLatitude(obj.getLatitude());
        weather.setLongitude(obj.getLongitude());
        weather.setTemperature(obj.getCurrently().getTemperature());

        if (save) {
            insertTempIntoDB(weather);
        }

        return obj;
    }

    public void insertTempIntoDB(DBtempLatLong db){

        int i = dsMapper.inputTemp(db);
        System.out.println(i);
    }


}
