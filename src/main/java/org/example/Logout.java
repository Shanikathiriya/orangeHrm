package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Logout extends Utils
{
    By welcomeButton= By.xpath("//*[@id='welcome']");
    By logout=By.xpath("//*[@id='welcome-menu']/ul/li[3]/a");
  // @FindBy(xpath=".//*[@id='welcome']")
 //  WebElement logoutMenu;
   // @FindBy(xpath="//a[text()='Logout']")
    //WebElement logOut1;


    public void logoutByAdmin() throws InterruptedException
    {
        Thread.sleep(2000);
        clickOnElement( welcomeButton);
        Thread.sleep(1000);
        clickOnElement(logout);

    }
    public void issuccessfullylogin(String PageURl)
    {
        Assert.assertTrue(driver.getCurrentUrl().equals(PageURl));
    }
}
