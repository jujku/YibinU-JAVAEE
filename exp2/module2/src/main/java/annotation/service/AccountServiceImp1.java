package annotation.service;

import annotation.dao.AccountDao;

import entity.Account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("AccountServiceImp1")
public class AccountServiceImp1 implements AccountService {
    @Resource(name="AccountDaoImp1")
    private AccountDao accountDao;
    @Override
    public void saveAccount(Account account){
        accountDao.saveAccount(account);
        System.out.println("accountService save");
    }
}
