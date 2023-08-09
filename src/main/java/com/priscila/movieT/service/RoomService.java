package com.priscila.movieT.service;

import com.priscila.movieT.controller.exception.ExemploExcecao;
import com.priscila.movieT.entity.Room;
import com.priscila.movieT.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

    public Room create(Room room){
        List<Room> rooms = roomRepository.findByName(room.getName());
        if(!rooms.isEmpty()){
            return new Room();
            //throw new ExemploExcecao("A sala " + room.getName() + " já existe");
        }
        return roomRepository.save(room);
    }

    public Room findById(UUID roomId){
        Optional<Room> optionalRoom = roomRepository.findById(roomId);
        return optionalRoom.orElse(new Room());
    }


}
