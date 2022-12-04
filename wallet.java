package jmv;

public class wallet implements Ipayment {
	 public int walletId;
	 public int balance;
	 public int getbalance()
	 {
		 return balance;
	 }
	@Override
	public boolean pay(int amount) {
		if(balance>=amount) {
		balance=balance-amount;
		return true;
		}
		else {
			return false;
			
		}
		
	}
	public boolean addtowallet(int funds,int cardnum ,int pas) {
		card c=new card(cardnum,pas);
		if(c.pay(funds)==true) {
			balance=balance+funds;
			return true;
		}
		else {return false;}
			
	}
	 
}