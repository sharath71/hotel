package com.example.hotel.controller;

import com.example.hotel.model.Hotel;
import com.example.hotel.model.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HotelController {

    @GetMapping("/hotel")
    public String showHotelPage(Model model) {
        // Dummy data
        Hotel hotel = new Hotel();
        hotel.setName("Sample Hotel");
        hotel.setAddress("123 Main Street, City, Country");

        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room("Single Room", 100.00, "https://www.freepik.com/free-photo/beautiful-scenery-summit-mount-everest-covered-with-snow-white-clouds_11062628.htm#query=wallpaper&position=0&from_view=keyword&track=sph&uuid=60fd018c-dc0a-44c6-b4cd-9efc5cf41a1d"));
        rooms.add(new Room("Double Room", 150.00, "https://www.freepik.com/free-photo/beautiful-scenery-summit-mount-everest-covered-with-snow-white-clouds_11062628.htm#query=wallpaper&position=0&from_view=keyword&track=sph&uuid=60fd018c-dc0a-44c6-b4cd-9efc5cf41a1d"));
        rooms.add(new Room("Suite", 250.00, "https://www.freepik.com/free-photo/beautiful-scenery-summit-mount-everest-covered-with-snow-white-clouds_11062628.htm#query=wallpaper&position=0&from_view=keyword&track=sph&uuid=60fd018c-dc0a-44c6-b4cd-9efc5cf41a1d"));

        hotel.setRooms(rooms);

        model.addAttribute("hotel", hotel);
        return "hotel";
    }
}
