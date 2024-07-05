package lostnfound.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import lostnfound.model.Itemdetails;
import lostnfound.model.Userlogin;
import lostnfound.service.userservice;

@Controller
@SessionAttributes ("user")
public class Usercontroller {

	@Autowired
	private userservice usermserv;
	@RequestMapping("/log")
	public String login()
	{
		//m.addAttribute("name", "Ganesh");
		System.out.println("this is login page");
		
		return "Login";
	}
	
	@RequestMapping("/login")
	public String loginintoapp()
	{
		//m.addAttribute("name", "Ganesh");
		System.out.println("this is login page");
		
		return "loginpage";
	}
	
	@RequestMapping(path="/process2" ,method=RequestMethod.POST)
	public String usercreater(@ModelAttribute Userlogin user,Model model) // 
	{
		
		this.usermserv.createuser(user);
		
		return "loginpage";
	}
	
	
	
	@RequestMapping(path="/Home",method=RequestMethod.POST )
	public String userlogin(@ModelAttribute Userlogin user,Model model) // 
	{
		Userlogin user2=this.usermserv.loginuser(user);
		
		if(user2!=null)
		{
			return "Home";
		}
		return "loginpage";
		
	}
	
	
}
