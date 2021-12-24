package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.clickOnElement;

public class AlertHandle extends Utils
{
    By clickAlerkBox=By.id("dialogDeleteBtn");
    //create method to accept alert box
    public void acceptAlertBox(){
        clickOnElement(clickAlerkBox);
       // driver.switchTo().alert().accept();
    }

}
