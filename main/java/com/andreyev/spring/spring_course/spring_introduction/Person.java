/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreyev.spring.spring_course.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author vitaliy
 */

public class Person {
//    @Autowired
//    @Qualifier("dog")
    private Pet pet;
    
   @Value("${person.surname}")
    private String surname;
   @Value("${person.age}")
    private int age;

//    public Person() {
//        System.out.println("Constuktor Person is Created");
//    }

    public Person(Pet pet) {
        System.out.println("PERSON bean is created");
        this.pet = pet;
    }
    
    
    
    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

//    @Autowired //for setter
//    @Qualifier("cat")
    public void setPet(Pet pet) {
        System.out.println("setter: set Pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        System.out.println("Setter: surname");
        this.surname = surname;
    }

    public void setAge(int age) {
        System.out.println("Setter: age");
        this.age = age;
    }
    
    

}
