import mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springmysql/applicationContextMS-*.xml")
public class UserTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void queryUserTest()
    {
        System.out.println("查询出的姓名为"+userMapper.queryUserList().get(0).getUsername());
    }
}
