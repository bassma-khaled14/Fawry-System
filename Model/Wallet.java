package com.fci.advanced.se.FawrySystem.Model;

public class Wallet {
    public int walletId;
    public int balance=0;
    public Wallet()
    {

    }
    public void setBalance(int balance)
    {
        this.balance=balance;
    }
    public int getbalance()
    {
        return balance;
    }
    public void setWalletId(int walletId)
    {
        this.walletId=walletId;
    }
    public int getWalletId()
    {
        return walletId;
    }


}
