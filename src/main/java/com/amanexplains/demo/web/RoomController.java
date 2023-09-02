package com.amanexplains.demo.web;

import com.amanexplains.demo.business.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getRooms(Model model) {
        model.addAttribute("rooms", this.roomService.getRooms());
        return "rooms";
    }
}
