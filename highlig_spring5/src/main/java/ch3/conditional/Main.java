package ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService =
                annotationConfigApplicationContext.getBean(ListService.class);
        System.out.println(annotationConfigApplicationContext.getEnvironment().getProperty("os.name")
        +"系统下的列表命令为："+listService.showListCmd());
        annotationConfigApplicationContext.close();
    }
}
