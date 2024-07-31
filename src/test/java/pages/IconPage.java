package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IconPage {
    private WebDriver driver;

    public IconPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchIcon() {
        return driver.findElement(By.cssSelector(".icon-search:nth-child(2) > svg"));
    }

    public WebElement getSearchField() {
        return driver.findElement(By.id("search-field"));
    }

    public WebElement titleField(){
        return driver.findElement(By.cssSelector("h1.page-title.ast-archive-title"));
    }
    public WebElement erroMessage(){
        return driver.findElement(By.cssSelector(".page-content > p"));
    }
    public WebElement MsgBranco(){
        return driver.findElement(By.cssSelector(".page-title"));
    }

}
