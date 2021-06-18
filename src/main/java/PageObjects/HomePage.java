package PageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    WebDriver driver;


    @FindBy(xpath = "//button[@title='Agree']")
    public WebElement agree_button;


    @FindBy(linkText = "Deals")
    public WebElement deals_link;

    @FindBy(linkText = "Sign in")
    public WebElement signin_link;

    @FindBy(id = "masthead-search-toggle")
    public WebElement search;

    @FindBy(xpath = "//input[@data-test-id='input-box']")
    public WebElement search_field;

    @FindBy(xpath = "//div[@role='region']//a")
    public WebElement title;

    @FindBy(xpath = "//div[@class='c-text-body svelte-16jvqu2']")
    public WebElement paragraph;


    @FindBy(id="sp_message_iframe_474555")
    public WebElement frame1;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void handleCookies() throws InterruptedException {
        Thread.sleep(2000);
       driver.switchTo().frame(frame1);
        Thread.sleep(1000);
        agree_button.click();
        driver.manage().deleteAllCookies();
        driver.switchTo().defaultContent();
    }

    public void clickDealsLink() {
        deals_link.click();
    }

    public void clickSignInLink() {
        signin_link.click();
    }

    public void clickSearchToggle() {
        search.click();
    }


    public void enterSearchText(String text) throws InterruptedException {

        search_field.sendKeys(text);
        Thread.sleep(2000);

    }


    public String verifyEditorialTitle()
    {
        return title.getText();
    }

    public String verifyEditorialParagraph() {
        return paragraph.getText();
    }


}
