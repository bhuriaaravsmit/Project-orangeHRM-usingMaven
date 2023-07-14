package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class AdminPage extends Utility {


    public By adminTab = By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]");
    public By systemUser = By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");

    public By getSystemUser() {
        return systemUser;
    }

    public By addButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");




}
