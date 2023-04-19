/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreyev.spring.spring_course.spring_introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author vitaliy
 */

public class Dog implements Pet{
    
    private String name;

    public Dog() {
        System.out.println("DOG bean is created");
    }
    
    @Override
    public void say() {
        System.out.println("Wow-wow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
//    @PostConstruct
//    protected void init() {
//        System.out.println("Class Dog: init method");
//    }
//    
//    @PreDestroy
//    protected void destroy() {
//        System.out.println("Class Dog: destroy method");
//    }
    
}
