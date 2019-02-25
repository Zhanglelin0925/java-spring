package ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService =
                annotationConfigApplicationContext.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("world"));
        annotationConfigApplicationContext.close();
    }
}
