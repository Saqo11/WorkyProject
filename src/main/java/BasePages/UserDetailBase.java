package BasePages;

import org.openqa.selenium.WebDriver;

public class UserDetailBase extends  BasePage {
    String SITE_URL = "https://worky-reppy-dev.esterox.org/en/users/62";
    public UserDetailBase(WebDriver driver) {
        super(driver);
    }
    public  UserDetailBase goTo (){
        driver.get(SITE_URL);
        return  this;
    }



}
