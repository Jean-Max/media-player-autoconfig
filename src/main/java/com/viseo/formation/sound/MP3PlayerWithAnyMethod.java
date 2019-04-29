package com.viseo.formation.sound;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MP3PlayerWithAnyMethod implements IMediaPlayer {

    private MP3File audioFile;

    @Autowired
    public void addMediaFile(MP3File audioFile) {
        this.audioFile = audioFile;
    }

    public void playMedia() {
        this.audioFile.play();
    }
}
