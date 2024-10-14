package Main;


import Interface.AudioPlayer;

public class MP3Player implements AudioPlayer {
    @Override
    public void play( String audioType, String fileName ) {
        if(audioType.equals("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        }else{
            System.out.println("only mp3 player");
        }
    }

}
