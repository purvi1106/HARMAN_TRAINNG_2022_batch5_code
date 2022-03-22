package com.bookapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/*
 * spring mvc crate a map of 
 * key 	value
 * hellourl----> that method 
 */
@Controller
public class BookController {

	@RequestMapping(path = "hellourl")
	public ModelAndView hello(ModelAndView mv) {
		mv.setViewName("show");	//it contain 2 things : model -> BL view-> logical view name
		mv.addObject("message", "i love programming and teaching");
		return mv;
	}
}
