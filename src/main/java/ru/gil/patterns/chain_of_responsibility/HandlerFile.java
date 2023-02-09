package ru.gil.patterns.chain_of_responsibility;

import org.springframework.stereotype.Service;

@Service
public class HandlerFile implements Handler {
    @Override
    public void invoke() {
        System.out.println("file processing............");
    }
}
