package gui_swing;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        setTitle("첫번째 GUI");
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}
