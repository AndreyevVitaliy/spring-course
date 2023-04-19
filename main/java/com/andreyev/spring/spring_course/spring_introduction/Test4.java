/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreyev.spring.spring_course. spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author vitaliy
 */
public class Test4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_1.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean( "myPet", Dog.class);
        
        myDog.setName("Belka");
        yourDog.setName("Strelka");
        
        System.out.println(myDog.equals(yourDog));
        
        System.out.println(myDog.getName());
        System.out.println(yourDog.getName() );
        
        context.close();

    }
}
