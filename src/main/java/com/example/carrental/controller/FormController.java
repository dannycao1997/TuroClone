package com.example.carrental.controller;

import com.example.carrental.entity.BookingForm;
import com.example.carrental.entity.ContactForm;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/form")
public class FormController {

//    @Autowired
//    private BookingService bookingService;
//
//    @Autowired
//    private ContactService contactService;

    @PostMapping("/booking")
    public ResponseEntity<String> submitBooking(@RequestBody BookingForm bookingform){
        // bookingService.save(bookingForm);
        return ResponseEntity.ok("Booking submitted successfully");
    }

    @PostMapping("/contact")
    public ResponseEntity<String> submitContact(@RequestBody ContactForm contactForm){
        // contactService.save(contactForm);
        return ResponseEntity.ok("Contact submitted successfully");
    }

}