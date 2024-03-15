import com.entity.A;
import com.entity.B;
import com.entity.C;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
    @Test
    public void testGetBeanByClass(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        A classB = context.getBean(B.class);
        classB.run();

        A classC = context.getBean(C.class);
        classC.run();
    }

    @Test
    public void testGetBeanById(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        A classB = (A) context.getBean("classB");
        classB.run();

        A classC = (A) context.getBean("classC");
        classC.run();
    }
}
