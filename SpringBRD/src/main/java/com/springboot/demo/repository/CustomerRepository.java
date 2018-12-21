package com.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;

import com.springboot.demo.model.CustomerDetails;

public interface CustomerRepository extends JpaRepository<CustomerDetails, Integer>{
	

	public CustomerDetails findByCustomerCode(Integer customerCode);
}
