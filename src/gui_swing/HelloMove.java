package gui_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HelloMove extends JFrame {
    JLabel hello = new JLabel("HELLO");

    HelloMove() {
        setTitle("상하좌우");
        setSize(500, 500);
        Container c = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setFocusable(true);
        c.requestFocus();
        setVisible(true);
        c.setLayout(null);
        setBackground(Color.lightGray);

        hello.setLocation(50, 50);
        hello.setSize(50, 30);

        c.add(hello);

        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()== KeyEvent.VK_RIGHT) hello.setLocation(hello.getX()+10,hello.getY());
                if(e.getKeyCode()== KeyEvent.VK_LEFT) hello.setLocation(hello.getX()-10,hello.getY());
                if(e.getKeyCode()== KeyEvent.VK_DOWN) hello.setLocation(hello.getX(),hello.getY()+10);
                if(e.getKeyCode()== KeyEvent.VK_UP) hello.setLocation(hello.getX(),hello.getY()-10);
            }
        });


    }

    public static void main(String[] args) {
        new HelloMove();
    }

}
