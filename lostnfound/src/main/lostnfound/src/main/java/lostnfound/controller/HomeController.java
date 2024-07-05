package lostnfound.controller;

import java.util.List;

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
	
	@RequestMapping(path="/process" ,method=RequestMethod.POST)
	public String formhandler(@RequestParam("item_image") CommonsMultipartFile file,@ModelAttribute Itemdetails item,Model model) // 
	{
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
		
		//modelandview.addAllObjects(list,"allitems");
		modelandview.addObject("list",list);
		
		modelandview.setViewName("itemlist");
		return modelandview;
	}
}
