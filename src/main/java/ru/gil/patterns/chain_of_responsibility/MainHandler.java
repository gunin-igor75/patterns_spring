package ru.gil.patterns.chain_of_responsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import ru.gil.patterns.chain_of_responsibility.annotation.InjectList;

import java.util.List;

@Service
public class MainHandler {

    @InjectList({HandlerFile.class})
    private List<Handler> handlers;


    @EventListener(ContextRefreshedEvent.class)
    public void start() {
        handlers.forEach(Handler::invoke);
    }
}
