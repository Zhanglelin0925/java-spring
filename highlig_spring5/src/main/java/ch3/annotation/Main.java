package ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = annotationConfigApplicationContext.getBean(DemoService.class);
        demoService.outputResult();
        annotationConfigApplicationContext.close();
    }
}
