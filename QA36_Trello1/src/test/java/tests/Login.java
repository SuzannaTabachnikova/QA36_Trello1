package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login extends TestBase {



@BeforeMethod
public void preConditions(){
    if(app.getUser().isLogged()){
        app.getUser().logOut();
    }
}



    @Test
    public void login1() {
        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillInLoginForm("tabachnikovasuzanna@gmail.com","15231995Ts");
        app.getUser().submitLogin();
        app.getUser().pause(2000);

        Assert.assertTrue(app.getUser().isLogged());












        //click(By.cssSelector("[href='/login']"));
       // pause(2000);

       //type(By.cssSelector("#user"), "tabachnikovasuzanna@gmail.com");
      //  click(By.cssSelector("#login"));
      // pause(2000);
      //  type(By.cssSelector("#password"), "15231995Ts");

       // click(By.cssSelector("#login-submit"));
      //  pause(2000);

        //[data-testid='header-member-menu-button']
        //[data-testid='header-member-menu-logout']
        //#logout-submit"

    }





}