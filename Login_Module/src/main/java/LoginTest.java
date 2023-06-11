import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chris Francis\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("http://localhost:8082/Login_Module/login.jsp");

        // Find the username and password input fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        // Enter the username and password
        usernameField.sendKeys("user1");
        passwordField.sendKeys("userpass1");

        // Find the login button and click it
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

        // Wait for the page to load after login
        // You can use explicit wait or sleep here

        // Verify the welcome message after successful login
       // WebElement welcomeMessage = driver.findElement(By.id("welcomeMessage"));
//        String message = welcomeMessage.getText();
//        if (message.contains("Welcome")) {
//            System.out.println("Login test passed");
//        } else {
//            System.out.println("Login test failed");
//        }

        // Close the browser
        driver.quit();
    }
}


