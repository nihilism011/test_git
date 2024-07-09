package minimini.스레드;

import javax.swing.*;
import java.awt.*;

public class ThreadTimerEx extends JFrame {
    public ThreadTimerEx(){
        setTitle("스레드를 상속받은 타이머 스레드");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,170);
        setVisible(true);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("consolas",Font.ITALIC,80));
        c.add(timerLabel);

        TimerThread th = new TimerThread(timerLabel);
        th.start();


    }

    public static void main(String[] args) {
        new ThreadTimerEx();
    }

}
