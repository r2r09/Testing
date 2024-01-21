package com.FirstSpring.demoFirstS.example.g1;

import com.FirstSpring.demoFirstS.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ObjectInputFilter;
import java.util.Arrays;

//@Component


public class XMLConfigContextLauncher {



    public static void main(String[] args){




        try(var context = new ClassPathXmlApplicationContext("ContextConfig.xml")) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("name"));
            System.out.println();
            context.getBean(GameRunner.class).run();

        }


    }




}
