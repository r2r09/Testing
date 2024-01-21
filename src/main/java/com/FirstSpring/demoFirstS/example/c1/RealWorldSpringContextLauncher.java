package com.FirstSpring.demoFirstS.example.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
public class RealWorldSpringContextLauncher {



    public static void main(String[] args){
        MySQLdataService m1 = new MySQLdataService();
        BusinessCalculationService b1 = new BusinessCalculationService(m1);
        System.out.println(b1.FindMax());


        var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncher.class);
         Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(BusinessCalculationService.class).FindMax());


    }




}
