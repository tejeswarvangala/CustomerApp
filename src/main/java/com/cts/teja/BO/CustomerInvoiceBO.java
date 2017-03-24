package com.cts.teja.BO;

import java.sql.SQLException;
import java.util.Map;

public interface CustomerInvoiceBO {
	Map<String,Double> retrievePymentStatus() throws ClassNotFoundException, SQLException;
}
