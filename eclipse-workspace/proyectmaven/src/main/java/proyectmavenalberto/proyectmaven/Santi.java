package proyectmavenalberto.proyectmaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Santi {
    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver",
                    "/geckodriver/chromedriver.exe"); //llamamos al fichero geckodrive
        WebDriver driver = new ChromeDriver();
        driver.get("https://campus.gmqtech.es/&quot");
        driver.findElement(By.id("username")).sendKeys("USUARIO@hotmail.com"); //indicamos nuestra cuenta
        driver.findElement(By.id("password")).sendKeys("CONTRASEÑA");
            Thread.sleep(5000, 0);
        driver.findElement(By.xpath("//button[contains(text(),'Acceder')]")).click();
        //indicamos nuestra clave
        driver.findElement(By.id("loginbutton")).click();
        System.out.println("abierto Facebook");
        driver.quit();
        } catch (Exception e) {
        System.out.println("Ocurrió un error: " +
        e.getMessage());
        }
    }
}