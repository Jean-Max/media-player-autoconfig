package com.viseo.formation.sound;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MP3PlayerWithAnyMethod implements IMediaPlayer {

    private IMediaFile IMediaFile;

    @Autowired
    public void addMediaFile(IMediaFile IMediaFile) {
        this.IMediaFile = IMediaFile;
    }

    public void playMedia() {
        this.IMediaFile.play();
    }
}
