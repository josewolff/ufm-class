package systemTesting.tests.firstsTests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import systemTesting.InitDriver;
import systemTesting.Users;
import utils.GlobalVariables;

public class MyFirstStepsWithSelenium extends InitDriver {

    @BeforeMethod(alwaysRun = true)
    public void init(){
        final String url = GlobalVariables.seleniumHost + "/register.html";
        driver.get(url);
    }

    @Test(groups = {"all","myFirstTest2"})
    public void f() throws InterruptedException {
        final Users user = new Users();
        System.out.println(user.toString());
        Thread.sleep(10000);
        driver.findElement(By.id("exampleFirstName")).sendKeys(user.getFirstname());
        Thread.sleep(2000);
        driver.findElement(By.id("exampleLastName")).sendKeys(user.getLastname());
        Thread.sleep(2000);
        driver.findElement(By.id("exampleInputEmail")).sendKeys(user.getEmail());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/div/input[@placeholder='Password']")).sendKeys(user.getPassword());
        Thread.sleep(2000);
        driver.findElement(By.id("exampleRepeatPassword")).sendKeys(user.getPassword());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Register Account')]")).click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
    }

}
