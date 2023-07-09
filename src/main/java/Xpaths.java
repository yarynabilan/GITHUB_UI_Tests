import org.openqa.selenium.By;

public class  Xpaths {

    private By signInButtonLocator = By.xpath("//a[contains(text(), \"Sign in\")]");
    private By imgLocator = By.xpath("//img[@class='avatar circle'][1]");
    private By signOutLocator = By.xpath("//span[contains(text(), 'Sign out')]/parent::a");
    private By yourRepositButtonLocator = By.xpath("//span[contains(text(), \"Your repositories\")]/parent::a");
    private By questionLocator = By.xpath("//h1[text()=\"Are you sure you want to sign out?\"]");
}