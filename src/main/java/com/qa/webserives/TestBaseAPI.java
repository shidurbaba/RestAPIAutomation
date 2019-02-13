package com.qa.webserives;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBaseAPI {
    public Properties prop;

    public TestBaseAPI() throws IOException {
        prop = new Properties();
        FileInputStream file = new FileInputStream("com/qa/config/config.properties");
        prop.load(file);
    }

}
