package jvm;


	import java.util.*;
	import java.util.Vector;

	public class transactions {
		public int size=100000;
		Vector <String> vc =new Vector<>();
	  String []payment=new String [size];
	  String[]addWallet=new String [size];
	  String[]refund=new String [size];
	  public void print() {
		  for(int i=0;i<vc.size();i++){
			  System.out.println(vc.elementAt(i));
		  }
	  }
	  public  void listpayment(int amount) {
		 
		  //String f = Arrays.toString(payment);  //Array in string format
	     // System.out.println(f);
	      String am=String.valueOf(amount);
	     String fina="Payment : "+am;
	      vc.add (fina);
	     System.out.println("Payment : "+am);
	  }
	 
	  public void listrefund(int amount,int trans_num,int ser_id) {

		 
	      String am=String.valueOf(amount);
	      vc.add("refund : "+am);
	  }
	  
	  
	}


