package com.what.ever.controllers;

import com.what.ever.model.DSRoot;
import com.what.ever.services.DSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")

public class DSController {

    @Autowired
    DSService dsService;


    // @RequestMapping ("/weatherFor")
    public DSRoot displayWeatherInstance(@RequestParam(value="latit", defaultValue = "0.0") double latit,
                                         @RequestParam(value="longit", defaultValue = "0.0") double longit){ // ,
                                         //  @RequestParam(value="save", defaultValue = "false") boolean save


        return dsService.getAndSaveWeather(latit,longit); // ,save

    }
}
