package systemTesting.tests.firstsTests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import systemTesting.InitDriver;
import systemTesting.Users;
import utils.GlobalVariables;

public class ExplicitWaits extends InitDriver {


    @BeforeMethod(alwaysRun = true)
    public void init(){
        final String url = GlobalVariables.seleniumHost + "/register.html";
        driver.get(url);
    }

    @Test(groups = {"all","explicitWaits"})
    public void f() throws InterruptedException {
        final Users user = new Users();
        System.out.println(user.toString());
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleFirstName"))).sendKeys(user.getFirstname());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleLastName"))).sendKeys(user.getLastname());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleInputEmail"))).sendKeys(user.getEmail());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/div/input[@placeholder='Password']"))).sendKeys(user.getPassword());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleRepeatPassword"))).sendKeys(user.getPassword());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Register Account')]"))).click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
    }

}
