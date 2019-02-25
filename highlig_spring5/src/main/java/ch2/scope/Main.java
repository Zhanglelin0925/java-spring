package ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService demoSingletonService1 =
                annotationConfigApplicationContext.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService2 =
                annotationConfigApplicationContext.getBean(DemoSingletonService.class);
        DemoPrototypeService demoPrototypeSrvice1 =
                annotationConfigApplicationContext.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService2 =
                annotationConfigApplicationContext.getBean(DemoPrototypeService.class);
        System.out.println("s1与s2是否相等："+demoSingletonService1.equals(demoSingletonService2));
        System.out.println("p1与p2是否相等："+ demoPrototypeSrvice1.equals(demoPrototypeService2));

        annotationConfigApplicationContext.close();
    }
}
