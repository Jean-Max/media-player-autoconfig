package com.viseo.formation.sound;

import org.springframework.stereotype.Component;

@Component
public class MP3File implements IMediaFile {

    private String title = "California Love";

    private String artist = "Tupac Shakur";

    private String album = "All Eyez on Me";

    private Integer duration = 240;

    public void play(){
        System.out.println("Playing " + title + " of album " + album + " by " + artist);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
