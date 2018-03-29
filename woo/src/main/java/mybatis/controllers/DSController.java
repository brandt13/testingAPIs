package mybatis.controllers;

import mybatis.mappers.DSMapper;
import mybatis.model.Currently;
import mybatis.model.DBtempLatLong;
import mybatis.model.DSRoot;
import mybatis.services.DSService;
import org.omg.CORBA.Current;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ds")

public class DSController {

    @Autowired
    DSService dsService;


    @RequestMapping ("/weatherFor")
    public DSRoot displayWeatherInstance(@RequestParam(value="latit", defaultValue = "0.0") double latit,
                                         @RequestParam(value="longit", defaultValue = "0.0") double longit,
                                         @RequestParam(value="save", defaultValue = "false") boolean save){

        return dsService.getAndSaveWeather(latit,longit,save);
    }






}
