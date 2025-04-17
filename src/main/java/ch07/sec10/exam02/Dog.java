package ch07.sec10.exam02;

import ch07.exam.HttpServlet;

public class Dog extends Animal {
    @Override
    public void sound(){
        System.out.println("멍멍");
    }
}
