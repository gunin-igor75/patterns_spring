package ru.gil.patterns.download_lasy_test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PlasmaGun implements Gun{

    public PlasmaGun() {
        System.out.println("PlasmaGun created...........");
    }

    public void shoot(Commando commando) {
        commando.setAlive(false);
        System.out.println("PlasmaGun shoot - Billy dead.................");
    }
}
