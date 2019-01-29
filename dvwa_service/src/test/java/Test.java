import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:springmysql/applicationContextMS-*.xml", "classpath:spring/applicationContext-service.xml"})
public class Test {
    @Autowired
    private UserService userService;

    @org.junit.Test
    public void UserServiceTest() {
        System.out.println(userService.queryUserList().get(0).getPassword());
    }

}
