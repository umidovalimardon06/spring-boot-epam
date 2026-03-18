package com.epam.springboot.controllers;

import com.epam.springboot.models.Room;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomRestController {
    private static final List<Room> rooms = new ArrayList<>();

    static {
        for (int i = 1; i < 11; i++) {
            rooms.add(Room.builder().number(i).name("Room:"+i).info("Info about room "+i).build());
        }
    }

    @GetMapping
    public List<Room> getAllRooms() {
        return rooms;
    }

}

















