package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DealsPage {
    WebDriver driver;

    @FindBy(xpath = "(//span[@class='text__Text-sc-1u9gciq-0 ebwAcM'])[1]")
    public WebElement price_one;

    @FindBy(xpath = "(//span[@class='text__Text-sc-1u9gciq-0 ebwAcM'])[2]")
    public WebElement price_two;

    @FindBy(xpath = "(//span[@class='text__Text-sc-1u9gciq-0 ebwAcM'])[3]")
    public WebElement price_three;


    public DealsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String verifyPrice1() {
        return price_one.getText();
    }

    public String verifyPrice2() {
        return price_two.getText();
    }

    public String verifyPrice3() {
        return price_three.getText();
    }

}
