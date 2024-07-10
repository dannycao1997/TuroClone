package com.example.carrental.entity;

import java.util.Date;

public class BookingForm {

    private String car;
    private Date dateStart;
    private Date dateEnd;
    private String firstName;
    private String email;



    //GETTERS AND SETTERS

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
