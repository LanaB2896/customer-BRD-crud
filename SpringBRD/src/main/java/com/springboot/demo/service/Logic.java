package com.springboot.demo.service;

import java.util.List;

import org.springframework.ui.Model;

import com.springboot.demo.model.CustomerDetails;

public interface Logic {

public void fromUI(CustomerDetails customerDetails);
public  List<CustomerDetails> details(Model model);
public void update(Model model,CustomerDetails customerDetails);
}
