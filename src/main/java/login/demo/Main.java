package login.demo;

import login.demo.dao.UserDao;
import login.demo.daoimpl.UserDaoImpl;
import login.demo.models.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String [] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserDao dao = (UserDaoImpl) ctx.getBean("orgDao");
        User user = new User ();
        user = dao.getUser("jack");
        System.out.println(user);



    }
}
