package com.kohan81.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * learning spring framework
 */

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.play();

        context.close();
    }
}
