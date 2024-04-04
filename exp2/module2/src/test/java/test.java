import annotation.controller.AccountController;
import entity.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Account account1 = context.getBean(Account.class);
        account1.setId(1);
        account1.setName("瑞峰");
        account1.setMoney(3000f);

        Account account2 = context.getBean(Account.class);
        account2.setId(2);
        account2.setName("金武");
        account2.setMoney(4000f);

        AccountController controller = context.getBean(AccountController.class);
        controller.saveAccount(account1);
        controller.saveAccount(account2);
    }
}
