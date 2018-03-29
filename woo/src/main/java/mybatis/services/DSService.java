package mybatis.services;

import mybatis.mappers.DSMapper;
import mybatis.model.Currently;
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

    public DSRoot getWeather(double latit, double longit){

        String weatherQuery = "https://api.darksky.net/forecast/key/" + latit + "," + longit;

        DSRoot response = restTemplate.getForObject(weatherQuery, DSRoot.class);

        return response;
    }

    public void insertTempIntoDB(Currently currently){

        dsMapper.inputTemp(currently);
    }




}
