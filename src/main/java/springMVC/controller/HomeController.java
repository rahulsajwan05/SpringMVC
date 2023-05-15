package springMVC.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home URL");
		
		model.addAttribute("name","Rahul Sajwan");
		model.addAttribute("id",1245);
		List<String> friends =new ArrayList<String>();
	    friends.add("Test 1");
	    friends.add("Test 12");
	    friends.add("Test 14");
		
	    model.addAttribute("listfriends", friends);
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help");
		ModelAndView modelAndView = new ModelAndView();
		
		
		modelAndView.addObject("name", "Rahul");  
		modelAndView.addObject("id", 1234);  
		LocalDateTime timeDate= LocalDateTime.now();
		modelAndView.addObject("time", timeDate);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(12343);
		list.add(123654);
		list.add(1234);
		modelAndView.addObject("marks", list);
		
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
