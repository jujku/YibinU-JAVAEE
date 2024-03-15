import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01{
    @Test
    public void testSayHello(){
        ApplicationContext appCon = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = (UserService) appCon.getBean("userService");

        userService.sayHello();
    }
}