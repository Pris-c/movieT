package com.priscila.movieT.service;

import com.priscila.movieT.entity.Room;
import com.priscila.movieT.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

    public Room create(Room room){
        return roomRepository.save(room);
    }

}
