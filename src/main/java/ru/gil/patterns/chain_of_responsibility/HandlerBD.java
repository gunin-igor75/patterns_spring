package ru.gil.patterns.chain_of_responsibility;

import org.springframework.stereotype.Service;

@Service
public class HandlerBD implements Handler{
    @Override
    public void invoke() {
        System.out.println("processing data from the Base data....");
    }
}
