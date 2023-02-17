package com.Blink.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	public static Properties a;

	public static Properties fileConfig() throws IOException {

		String projectPath = System.getProperty("user.dir");
		FileReader reader = new FileReader(projectPath + "/src/test/resources/config/config.properties");
		Properties props = new Properties();
		props.load(reader);
		return a = props;

	}

	public static String getBrowser() throws IOException {

		fileConfig();
		String browserName = a.getProperty("browser");
		return browserName;

	}

	public static String getUrl() throws IOException {

		fileConfig();
		String url = a.getProperty("Admin_Weburl");
		return url;

	}

	public static String getStageUrl() throws IOException {

		fileConfig();
		String url = a.getProperty("Stage_url");
		return url;

	}

	public static String getUserId() throws IOException {

		fileConfig();
		String empNo = a.getProperty("userId");
		return empNo;

	}

	public static String getPassword() throws IOException {

		fileConfig();
		String password = a.getProperty("password");
		return password;

	}

	public static String getAdminUrl() throws IOException {

		fileConfig();
		String adminURL = a.getProperty("Admin_url");
		return adminURL;

	}

	public static String getInvalidId() throws IOException {

		fileConfig();
		String invalidID = a.getProperty("invalidUserID");
		return invalidID;

	}

	public static String getInvalidPassword() throws IOException {

		fileConfig();
		String invalidID = a.getProperty("invalidPassword");
		return invalidID;

	}

}
