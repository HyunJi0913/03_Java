package ch06.ExampleTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ButtonExample extends JFrame {

    private JTextField messageFiled;
    private JButton sendbutton;

    //중첩 인터페이스 선언
    public interface MessageHandler{
        //메시지를 처리하는 메서드
        void printMessage(String message);


    }


    public ButtonExample() {
        setTitle("중첩 클래스, 익명 객체 예제");
        setSize(400, 100);
        setLocationRelativeTo(null); //화면 중앙 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        messageFiled = new JTextField(20);
        sendbutton = new JButton("콘솔에 출력");
        add(messageFiled);
        add(sendbutton);

        //UI 컴포넌트를 JFrame에 추가
        add(new JLabel("메시지"));
        add(messageFiled);
        add(sendbutton);
        
        //중첩 인터페이스를 익명 내부 클래스를 이용해서 구현 !! 
        MessageHandler handlerA = new MessageHandler(){
            @Override
            public void printMessage(String message) {
                System.out.println("message = " + message);
            }};
        
        MessageHandler handlerB = new MessageHandler(){
            @Override
            public void printMessage(String message) {
                String currentTime = LocalDateTime.now().format(
                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                );

                System.out.printf("[%s] %s\n", currentTime, message);
            }
        };

        //sendbutton 클릭 시 동작을 익명 내부 클래스로 구현

        sendbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //jtextfiled에 작성된 값 얻어오기
                String message = messageFiled.getText();

                if(message.isEmpty()){
                    //html의 alert() 와 비슷
                    JOptionPane.showMessageDialog(ButtonExample.this,"전송할 메시지를 입력해주세요","오류",JOptionPane.ERROR_MESSAGE);

                }
                else {
                    //중첩 인터페이스를 구현한 방법을 이용해서 message를
                    //출력한다
                    handlerA.printMessage(message);
                    handlerB.printMessage(message);

                    //입력 필드 초기화
                    messageFiled.setText("");
                }

            }
        });
    }
}
