package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserManager extends BasePage // create browser manager class inherit base page class
{
    DesiredCapabilities caps = new DesiredCapabilities();
    public static final String AUTOMATE_USERNAME = "krishnasanghani_hnm20u";
    public static final String AUTOMATE_ACCESS_KEY = "6uVE9ge75FHZMKKPyyPp";
    public static final String BrowseStackURL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
     String browser="chrome";
    LoadProp loadProp=new LoadProp();
    //String browser=System.getProperty("browser");

    boolean cloud=false;
    //boolean cloud = Boolean.parseBoolean(System.getProperty("cloud"));

    public void openBrowser()  // create method for open browser
    {
        if(cloud)
        {

            if (browser.equalsIgnoreCase("chrome"))
            {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "7");
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.14.0");

            }
            else if (browser.equalsIgnoreCase("edge"))
            {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Edge");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.5.2");


            } else
            {
                System.out.println("your browser name is wrong");
            }
            try
            {
                driver = new RemoteWebDriver(new URL(BrowseStackURL), caps);
            }
            catch (MalformedURLException e)
            {
                e.printStackTrace();
            }


        }



        else
        {


            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
                driver = new ChromeDriver();

            } else if (browser.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/msedgedriver.exe");
                driver = new EdgeDriver();

            } else
            {
                System.out.println("your browser name is wrong");
            }

            driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

        }

    }

    public void closeBrowser()//create method for close browser
    {
        driver.close();
    }
}
