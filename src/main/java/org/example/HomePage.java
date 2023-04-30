package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage extends Utils
{
    private By _registraionButton = By.className("ico-register");

public void clickonregistrationButton()
        {

            //click on resister button
            clickOnElement(_registraionButton);

        }

}
