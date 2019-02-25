package ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(Awareonfig.class);
        AwareService awareService = annotationConfigApplicationContext.getBean(AwareService.class);
        awareService.outputResult();
        annotationConfigApplicationContext.close();
    }
}
