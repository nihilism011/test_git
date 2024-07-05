package gui_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListen_main extends JFrame {
    JLabel[] keyM;
    KeyListen_main() {
        setTitle("Key 리스너");
        Container c = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
        c.setLayout((new FlowLayout()));
        keyM = new JLabel [3];
        keyM[0]= new JLabel("getKeyCode() ");
        keyM[1]= new JLabel("getKeyChar() ");
        keyM[2]= new JLabel("getKeyText() ");

        for(int i =0;i<keyM.length;i++){
            c.add(keyM[i]);
            keyM[i].setOpaque(true);
            keyM[i].setBackground(Color.LIGHT_GRAY);
        }
        c.addKeyListener(new MyKeyListener());
        c.setFocusable(true);
        c.requestFocus();
    }
    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();
            keyM[0].setText(Integer.toString(keyCode));
            keyM[1].setText(Character.toString(keyChar));
            keyM[2].setText(e.getKeyText(keyCode));
        }
    }


    public static void main(String[] args) {
        new KeyListen_main();
    }
}
