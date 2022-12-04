 package jmv;

 public class card implements Ipayment {
	  public int cardnum;
	  public int pas;
	  public int cardbalance;
	  card(int cardnum,int pas){
		  this.cardnum=cardnum;
		  this.pas=pas;
	  }
		@Override
		
		public boolean pay(int amount) {
			if(cardbalance>=amount) {
				cardbalance=cardbalance-amount;
				return true;
				}
				else {
					return false;
				}
				
		}

	}