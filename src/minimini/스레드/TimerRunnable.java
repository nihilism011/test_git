package minimini.스레드;

import javax.swing.*;


public class TimerRunnable implements Runnable {
    private JLabel timerLabel;

    public TimerRunnable(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n = 5;
        while (true) {
            timerLabel.setText("CountDown\n"+n);
            n--;
            if(n==-1){
                timerLabel.setText("CountDown Clear");
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}