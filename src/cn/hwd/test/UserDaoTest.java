package cn.hwd.test;

import cn.hwd.dao.UserDao;
import cn.hwd.domain.User;
import org.junit.Test;

public class UserDaoTest {

    @Test
    public void testLogin(){
        User loginUser=new User();
        loginUser.setUsername("supeibody");
        loginUser.setPassword("123");

        UserDao dao=new UserDao();
        User user = dao.login(loginUser);
        System.out.println(user);

    }
}
