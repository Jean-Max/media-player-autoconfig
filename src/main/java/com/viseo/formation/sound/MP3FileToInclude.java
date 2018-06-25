package com.viseo.formation.sound;

import org.springframework.stereotype.Component;

@Component
public class MP3FileToInclude {

    private String title = "California Love";

    private String artist = "Tupac Shakur";

    private String album = "All Eyez on Me";

    private Integer duration = 240;

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public Integer getDuration() {
        return duration;
    }
}
