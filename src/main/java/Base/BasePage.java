package Base;


import PageObjects.DealsPage;
import PageObjects.HomePage;
import PageObjects.SignInPage;

import Utils.Utils;

public class BasePage
{
    public static
    HomePage homePage;

    public static SignInPage signInPage;

    public static DealsPage dealsPage;

    public static void initPages()
    {

        homePage = new HomePage(Utils.driver);
        signInPage = new SignInPage(Utils.driver);
        dealsPage = new DealsPage(Utils.driver);
    }


}
