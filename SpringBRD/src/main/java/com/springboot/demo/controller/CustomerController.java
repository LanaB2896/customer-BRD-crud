package com.springboot.demo.controller;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springboot.demo.model.CustomerDetails;
import com.springboot.demo.service.CustomerLogic;

@Controller
public class CustomerController {
	@Autowired
	private CustomerLogic customerLogic;
	
@RequestMapping(value="/", method=RequestMethod.GET)
public String firstPage()
{
	return "NewFile";
}
@RequestMapping(value="/table", method=RequestMethod.GET)
public String table(Model model)
{
//	 List<CustomerDetails> connection = customerLogic.details(model);
	 model.addAttribute("view",  customerLogic.details(model));
	return "view";
}
@RequestMapping(value="/search", method=RequestMethod.GET)
public String search(Model model,CustomerDetails customerDetails)
{
	// customerLogic.update(model, customerDetails);
	model.addAttribute("up",  customerDetails);
return "search";
}

@RequestMapping(value="/search", method=RequestMethod.POST)
public String searchs(Model model,CustomerDetails customerDetails)

{
customerLogic.update(model, customerDetails);
return "search";
} 

@RequestMapping(value="/add", method= RequestMethod.GET)

public String read(CustomerDetails customerDetails)
{
	return "CustomerList";
}

@RequestMapping(value="/add", method=RequestMethod.POST)
 public String read(@Valid @ModelAttribute("customerDetails")CustomerDetails customerDetails,BindingResult bindingResult, Model model)
 {
	if(bindingResult.hasErrors())
	{
		return "CustomerList";
	}
	customerLogic.fromUI(customerDetails);

	customerLogic.details(model);
	return "view";
 }
}
