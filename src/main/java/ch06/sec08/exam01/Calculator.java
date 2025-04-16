package ch06.sec08.exam01;

public class Calculator {

    public void powerOn(){
        System.out.println("전원을 킵니다");
    }
    
    public void powerOff(){
        System.out.println("전원을 끕니다");
    }
    
    public int plus(int a, int b){
        return a+b;
    }
    
    public double divide(int a, int b){
        return (double) a/b;
    }

}
