package ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class DemoPublisher implements ApplicationEventPublisherAware{
    String measage;

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public String getMeasage() {
        return measage;
    }

    public void setMeasage(String measage) {
        this.measage = measage;
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher.publishEvent(new DemoEvent(this,this.measage));
    }


//        @Autowired
//    ApplicationContext applicationContext;

    public void publish(String msg) {
        this.setMeasage(msg);
        setApplicationEventPublisher(applicationEventPublisher);
    }
//    public void publish(String msg){
//        applicationContext.publishEvent(new DemoEvent(this,msg));
//    }
}
