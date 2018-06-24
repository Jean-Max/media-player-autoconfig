package com.viseo.formation;

import com.viseo.formation.config.MediaPlayerConfig;
import com.viseo.formation.sound.MP3PlayerWithAnyMethod;
import com.viseo.formation.sound.MP3PlayerWithConstructor;
import com.viseo.formation.sound.MP3PlayerWithSetterMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = MediaPlayerConfig.class)
public class RunApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MediaPlayerConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String element : beanDefinitionNames) {
            System.out.println("Bean available in context are: " + element);
        }

        MP3PlayerWithConstructor playerWithConstructor = (MP3PlayerWithConstructor)context.getBean("MP3PlayerWithConstructor");
        playerWithConstructor.playMedia();

        MP3PlayerWithSetterMethod playerWithSetterMethod = (MP3PlayerWithSetterMethod)context.getBean("MP3PlayerWithSetterMethod");
        playerWithSetterMethod.playMedia();

        MP3PlayerWithAnyMethod playerWithAnyMethod = (MP3PlayerWithAnyMethod)context.getBean("MP3PlayerWithAnyMethod");
        playerWithAnyMethod.playMedia();
    }
}
