package com.kohan81.learning;

import java.util.*;

public class MusicPlayer {

    private Music music;


    private String name;
    private int volume;

    List <Music> musicList = new ArrayList<>();

    //IoC
    private MusicPlayer(Music music){
        this.music = music;
    }

    private MusicPlayer(){
    }

     void doInit(){
         System.out.println("Initializing Music Player");
     }

     void doDestroy(){
        System.out.println("Destroying Music Player");
     }

//    void setMusicList(List<Music> musicList){
//        this.musicList = musicList;
//    }

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

    public void setMusicList(List <Music>musicList) {
        this.musicList = musicList;
    }
}
