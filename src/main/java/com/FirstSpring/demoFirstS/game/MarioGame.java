package com.FirstSpring.demoFirstS.game;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsoleIntr {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Crouch");
    }
    public void right(){
        System.out.println("Accelerate");
    }
    public void left(){
        System.out.println("Back");
    }

}
