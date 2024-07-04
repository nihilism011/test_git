package gui_swing;

import javax.swing.*;
import java.awt.*;

public class NoLayout extends JFrame {
    public NoLayout() {
        setTitle("배치관리자 없음");
        Container c = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c.setBackground(Color.BLACK);
        c.setLayout(null);
        JLabel la = new JLabel("Hello, Buttons!");
        la.setLocation(200, 100);
        la.setSize(100, 18);
        c.add(la);
        for (int i = 1; i < 10; i++) {
            JButton b = new JButton("button"+i);
            b.setLocation(i*30, i*30);
            b.setSize(80+(i*5), 20+(i*5));
            c.add(b);
        }
        setSize(500, 400);
        setVisible(true);

    }

    public static void main(String[] args) {
        new NoLayout();
    }
}
