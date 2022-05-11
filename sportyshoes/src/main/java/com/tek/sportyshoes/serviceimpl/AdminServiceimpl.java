package com.tek.sportyshoes.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tek.sportyshoes.entity.Admin;
import com.tek.sportyshoes.entity.Product;
import com.tek.sportyshoes.entity.Reports;
import com.tek.sportyshoes.entity.User;
import com.tek.sportyshoes.repository.AdminRepoInter;
import com.tek.sportyshoes.repositoryimpl.AdminRepoImpl;
import com.tek.sportyshoes.service.AdminServiceInter;

@Service
public class AdminServiceimpl implements AdminServiceInter {

	@Autowired
	private AdminRepoInter adminrepointer;
	@Override
	public Admin getdetails() {

		Admin admin=adminrepointer.getData();
		
		
		return admin;
	}
	@Override
	@Transactional(readOnly=false)
	public String updatePassword(Admin admin) {
		
		String s=adminrepointer.updatePassword(admin);
		return s;
	}
	@Override
	@Transactional(readOnly=false)
	public String addProduct(Product product) {
		String s=adminrepointer.addProduct(product);
		return s;
	}
	@Override
	@Transactional(readOnly=false)
	public String deleteProduct(Product product) {
		
		adminrepointer.deleteProduct(product);
		return null;
	}
	@Override
	@Transactional(readOnly=false)
	public void updateProduct(Product product) {
		adminrepointer.updateProduct(product);
	}
	@Override
	public List<Product> showproduct() {
		List<Product> list=adminrepointer.showProduct();
		return list;
	}
	@Override
	public List<User> showUser() {
		List<User> list=adminrepointer.showUser();
		return list;
	}
	@Override
	public List<Reports> getReport(Reports reports) {
		List<Reports> list=adminrepointer.getReports(reports);
		return list;
	}
	
}
