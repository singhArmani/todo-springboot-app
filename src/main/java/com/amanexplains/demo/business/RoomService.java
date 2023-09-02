package com.amanexplains.demo.business;

import com.amanexplains.demo.data.Room;
import com.amanexplains.demo.data.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public Iterable<Room> getRooms(){
        return this.roomRepository.findAll();
    }
}
