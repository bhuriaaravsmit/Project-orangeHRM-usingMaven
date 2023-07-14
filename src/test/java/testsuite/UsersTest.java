package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AddUserPage;
import pages.AdminPage;
import pages.DashboardPage;
import pages.LoginPage;
import testbase.BaseTest;

import java.util.List;

public class UsersTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    LoginTest loginTest = new LoginTest();
    AdminPage adminPage = new AdminPage();
AddUserPage addUserPage=new AddUserPage();
    @Test
    public void adminShouldAddUserSuccessFully() {
        loginTest.verifyUserShouldLoginSuccessFully();
        sleep(2000);
        adminPage.clickOnElement(adminPage.adminTab);
        sleep(1000);
        verifyText(adminPage.getSystemUser(), "Systembenutzer");
        adminPage.clickOnElement(adminPage.addButton);
        sleep(1000);
        verifyText(addUserPage.getAddUser(),"Benutzer hinzufügen");

       // selectByVisibleTextFromDropDown(addUserPage.userRole,"Admin");
        clickOnElement(By.xpath("//div[@class='oxd-select-wrapper']"));
        sleep(1000);
        List<WebElement> lst = driver.findElements(By.xpath("//div[@class='oxd-select-text--after']/i"));
        for(WebElement name :lst){

            System.out.println("+++"+name.getText());
            if(name.getText().equals("Admin")){
                sleep(2000);
                name.click();
                sleep(2000);

            }

        }
        driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).sendKeys("Admin");
        sendTextToElement(addUserPage.employeeName,"AnanyaShah");
        sendTextToElement(addUserPage.userName,"Admin123456");
       // selectByVisibleTextFromDropDown(addUserPage.status,"Disabled");
        clickOnElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));

sendTextToElement(addUserPage.password,"ABC123");
sendTextToElement(addUserPage.confirmPassword,"ABC123");
addUserPage.clickOnElement(addUserPage.status);


    }

    @Test
    public void searchTheUserCreatedAndVerifyIt() {
        loginTest.verifyUserShouldLoginSuccessFully();
        sleep(2000);
        adminPage.clickOnElement(adminPage.adminTab);
        sleep(1000);
        verifyText(adminPage.getSystemUser(), "System Users");



    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        loginTest.verifyUserShouldLoginSuccessFully();
        sleep(2000);
        adminPage.clickOnElement(adminPage.adminTab);
        sleep(1000);

    }

    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
        loginTest.verifyUserShouldLoginSuccessFully();
        sleep(2000);
        adminPage.clickOnElement(adminPage.adminTab);
        sleep(1000);

    }


}
