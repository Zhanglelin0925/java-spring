package ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService =
                annotationConfigApplicationContext.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService =
                annotationConfigApplicationContext.getBean(JSR250WayService.class);
        annotationConfigApplicationContext.close();
    }
}
