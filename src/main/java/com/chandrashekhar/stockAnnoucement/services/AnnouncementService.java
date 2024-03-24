package com.chandrashekhar.stockAnnoucement.services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.springframework.stereotype.Service;

@Service
public class AnnouncementService {
    String url = "https://www.bseindia.com/corporates/ann.html";

    public String scrapAnnouncements(){
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver.getTitle();
    }   
    
}
