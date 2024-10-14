package Main;

import Interface.ACCPlayer;
import Interface.WAVplayer;

public class AdvancedAudioPlayer implements WAVplayer, ACCPlayer {
    @Override
    public void playWAV(String fileName) {
        System.out.println("Playing WAV file: " + fileName);
    }
    @Override
    public void playACC(String fileName) {
        System.out.println("Playing ACC file: " + fileName);
    }
}
