package com.chandrashekhar.stockAnnoucement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandrashekhar.stockAnnoucement.models.BaseAnnouncement;

public interface BaseRepository extends JpaRepository<BaseAnnouncement, Long>{
    
}
