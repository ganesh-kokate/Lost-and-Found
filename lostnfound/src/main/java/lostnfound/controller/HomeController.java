package lostnfound.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;



import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import lostnfound.model.Itemdetails;
import lostnfound.model.Userlogin;
import lostnfound.service.itemservice;


@Controller
public class HomeController {

	@Autowired
	private itemservice itemserv;
	
	@RequestMapping("/home")
	public String home()
	{
		//m.addAttribute("name", "Ganesh");
		System.out.println("this is view");
		
		return "Home";
	}
	
//	@RequestMapping("/home")
//	public String returntohome()
//	{
//		//m.addAttribute("name", "Ganesh");
//		System.out.println("this is view");
//		
//		return "Home";
//	}
	@RequestMapping("/find")
	public String find()
	{
		
		return "finditemform";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		
		return "about";
	}
	
	@RequestMapping("/contact")
	//@PostMapping("/contact")
	public String contact()
	{
		
		return "contact";
	}
	@RequestMapping("/mydata")
	public ModelAndView mydata(HttpSession session,HttpServletRequest request)
	{
		ModelAndView modelandview = new ModelAndView();
		int x=itemserv.processRequest(request);
		List<Itemdetails> list = this.itemserv.getitemlistbyid(x);
		
         modelandview.addObject("list",list);
		
		modelandview.setViewName("mydata");
		return modelandview;
		//return "mydata";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(@RequestParam("itemid") int itemid) {
		itemserv.deleteItemservice(itemid);
		return "Home";
		
		
	}
	
	@RequestMapping(path="/process" ,method=RequestMethod.POST)
	public String formhandler(@RequestParam("item_image") CommonsMultipartFile file,@ModelAttribute Itemdetails item,@ModelAttribute Userlogin user,Model model,HttpSession session,HttpServletRequest request) // 
	{
		//Userlogin currentuser=(Userlogin) session.getAttribute("user");
		//System.out.println(currentuser.getUsername());
		//item.setUids(currentuser.getId());
		int x=itemserv.processRequest(request);
		//changes
		System.out.println(x);
		item.setU(x);
		
		System.out.println(file.getOriginalFilename());
		byte[] image = file.getBytes();
		item.setImage(image);
		this.itemserv.createitem(item);
		
		return "success";
	}
	
	
	
	@RequestMapping("/itemlist")
	public ModelAndView itemlist()
	{
		ModelAndView modelandview = new ModelAndView();
		List<Itemdetails> list = this.itemserv.getitemlist();
		//System.out.println(list);
		
//		list.forEach(item -> {
//	        if (item.getUids() == null) {
//	            item.setUids(0); // Set a default value or handle it as needed
//	        }
//	    });
	
		//modelandview.addAllObjects(list,"allitems");
		modelandview.addObject("list",list);
		
		modelandview.setViewName("itemlist");
		return modelandview;
	}
}
