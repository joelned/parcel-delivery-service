package com.example.School.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {

    @GetMapping("/loginPage")
    String showLoginPage(){
        return "login";
    }

    @GetMapping("/form")
    String showFormPage(){
        return "cdetails";
    }
    @GetMapping("/recipient")
    String showRecipientPage() {
        return "recipient";
    }
    @GetMapping("/payment")
    String showPaymentPage(){
        return "payment";
    }
    @GetMapping("/parcel")
    String showParcelPage(){
        return "parcel";
    }

}
