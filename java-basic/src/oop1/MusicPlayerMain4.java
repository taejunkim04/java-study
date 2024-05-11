package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayerData player = new MusicPlayerData();
        player.playerOn();
        player.volumeUp();
        player.volumeUp();
        player.volumeDown();
        player.showStatus();
        player.playerOff();
    }
}
