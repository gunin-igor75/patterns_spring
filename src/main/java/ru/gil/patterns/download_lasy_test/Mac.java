package ru.gil.patterns.download_lasy_test;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class Mac extends Commando{

    @PostConstruct
    private void init() {
        super.setAlive(true);
    }
}
