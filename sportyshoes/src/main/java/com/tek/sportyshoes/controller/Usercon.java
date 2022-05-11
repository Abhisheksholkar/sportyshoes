package com.tek.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tek.sportyshoes.entity.Product;
import com.tek.sportyshoes.entity.User;
import com.tek.sportyshoes.service.AdminServiceInter;

@Controller
public class Usercon {
	@Autowired
	AdminServiceInter adminserviceInter;
	
	
	@RequestMapping("/showuser")
	public String userShow(ModelMap model) {
		

		List<User> list=adminserviceInter.showUser();
		model.addAttribute("userlist", list);
		return "usershow";
	}

}
