package pack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pack.exceptions.AuthenticationException;
import pack.exceptions.GeneralException;
import pack.models.User;
import pack.services.SecurityService;
import pack.services.UserService;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    SecurityService securityService;

    @GetMapping("/")
    public ArrayList<User> getAllUsers(@RequestParam("api-key") String apiKey) throws AuthenticationException {

        if (securityService.authenticateApiKey(apiKey))
            return userService.getAllUsers();
        else
            throw new AuthenticationException("Invalid API Key.");
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") String id,
                            @RequestParam("api-key") String apiKey) throws GeneralException, AuthenticationException {

        if (securityService.authenticateApiKey(apiKey))
            return userService.getUserById(id);
        else
            throw new AuthenticationException("Invalid API Key.");

    }

    @PostMapping("/")
    public User createUser(@RequestBody User user) throws GeneralException {

        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user) throws GeneralException, AuthenticationException {

        if (securityService.authenticateApiKey(user.getApiKey()))
            return userService.updateUser(user);
        else
            throw new AuthenticationException("Invalid API Key.");
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable("id") String id,
                           @RequestParam("api-key") String apiKey) throws GeneralException, AuthenticationException {

        if (securityService.authenticateApiKey(apiKey))
            return userService.deleteUser(id);
        else
            throw new AuthenticationException("Invalid API Key.");

    }
}
