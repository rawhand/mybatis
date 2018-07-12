package hp.demo.mybatis.mapper;

import hp.demo.mybatis.pojo.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserEntityMapper {

    @Select("SELECT * From users")
    List<UserEntity> getAll();

    @Insert("INSERT INTO users(userName) VALUES(#{userName})")
    @Options(useGeneratedKeys = true, keyProperty = "userId", keyColumn = "userId")
    void insert(UserEntity user);

    @Select("SELECT * FROM users WHERE userName='1'")
    UserEntity test1();

    @Update("UPDATE users SET userName= \"3\", numOne = 10, numTwo = 20 WHERE userName=\"1\"")
    void test2();

    @Select("SELECT * FROM users WHERE userName=#{userName}")
    UserEntity select(@Param("userName") String userName);

    @Delete("DELETE FROM users WHERE userName= #{userName}")
    @Options(useGeneratedKeys = true, keyColumn = "userName", keyProperty = "userName")
    int delete(@Param("userName") String userName);
}
