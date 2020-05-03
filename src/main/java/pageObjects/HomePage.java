package pageObjects;
import java.util.List;

import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import dataProvider.ConfigFileReader;
public class HomePage {
    WebDriver driver;
    ConfigFileReader configFileReader;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        configFileReader = new ConfigFileReader();
    }

    public void launchHomePage(){
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

}
