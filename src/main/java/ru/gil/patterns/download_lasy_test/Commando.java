package ru.gil.patterns.download_lasy_test;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public abstract class Commando {

    private boolean alive;

    public Commando() {
        System.out.println(getClass().getSimpleName() + "  was created");
    }
}
