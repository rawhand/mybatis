package hp.demo.mybatis.mapper;

import hp.demo.mybatis.entity.StatusEnum;
import hp.demo.mybatis.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        String userName = UUID.randomUUID().toString().replace("-", "");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        User userEntity = new User(null, userName, 10L, 20L, timestamp, StatusEnum.Error);
        userMapper.insert(userEntity);
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}