			package lostnfound.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import org.springframework.web.servlet.ModelAndView;

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
	public String userlogin(@ModelAttribute Userlogin user,Model model,HttpSession session,HttpServletRequest request) // 
	{
		//System.out.println(user.username);
		Userlogin user2=this.usermserv.loginuser(user);
		//System.out.println(user2.username);
		if(user2!=null)
		{
			
		  // session = request.getSession(true);
			model.addAttribute("user", user2);
			session.setAttribute("user", user2);
			
			//System.out.println(x);
			System.out.println(user.username);
			usermserv.processRequest(request);
			//System.out.println("by service"+x.username);
			return "Home";
		}
		
		return "loginpage";
	}
	
	@RequestMapping(path="/logout",method=RequestMethod.GET )
	public String logout(HttpSession session,HttpServletRequest request)
	{
		session.removeAttribute("user");	
		session.invalidate();
		//System.out.print(session.getAttribute("user"));
		//session = request.getSession(true);
		return "loginpage";
		
	}
	
	
}
