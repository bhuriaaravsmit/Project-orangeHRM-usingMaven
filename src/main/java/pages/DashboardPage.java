package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class DashboardPage extends Utility {


    public By getLogo() {
        return logo;
    }

    public By logo=By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[1]/a[1]/div[2]/img[1]");


public By userProfile =By.xpath("//img[@class='oxd-userdropdown-img']");


public By logout=By.xpath("//a[text()='Logout']");

public By loginPanel=By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");

    public By getLoginPanel() {
        return loginPanel;
    }

    public void mouseHoverAndClick(){

    mouseHoverToElementAndClick(logout);

}







}
