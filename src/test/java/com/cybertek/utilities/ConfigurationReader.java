package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    // #1  we create the properties object
    private static Properties properties = new Properties();

    static {
        try{
            //#2 we get the pass and put it into FileInputStream, to open the file
            FileInputStream file = new FileInputStream("configuration.properties");

            //#3 we load the opened file into properties object
            properties.load(file);

            //#5 CLOSE THE file
            file.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Properties file not found");
        }
    }
    //#5 we read from file: we will create a utility method for reading
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }
}



