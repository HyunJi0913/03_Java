package ch06.sec14;

public class Car {
    // 필드 선언
    private int speed;
    private boolean stop;

    // speed의 getter
    public int getSpeed() {
        return speed;
    }

    // speed의 setter
    public void setSpeed(int speed) {
        if (speed <= 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    // stop의 getter
    public boolean isStop() {
        return stop;
    }

    // stop의 setter
    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop) {
            this.speed = 0;
        }
    }
}
