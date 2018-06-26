package com.viseo.formation;

import com.viseo.formation.config.MediaPlayerConfig;
import com.viseo.formation.sound.MP3FileToInclude;
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
public class CustomFiltersTest {

    @Autowired
    private MP3FileToInclude mp3FileToInclude;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void mp3FileToInclude_should_not_be_null(){
        Assert.assertNotNull(mp3FileToInclude);
        Assert.assertEquals("All Eyez on Me", mp3FileToInclude.getAlbum());
        Assert.assertEquals("California Love", mp3FileToInclude.getTitle());
        Assert.assertEquals("Tupac Shakur", mp3FileToInclude.getArtist());
        Assert.assertEquals(new Integer(240), mp3FileToInclude.getDuration());
    }

}
