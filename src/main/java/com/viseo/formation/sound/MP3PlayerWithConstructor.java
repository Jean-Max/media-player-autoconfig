package com.viseo.formation.sound;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MP3PlayerWithConstructor implements IMediaPlayer {

    private IMediaFile IMediaFile;

    @Autowired
    public MP3PlayerWithConstructor(final IMediaFile IMediaFile){
        this.IMediaFile = IMediaFile;
    }

    public void playMedia() {
        this.IMediaFile.play();
    }
}
