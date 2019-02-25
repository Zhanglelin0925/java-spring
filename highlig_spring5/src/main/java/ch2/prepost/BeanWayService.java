package ch2.prepost;

public class BeanWayService {
    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }
    public String line(){
        System.out.println("@Bean-line");
        return "a";
    }
    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }
}
