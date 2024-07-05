package gui_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex11_5 extends JFrame {
    int sumnum = 0;
    JCheckBox apple = new JCheckBox("사과");
    JCheckBox banana = new JCheckBox("바나나");
    JCheckBox orange = new JCheckBox("오랜지");
    JCheckBox[] fruitbox = {new JCheckBox("사과"),new JCheckBox("바나나"),new JCheckBox("오랜지")};
    Ex11_5() {
        setTitle("과일들");
        setSize(500, 300);
        setVisible(true);
        Container c = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setBackground(Color.ORANGE);
        c.setLayout(new FlowLayout());
        c.add(new JLabel("사과 100원, 배 500원 체리 20000원"));



        c.add(new JLabel("현재" + sumnum + "입니다"));



    }

    public static void main(String[] args) {
        new Ex11_5();
    }
}
