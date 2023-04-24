package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    //***********************
//    @Pointcut("execution(* aop.UniLibrary.*(..))")//pointcut для определения методов
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")//pointcut для определения методов
//    private void returnMagazineFromUniLibrary(){}
//
//    //определяется pointcut для выполнения
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")//pointcut для определения методов
//    private void allMethodsExceptReturnFromUniLibrary(){}
//
//    @Before("allMethodsExceptReturnFromUniLibrary()") //выполнение кода подходящего под данный pointcut
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log writing #10");
//    }


    //***************************
//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvise(){
//        System.out.println("beforeGetLoggingAdvise: writing Log #1");
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeAllReturnMethodsFromUniLibrary(){
//        System.out.println("beforeGetLoggingAdvise: writing Log #2");
//    }
//
//    //комбинация POINTCUT
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()") //логическое ИЛИ.
//    // Использовать И нет смысла
//    //поскольку методы которые будут вызываться, скорее всего всегда будут разные
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvise: writing Log #3");
//    }

//***********************

    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetBookAdvice: логирование " +
                "попытки получить книгу или журнал");
    }

}
