package gui_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Ex10_9 extends JFrame {
    Ex10_9(){
        setTitle("마우스 좌표");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        JLabel la = new JLabel();
        c.add(la);
        setVisible(true);
        c.setLayout(null);
        la.setSize(150,30);
        c.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                la.setLocation(e.getX(),e.getY()+15);
                la.setText("드래그중!"+e.getX()+","+e.getY());

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                la.setLocation(e.getX(),e.getY()+15);
                la.setText("움직이는중!"+e.getX()+","+e.getY());
            }
        });

        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                la.setLocation(e.getX(),e.getY()+15);
                la.setText("클릭!"+e.getX()+","+e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                la.setLocation(e.getX(),e.getY()+15);
                la.setText("클릭 릴리즈!"+e.getX()+","+e.getY());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                c.setBackground(Color.cyan);
            }
            @Override
            public void mouseExited(MouseEvent e){
                c.setBackground(Color.black);
            }

        });



    }

    public static void main(String[] args) {
        new Ex10_9();
    }
}
