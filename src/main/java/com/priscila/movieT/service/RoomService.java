package com.priscila.movieT.service;

import com.priscila.movieT.entity.Room;
import com.priscila.movieT.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

    public Room create(Room room){
        return roomRepository.save(room);
    }

    public Room findById(UUID roomId){
        Optional<Room> optionalRoom = roomRepository.findById(roomId);
        return optionalRoom.orElse(new Room());
    }


}
