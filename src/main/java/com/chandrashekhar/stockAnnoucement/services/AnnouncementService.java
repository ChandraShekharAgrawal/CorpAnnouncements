package com.chandrashekhar.stockAnnoucement.services;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@Service
public class AnnouncementService {
    String url = "https://www.bseindia.com/corporates/ann.html";

    public void scrapAnnouncements(String url){
        try{
            Document document = Jsoup.connect(url).get();
        }
        catch (IOException e){
            System.out.println("error message is: "+ e);
        }
    }   
    
}
