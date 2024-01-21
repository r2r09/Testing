package com.FirstSpring.demoFirstS.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class GameRunner {
    GamingConsoleIntr game;
    @Autowired
    public GameRunner( GamingConsoleIntr game) {
        this.game = game;
    }

    public void run(){
        // System.out.println("Running game" + game);
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
