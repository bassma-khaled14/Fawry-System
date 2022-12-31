package com.fci.advanced.se.FawrySystem.Controller;
import org.springframework.web.bind.annotation.*;

import com.fci.advanced.se.FawrySystem.Model.user;

@RestController
@RequestMapping("api/v1")
public class UserController {
	public user user_obj=new user();
	public UserController()
	{

	}

	@PostMapping(value="/signup")
	public String signup(@RequestBody user u) {
		int x=0;
		System.out.println(user_obj.getUserEntity().get(0).getMail());
		System.out.println(u.getMail() + u.getName());
		for(int i=0; i<user_obj.getUserEntity().size();i++) {
			if(user_obj.getUserEntity().get(i).getName().equals(u.getName()) || user_obj.getUserEntity().get(i).getMail().equals(u.getMail()))//ahmed-ahmed2
				x++;
		}
		if(x==0)
		{
			user_obj.getUserEntity().add(new user(u.getName(),u.getMail(),u.getpass()));
			return "added to the system";
		}
		else
		{
			return "already exists";
		}
	}
	@GetMapping(value="/login")
	public String login(@RequestBody user u) {
		int x=0;
		for(int i=0; i< user_obj.getUserEntity().size(); i++)
		{
			if(user_obj.getUserEntity().get(i).getMail().equals(u.getMail()) && user_obj.getUserEntity().get(i).getpass()== u.getpass())
			{
				x++;
				break;
			}
		}
		if(x>0)
		{
			return "Logged in successufully";
		}
		else
		{
			return "Incorrect email or password";
		}


	}
	public user getUser(int pass, String mail) //Get> (X) expose le API
	{
		int x=0;
		int key=0;
		for(int i=0; i<user_obj.getUserEntity().size();i++) { //size arraylist; i++)
			key++;
			if (user_obj.getUserEntity().get(i).getpass() == pass && user_obj.getUserEntity().get(i).getMail().equals(mail)) {
				x++;
				break;
			}
		}
		if(x>0)
		{
			return user_obj.getUserEntity().get(key);
		}
		else
		{
			return null;
		}


	}

	/*
	public int[] reqrefund(int trans_num,int serv_id){

		int arr[]=new int[2];
		arr[0]=trans_num;
		arr[1]=serv_id;
		return arr;

	}

	*/
}
