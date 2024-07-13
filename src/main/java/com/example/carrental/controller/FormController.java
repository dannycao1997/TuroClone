package com.example.carrental.controller;

import com.example.carrental.entity.BookingForm;
import com.example.carrental.entity.ContactForm;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/forms")
public class FormController {


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

    @GetMapping("/booking")
    public ResponseEntity<String> getBooking(){
        return ResponseEntity.ok("Booking submitted successfully");
    }

    @GetMapping("/contact")
    public ResponseEntity<String> getContact(){
        return ResponseEntity.ok("Contact submitted successfully");
    }

}
