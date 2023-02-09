package ru.gil.patterns.chain_of_responsibility.bpp;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import ru.gil.patterns.chain_of_responsibility.annotation.InjectList;

import java.beans.Introspector;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InjectListBPP implements BeanPostProcessor {
    @Autowired
    private ApplicationContext context;

    @SneakyThrows
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Set<Field> fieldSet = Arrays.stream(bean.getClass().getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(InjectList.class))
                .collect(Collectors.toSet());
        for (Field field : fieldSet) {
            InjectList annotation = field.getAnnotation(InjectList.class);
            List<Object> list = Arrays.stream(annotation.value())
                    .map(clazz -> Introspector.decapitalize(clazz.getSimpleName()))
                    .map(name -> context.getBean(name)).toList();
            field.setAccessible(true);
            field.set(bean,list);
        }
        return bean;
    }
}
