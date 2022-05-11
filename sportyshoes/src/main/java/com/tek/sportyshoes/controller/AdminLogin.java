package com.tek.sportyshoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tek.sportyshoes.entity.Admin;
import com.tek.sportyshoes.entity.Product;
import com.tek.sportyshoes.service.AdminServiceInter;
import com.tek.sportyshoes.serviceimpl.AdminServiceimpl;

@Controller
public class AdminLogin {

	@Autowired
	AdminServiceInter adminserviceInter;

	@RequestMapping("/adminlogin")
	public String loginAdmin() {
		return "adminlog";

	}
	

	@RequestMapping("/verify")
	public String getdetails(@ModelAttribute("admin") Admin admin , ModelMap model) 
	{
		Admin admin1=adminserviceInter.getdetails();
	   if(admin.getPassword().equals(admin1.getPassword()))
	   {
          return "homepage";
	   }
	   String s="the given password is wrong please enter valid password";
	   model.addAttribute("mes", s);
		return "adminlog";
		
	}

	@RequestMapping("/changeadminpass")
	public String changepass() {
		return "changepass";

	}
	@RequestMapping(value="/updatepass", method=RequestMethod.POST)
	public String updatepassword(@ModelAttribute("admin") Admin admin, ModelMap model) {
		
		String s=adminserviceInter.updatePassword(admin);
		model.addAttribute("con", s);
		return "updatepassword";

	}
	
	
	
}
