import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class otomotoTest {

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void openOtomoto() {
        WebDriver driver = new ChromeDriver();
        String title = "OTOMOTO - nowe i używane samochody i motocykle oraz części samochodowe. Ogłoszenia motoryzacyjne.";
        driver.get("https://otomoto.pl");
        assertEquals(title, driver.getTitle());
        driver.quit();
    }
}
