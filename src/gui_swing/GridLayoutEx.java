package gui_swing;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        setTitle("두번째 GUI");
        Container c = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4,2);
        grid.setVgap(10);

        c.setLayout(grid);

        c.add(new JLabel("이름"));
        c.add(new TextField());
        c.add(new JLabel("학번"));
        c.add(new TextField());
        c.add(new JLabel("학과"));
        c.add(new TextField());
        c.add(new JLabel("과목"));
        c.add(new TextField());

        setSize(500, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}