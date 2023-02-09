package ru.gil.patterns.singleton;


import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Rocket implements Hit{

    @PostConstruct
    public void init() {
        System.out.println("Rocket create.............");
    }
    @Override
    public void use() {
        System.out.println("Ba-Bax...............");
    }
}
