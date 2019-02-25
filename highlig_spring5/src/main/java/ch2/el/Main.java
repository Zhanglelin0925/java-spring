package ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(ResourceConfig.class);
        ELConfig resourceService = annotationConfigApplicationContext.getBean(ELConfig.class);
        resourceService.outputResouce();
        annotationConfigApplicationContext.close();
    }
}
