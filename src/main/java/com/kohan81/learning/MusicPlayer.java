package com.kohan81.learning;

import java.util.*;

public class MusicPlayer {

    private Music music;


    private String name;
    private int volume;

    //IoC
    MusicPlayer(Music music){
        this.music = music;
    }

    MusicPlayer(){
    }

    List <Music> musicList = new ArrayList<>();

    void addMusic(Music music){
        musicList.add(music);
    }

    public void setMusic(Music music){
        this.music = music;
    }

    public void play(){
        System.out.println("Playnig: " + music.getSong());
    }

    public void playList(){
        for(Music music : musicList){
            System.out.println("Playing: " + music.getSong());
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
