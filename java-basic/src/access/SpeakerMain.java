package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();
        speaker.volumeUP();
        speaker.showVolume();

        System.out.println("volumn 필드 직접 접근 수정");
        speaker.showVolume();
    }
}
