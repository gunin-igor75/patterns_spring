package ru.gil.patterns.chain_of_responsibility;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(2)
public class HandlerConsole implements Handler{

    @Override
    public void invoke() {
        System.out.println("processing data from the console....");
    }
}
