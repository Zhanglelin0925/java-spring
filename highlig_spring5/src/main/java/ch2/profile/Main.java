package ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.getEnvironment().setActiveProfiles("dev");
        annotationConfigApplicationContext.register(ProfileConfig.class);
        annotationConfigApplicationContext.refresh();

        DemoBean demoBean = annotationConfigApplicationContext.getBean(DemoBean.class);
        System.out.println(demoBean.getFrom_development_profile());
        annotationConfigApplicationContext.close();
    }
}
