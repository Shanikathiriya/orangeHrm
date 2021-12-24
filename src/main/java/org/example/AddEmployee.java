package org.example;

import org.openqa.selenium.By;
import  org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import  org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class AddEmployee extends Utils
{
    By firstName=By.id("firstName");
    By lastName=By.id("lastName");
    By empId=By.id("employeeId");
    By chkBox=By.id("chkLogin");
    By loginUsername=By.id("user_name");
    By loginPassword=By.xpath("//input[@name='user_password']");
    By confirmPAsword=By.xpath("//input[@name='re_password']");
    By saveButton=By.id("btnSave");




  public void addEmployeeDetails()
  {
      typeText(firstName, currentTimeStamp()+loadProp.getProperty("FirstName"));
      typeText(lastName, loadProp.getProperty("LastName"));
      typeText(empId, loadProp.getProperty("EmpId"));
      clickOnElement(chkBox);
      typeText(loginUsername,loadProp.getProperty("Username"));
      typeText(loginPassword,loadProp.getProperty("Password"));
      typeText(confirmPAsword,loadProp.getProperty("ConfirmPassword"));


         clickOnElement(saveButton);

      //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);





  }

}
