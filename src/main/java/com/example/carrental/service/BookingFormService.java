package com.example.carrental.service;

import com.example.carrental.entity.BookingForm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingFormService {
    private final List<BookingForm> bookingForms = new ArrayList<>();

    public void save(BookingForm bookingForm) {
        bookingForms.add(bookingForm);
    }

    public List<BookingForm> findAll() {
        return new ArrayList<>(bookingForms);
    }
}
