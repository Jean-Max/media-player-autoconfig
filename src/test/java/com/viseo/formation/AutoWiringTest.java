package com.viseo.formation;

import com.viseo.formation.config.MediaPlayerConfig;
import com.viseo.formation.sound.MP3File;
import com.viseo.formation.sound.MP3PlayerWithConstructor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // Allowed to have a Spring application context created when test starts
@ContextConfiguration( classes = MediaPlayerConfig.class) // Tells Spring to load the configuration
public class AutoWiringTest {

    @Autowired
    private MP3PlayerWithConstructor mediaPlayer;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void audio_file_should_not_be_null(){
        Assert.assertNotNull(mediaPlayer.getAudioFile());
        Assert.assertEquals("All Eyez on Me",mediaPlayer.getAudioFile().getAlbum());
        Assert.assertEquals("California Love", mediaPlayer.getAudioFile().getTitle());
        Assert.assertEquals("Tupac Shakur", mediaPlayer.getAudioFile().getArtist());
        Assert.assertEquals(new Integer(240), mediaPlayer.getAudioFile().getDuration());
    }

    @Test
    public void media_player_should_display_mp3_information_when_press_play_button(){
        Assert.assertNotNull(mediaPlayer);
        mediaPlayer.playMedia();
        Assert.assertEquals("Playing California Love of album All Eyez on Me by Tupac Shakur\r\n", systemOutRule.getLog());
        // TODO:Use \n for Unix-like system.
    }
}
