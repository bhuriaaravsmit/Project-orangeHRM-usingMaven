package testsuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import testbase.BaseTest;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void verifyUserShouldLoginSuccessFully() {
        sleep(2000);
        sendTextToElement(loginPage.userName, "Admin");
        sendTextToElement(loginPage.password, "admin123");
        loginPage.clickOnElement(loginPage.loginButton);
        sleep(2000);
        verifyText(loginPage.getDashBoard(), "Dashboard");

    }

    @Test

    public void VerifyThatTheLogoDisplayOnLoginPage() {

        verifyUserShouldLoginSuccessFully();
        Boolean display = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[1]/a[1]/div[2]/img[1]")).isDisplayed();
        Assert.assertTrue(display, "OrangeTrue");
        System.out.println("The logo is " + display);
    }

    @Test

    public void VerifyUserShouldLogOutSuccessFully() {
        verifyUserShouldLoginSuccessFully();
        sleep(2000);
        dashboardPage.clickOnElement(dashboardPage.userProfile);
        dashboardPage.mouseHoverToElementAndClick(dashboardPage.logout);

        verifyText(dashboardPage.getLoginPanel(), "Login");

    }


}
