/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreyev.spring.spring_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author vitaliy
 */
public class ConfigWithAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
        
//        Cat cat  = context.getBean("catBean", Cat.class);
//        cat.say();
    
        context.close();
    }
    
}
