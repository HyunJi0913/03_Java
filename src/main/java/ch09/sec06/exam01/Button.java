package ch09.sec06.exam01;

public class Button {
    public static interface ClilckListener{
        void onClick();
    }

    private ClilckListener clilckListener;

    public void setClilckListener(ClilckListener clilckListener) {
        this.clilckListener = clilckListener;
    }

    public void click(){
        this.clilckListener.onClick();
    }


}
