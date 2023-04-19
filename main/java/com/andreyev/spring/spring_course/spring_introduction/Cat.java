/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreyev.spring.spring_course.spring_introduction;

import org.springframework.stereotype.Component;

/**
 *
 * @author vitaliy
 */

public class Cat implements Pet{

    @Override
    public void say() {
        System.out.println("Myau-Myau");
    }

    public Cat() {
          System.out.println("CAT bean is created");
    }
    
    
    
    
    
}
