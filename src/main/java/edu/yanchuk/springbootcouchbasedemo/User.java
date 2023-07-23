package edu.yanchuk.springbootcouchbasedemo;

import java.time.LocalDate;
import java.util.UUID;

public class User {
    private UUID id;
    private String email;
    private String fullName;
    private LocalDate birthDate;
    private Gender gender;

    // Constructors, getters, and setters

    public User(UUID id, String email, String fullName, LocalDate birthDate, Gender gender) {
        this.id = id;
        this.email = email;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    // Getters and setters (you can generate them automatically in IDE)

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    // You can override the toString() method if you want a custom string representation of the User object

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                '}';
    }
}

