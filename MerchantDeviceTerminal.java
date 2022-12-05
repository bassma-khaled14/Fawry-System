package jvm;
import java.util.Scanner;
public class MerchantDeviceTerminal {
 public static void main(String[] args) {
	 transactions obj= new transactions();
	
	  while(true) 
	{
	System.out.println("manue for user");
	 System.out.println("pleace Choose an option ");
	 System.out.println("1.log in");
	 System.out.println("2.Sign up");
	 System.out.println("3.Search for service");
	 System.out.println("4.Pay for service");
	 System.out.println("5.ask for refund");
	 System.out.println("manue for admin");
	 System.out.println("6.add overall dicount");
	 System.out.println("7.add specific dicount");
	 System.out.println("8.list user transactions");
	 user a=new user();
	 admin d=new admin();
	 Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  if(num==1) {
		  System.out.println("Enter mail");
		  String s=sc.next();
		  System.out.println("Enter passward");
		  int pass = sc.nextInt();
		 
		if(  (a.login(s, pass))==true) {
			System.out.println("Welcome to system");
		}
		else {
			System.out.println("Try again");
		}
		  
	  }
	  if(num==2) {
		  System.out.println("Enter name");
		  String nam=sc.next();
		  System.out.println("Enter mail");
		  String em=sc.next();
		  System.out.println("Enter passward");
		  int pas = sc.nextInt();
		if(  a.signup(nam, em, pas)==true) {
		 System.out.println("welcome to system") ;
	  }
		else {
			System.out.println("try again");
			}
		}
	  if(num==3) {
		  System.out.println("Enter service name");
		  String sn=sc.next();
		 if( a.search(sn)==null) {
			 System.out.println("service does not exist");
		 }
		 	}
	  if(num==4) {
		  System.out.println("Choose payment method");
		  System.out.println("1.card");	
		  System.out.println("2.cash");	
		  System.out.println("3.wallet");
		  int pa = sc.nextInt();
		
		  if(pa==1) {
			 
			  System.out.println("enter card num");	
			  int cn = sc.nextInt();
			  System.out.println("enter pass");
			  int cp = sc.nextInt();
			 Ipayment p=new card(cn,cp);
			  System.out.println("Enter amount");
			  int am=sc.nextInt();
			  obj.listpayment(am);

			 if( p.pay(am)==true) {
				 System.out.println("done ");
			 }
			 else {
				 System.out.println("try again");
			 }
			  
			  }
		  if(pa==2) {
			  Ipayment p = new cash();
			  int am=sc.nextInt();
			  p.pay(am);
			  obj.listpayment(am);
			 
			  
		  }
		  if(pa==3) {
			  Ipayment p = new wallet();
			  int am=sc.nextInt();
			  p.pay(am);
			  obj.listpayment(am);
		  }
	  }
	  if(num==5) {
		  System.out.println("Enter transaction number");
		  int tn=sc.nextInt();
		  System.out.println("Enter service id");
		  int si=sc.nextInt();
		  a.reqrefund(tn, si);
		  System.out.println("request done");
		  
	  }
	  if(num==6) {
		  System.out.println("Enter the discount precentages");
		  int dp=sc.nextInt();
		  d.setdiscountpres(dp);
		System.out.println("the discount added");
		  
		  
	  }
	  if(num==7) {
		  System.out.println("Enter the discount precentages");
		  int dp=sc.nextInt();
		  d.setdiscountpres(dp);
		System.out.println("the discount added");
	  }
	  if(num==8) {
		  obj.print();
	  }
	  
	  
  }
	  }
 
}
