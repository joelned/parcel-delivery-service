package com.example.School.Controllers;

import com.example.School.Entities.Orders;
import com.example.School.Entities.Recipient;
import com.example.School.Services.RecipientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class RecipientController {
    private final RecipientService recipientService;
    @Autowired
    public RecipientController(RecipientService recipientService) {
        this.recipientService = recipientService;
    }
    @PostMapping("/saveRecipient")
    public String saveRecipient(@ModelAttribute Recipient recipient){
        recipientService.saveRecipient(recipient);
        return "redirect:/parcel";

    }
}
