package com.chandrashekhar.stockAnnoucement.services;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.List;

@Service
public class AnnouncementService {
    String url = "https://www.bseindia.com/corporates/ann.html";

    public static ExpectedCondition<List<WebElement>> presenceOfAllElementsLocatedBy(By locator) {
        return new ExpectedCondition<List<WebElement>>() {
            @Override
            public List<WebElement> apply(WebDriver driver) {
                return driver.findElements(locator);
            }
        };
    }


    public String scrapAnnouncements(){
        WebDriver driver = new ChromeDriver();

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        driver.get(url);

        jsExecutor.executeScript("document.getElementById('txtFromDt').value = '20240323'");
        jsExecutor.executeScript("document.getElementById('txtToDt').value = '20240323'");
        jsExecutor.executeScript("document.getElementById('btnSubmit').click()");


        // Duration duration = Duration.ofSeconds(5);
        // WebDriverWait wait = new WebDriverWait(driver, duration);

        // WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSubmit")));
        // submitButton.click();
        
        String title = driver.getTitle();
        System.out.println(title);

        
        // while(true){

            
        //     WebElement currentPageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lblann")));

        //     //List<WebElement> currentPageElements = wait.until(presenceOfAllElementsLocatedBy(By.xpath("//b[contains(text(),'Current Page Number')]")));

        //     //WebElement currentPageElement = driver.findElement(By.xpath("//b[contains(text(),'Current Page Number')]"));
        //     String currentPageText = currentPageElement.getText();
        //     // for(WebElement webElement: currentPageElements){
        //     //     System.out.println(webElement.getText());
        //     // }
        //     System.out.println(currentPageText);

        //     // WebElement tdElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tablebluelink")));
        //     // System.out.println(tdElement.getText());
        //     // List<WebElement> anchorTags = tdElement.findElements(By.tagName("a"));
        //     // System.out.println(anchorTags.size());
        //     // for (WebElement anchorTag : anchorTags) {
        //     //     // Retrieve the text and URL of each anchor tag
        //     //     //String linkText = anchorTag.getText();
        //     //     String href = anchorTag.getAttribute("href");
        //     //     //System.out.println("Link Text: " + linkText);
        //     //     System.out.println("URL: " + href);
        //     // }

        //     List<WebElement> links = currentPageElement.findElements(By.className("tablebluelink"));
        //     System.out.println("size of list is " + links.size());
        //     int count = 0;
        //     for(WebElement link: links){
        //         String href = link.getAttribute("href");
        //         String text = "https://www.bseindia.com/corporates/ann.html#";
        //         boolean value = true;
                
        //         for(int i=0; i<text.length(); i++){
        //             if(href != null && href.charAt(i) != text.charAt(i)){
        //                 value = false;
        //                 count++;
        //                 break;
        //             }
        //         }
        //         if(value)
        //             continue;
        //         System.out.println("Please find below link string -->");
        //         System.out.println(href);
        //         System.out.println();
        //     }

        //     System.out.println(" count is "+ count);

        //     // List<WebElement> links = currentPageElement.findElements(By.tagName("a"));
        //     // for (WebElement link : links) {
        //     //     // String linkText = link.getText();
        //     //     // if(linkText.length() == 0){
        //     //     //     System.out.println("Empty string");
        //     //     // }
        //     //     String href = link.getAttribute("href");
        //     //     //System.out.println("Link Text: " + linkText);
        //     //     System.out.println("URL: " + href);
        //     // }
        //     // WebElement button = null;
        //     // try {
        //     //     button = currentPageElement.findElement(By.id("idnext"));
        //     //     System.out.println(currentPageElement.getText());
        //     // } catch (NoSuchElementException e) {
        //     //     System.out.println("Error occurred");
        //     //     break;
        //     // }            
        //     // if(button == null){
        //     //     break;
        //     // }
        //     // button.click();
        //     // wait.until(ExpectedConditions.stalenessOf(button)); 
            
            
        //     //

        //     WebElement fromDateField = wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFromDt")));
        //     fromDateField.clear();
        //     fromDateField.sendKeys("23/03/2024");
        //     // JavascriptExecutor js = (JavascriptExecutor) driver;
        //     // js.executeScript("arguments[0].value='23/03/2023';", fromDateField);

        //     WebElement toDateField = wait.until(ExpectedConditions.elementToBeClickable(By.id("txtToDt")));
        //     toDateField.clear();
        //     toDateField.sendKeys("23-03-2024");
        //     // JavascriptExecutor js2 = (JavascriptExecutor) driver;    
        //     // js2.executeScript("arguments[0].value='23/03/2023';", toDateField);

        //     WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSubmit")));
        //     submitButton.click();

        //     WebElement currentPageElement2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lblann")));

        //     String currentPageText2 = currentPageElement2.getText();

        //     System.out.println(currentPageText2);
        
        //     break;
        // }   
        // tdcolumngrey ng-scope
        driver.quit();
        return title;
    }   
    
}
