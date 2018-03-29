package mybatis.mappers;

import mybatis.model.Currently;
import mybatis.model.DailyData;
import org.apache.ibatis.annotations.*;


@Mapper
public interface DSMapper {

    String INPUT_TEMP = "INSERT INTO `weather`.`temperatures` (`temperature`, `latitude`,`longitude`) " +
            "VALUES (#{temperature}, #{latitude}, #{longitude});";

    @Insert(INPUT_TEMP)
    public int inputTemp(Currently currently);



}
