package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* get*())") //Объявление pointcut для избавления от дублей и упрощения поддержки кода
    public void allGetMethods() {}

}
