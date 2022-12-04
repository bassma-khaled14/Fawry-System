 package jmv;

public class user {
public String name;
public String mail;
public int pass;
Iservice service;
Ipayment paymethod;
public int walletId;
public void login(String mail,int pass) {
	if(this.mail==mail&& this.pass==pass) {
		System.out.println("Login done successfully");
	}
	else
	{
		System.out.println("Wrong mail or passward try again");
	}
	
}
public void signup(String name,String mail,int pass) {
	this.name=name;
	this.mail=mail;
	this.pass=pass;
	
}
public Iservice search(String servName) {
	if(servName==service.name) {
		return service;
	}
	else {
		return null;
	}
}


}
