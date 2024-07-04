package gui_swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx(){
        setTitle("두번째 GUI");
        Container c = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c.setBackground(Color.GRAY);
        c.setLayout(new BorderLayout(10,10));

        c.add(new JButton("A 버튼"), BorderLayout.WEST);
        c.add(new JButton("B 버튼"), BorderLayout.CENTER);
        c.add(new JButton("C 버튼"), BorderLayout.EAST);
        c.add(new JButton("D 버튼"), BorderLayout.NORTH);
        c.add(new JButton("F 버튼"), BorderLayout.SOUTH);
        setSize(500,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}
