/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andreyev.spring.spring_course.spring_introduction;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration //признак конфигурации приложения
@PropertySource("classpath:myApp.properties")//использования файла ресурсов
//@ComponentScan("com.andreyev.spring.spring_course.spring_introduction")
public class MyConfig {
    
    @Bean
    public Pet catBean(){
        return new Cat();
    }
    
    @Bean
    @Scope("singleton")
    public Person personBean() {
        return new Person(catBean());
    }
    
    
}
