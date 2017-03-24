package com.cts.teja.BO;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.teja.Dao.CustomerDao;
import com.cts.teja.model.Customer;
@Service
public class CustomerBOImpl implements CustomerBo {
	@Autowired
	private CustomerDao customerDao;

	public boolean insertCustomers(Customer cust) throws ClassNotFoundException, SQLException {
		return customerDao.insertCustomers(cust);
	}

	public Map<String, Integer> retrieveCategoryCount() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Map<String, Integer> map = customerDao.retrieveCategoryCount();
		//List<Integer> list = (List<Integer>) map.values();
		int sum = 0;
		for (int val : map.values()) {
			sum = sum + val;
		}

		map.put("Total", sum);
		return map;
	}

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

}
