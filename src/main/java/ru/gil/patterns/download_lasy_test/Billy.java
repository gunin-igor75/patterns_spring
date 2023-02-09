package ru.gil.patterns.download_lasy_test;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Billy extends Commando{


    @PostConstruct
    private void init() {
        super.setAlive(true);
    }
}
