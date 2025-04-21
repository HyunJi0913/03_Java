package ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();

        rc.turnOff();
        rc.turnOff();

        Searchable searchalbe = new SmartTelevision();

        searchalbe.search("http://www.youtube.com");
    }
}
