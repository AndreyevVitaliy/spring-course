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
public class ScopeTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();

//        Dog yourDog = context.getBean("dog", Dog.class);
//
//        System.out.println(myDog == yourDog);
//        
//        System.out.println(myDog);
//        System.out.println(yourDog);
        context.close();
//        

    }

}
