package jvm;

public class user {
public String name;
public String mail;
public int pass;
Iservice service;
Ipayment paymethod;
public int walletId;
public boolean login(String mail,int pass) {
	if(this.mail==mail&& this.pass==pass) {
		return true;
	}
	else
	{
		return false;
	}
	
}
public boolean signup(String name,String mail,int pass) {
	if(this.name!=name || this.mail!=mail) {
	this.name=name;
	this.mail=mail;
	this.pass=pass;
	return true;
	}
	else {
		return false;
	}
}
public Iservice search(String servName) {
	if(servName==service.name) {
		return service;
	}
	else {
		return null;
	}
	
}
public int[] reqrefund(int trans_num,int serv_id){
	
  int arr[]=new int[2];
  arr[0]=trans_num;
  arr[1]=serv_id;
  return arr;
  
}


}
