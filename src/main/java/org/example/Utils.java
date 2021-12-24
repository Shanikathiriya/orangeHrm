package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BrowserManager // create method inherit browser manager
{
    public static void captureScreenshot(String  fileName)
    {
        TakesScreenshot scrShot=((TakesScreenshot) driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File destFile=new File("src/test/java/Screenshots/"+fileName+"+"+currentTimeStamp()+".png");

                try
                {
                    FileUtils.copyFile(SrcFile,destFile);

                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
    }
    public static void clickOnElement(By by)// create click method .this method will execute when fire click event
    {
        driver.findElement(by).click();
    }
    public static void typeText(By by,String text)//  create type text method for type text as input in text box
    {
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by)//get text method for get data
    {
        return driver.findElement(by).getText();
    }
    public static String currentTimeStamp() //current time stamp method
    {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);

    }
    public static void waitForClickabInSEle(By by,int timeInSeconds)//create method wait for clickable
    {
        WebDriverWait wait=new WebDriverWait(driver,timeInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }
    public static void waitForVisible(By by,int timeInSeconds)// create method wait for visible
    {
        WebDriverWait wait=new WebDriverWait(driver,timeInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }

    public void selectByText(By by,String text)
    {
        Select select_d=new  Select( driver.findElement(by));
        select_d.selectByVisibleText(text);
    }
    public void selectByValue(By by,String m)
    {
        Select select_m=new  Select( driver.findElement(by));
        select_m.selectByValue(m);
    }
    public void selectByIndex(By by, String y)
    {
        Select select_y=new  Select( driver.findElement(by));
        select_y.selectByIndex(Integer.parseInt(y));
    }

    public void VerifyCurrentUrl(String Url_Name)
    {
        Assert.assertTrue(driver.getCurrentUrl().equals(Url_Name));
    }


}
