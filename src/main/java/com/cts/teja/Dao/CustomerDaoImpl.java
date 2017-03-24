package com.cts.teja.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cts.teja.model.Customer;
import com.cts.teja.model.SearchCriteria;
import com.cts.teja.utilities.JdbcHelper;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	private Connection connection;
	private static String INSERT_CUSTOMER = "INSERT INTO TEJA.CUSTOMER (CUST_FNAME, CUST_LNAME, CUST_DOB, CUST_JOINDATE, CATEGORY) VALUES (?,?,?,?,?)";
	private static String RETRIEVE_CATEGORY_COUNT = "SELECT CATEGORY, COUNT(CUST_ID) AS CAT_COUNT FROM TEJA.CUSTOMER GROUP BY CATEGORY";

	public boolean insertCustomers(Customer cust) {
		try {
			connection = JdbcHelper.getConnection();
			PreparedStatement prepStatement = connection.prepareStatement(INSERT_CUSTOMER);
			prepStatement.setString(1, cust.getCustomerFname());
			prepStatement.setString(2, cust.getCustomerLname());
			prepStatement.setDate(3, convertToSQLDate(cust.getDob()));
			prepStatement.setDate(4, convertToSQLDate(cust.getDoj()));
			prepStatement.setString(5, cust.getCategory());
			int result = prepStatement.executeUpdate();
			if (result == 1) {
				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				JdbcHelper.closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	private Date convertToSQLDate(String dateString) {
		SimpleDateFormat format = new SimpleDateFormat("mm/dd/yyyy");
        java.util.Date parsed=null;
		try {
			parsed = format.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if (parsed!=null) {
			return new java.sql.Date(parsed.getTime());
		} else{
			return null;
		}
	}

	public List<Customer> searchCustomers(SearchCriteria search) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Integer> retrieveCategoryCount() {

		Map<String, Integer> map = null;
		try {
			connection = JdbcHelper.getConnection();
			PreparedStatement prepStatement = connection.prepareStatement(RETRIEVE_CATEGORY_COUNT);
			map = new HashMap<String, Integer>();
			ResultSet resultSet = prepStatement.executeQuery();
			while (resultSet.next()) {
				String category = resultSet.getString("category");
				Integer count = resultSet.getInt("CAT_COUNT");
				map.put(category, count);
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
