package ch06.ExampleTest;

import javax.swing.*;

public class ButtonMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonExample().setVisible(true);

            }
        });
    }
}
