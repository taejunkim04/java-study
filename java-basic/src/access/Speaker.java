package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;//초기 볼륨값
    }

    void volumeUP() {
        if (volume <= 100) {
            volume++;
            System.out.println("볼륨이 증가하였습니다.");
        } else {
            System.out.println("이미 최대 볼륨입니다.");
        }
    }

    void volumeDown() {
        volume--;
        System.out.println("볼륨이 감소하였습니다.");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
