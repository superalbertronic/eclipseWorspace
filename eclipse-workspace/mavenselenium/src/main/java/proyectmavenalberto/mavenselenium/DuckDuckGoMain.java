package proyectmavenalberto.mavenselenium;

import org.openqa.selenium.By;
import java.util.Scanner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//previamente debemos configurar el fichero pom.xml añadiendo las dependencias.
public class DuckDuckGoMain {
    public static void main(String[] args) {
      try {
    	  System.setProperty("webdriver.gecko.driver", "/geckodriver/geckodriver.exe"); //llamamos al fichero geckodrive
    	  WebDriver driver = new FirefoxDriver();

    	  driver.get("https://duckduckgo.com/");
    	  WebDriverWait wait = new WebDriverWait(driver, 50);
    	  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("cookieConsent")));

    	  driver.findElement(By.name("q")).sendKeys("selenium tutorial");
    	  
    	  driver.findElement(By.id("search_button_homepage")).click();
    	  String title = driver.getTitle();
    	  if (title.contains("selenium tutorial")) {
    	    System.out.println("Test ok");
    	  } else {
    	    System.out.println("Test error");
    	  }

    	  Scanner click=new Scanner(System.in);
    	  System.out.println("Pulsa cualquier tecla para cerrar ");
    	  click.nextLine();
    	  driver.quit();

      } catch (Exception e) {
          System.out.println("Ocurrió un error: " + e.getMessage());
      }
    }
}