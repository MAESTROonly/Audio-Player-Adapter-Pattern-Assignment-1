package Main;

import Interface.AudioPlayer;

public class MusicPlayerApp {
    public static void main(String[] args) {
        AudioPlayer ap = new MP3Player();
        ap.play("mp3","song.mp3");

        AudioPlayer ap2 = new AudioAdapter("wav");

        ap2.play("mp3","song.wav");

        AudioPlayer ap3 = new AudioAdapter("acc");

        ap3.play("mp3","song.acc");

    }
}
