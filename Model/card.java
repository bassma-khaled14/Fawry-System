package com.fci.advanced.se.FawrySystem.Model;

import com.fci.advanced.se.FawrySystem.Ipayment;

public class card {
  public int cardnum;
  public int pas;
  public int cardbalance=10000;

  public card()
  {

  }
	
	public card(int cardnum, int pas) {
		 this.cardnum=cardnum;
		  this.pas=pas;
	}
	public void setCardnum(int cardnum)
	{
		this.cardnum=cardnum;
	}
	public int getCardnum()
	{
		return cardnum;
	}
	public void setCardbalance(int cardbalance)
	{
		this.cardbalance=cardbalance;
	}
	public int getCardbalance()
	{
		return cardbalance;
	}



}
