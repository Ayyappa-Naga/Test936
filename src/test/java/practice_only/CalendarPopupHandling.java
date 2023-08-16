package practice_only;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarPopupHandling {

    public static void main(String[] args) throws Throwable {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.goibibo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Close any pop-up if present
        try {
            WebElement closeButton = driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
            closeButton.click();
        } catch (Exception e) {
            // Pop-up not found or not clickable
        }

        // Open the calendar pop-up
        WebElement datePickerButton = driver.findElement(By.xpath("//span[@class='sc-12foipm-22 oSYrJ fswDownArrow']"));
        datePickerButton.click();

        // Calculate and format the next day's date
        Calendar cal = Calendar.getInstance();
      cal.add(Calendar.DAY_OF_YEAR, 100);
        Date nextDay = cal.getTime();
        System.out.println(nextDay);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(nextDay);

        // Select the date in the calendar pop-up
        WebElement calendar = driver.findElement(By.className("DayPicker-Months"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(calendar));
System.out.println(formattedDate);
        WebElement selectedDateCell = calendar.findElement(By.xpath("//div[contains(@aria-label, '" + formattedDate + "')]"));
        
        // Scroll to the selected date cell to ensure it's in view
        Actions actions = new Actions(driver);
        actions.moveToElement(selectedDateCell).perform();

        // Click on the selected date
        selectedDateCell.click();

        // Wait for a moment to see the selected date (for demonstration purposes)
        Thread.sleep(3000);

        // Close the browser
        
    }
}
