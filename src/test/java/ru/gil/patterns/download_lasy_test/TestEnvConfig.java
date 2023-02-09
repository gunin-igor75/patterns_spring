package ru.gil.patterns.download_lasy_test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(lazyInit = true)
public class TestEnvConfig {
}
