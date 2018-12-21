package com.springboot.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class CustomerDetails {
	private Integer customerCode;
	
	
	@NotNull(message="Name should not be empty")
	@Pattern(regexp="[a-zA-Z0-9]+", message="Invalid Format")
	@Size(min=1,max=30)
	private String customerName;
	@Lob
	@NotEmpty  
	private String customerAddress;
	
	@NotNull(message="Pincode should not be empty")
	@Pattern(regexp=".{6}", message="Pincode must be in 6 digits")
	private String customerPincode;
	
	@Email
@NotEmpty
	private String customerEmail;
	
	
	private String customerNumber;

	// @DateTimeFormat (pattern="MM/dd/yyyy")
  //@Past
	private String registrationDate;
	
	@NotEmpty
	private String createdBy;
	
	@NotEmpty
	private String modifiedDate;

	@Id
	@Column(length = 10)
	public Integer getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(Integer customerCode) {
		this.customerCode = customerCode;
	}
	
	@Column(length = 30)
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Column(length = 100)
	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Column(length = 6)
	public String getCustomerPincode() {
		return customerPincode;
	}

	public void setCustomerPincode(String customerPincode) {
		this.customerPincode = customerPincode;
	}
	@Column(length = 100)
	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	@Column(length = 20)
	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
