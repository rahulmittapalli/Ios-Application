import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class AndroidAbaco {

    AppiumDriver driver =null;

    @Test

    public void play() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName","MicroMax Tab");
        capabilities.setCapability("udid", "0123456789ABCDEF");
        //capabilities.setCapability("automationName","XCUITest");
        //capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        //capabilities.setCapability("xcodeOrgId", "A339L8W434");
        capabilities.setCapability("platformVersion", "5.0.1");
        capabilities.setCapability("noReset", "false");
        capabilities.setCapability("app","/Users/rahulmittapalli/Documents/Abaco.apk");
        //capabilities.setCapability("usePrebuiltWDA","true");
        capabilities.setCapability("fullReset", "true");
        //capabilities.setCapability("useNewWDA","false");
        driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        Thread.sleep(15000);
        driver.findElementByName("Username").sendKeys("Dev@abstractmediaco.com");
        driver.findElementByName("Password").sendKeys("abstractdev");
        WebElement signin=driver.findElementByXPath("(//XCUIElementTypeOther[@name='SIGN IN'])[2]");
        signin.click();
        Thread.sleep(5000);
        WebElement customerview=driver.findElementByName("Customers CREATE VIEW");
        customerview.findElement(By.name("VIEW")).click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='NAME Mobig'])[1]").click();
        Thread.sleep(2000);
        driver.findElementByName("Draft Orders").click();
        driver.findElementByName("Order History").click();
        driver.findElementByName("Linked Accounts").click();
        driver.findElementByName("Available Accounts").click();
        driver.findElementByName("Inventory").click();
        driver.findElementByName("Users").click();
        driver.findElementByName("Profile").click();
        WebElement backArrow=driver.findElementByXPath("(//XCUIElementTypeOther[@name='MOBIG'])[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
        backArrow.click();
        Thread.sleep(3000);
        WebElement mainMenu=driver.findElementByXPath("(//XCUIElementTypeOther[@name='CUSTOMERS'])[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
        mainMenu.click();
        driver.findElementByName("Catalog").click();
        driver.findElementByName("Product Specs").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Product Specs'])[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
        driver.findElementByName("Dashboard").click();
        Thread.sleep(5000);
        driver.closeApp();
    }
}
