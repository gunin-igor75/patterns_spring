package ru.gil.patterns.download_lasy_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Predator {

    @Autowired
//    @Qualifier(value = "plasmaSword")
    private Gun blaster;

    public Predator() {
        System.out.println("Predator was created");
    }

    public void fight(Commando commando) {
        blaster.shoot(commando);
    }

}
