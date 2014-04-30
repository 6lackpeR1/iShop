package com.blythe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blythe.domain.Store;

@Controller
@RequestMapping("/welcome")
public class HomeController {

	@Autowired	
	Store store;

	@RequestMapping(method = RequestMethod.GET)
		public String printWelcome(ModelMap	model) {

			model.addAttribute("message", "Spring 3 MVC Hello World" + store.getName());
			return "hello";
		}
}
