package com.bank.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Util {
    private  Properties prop;
    public Properties init_confprop() {

        prop = new Properties();
        try {
            FileInputStream configFile = new FileInputStream(System.getProperty("./src/test/resources/Config.properties"));
            prop.load(configFile);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return prop;
    }

}
