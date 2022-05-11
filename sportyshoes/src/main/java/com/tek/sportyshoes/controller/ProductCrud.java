package com.tek.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tek.sportyshoes.entity.Product;
import com.tek.sportyshoes.service.AdminServiceInter;


@Controller
public class ProductCrud {
	
	@Autowired
	AdminServiceInter adminserviceInter;
	
	
	@RequestMapping("/home")
	public String addedp() {
		return "homepage";
	}
	@RequestMapping("/productp")
	public String productpage() {
		return "productpage";

	}

	@RequestMapping(value="/addp", method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product, ModelMap model) {
		String s=adminserviceInter.addProduct(product);
		model.addAttribute("done", s);
		return "productadded";

	}
	@RequestMapping("/delete")
	public String productdel() {
		return "productdel";

	}
	@RequestMapping(value="/del", method=RequestMethod.POST)
	public String deleteProduct(@RequestParam("pid") Integer productid, ModelMap model )
	{
		Product product1= new Product(productid);
		adminserviceInter.deleteProduct(product1);
		System.out.println(product1);
		String s= "product deleted wit id ="+productid;
		model.addAttribute("ss",s);
		return "deletedpro";
		
	}
	@RequestMapping("/update")
	public String productup() {
		return "productup";

	}
	@RequestMapping(value="/up", method=RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product") Product product, ModelMap model )
	{
		adminserviceInter.updateProduct(product);
		
		String s= "product updated wit id ="+product.getProductid();
		model.addAttribute("ss",s);
		return "updatedpro";
		
	}
	@RequestMapping("/show")
	public String productshow( ModelMap model) {
		
		List<Product> list=adminserviceInter.showproduct();
		model.addAttribute("prolist", list);
		return "productshow";

	}
}
