package com.viseo.formation.config;

import com.viseo.formation.sound.MP3File;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.viseo.formation.sound") // component scanning with package
@ComponentScan(basePackageClasses = {MP3File.class})
public class MediaPlayerConfig {

}
