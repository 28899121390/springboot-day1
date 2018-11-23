import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestUser extends BaseTest{
    @Autowired
    UserService userService;
    @Test
    public void m1(){
        List<User> users = userService.queryAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
