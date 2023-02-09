package ru.gil.patterns.chain_of_responsibility.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gil.patterns.chain_of_responsibility.bpp.InjectListBPP;

@Configuration
public class ConfigInjectionBPP {

    @Bean
    public InjectListBPP injectListBPP() {
        return new InjectListBPP();
    }
}
