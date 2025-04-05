package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenKartStepDefinition {
    WebDriver driver;

    @Given("User is on amazon Landing page")
    public void user_is_on_green_cart_landing_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://amazon.in");
        Thread.sleep(1000);
        }
    @When("user searched with name {string} and extracted actual name of the product")
    public void user_searched_with_shortname_and_extracted_actual_name_of_the_product(String shortName) {
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(shortName);
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

       
    }
    @Then("user searched with shortname in offers page to check if product exist")
    public void user_searched_with_shortname_in_offers_page_to_check_if_product_exist() {

        List<WebElement> productElements = driver.findElements(By.xpath("//*[@role=\"listitem\"]/div/div/span/div/div/div[2]/div[1]/a/h2/span"));

        // Store names in a list
        List<String> productNames = new ArrayList<>();
        for (WebElement product : productElements) {
            productNames.add(product.getText());
        }

        System.out.println(productNames.get(0)+": product name extracted");
        productElements.get(0).click();

        Set<String> tabSet=driver.getWindowHandles();
        Iterator <String> tabIterator = tabSet.iterator();
        String parentTab = tabIterator.next();
        String childTab = tabIterator.next();
        driver.switchTo().window(childTab);
        driver.findElement(By.xpath("(//*[text()='Add to cart'])[2]" )).click();
        driver.findElement(By.xpath("//*[text()='go to cart']" )).click();
        
    }
   
    
    
}
