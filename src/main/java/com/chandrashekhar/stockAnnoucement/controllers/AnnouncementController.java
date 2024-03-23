package com.chandrashekhar.stockAnnoucement.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.chandrashekhar.stockAnnoucement.services.AnnouncementService;

import lombok.Getter;
import lombok.Setter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/home")
@Getter
@Setter
public class AnnouncementController {
    private AnnouncementService announcementService;

    public AnnouncementController(AnnouncementService announcementService){
        this.announcementService = announcementService;
    }

    @GetMapping("/announcement")
    public String getMethodName() {
        return announcementService.scrapAnnouncements();
    }
    
}
