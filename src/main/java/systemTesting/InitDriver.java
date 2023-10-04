package systemTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class InitDriver {

    protected WebDriver driver;
    protected WebDriverWait wait;
    private String geckoDriver = "";
    private String chromeDriver = "";

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void openDriver(@Optional("firefox") String browser){
        initDriver(browser);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        try {
            driver.quit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private WebDriver initDriver(String browser) {
        try {
            String operativeSystem = System.getProperty("os.name").toLowerCase();
            if (browser.equals("firefox")) {
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            } else {
                if (browser.equals("chrome")) {
                    if(operativeSystem.contains("linux")){
                        ChromeOptions opt = new ChromeOptions();
                        opt.addArguments("--headless");
                        driver = new ChromeDriver(opt);
                    }else {
                        driver = new ChromeDriver();
                    }
                } else if (browser.equals("safari")) {
                    driver = new SafariDriver();
                    driver.manage().window().maximize();
                }
            }

            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            return driver;
        } catch (Exception var5) {
            var5.printStackTrace();
            Assert.fail("fail to init the browser");
            return null;
        }
    }
}
