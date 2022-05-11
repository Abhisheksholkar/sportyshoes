package com.tek.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tek.sportyshoes.entity.Reports;
import com.tek.sportyshoes.service.AdminServiceInter;

@Controller
public class PurchaseReports {

	@Autowired
		AdminServiceInter adminserviceInter;
		
		
		@RequestMapping("/showreports")
		public String showReport() {
			return "reportshow";
	
	
		}
		@RequestMapping("/showrepobydate")
		public String showReportByDate(@ModelAttribute("reports") Reports reports, ModelMap model) {
			
			List<Reports> list=adminserviceInter.getReport(reports);
			model.addAttribute("report", list);
			String date=reports.getDate();
			model.addAttribute("x", date);
			return "showreportsbydate";
	
	
		}
		@RequestMapping("/showreports1")
		public String showReport1() {
			return "reportshow1";
	
	
		}
		@RequestMapping("/showrepobycategory")
		public String showReportByCategory(@ModelAttribute("reports") Reports reports, ModelMap model) {
			
			List<Reports> list=adminserviceInter.getReport(reports);
			model.addAttribute("report", list);
			String category=reports.getCategory();
			model.addAttribute("x", category);
			return "showreportsbycategory";
	
	
		}
}
