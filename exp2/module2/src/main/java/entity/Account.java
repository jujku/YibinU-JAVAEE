package entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Account {
    private Integer id = 1;
    private String name = "Tom";
    private Float money = 2000.0f;

    public Integer getId(){return this.id;}
    public void setId(Integer id){this.id = id;}
    public String getName(){return this.name;}
    public  void setName(String name){this.name = name;}
    public Float getMoney(){return this.money;}
    public void setMoney(Float money){this.money = money;}

}
