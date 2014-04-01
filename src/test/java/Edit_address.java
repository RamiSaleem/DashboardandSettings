package test;

import com.saucelabs.common.SauceOnDemandAuthentication;
import com.saucelabs.common.SauceOnDemandSessionIdProvider;
import com.saucelabs.testng.SauceOnDemandAuthenticationProvider;
import com.saucelabs.testng.SauceOnDemandTestListener;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import java.lang.reflect.Method;
import java.net.URL;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import java.util.Date;
import org.junit.Before;
import java.text.MessageFormat;
import java.util.List;
import java.util.ArrayList;
import org.junit.After;

/**
 *
 * @author Rami Saleem
 */

@Listeners({SauceOnDemandTestListener.class})
public class Edit_address implements SauceOnDemandSessionIdProvider, SauceOnDemandAuthenticationProvider {
    
    public SauceOnDemandAuthentication authentication;
    
    private WebDriver driver;
    
    /**
     * If the tests can rely on the username/key to be supplied by environment variables or the existence
     * of a ~/.sauce-ondemand file, then we don't need to specify them as parameters, just create a new instance
     * of {@link SauceOnDemandAuthentication} using the no-arg constructor.
     * @param username
     * @param key
     * @param os
     * @param browser
     * @param browserVersion
     * @param method
     * @throws Exception
     */
    
    @Parameters({"username", "key", "VESRSION", "BROWSER_NAME", "device", "platform", "app"})
    @BeforeMethod
    public void setUp(@Optional("icreativeapp") String username,
                      @Optional("8e40a4f9-07bd-4bdb-88f2-806eb88c63ab") String key,
                      @Optional("6") String VERSION,
                      @Optional("") String BROWSER_NAME,
                      @Optional("iPhone Simulator") String device,
                      @Optional("Mac 10.9") String platform,
                      @Optional("http://attractiveapp.com/build/MarkaVIP.zip") String app,
                      Method method) throws Exception {
        
        if (StringUtils.isNotEmpty(username) && StringUtils.isNotEmpty(key)) {
            authentication = new SauceOnDemandAuthentication(username, key);
        } else {
            authentication = new SauceOnDemandAuthentication();
        }
        
        
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName(System.getenv("SELENIUM_BROWSER"));
        desiredCapabilities.setCapability("device", System.getenv("SELENIUM_DEVICE"));
        desiredCapabilities.setVersion(System.getenv("SELENIUM_VERSION"));
        desiredCapabilities.setCapability(CapabilityType.PLATFORM, System.getenv("SELENIUM_PLATFORM"));
        desiredCapabilities.setCapability("name", method.getName());
        desiredCapabilities.setCapability("app", "http://attractiveapp.com/build/MarkaVIP.zip");
        
        this.driver = new RemoteWebDriver(
                                          new URL("http://ramisaleem:0fbac7ef-aa6d-45b4-b6e7-6aeba7a3e9ea@ondemand.saucelabs.com:80/wd/hub"),
                                          desiredCapabilities);
    }
    
    /**
     * {@inheritDoc}
     * @return
     */
    
    @Override
    public String getSessionId() {
        SessionId sessionId = ((RemoteWebDriver)driver).getSessionId();
        return (sessionId == null) ? null : sessionId.toString();
    }
    
    @Test
    public void Edit_address() throws Exception {
        
        
        
        try {
            Thread.sleep(30000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        
           driver.findElement(By.xpath("//window[1]/navigationBar[1]/button[1]")).click();
        
        
        try {
            Thread.sleep(30000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
           driver.findElement(By.name("Log In")).click();
           
           driver.findElement(By.xpath("//window[1]/textfield[2]")).sendKeys("icreativeapp@gmail.com");
           driver.findElement(By.xpath("//window[1]/secure[2]")).sendKeys("147852");
           
           driver.findElement(By.xpath("//window[1]/button[5]")).click();
        
        
           
        try {
            Thread.sleep(30000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        //markavipdriver.findElement(By.name("menu button")).click();
           driver.findElement(By.xpath("//window[1]/navigationBar[1]/button[1]")).click();

        
        try {
            Thread.sleep(30000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        //navigate to my account screens
           driver.findElement(By.xpath("//window[1]/button[6]")).click();
           
            try {
            Thread.sleep(30000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        
           driver.findElement(By.xpath("//window[1]/scrollview[1]/scrollview[1]/button[4]")).click();
        
        
        //Edit Address
        
        try {
            Thread.sleep(30000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        
        
        driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[3]")).clear();
        driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[3]")).sendKeys("edit address");

        driver.findElement(By.xpath("//window[2]/toolbar[1]/button[3]")).click();
        
        driver.findElement(By.xpath("//window[1]/scrollview[1]/button[1]")).click();
        driver.findElement(By.xpath("//window[1]/tableview[1]/cell[3]/text[1]")).click();
        
        driver.findElement(By.xpath("//window[1]/scrollview[1]/button[2]")).click();
        driver.findElement(By.xpath("//window[1]/tableview[1]/cell[2]/text[1]")).click();
        
        try {
            Thread.sleep(30000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        //driver.findElement(By.xpath("//window[1]/scrollview[1]/button[1]")).click();
        //driver.findElement(By.xpath("//window[2]/toolbar[1]/button[3]")).click();
        
        driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[6]")).sendKeys("700000000");
        driver.findElement(By.xpath("//window[2]/toolbar[1]/button[3]")).click();
        
        
        driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[8]")).click();
        driver.findElement(By.xpath("//window[2]/toolbar[1]/button[3]")).click();
        driver.findElement(By.xpath("//window[1]/scrollview[1]/button[7]")).click();
        
        try {
            Thread.sleep(30000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        /*String newaddress= "edit address" + "\n" + "Amman" + "\n" + "Jordan";
        String actualaddress = driver.findElement(By.xpath("//window[1]/scrollview[1]/scrollview[1]/textview[2]")).getText();
        Assert.assertEquals(actualaddress, newaddress);*/
    
        String checksavedaddress= driver.findElement(By.xpath("//window[1]/scrollview[1]/scrollview[1]/textview[2]")).getText();
        
        System.out.println(checksavedaddress);
        String realaddress= "edit address"+"\n"+"Amman"+"\n"+"Jordan";
        System.out.println(realaddress);
        Assert.assertEquals(checksavedaddress, realaddress);
        
    }
    
    
    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
    
    /**
     * {@inheritDoc}
     * @return
     */
    
    @Override
    public SauceOnDemandAuthentication getAuthentication() {
        return authentication;
    }
}


