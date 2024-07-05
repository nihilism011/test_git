package gui_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ex10_7 extends JFrame {
    JLabel input = new JLabel("키를 입력해주세요.");

    Ex10_7() {
        setTitle("key 코드 예제");
        setSize(500, 200);
        Container c = getContentPane();
        c.setBackground(Color.green);
        input.setSize(150, 20);
        c.setSize(300, 100);
        c.setLayout(null);
        input.setLocation(150, 50);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.add(input);
        c.setFocusable(true);
        c.requestFocus();
        c.setBackground(Color.green);
        input.setBackground(Color.green);

        c.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                input.setText(e.getKeyText(keyCode) + "키가 입력되었음");
                if (e.getKeyChar() == '%') c.setBackground(Color.yellow);
                if ((e.getKeyChar() == '5')) c.setBackground(Color.green);
                if (keyCode == 17){
                    input.setOpaque(true);
                input.setBackground(Color.CYAN);}
            }
        });


    }

    public static void main(String[] args) {
        new Ex10_7();
    }

}
