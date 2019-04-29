package com.viseo.formation.sound;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MP3PlayerWithSetterMethod implements IMediaPlayer {

    private MP3File audioFile;

    @Autowired
    public void setIMediaFile(MP3File IMediaFile) {
        this.audioFile = IMediaFile;
    }

    public void playMedia() {
        this.audioFile.play();
    }
}
