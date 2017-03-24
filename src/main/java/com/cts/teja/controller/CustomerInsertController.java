package com.cts.teja.controller;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.teja.BO.CustomerBo;
import com.cts.teja.model.Customer;
@Controller
public class CustomerInsertController {
	@Autowired
	private CustomerBo customerBo;
	
	@RequestMapping("/customerInsert")
	public ModelAndView customerInsert() {
		return new ModelAndView("custInsert", "cust", new Customer());
	}
	
	@RequestMapping("/saveCustomer")
	public ModelAndView saveCustomer(@ModelAttribute("cust")Customer customer) {
		boolean insert=false;
		try {
			insert=customerBo.insertCustomers(customer);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/custHome");
	}


	public CustomerBo getCustomerBo() {
		return customerBo;
	}

	public void setCustomerBo(CustomerBo customerBo) {
		this.customerBo = customerBo;
	}

}
