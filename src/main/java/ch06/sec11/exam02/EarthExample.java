package ch06.sec11.exam02;

public class EarthExample {
    public static void main(String[] args) {
        Earth earth = new Earth();
        double surfaceArea = earth.result();
        System.out.println("지구의 표면적: " + surfaceArea);
    }
}
