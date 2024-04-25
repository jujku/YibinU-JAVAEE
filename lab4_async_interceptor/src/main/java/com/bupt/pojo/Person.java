package com.bupt.pojo;

import javax.swing.*;

public class Person {
    private String pname;
    private String password;
    private Integer page;

    public String getPname(){ return this.pname; }
    public void setPname(String pname){
        this.pname = pname;
    }

    public String getPassword(){ return this.password;}
    public void setPassword(String password){ this.password = password;}

    public Integer getPage(){return this.page;}
    public void setPage(Integer page){
        this.page = page;
    }
}
