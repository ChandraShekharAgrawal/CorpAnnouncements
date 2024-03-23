package com.chandrashekhar.stockAnnoucement.services;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@Service
public class AnnouncementService {
    String url = "https://www.bseindia.com/corporates/ann.html";

    public String scrapAnnouncements(){
        try{
            Document document = Jsoup.connect(url).get();
            return document.title();
        }
        catch (IOException e){
            return ("error message is: "+ e);
        }
    }   
    
}
