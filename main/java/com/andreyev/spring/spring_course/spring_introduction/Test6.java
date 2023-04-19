/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreyev.spring.spring_course.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author vitaliy
 */
public class Test6 {
    
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(MyConfig.class);
        
        Person person = context.getBean("personBean", Person.class);
        //person.callYourPet();
        
//      Person person2 = context.getBean("personBean", Person.class);
//          
//        System.out.println(person==person2);

        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        

      
        
//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        //cat.say();

        //System.out.println(cat1 == cat2);
        
        context.close();
        
    }
    
    
}
