package com.fci.advanced.se.FawrySystem.Controller;
import com.fci.advanced.se.FawrySystem.Model.Wallet;
import com.fci.advanced.se.FawrySystem.Model.user;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/wallet")
public class AddToWalletController {
    UserController userctr=new UserController();
    public Wallet yourWallet = new Wallet();

    @GetMapping(value = "/AddToWallet/{amount}/{mail}/{pass}")
    public String AddToWalletController(@PathVariable("amount") int amount, @PathVariable("mail") String mail, @PathVariable("pass") int pass) {

        if (amount < userctr.getUser(pass,mail).getCardBalance()) {
            userctr.getUser(pass,mail).setWalletBalance(amount);
            return "Amount added successfully";
        }
        else
        {
            return "Insufficient balance";
        }
    }
}
