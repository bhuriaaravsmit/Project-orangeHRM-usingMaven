package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class AddUserPage extends Utility {

    public By addUser = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/h6[1]");

    public By getAddUser() {
        return addUser;
    }

public By userRole =By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");

    public By employeeName=By.xpath("//input[@placeholder='Type for hints...']");

  public By userName=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");

    public By status=By.xpath("(//div[@class='oxd-select-text-input'])[2]");

public By password=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");


public By confirmPassword=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");

public By save=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]");


}
