package pack.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.mappers.UserMapper;

import java.util.UUID;

@Service
public class SecurityService {

    @Autowired
    UserMapper userMapper;

    public String generateApiKey(){

        UUID uuid = UUID.randomUUID();
        String key = uuid.toString();

        return key;
    }

    public boolean authenticateApiKey(String apiKey) {

        boolean isActive = userMapper.authenticate(apiKey);

        try {
            if (isActive) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
