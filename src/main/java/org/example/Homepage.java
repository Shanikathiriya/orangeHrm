package org.example;

import org.openqa.selenium.By;

public class Homepage extends Utils
{
    By pimMenu= By.xpath("//*[@id=\"menu_pim_viewPimModule\"]");

    public void clickOnPim()
    {
        clickOnElement(pimMenu);
    }
}
