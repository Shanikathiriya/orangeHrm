package org.example;

import org.openqa.selenium.By;

public class AdminLogin extends Utils
{
    By userName= By.id("txtUsername");
    By password=By.id("txtPassword");
    By loginButton=By.id("btnLogin");

   // By newUser=By.xpath("//input[@name='txtUsername']");
    //By newPassword=By.xpath("//input[@name='txtPassword']");

    public void adminLogindetails()
    {
        typeText(userName,loadProp.getProperty("adminUserName"));
        typeText(password,loadProp.getProperty("adminPassword"));

        clickOnElement(loginButton);
    }
    public void credentialUserLogin()
    {

        typeText(userName,loadProp.getProperty("newUserName"));
        typeText(password,loadProp.getProperty("newPassword"));
        clickOnElement(loginButton);
    }
}
