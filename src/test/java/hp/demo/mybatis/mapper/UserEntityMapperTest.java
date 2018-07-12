package hp.demo.mybatis.mapper;

import hp.demo.mybatis.entity.StatusEnum;
import hp.demo.mybatis.pojo.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserEntityMapperTest {

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Test
    public void getAll() {
        List<UserEntity> userEntityList = userEntityMapper.getAll();
        userEntityList.forEach(ele -> System.out.println(ele.toString()));
    }

    @Test
    public void insert() {
        String userName = UUID.randomUUID().toString().replace("-", "");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        UserEntity userEntity = new UserEntity(null, userName, 10L, 20L, timestamp, StatusEnum.Error);
        userEntityMapper.insert(userEntity);
    }

    @Test
    public void test1() {
    }

    @Test
    public void test2() {
    }

    @Test
    public void select() {
    }

    @Test
    public void delete() {
    }
}