package annotation.controller;

import annotation.service.AccountService;
import entity.Account;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class AccountController {
    @Resource(name = "AccountServiceImp1")
    private AccountService accountService;

    public AccountController(){
        System.out.println("AccountController实例化");
    }

    public void saveAccount(Account account){
        accountService.saveAccount(account);
        System.out.println("accountController save" + account.getId() + account.getName() + account.getMoney());
    }
}
