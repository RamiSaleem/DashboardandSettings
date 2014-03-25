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
import java.util.ArrayList;
import java.util.HashMap;
import org.openqa.selenium.*; 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rami Saleem
 */

@Listeners({SauceOnDemandTestListener.class})
public class Add_first_address implements SauceOnDemandSessionIdProvider, SauceOnDemandAuthenticationProvider {
    
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
    public void Add_first_address() throws Exception {
        
        
        
        //Generate different email address each time       
    Date currenttime= new Date();
	DateFormat dateFormat = new SimpleDateFormat("MMddyyyyHHmmss");
	String generateemail= "Automation" + dateFormat.format(currenttime) + "@qa.markavip.com";
	
	
	
        //Wait until loading the home screen.
          
        
        try {
            Thread.sleep(30000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        //Application action and steps
        driver.findElement(By.xpath("//window[1]/navigationBar[1]/button[1]")).click();
        
        
        try {
            Thread.sleep(30000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        
        driver.findElement(By.xpath("/window[1]/button[7]")).click();
          
        driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[1]")).sendKeys("RAMI");
        driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[2]")).sendKeys("SALEEM");
        driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[3]")).sendKeys(generateemail);
        //driver.findElement(By.xpath("//window[2]/toolbar[1]/segmented[1]/button[2]")).click();
        driver.findElement(By.xpath("//window[2]/toolbar[1]/button[3]")).click();
        driver.findElement(By.xpath("//window[1]/scrollview[1]/secure[1]")).sendKeys("147852");
        driver.findElement(By.xpath("//window[2]/toolbar[1]/button[3]")).click();
        //driver.findElement(By.xpath("//window[2]/UIAKeyboard[1]/button[4]")).click();
        driver.findElement(By.xpath("//window[1]/scrollview[1]/button[4]")).click();
          
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
        
        
        //navigate to my account screens
        driver.findElement(By.xpath("//window[1]/button[6]")).click();
        
          
        
        try {
            Thread.sleep(30000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        
        //We need to swipe to find the invisible element to be able to tap on it
        /*JavascriptExecutor js = (JavascriptExecutor) markavipdriver;
         HashMap<String, Double> swipeObject = new HashMap<String, Double>();
         swipeObject.put("startX", 0.0);
         swipeObject.put("startY", 0.0);
         swipeObject.put("endX", 0.0);
         swipeObject.put("endY", 0.9);
         swipeObject.put("duration", 1.9);
         js.executeScript("mobile: swipe", swipeObject);*/
        
        /*JavascriptExecutor js = (JavascriptExecutor) markavipdriver;
         HashMap<String, String> scrollObject = new HashMap<String, String>();
         scrollObject.put("direction", "down");
         js.executeScript("mobile: scroll", scrollObject);*/
        

        
        try {
            Thread.sleep(30000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        
        
        //Tap on add new address
        driver.findElement(By.xpath("//window[1]/scrollview[1]/scrollview[1]/button[5]")).click();
        
        try {
            Thread.sleep(30000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        
        //First name
        driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[1]")).sendKeys("Rami");
        //Last name
        driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[2]")).sendKeys("Saleem");
        //Address
        driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[3]")).sendKeys("Amman Two");
        //Hide keyboard
        driver.findElement(By.xpath("//window[2]/UIAKeyboard[1]/button[4]")).click();
        //Select city
        driver.findElement(By.xpath("//window[1]/scrollview[1]/button[2]")).click();
        driver.findElement(By.xpath("//window[1]/tableview[1]/cell[2]/text[1]")).click();
        //Telephone number 1
        driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[6]")).sendKeys("700000000");
        //Hide keyboard
        driver.findElement(By.xpath("//window[2]/UIAKeyboard[1]/button[4]")).click();
        //Telephone number 2
        /*driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[7]").sendKeys("700000000");
         //Hide keyboard
         driver.findElement(By.xpath("//window[2]/UIAKeyboard[1]/button[4]").click();
         //National id
         driver.findElement(By.xpath("//window[1]/scrollview[1]/textfield[8]").sendKeys("1234567890");
         //Hide keyboard
         driver.findElement(By.xpath("//window[2]/UIAKeyboard[1]/button[4]").click();*/
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "down");
        js.executeScript("mobile: scroll", scrollObject);
        
        try {
            Thread.sleep(30000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        //Save address
        driver.findElement(By.xpath("//window[1]/scrollview[1]/button[9]")).click();
        
        
        try {
            Thread.sleep(30000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        String checksavedaddress= driver.findElement(By.xpath("//window[1]/scrollview[1]/scrollview[1]/textview[2]")).getText();
        
        System.out.println(checksavedaddress);
        String realaddress= "Amman Two"+"\n"+"Amman"+"\n"+"Jordan";
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


