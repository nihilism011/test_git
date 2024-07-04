package gui_swing;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx(){
        setTitle("두번째 GUI");
        Container c = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c.setBackground(Color.GRAY);
        c.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));

        c.add(new JButton("A 버튼"));
        c.add(new JButton("B 버튼"));
        c.add(new JButton("C 버튼"));
        c.add(new JButton("D 버튼"));
        c.add(new JButton("F 버튼"));
        setSize(500,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ContentPaneEx();
    }
}
