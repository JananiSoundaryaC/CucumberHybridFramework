package com.bank.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public WebDriver driver;
    public static ThreadLocal<WebDriver> driverThreadLocal=new ThreadLocal<>();
    public WebDriver initDriver(String browser){
    if(browser.equalsIgnoreCase("Chrome")){
        WebDriverManager.chromedriver().setup();
        driverThreadLocal.set(new ChromeDriver());
    }
    else{
        driverThreadLocal.set(new FirefoxDriver());
    }
    getDriver().manage().deleteAllCookies();
    getDriver().manage().window().maximize();
    return getDriver();
    }

    public static WebDriver getDriver(){
        return driverThreadLocal.get();
    }

}
