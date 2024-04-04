import enity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    @Test
    public void test001(){
        ApplicationContext appCon = new ClassPathXmlApplicationContext("spring-config.xml");
        User user1 = (User) appCon.getBean("user1");
        User user2 = (User) appCon.getBean("user2");
        //使用构造器
        System.out.println(user1.getUname());
        System.out.println(user1.getHobbyList());
        System.out.println(user1.getResidenceMap());
        System.out.println(user1.getAliasSet());
        //使用setter
        System.out.println(user2.getUname());
        System.out.println(user2.getHobbyList());
        System.out.println(user2.getResidenceMap());
        System.out.println(user2.getAliasSet());


    }
}
