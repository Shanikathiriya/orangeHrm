package org.example;

import org.openqa.selenium.By;

public class PIMPage extends Utils
{
    By addEmployee= By.xpath("//li[@class='current main-menu-first-level-list-item']/ul/li[3]/a");

    public void clickOnaddEmploee()
    {
        waitForClickabInSEle(addEmployee,2);
        clickOnElement(addEmployee);
    }

}
