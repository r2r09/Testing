package com.FirstSpring.demoFirstS.example.a0;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
class SomeClass{
    SomeDependency somedependency;

    public SomeClass(SomeDependency somedependency){
        this.somedependency = somedependency;
        System.out.println("All dependencies ready");
    }

    @PostConstruct
    public void initialize(){
        somedependency.getReady();
    }

    @PreDestroy
    public void cleanup(){
    System.out.println("To be done before bean destroy");

    }



}

@Component

class SomeDependency{
    public void getReady(){
        System.out.println("do Something with the dependency after bean created");
    }



}

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args){

        try(var context =
                    new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)){
            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(SomeClass.class));
        }
    }




}
