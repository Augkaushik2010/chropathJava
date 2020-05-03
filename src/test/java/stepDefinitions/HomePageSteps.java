package stepDefinitions;
import cucumber.api.java.en.Given;
import dataProvider.ConfigFileReader;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;

import java.util.concurrent.TimeUnit;

public class HomePageSteps {
    WebDriver driver;
    HomePage homePage;
    PageObjectManager pageObjectManager;
    //ConfigFileReader configFileReader;
    WebDriverManager webDriverManager;

    @Given("^launch the automation practice website homepage$")
    public void launch_the_automation_practice_website_homepage(){
        webDriverManager=new WebDriverManager();
        driver = webDriverManager.getDriver();
        pageObjectManager=new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();
        homePage.launchHomePage();
    }

}
