package com.example.School.Controllers;
import com.example.School.Entities.Parcel;
import com.example.School.Services.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class ParcelController {
    Random random = new Random();
    private final ParcelService parcelService;
    @Autowired
    public ParcelController(ParcelService parcelService) {
        this.parcelService = parcelService;
    }
    // Endpoint to create a new parcel
    @PostMapping("/createParcel")
    public String createParcel(@ModelAttribute Parcel parcel, Model model) {
        String parcelTypeandDescription = parcel.getParcelDescription();
        Integer price = random.nextInt(30000,300000) ;
        model.addAttribute("parcel", parcelTypeandDescription);
        model.addAttribute("price", price);
        parcelService.createParcel(parcel);
        return "payment";
    }
}
