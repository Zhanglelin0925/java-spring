package ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher =
                annotationConfigApplicationContext.getBean(DemoPublisher.class);
        demoPublisher.publish("hello");
        annotationConfigApplicationContext.close();
    }
}
