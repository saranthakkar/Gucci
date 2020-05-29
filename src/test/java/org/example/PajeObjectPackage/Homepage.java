package org.example.PajeObjectPackage;

import org.example.BaseObjectPackage.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory {
    @FindBy(xpath = "//button[@id='acceptCookiePolicy']")
    WebElement cookie;
    @FindBy(xpath = "//div[contains(@class,'item slick-slide slick-current slick-active')]//a[2]")
    WebElement shopMEN;

public void cookieMethod(){
    cookie.click();
}
public void menMethod() {
    shopMEN.click();
}
public void scrollMethod(){
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1000);");
}
}
