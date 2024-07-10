package com.example.carrental.service;

import com.example.carrental.entity.ContactForm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactFormService {
    private final List<ContactForm> contactForms = new ArrayList<>();

    public void save(ContactForm contactForm) {
        contactForms.add(contactForm);
    }

    public List<ContactForm> findAll() {
        return new ArrayList<>(contactForms);
    }
}
