package com.tek.sportyshoes.service;

import java.util.List;

import com.tek.sportyshoes.entity.Admin;
import com.tek.sportyshoes.entity.Product;
import com.tek.sportyshoes.entity.Reports;
import com.tek.sportyshoes.entity.User;

public interface AdminServiceInter {
	public Admin getdetails();

	public  String updatePassword(Admin admin);

	public String addProduct(Product product);

	public String deleteProduct(Product product);

	public void updateProduct(Product product);

	public List<Product> showproduct();

	public List<User> showUser();

	public List<Reports> getReport(Reports reports);


}
