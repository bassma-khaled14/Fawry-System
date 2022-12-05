package jvm;

public class specific_disc  extends Idiscounts{
	public int dis;

	public String name=" specific discount";
public String getname() {
		
		return name;
	}
 public void knowpres(int dis) {
	 this.dis=dis;
 }
 
public int execute(service_provider providername,int telephone,int amount) {

	int newAmount=amount*dis/100;
	 return des_serv.execute(providername, telephone, newAmount);
}


}
