package pack.mappers;


import org.apache.ibatis.annotations.*;
import pack.models.User;

import java.util.ArrayList;

@Mapper
public interface UserMapper {

    String GET_ALL_ACTIVE_USERS = "SELECT * FROM `custom_key`.users WHERE isActive = 1";

    String GET_BY_ID = "SELECT * FROM `custom_key`.users WHERE id = #{id}";

    String INSERT_USER = "INSERT INTO `custom_key`.users (firstName, lastName, email, isActive, apiKey) " +
            "VALUES (#{firstName}, #{lastName}, #{email}, #{isActive}, #{apiKey});";

    String UPDATE_USER = "UPDATE `custom_key`.users SET firstName = #{firstName}, lastName = #{lastName}, email = #{email}, " +
            "isActive = #{isActive}, apiKey = #{apiKey} WHERE id = #{id}";

    String DELETE_USER = "UPDATE `custom_key`.users SET isActive = 0 WHERE id = #{id}";

    String GET_BY_NAME = "SELECT * FROM `custom_key`.users WHERE firstName = #{arg0} and lastName = #{arg1}";

    String AUTHENTICATE = "SELECT isActive from `custom_key`.users where apiKey = #{apiKey}";

    @Select(GET_ALL_ACTIVE_USERS)
    public ArrayList<User> getAllUsers();

    @Select(GET_BY_NAME)
    public User getByName(String firstName, String lastName);

    @Select(GET_BY_ID)
    public User getByID(int id);

    @Insert(INSERT_USER)
    public int insertUser(User user);

    @Update(UPDATE_USER)
    public int updateUser (User user);

    @Delete(DELETE_USER)
    public int deleteById(int id);

    @Select(AUTHENTICATE)
    public boolean authenticate(String apiKey);
}
