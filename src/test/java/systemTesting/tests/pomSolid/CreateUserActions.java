package systemTesting.tests.pomSolid;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import systemTesting.Users;

public class CreateUserActions extends CreateUserElements{

    public CreateUserActions(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait =  wait;
        PageFactory.initElements(driver, this);
    }

    public void createUserMethod(){
        final Users user = new Users();
        System.out.println(user.toString());
        writeFistName(user.getFirstname());
        writeLastName(user.getLastname());
        writeEmail(user.getEmail());
        writePassword(user.getPassword());
        writeRPassword(user.getPassword());
        clickRegisterButton();
    }


    private void writeFistName(String firstNameText){
        writeText(firstName,firstNameText);
    }

    private void writeLastName(String lastNamet){
        writeText(lastName,lastNamet);
    }

    private void writeEmail(String emailt){
        writeText(email,emailt);
    }

    private void writePassword(String pass){
        writeText(password,pass);
    }

    private void writeRPassword(String pass){
        writeText(rPassword,pass);
    }

    private void clickRegisterButton(){
        wait.until(ExpectedConditions.visibilityOf(registerBtn)).click();
    }

    private void writeText(WebElement element, String s){
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(s);
    }
}
