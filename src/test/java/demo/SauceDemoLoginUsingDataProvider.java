package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ExcelUtils;

public class SauceDemoLoginUsingDataProvider {

    @DataProvider(name = "data-provider-login")
    public Object[][] loginDataProvider(){
        ExcelUtils.getExcelInstance("data/dataSet.xlsx","Sheet1");
        Object[][] userNamePassword = ExcelUtils.getDataSet();
        return userNamePassword;
    }


    @Test(dataProvider = "data-provider-login")
    public void loginWithDifferentUsernamesAndPasswords(String username, String password){
        System.out.println("Im using username : " + username + " and password: " + password );


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userNameElement = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement passwordElement = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));


        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButton.click();
        driver.quit();
    }






}
