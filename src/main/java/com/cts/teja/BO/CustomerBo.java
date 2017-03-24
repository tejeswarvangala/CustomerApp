package com.cts.teja.BO;

import java.sql.SQLException;
import java.util.Map;

import com.cts.teja.model.Customer;

public interface CustomerBo {
	boolean insertCustomers(Customer cust) throws ClassNotFoundException, SQLException;
	Map<String,Integer> retrieveCategoryCount() throws ClassNotFoundException, SQLException;
}
