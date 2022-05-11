package com.tek.sportyshoes.repositoryimpl;


import java.util.List;

import javax.transaction.TransactionManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.tek.sportyshoes.entity.Admin;
import com.tek.sportyshoes.entity.Product;
import com.tek.sportyshoes.entity.Reports;
import com.tek.sportyshoes.entity.User;
import com.tek.sportyshoes.repository.AdminRepoInter;


@Repository
public class AdminRepoImpl implements AdminRepoInter {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	@Override
	public Admin getData() {
		
		Admin admin = (Admin) hibernateTemplate.get(Admin.class,"admin" );
		
		return admin;
	}

	@Override
	public String updatePassword(Admin admin) {
		hibernateTemplate.update(admin);
		return "YOUR PASSWORD IS UPDATED";
	}

	@Override
	public String addProduct(Product product) {
		int result=(int) hibernateTemplate.save(product);
		String s="the product with id"+"  "+result+"   "+"is added";
		return s;
	}

	@Override
	public String deleteProduct(Product product) {
		
		hibernateTemplate.delete(product);
		String s="the product  deleted";
		return s;
	}

	@Override
	public void updateProduct(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	public java.util.List<Product> showProduct() {
		
		List<Product> list=hibernateTemplate.loadAll(Product.class);
		return list;
	}

	@Override
	public List<User> showUser() {
		List<User> list=hibernateTemplate.loadAll(User.class);
		return list;
	}

	@Override
	public List<Reports> getReports(Reports reports) {

		
		List<Reports> list=(List<Reports>) hibernateTemplate.loadAll(Reports.class);
		
		return list;
		
	}
      
}

	
	
