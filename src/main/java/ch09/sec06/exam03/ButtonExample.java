package ch09.sec06.exam03;

import ch09.sec06.exam01.Button;

import java.sql.SQLOutput;

public class ButtonExample {
    public static void main(String[] args) {
        Button button = new Button();

        class OkListener implements Button.ClilckListener{
            @Override
            public void onClick() {
                System.out.println("Button clicked");
            }
        }

        button.setClilckListener(new OkListener());

        button.click();

        Button btnCancel = new Button();
        class CancelListener implements Button.ClilckListener{
            @Override
            public void onClick() {
                System.out.println("CancelButton clicked");
            }
        }

        btnCancel.setClilckListener(new CancelListener());

        btnCancel.click();
    }
}
