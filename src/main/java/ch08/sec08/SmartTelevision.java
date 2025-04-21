package ch08.sec08;

public class SmartTelevision implements RemoteControl,Searchable{
    @Override
    public void turnOn() {
        System.out.println("SmartTelevision ON");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTelevision OFF");
    }

    @Override
    public void search(String url) {
        System.out.println(url+" is searching");
    }
}
