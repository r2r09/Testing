package com.FirstSpring.demoFirstS.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class ContraGame implements GamingConsoleIntr{

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("lie down");

    }

    @Override
    public void left() {
        System.out.println("run back");

    }

    @Override
    public void right() {
        System.out.println("run forward");

    }
}
