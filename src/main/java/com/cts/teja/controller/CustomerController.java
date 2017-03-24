package com.cts.teja.controller;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.teja.BO.CustomerBo;
import com.cts.teja.BO.CustomerInvoiceBO;

@Controller
public class CustomerController {
	@Autowired
	private CustomerBo customerBo;
	@Autowired
	private CustomerInvoiceBO customerInvBO;

	@RequestMapping("/custHome")
	public String helloWorld(ModelMap model) {
		Map<String, Integer> countMap=null;
		Map<String, Double> invoice=null;
		try {
			countMap = customerBo.retrieveCategoryCount();
			invoice = customerInvBO.retrievePymentStatus();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("countMap", countMap);
		model.addAttribute("invoice", invoice);
		return "custHome";
	}

	public CustomerBo getCustomerBo() {
		return customerBo;
	}

	public void setCustomerBo(CustomerBo customerBo) {
		this.customerBo = customerBo;
	}

	public CustomerInvoiceBO getCustomerInvBO() {
		return customerInvBO;
	}

	public void setCustomerInvBO(CustomerInvoiceBO customerInvBO) {
		this.customerInvBO = customerInvBO;
	}
}
