package ru.gil.patterns.download_lasy_test;

import org.springframework.stereotype.Service;

@Service
public class PlasmaSword implements Gun{

    public PlasmaSword() {
        System.out.println("PlasmaSword created......");
    }

    @Override
    public void shoot(Commando commando) {
        commando.setAlive(false);
        System.out.println("PlasmaSword shoot - Billy dead.................");
    }
}
