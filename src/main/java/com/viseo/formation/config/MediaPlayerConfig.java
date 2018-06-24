package com.viseo.formation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.viseo.formation.sound")
//@ComponentScan(basePackageClasses = {MP3File.class, MP3PlayerWithConstructorI.class, MP3PlayerWithSetterMethodI.class, MP3PlayerWithAnyMethodI.class})
public class MediaPlayerConfig {

}
