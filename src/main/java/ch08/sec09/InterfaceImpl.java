package ch08.sec09;

public class InterfaceImpl implements InterfaceC {

    @Override
    public void methodC() {
        System.out.println("InterfaceImpl methodC");
    }

    @Override
    public void methodA() {
        System.out.println("InterfaceImpl methodA");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceImpl methodB");
    }
}
