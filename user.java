
package os;
import java.util.ArrayList;
public class user {
public String name;
public String mail;
public int pass;
Iservice service;
Ipayment paymethod;
public int walletId;
public user()
{
	
}
public user(String name,String mail,int pass)
{
	this.name=name;
	this.mail=mail;
	this.pass=pass;
}
public boolean signup(ArrayList<user> a,String name,String mail,int pass) {
	int x=0;
	for(int i=0; i<a.size();i++) {
		if(a.get(i).getName().equals(name) || a.get(i).getMail().equals(mail))//ahmed-ahmed2
			x++;
	}
	if(x==0)
	{
		return true;
	}
	else
	{
		return false;
	}

	
}
public boolean login(ArrayList<user> a,String mail, int pass) {
	int x=0;
	for(int i=0; i<a.size(); i++)
	{
		if(a.get(i).getMail().equals(mail) && a.get(i).getPassword() == pass)
		{
			x++;
			break;
		}
	}
	if(x>0)
	{
		return true;
	}
	else
	{
		return false;
	}
	
}

public Iservice search(String servName) {
	if(servName.equals(service.name)) {
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
public void setMail(String mail)
{
	this.mail = mail;
}
public void setName(String name)
{
	this.name = name;
}
public void setPassword(int pass)
{
	this.pass = pass;
}
public int getPassword()
{
	return pass;
}
public String getMail()
{
	return mail;
}
public String getName()
{
	return name;
}


}
