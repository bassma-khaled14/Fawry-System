package com.fci.advanced.se.FawrySystem.Controller;
import com.fci.advanced.se.FawrySystem.Model.Wallet;
import com.fci.advanced.se.FawrySystem.Model.card;
import com.fci.advanced.se.FawrySystem.Model.user;

public class PaymentController {
    public card usercard=new card();
    public Wallet userWallet=new Wallet();
    public boolean pay(int amount) {
        if(usercard.cardbalance>=amount)
        {
            usercard.setCardbalance(usercard.getCardbalance()-amount);
            return true;
        }
        else
        {
            return false;
        }

    }
    public String pay(int amount, user u) //Update > update lel wallet(root)
    {
        if(500>u.getWalletBalance())
            return "Payment failed.";
        else
        {

            u.setWalletBalance(u.getWalletBalance()- 500);
             return "Payment succeeded.";
        }

    }

}
