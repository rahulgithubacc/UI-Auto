package com.learning.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public  class PropertyUtil {
    public static Properties getProperties(String propertyFileName) {
        Properties prop = null;
        try {
            String propertyFile  = "config/"+propertyFileName;
            InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(propertyFile);
            System.out.println("InputStream:"+inputStream);
            prop = new Properties();
            prop.load(inputStream);
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return  prop;
    }
    public static String getProperty(String key) {
        Properties prop = getProperties("application.properties");
        return prop.getProperty(key);
    }
}
