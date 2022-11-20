import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.naming.directory.DirContext;
import java.util.List;
import java.util.Random;

public class HomePage extends BasePage {
        // sepeti kontrol etme By cartCountLocator = By.id("nav-cart-count");
    //By BedenSec = By.xpath("//label[@for='size_54/6N']");
    By randomSizeLocator = By.xpath("(//label[@class='radio-box__label'])[1]");
    SearchBox searchBox;

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {

    }

    public void goToCart() {
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }


    public void selectRandom() {
        List<WebElement> allProducts = driver.findElements(randomSizeLocator);
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();

    }



}
