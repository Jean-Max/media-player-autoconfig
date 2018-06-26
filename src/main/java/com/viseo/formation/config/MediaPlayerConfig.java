package com.viseo.formation.config;

import com.viseo.formation.sound.MP3FileToInclude;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.viseo.formation.sound")
//@ComponentScan(basePackageClasses = {MP3File.class, MP3PlayerWithConstructorI.class, MP3PlayerWithSetterMethodI.class, MP3PlayerWithAnyMethodI.class})
/*@ComponentScan(basePackages = "com.viseo.formation.sound",
        includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MP3FileToInclude.class),
        useDefaultFilters = false)*/
public class MediaPlayerConfig {

}
