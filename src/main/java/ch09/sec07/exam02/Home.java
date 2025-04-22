package ch09.sec07.exam02;

public class Home {
    private RemoteControl rc = new RemoteControl(){
        @Override
        public void turnOn() {
            System.out.println("티비 turn on");
        }

        @Override
        public void turnOff() {
            System.out.println("티비 turn off");
        }
    };

    public void use1(){
        rc.turnOn();
        rc.turnOff();
    }

    public void use2(){
        RemoteControl rc = new RemoteControl(){
            @Override
            public void turnOn() {
                System.out.println("에어컨 turn on");

            }

            @Override
            public void turnOff() {
                System.out.println("에어컨 turn off");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc){
        rc.turnOn();
        rc.turnOff();
    }
}
