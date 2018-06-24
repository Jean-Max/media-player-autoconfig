package com.viseo.formation.sound;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MP3PlayerWithSetterMethod implements IMediaPlayer {

    private IMediaFile IMediaFile;

    public void playMedia() {
        this.IMediaFile.play();
    }

    @Autowired
    public void setIMediaFile(IMediaFile IMediaFile) {
        this.IMediaFile = IMediaFile;
    }
}
