package com.cts.teja.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cts.teja.utilities.JdbcHelper;
@Repository
public class CustomerInvoiceDaoImpl implements CustomerInvoiceDao{
	private static String RETRIEVE_PAYMENT_STATUS = "SELECT payment_status, count(payment_status) as Count, SUM(payment_price) as Total   FROM TEJA.invoice GROUP BY payment_status";
	private Connection connection;

	@Override
	public Map<String, Double> retrievePymentStatus() {
		Map<String, Double> map = null;
		try {
			connection = JdbcHelper.getConnection();
			PreparedStatement prepStatement = connection.prepareStatement(RETRIEVE_PAYMENT_STATUS);
			map = new HashMap<String, Double>();
			ResultSet resultSet = prepStatement.executeQuery();
			while (resultSet.next()) {
				String status = resultSet.getString("payment_status");
				Double total= resultSet.getDouble("Total");
				Double count = resultSet.getDouble("Count");
				map.put(status.toUpperCase()+" AMOUNT", total);
				map.put(status.toUpperCase(), count);
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				JdbcHelper.closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return map;

	}

	}


