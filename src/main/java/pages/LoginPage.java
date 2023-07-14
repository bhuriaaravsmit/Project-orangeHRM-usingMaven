package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class LoginPage extends Utility {



    public By userName=By.xpath("//input[@name='username']");
    public By password=By.xpath("//input[@name='password']");

public By loginButton= By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");



    public By dashBoard=By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    public By getDashBoard() {
        return dashBoard;
    }




}
