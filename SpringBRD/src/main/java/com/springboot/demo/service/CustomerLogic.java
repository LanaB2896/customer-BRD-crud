package com.springboot.demo.service;

import java.util.List;

import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.springboot.demo.model.CustomerDetails;
import com.springboot.demo.repository.CustomerRepository;
@Service
public class CustomerLogic implements Logic {
@Autowired 
private CustomerRepository customerRepository;


@Override
public void fromUI(CustomerDetails customerDetails)
{
	CustomerDetails detail = new CustomerDetails();
	detail.setCustomerCode(customerDetails.getCustomerCode());
	detail.setCustomerName(customerDetails.getCustomerName());
	detail.setCustomerAddress(customerDetails.getCustomerAddress());
	detail.setCustomerPincode(customerDetails.getCustomerPincode());
	detail.setCustomerEmail(customerDetails.getCustomerEmail());
	detail.setCustomerNumber(customerDetails.getCustomerNumber());
	detail.setRegistrationDate(customerDetails.getRegistrationDate());
	detail.setCreatedBy(customerDetails.getCreatedBy());
	detail.setModifiedDate(customerDetails.getModifiedDate());
	customerRepository.save(detail);
}
@Override
public List<CustomerDetails>details(Model model)
{
	model.addAttribute("view",customerRepository.findAll());
	return customerRepository.findAll();
	
}
@Override
public void update(Model model,CustomerDetails customerDetails) {
	model.addAttribute("up", customerRepository.findByCustomerCode(customerDetails.getCustomerCode()));
	
}

}
