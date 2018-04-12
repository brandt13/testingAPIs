package com.what.ever.services;

import com.what.ever.exceptions.GeneralException;
import com.what.ever.model.Role;
import com.what.ever.model.User;
import com.what.ever.repository.RoleRepository;
import com.what.ever.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashSet;


@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private DSService dsService;

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUser(User user) {

        user.setapiKey(dsService.generateapiKey());
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);
    }

    public User checkDBforAPIkeyMatch(String apiKey) throws GeneralException {

        User user = userRepository.findByapiKey(apiKey);

        String key = user.getapiKey();

        if (key == null)
            throw new GeneralException("Invalid API key.");
        else
            return userRepository.findByapiKey(apiKey);

    }

}