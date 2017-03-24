package com.cts.teja.Dao;

import java.util.List;
import java.util.Map;

import com.cts.teja.model.Customer;
import com.cts.teja.model.SearchCriteria;

public interface CustomerDao {

	boolean insertCustomers(Customer cust);
	List<Customer> searchCustomers(SearchCriteria search);
	Map<String,Integer> retrieveCategoryCount();
}
