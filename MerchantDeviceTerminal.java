package os;
import java.util.ArrayList;
import java.util.Scanner;
public class MerchantDeviceTerminal {
 public static void main(String[] args) {
	 transactions obj= new transactions();
	 ArrayList<user> a2 = new ArrayList<user>();
	 user a=new user();
	 admin d=new admin();
	  while(true) 
	{
	 System.out.println("Menu for user");
	 System.out.println("Please Choose an option ");
	 System.out.println("1.Log in");
	 System.out.println("2.Sign up");
	 System.out.println("Menu for admin");
	 System.out.println("6.Add overall dicount");
	 System.out.println("7.Add specific dicount");
	 System.out.println("8.List user transactions");
	 System.out.println("9.System Termination");
	 

	 Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  if(num==2) {
		  System.out.println("Enter name");
		  String nam=sc.next();
		  System.out.println("Enter mail");
		  String em=sc.next();
		  System.out.println("Enter password, numeric");
		  int pas = sc.nextInt();
		if(a.signup(a2,nam, em, pas)==true) {
		 System.out.println("Welcome to system") ;
		 a2.add(new user(nam,em,pas));
	  }
		else {
			System.out.println("Try again, mail or username already exists");
			 }
		}
	  if(num==1) {
		  System.out.println("Enter mail");
		  String s=sc.next();
		  System.out.println("Enter password");
		  int pass = sc.nextInt();
		 
		if(  (a.login(a2,s, pass))==true) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Welcome to system");
			 System.out.println("3.Search for service");
			 System.out.println("4.Pay for service");
			 System.out.println("5.Ask for refund");
			int num1 = s1.nextInt();
			  if(num1==3) {
				  System.out.println("Enter service name");
				  String sn=sc.next();
				 if( a.search(sn)==null) {
					 System.out.println("Service does not exist");
				 }
				 	}
			  if(num1==4) {
				  System.out.println("Choose payment method");
				  System.out.println("1.Card");	
				  System.out.println("2.Cash");	
				  System.out.println("3.Wallet");
				  int pa = sc.nextInt();
				
				  if(pa==1) {
					 
					  System.out.println("Enter card num");	
					  int cn = sc.nextInt();
					  System.out.println("Enter pass");
					  int cp = sc.nextInt();
					 Ipayment p=new card(cn,cp);
					  System.out.println("Enter amount");
					  int am=sc.nextInt();
					  obj.listpayment(am);

					 if( p.pay(am)==true) {
						 System.out.println("Done ");
					 }
					 else {
						 System.out.println("Try again");
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
					  System.out.println("Enter amount");
					  int am=sc.nextInt();
					  p.pay(am);
					  obj.listpayment(am);
				  }
			  }
			  if(num1==5) {
				  System.out.println("Enter transaction number");
				  int tn=sc.nextInt();
				  System.out.println("Enter service id");
				  int si=sc.nextInt();
				  a.reqrefund(tn, si);
				  System.out.println("Request done");
				  
			  }
		}
		else {
			System.out.println("Incorrect email or password, please try again.");
		}
		  
	  }

	  if(num==7) {
		  System.out.println("Enter the discount precentages");
		  double dp=sc.nextDouble();
		  for(int i=0; i<a2.size();i++)
		  {d.addDiscount(a2.get(i),dp);}
		System.out.println("The discount added");
	  }
	  if(num==8) {
		  obj.print();
	  }
	  if(num==9)
	  {
		  System.out.println("System Terminated Successfully.");
		  break;
	  }
	  
	  
  }
	  }
 
}
