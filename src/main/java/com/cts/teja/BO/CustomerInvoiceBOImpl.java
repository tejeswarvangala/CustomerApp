package com.cts.teja.BO;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.teja.Dao.CustomerInvoiceDao;
@Service
public class CustomerInvoiceBOImpl implements CustomerInvoiceBO {
	@Autowired
	private CustomerInvoiceDao custInDao;

	@Override
	public Map<String, Double> retrievePymentStatus() throws ClassNotFoundException, SQLException {
		Map<String, Double> map = custInDao.retrievePymentStatus();
			Double sum = 0.0;
		for (Double val : map.values()) {
			sum = sum + val;
		}
		map.put("Total", sum);
		return map;
	}

	public CustomerInvoiceDao getCustInDao() {
		return custInDao;
	}

	public void setCustInDao(CustomerInvoiceDao custInDao) {
		this.custInDao = custInDao;
	}

}
