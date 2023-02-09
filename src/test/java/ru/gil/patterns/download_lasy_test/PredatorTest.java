package ru.gil.patterns.download_lasy_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = TestEnvConfig.class)
class PredatorTest {

    @Autowired
    private Commando commando;

    @Autowired
    private Predator predator;


    @Test
    public void predatorKillBilly() {
        predator.fight(commando);
        Assertions.assertFalse(commando.isAlive());
    }

}