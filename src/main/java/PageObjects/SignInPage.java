package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage
{
    WebDriver driver;

    @FindBy(id="username")
    public WebElement username_field;

    @FindBy(id="password")
    public WebElement password_field;

    @FindBy(id = "signinButton")
    public WebElement signin_button;

    @FindBy(xpath = "//li[text()='Sorry, we did not recognise either your username or password']")
    public WebElement errorMsg;

    public SignInPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


  public void login(String un, String pw)
  {
      username_field.sendKeys(un);
      password_field.sendKeys(pw);
      signin_button.click();

  }


  public String verifyErrorMessage()
  {
     return errorMsg.getText();
  }

}
