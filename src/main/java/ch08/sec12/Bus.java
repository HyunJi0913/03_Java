package ch08.sec12;

public class Bus implements Vehicle{
    public void run(){
        System.out.println("Bus is running");
    }

    public void checkFare(){
        System.out.println("승차요금을 체크합니다");
    }
}
