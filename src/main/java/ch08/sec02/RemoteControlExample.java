package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();  // 출력: Television ON

        rc = new Audio();
        rc.turnOn();  // 출력: Audio ON
    }
}
