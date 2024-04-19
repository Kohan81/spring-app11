package com.kohan81.learning;

public class MusicPlayer {

    private Music music;

    //IoC
    MusicPlayer(Music music){
        this.music = music;
    }

    public void play(){
        System.out.println("Playnig: " + music.getSong());
    }
}
