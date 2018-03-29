package mybatis.controllers;

import mybatis.model.DSRoot;
import mybatis.services.DSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ds")

public class DSController {

    @Autowired
    DSService dsService;

    @RequestMapping ("/weatherFor")
    public DSRoot displayWeatherInstance(@RequestParam(value="latit", defaultValue = "0.0") double latit,
                                         @RequestParam(value="longit", defaultValue = "0.0") double longit){

        DSRoot obj = dsService.getWeather(latit,longit);
        obj

        return dsService.getWeather(latit,longit);
    }




}
