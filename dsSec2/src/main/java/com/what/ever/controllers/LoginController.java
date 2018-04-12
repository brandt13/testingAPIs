package com.what.ever.controllers;

import com.what.ever.exceptions.GeneralException;
import com.what.ever.model.DSRoot;
import com.what.ever.model.User;
import com.what.ever.model.WeatherUrl;
import com.what.ever.services.DSService;
import com.what.ever.services.UserService;
import com.what.ever.model.DBtempLatLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.what.ever.services.UserServiceImpl;


import javax.validation.Valid;
import java.security.GeneralSecurityException;

@RestController
@Controller
public class LoginController {

    DBtempLatLong db;

    @Autowired
    private UserService userService;
    @Autowired
    private DSService dsService;


    @RequestMapping(value={"/", "/getKey"}, method = RequestMethod.GET)
    public ModelAndView getKey(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("getKey");
        return modelAndView;
    }

    @RequestMapping(value = "/getKey", method = RequestMethod.POST)
    public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        User userExists = userService.findUserByEmail(user.getEmail());

        if (userExists != null) {
            bindingResult
                    .rejectValue("email", "error.user",
                            "There is already a user registered with the email provided");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("getKey");
        } else {
            userService.saveUser(user);
            modelAndView.addObject("successMessage", "Your API Key is " + user.getapiKey());
            modelAndView.addObject("user", new User());
            modelAndView.setViewName("getKey");

        }
        return modelAndView;
    }

    @RequestMapping(value="/weather", method= RequestMethod.GET)
    public DSRoot getWeather(@ModelAttribute WeatherUrl weatherUrl, User user) throws GeneralException {

        String apiKey;
        double latit;
        double longit;

        apiKey = weatherUrl.getapiKey();
        latit = weatherUrl.getLatitude();
        longit = weatherUrl.getLongitude();

        DSRoot obj;
        obj = dsService.getAndSaveWeather(latit, longit, apiKey);

        return obj;
    }
}