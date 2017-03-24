package com.cts.teja.utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

	private Properties props = new Properties();

	public PropertyReader() {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		try{
			InputStream resourceStream = loader.getResourceAsStream("jdbc.properties");
		    props.load(resourceStream);
		} catch (FileNotFoundException e) {
			System.out.println("jdbc.properties file is missing. the error message is" + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("error in reading jdbc.properties. the error message is" + e.getMessage());
			e.printStackTrace();
		}
	}

	public String getProperty(String property) {
		String value = props.getProperty(property);
		return value;
	}
}
