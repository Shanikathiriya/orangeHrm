package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DeleteEmployeeDetails extends Utils
{
    By employeeListButton = By.xpath(" //b[contains(text(),'PIM')]");

    By empName=By.xpath("//*[@id='empsearch_employee_name_empName']");
    By searchButton=By.xpath("//*[@id='searchBtn']");
    By chkbox=By.xpath("//input[@id='ohrmList_chkSelectAll']");
    By deleteButton=By.xpath("//*[@id='btnDelete']");

    public void selectEmpList()
    {
        clickOnElement(employeeListButton);
        waitForVisible(empName,20);
        typeText(empName, loadProp.getProperty("Username"));





    }
    public void clickOnSearch()
    {
        clickOnElement(searchButton);

    }
    public void clickOnDelete()
    {
        clickOnElement(chkbox);
        clickOnElement(deleteButton);
       // driver.switchTo().alert().accept();
    }
    public void verifyDeletesuccessfully(){

        Assert.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'No Records Found')]")).getText().equals("No Records Found"));
    }

}
