package ch1.javaconfig;


public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String world) {

        return functionService.SayHello(world);
    }
}
