package ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService =
                annotationConfigApplicationContext.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService =
                annotationConfigApplicationContext.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        annotationConfigApplicationContext.close();
    }
}
