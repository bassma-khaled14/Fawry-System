package com.fci.advanced.se.FawrySystem.Controller;
import com.fci.advanced.se.FawrySystem.Model.Wallet;
import com.fci.advanced.se.FawrySystem.Model.card;
import com.fci.advanced.se.FawrySystem.Model.user;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/payment")
public class PaymentController {
    public card usercard=new card();
    public Wallet userWallet=new Wallet();
    public UserController userctr = new UserController();
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

   // @PostMapping(value="/pay")
    @PutMapping (value = "/pay/{amount}/{mail}/{pass}")
    public String pay( @PathVariable("amount") int amount, @PathVariable("mail") String mail, @PathVariable("pass") int pass) //Update > update lel wallet(root)
    {
        if(amount>userctr.getUser(pass,mail).getWalletBalance())
            return "Payment failed.";
        else
        {

            userctr.getUser(pass,mail).setWalletBalance(userctr.getUser(pass,mail).getWalletBalance()-amount);
             return "Payment succeeded.";
        }

    }

}
