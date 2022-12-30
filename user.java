package com.fci.advanced.se.FawrySystem;
import java.util.ArrayList;
public class user {
    public String name;
    public String mail;
    public Integer pass;
    public double NewUserDiscount = 0.1;
    public double specificDiscount;
    public static ArrayList<user> userentity=new ArrayList<user>();

    public com.fci.advanced.se.FawrySystem.wallet wallet = new wallet();
    public user()
    {
        userentity.add(new user("bassma","bassma@gmail",123));
    }
    public user(String name, String mail, Integer pass)
    {
        this.name=name;
        this.mail=mail;
        this.pass=pass;
    }
    public ArrayList<user> getUserEntity()
    {
       return userentity;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setMail(String mail)
    {
        this.mail=mail;
    }
    public void setpass(int pass)
    {
        this.pass=pass;
    }
    public String getName()
    {
        return name;
    }
    public String getMail()
    {
        return mail;
    }
    public int getpass()
    {
        return pass;
    }
    public void setUserentity(String name,String mail,int pass)
    {
        userentity.add(new user(name,mail,pass));
    }
    public void setDiscount(double discount)
    {
        specificDiscount = discount;
    }
    public double getDiscount()
    {
        return specificDiscount;
    }
    public void setWalletBalance(int balance)
    {

    }

}
