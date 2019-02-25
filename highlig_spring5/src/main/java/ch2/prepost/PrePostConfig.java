package ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ch2.prepost")
public class PrePostConfig {
    @Bean(initMethod = "line",destroyMethod = "destroy")
//    public void line(){
//        new BeanWayService().line();
//    }
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
