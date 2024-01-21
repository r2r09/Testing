package com.FirstSpring.demoFirstS.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan("com.FirstSpring.demoFirstS.game")
public class App03GamingSpringBeans {

//    @Bean
//    public GamingConsoleIntr game() {
//        var game = new MarioGame();
//        return game;
//    }

//    @Bean
//    public GameRunner gameRunner(GamingConsoleIntr game) {
//        System.out.println("parameter" + game);
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }

    public static void main(String[] args){




        var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class);


        context.getBean(GamingConsoleIntr.class).up();
        context.getBean(GameRunner.class).run();
        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }




}
