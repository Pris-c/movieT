package com.priscila.movieT.controller;

import com.priscila.movieT.controller.request.RoomRequest;
import com.priscila.movieT.controller.response.RoomResponse;
import com.priscila.movieT.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping
    public RoomResponse create(@RequestBody RoomRequest roomRequest){
        var room = roomRequest.getRoom();
        room = roomService.create(room);
        if (room.getId()==null){
            return RoomResponse.getEmptyRoomResponse();
        }
        return RoomResponse.valueOf(room);
    }

}
