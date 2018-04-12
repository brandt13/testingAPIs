package com.what.ever.services;

import com.what.ever.exceptions.GeneralException;
import com.what.ever.model.DSRoot;
import com.what.ever.mappers.DSMapper;
import com.what.ever.model.DBtempLatLong;
import com.what.ever.services.UserServiceImpl;
import com.what.ever.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.UUID;


@Service
public class DSService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DSMapper dsMapper;

    public DSRoot getAndSaveWeather(double latit, double longit, String apiKey) throws GeneralException {

        String weatherQuery = "https://api.darksky.net/forecast/apiKey/" + latit + "," + longit;

        DSRoot obj = restTemplate.getForObject(weatherQuery, DSRoot.class);

        UserServiceImpl usi = new UserServiceImpl();

        DBtempLatLong weather = new DBtempLatLong();
        User user = new User();
        weather.setLatitude(obj.getLatitude());
        weather.setLongitude(obj.getLongitude());
        weather.setTemperature(obj.getCurrently().getTemperature());
        weather.setapiKey(user.getapiKey());

        usi.checkDBforAPIkeyMatch(apiKey);

        return obj;
    }


    public String generateapiKey(){

        UUID uuid = UUID.randomUUID();
        String key = uuid.toString();

        return key;
    }




}
