package com.stackroute.userservice.repository;

import com.stackroute.userservice.domain.Music;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MusicRepository extends MongoRepository<Music, Integer> {

//    public Music getTrackByName(String trackName);
//    public List<Music> searchById(int id);
}
