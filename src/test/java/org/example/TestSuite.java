package org.example;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage= new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResult registrationResult= new RegistrationResult();

    @Test
    public void verifyuserregistersucessfully()
    {
        homePage.clickonregistrationButton();
        registrationPage.filldetailsforregistration();
        registrationResult.verifyUserregistersucesfully();
    }
}
