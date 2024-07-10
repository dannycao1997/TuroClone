package com.example.carrental;

import com.example.carrental.entity.BookingForm;
import com.example.carrental.entity.ContactForm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;

@SpringBootTest
@AutoConfigureMockMvc
public class FormControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testSubmitBooking() throws Exception {
        BookingForm bookingForm = new BookingForm();
        bookingForm.setCar("nissan-gtr-r34");
        bookingForm.setDateStart(new Date());
        bookingForm.setDateEnd(new Date());
        bookingForm.setFirstName("John");
        bookingForm.setEmail("john.doe@example.com");

        mockMvc.perform(post("/api/forms/booking")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(bookingForm)))
                .andExpect(status().isOk());

    }

    @Test
    public void testSubmitContact() throws Exception {
        ContactForm contactForm = new ContactForm();
        contactForm.setName("John Doe");
        contactForm.setEmail("john.doe@example.com");
        contactForm.setSubject("Test Subject");
        contactForm.setMessage("Test Message");

        mockMvc.perform(post("/api/forms/contact")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(contactForm)))
                .andExpect(status().isOk());
    }
}
