import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {

    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chris Francis\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the registration page
        driver.get("http://localhost:8082/Login_Module/registration.jsp");

        // Find the registration form elements
        WebElement fullNameField = driver.findElement(By.id("fullname"));
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement registerButton = driver.findElement(By.id("registerButton"));

        // Enter the registration details
        fullNameField.sendKeys("John Doe");
        emailField.sendKeys("johndoe@example.com");
        usernameField.sendKeys("johndoe");
        passwordField.sendKeys("password123");

        // Click the register button
        registerButton.click();

        // Wait for the registration process to complete
        // You can use explicit wait or sleep here

        // Verify the registration success message
        WebElement successMessage = driver.findElement(By.id("successMessage"));
        String message = successMessage.getText();
        if (message.contains("Registration successful")) {
            System.out.println("Registration test passed");
        } else {
            System.out.println("Registration test failed");
        }

        // Close the browser
        driver.quit();
    }
}
