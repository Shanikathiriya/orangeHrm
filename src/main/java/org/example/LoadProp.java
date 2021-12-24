package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp // create class load prop
{
    static Properties prop=new Properties();
    static FileInputStream input;
    static String propertiesFileLocation="src/test/java/TestConfig/TestData.properties";

    public  String getProperty(String key)//create get property method which is used for get data from test data property
    {
        try {
            input=new FileInputStream(propertiesFileLocation);
            prop.load(input);
            input.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return  prop.getProperty(key);

    }
}
