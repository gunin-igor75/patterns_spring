package ru.gil.patterns.singleton;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Schwarz {

    @Autowired
    @Lazy
    private Rocket rocket;

    private int stamina = 10;

    @PostConstruct
    public void init() {
        System.out.println("Schwarz create........");
        stamina = 10;
    }

    @EventListener(ContextRefreshedEvent.class)
    public void run() {
        while (stamina >= 0) {
            if (stamina > 6) {
                System.out.println("Bum-Bum..............");
            } else if (stamina < 6 && stamina > 0) {
                rocket.use();
            }
            stamina--;
        }
    }
}