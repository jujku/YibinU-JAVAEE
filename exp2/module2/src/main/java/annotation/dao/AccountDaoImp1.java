package annotation.dao;

import entity.Account;
import org.springframework.stereotype.Repository;

@Repository("AccountDaoImp1")
public class AccountDaoImp1 implements AccountDao {
    @Override
    public void saveAccount(Account account){
        System.out.println("AccountDao save");
    }
}
