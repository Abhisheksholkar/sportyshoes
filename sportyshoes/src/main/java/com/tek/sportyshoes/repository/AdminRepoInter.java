package com.tek.sportyshoes.repository;

import java.util.List;

import com.tek.sportyshoes.entity.Admin;
import com.tek.sportyshoes.entity.Product;
import com.tek.sportyshoes.entity.Reports;
import com.tek.sportyshoes.entity.User;



public interface AdminRepoInter {
	
	
	
	public Admin getData();

	public String updatePassword(Admin admin);

	public String addProduct(Product product);

	public String deleteProduct(Product product);

	public void updateProduct(Product product);

	public List<Product> showProduct();

	public List<User> showUser();

	public List<Reports> getReports(Reports reports);


}
