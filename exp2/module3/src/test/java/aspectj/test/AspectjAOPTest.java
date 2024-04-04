package aspectj.test;

import aspectj.dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectjAOPTest {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        ApplicationContext appCon = new ClassPathXmlApplicationContext("aspectj-config.xml");
        TestDao testDaoAdvice = (TestDao)appCon.getBean("testDao");
        testDaoAdvice.save();
        System.out.println("====================");
        testDaoAdvice.modify();
        System.out.println("=====================");
        testDaoAdvice.delete();
    }
}
