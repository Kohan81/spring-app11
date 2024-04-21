package com.kohan81.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;

/**
 * learning spring framework
 */

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playList();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
