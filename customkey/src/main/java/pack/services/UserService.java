package pack.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.exceptions.GeneralException;
import pack.mappers.UserMapper;
import pack.models.User;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    SecurityService securityService;

    public ArrayList<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public User getUserById(String id) throws GeneralException {
        User u = userMapper.getByID(Integer.parseInt(id));
        if (u == null) {
            throw new GeneralException("User not found");
        }

        return u;
    }

    public User createUser(User user) throws GeneralException {

        String apiKey = securityService.generateApiKey();
        user.setApiKey(apiKey);

        int success = userMapper.insertUser(user);

        if (success == 1){
            User u = userMapper.getByName(user.getFirstName(), user.getLastName());
            return u;
        } else {
            throw new GeneralException("User not created.");
        }

    }

    public User updateUser(User user) throws GeneralException {

        int success = userMapper.updateUser(user);

        if (success == 1) {
            User u = userMapper.getByName(user.getFirstName(), user.getLastName());
            return u;
        } else {
            throw new GeneralException("User not updated.");
        }
    }

    public User deleteUser(String id) throws GeneralException {

        int success = userMapper.deleteById(Integer.parseInt(id));

        if (success == 1) {
            User u = userMapper.getByID(Integer.parseInt(id));
            return u;
        } else {
            throw new GeneralException("User not updated.");
        }

    }
}
