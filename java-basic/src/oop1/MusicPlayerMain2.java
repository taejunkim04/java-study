package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData playerData = new MusicPlayerData();

        playerOn(playerData);

        volumeUp(playerData);
        volumeUp(playerData);
        volumeDown(playerData);

        playerSangTe(playerData);

        playerDown(playerData);
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨" + data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨" + data.volume);
    }

    static void playerSangTe(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    static void playerOn(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void playerDown(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

}
