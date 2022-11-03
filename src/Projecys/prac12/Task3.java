package Projecys.prac12;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class Task3 extends JFrame {

    private JLabel window;

    private int imgNumber = 1;

    private Task3() {

        this.setSize(1200, 1200);
        window = new JLabel("", new ImageIcon(getClass().getResource("1.jpg")), SwingConstants.CENTER);

        getContentPane().add(window);

        Timer timer = new Timer(2000, e ->nextImg());
        timer.start();
    }

    public void nextImg()
    {
        window.setIcon(new ImageIcon(getClass().getResource((++imgNumber)+ ".jpg")));
        if(imgNumber == 5) imgNumber = 0;
    }


    public static void main(String[] args)
    {
        Task3 an = new Task3();
        an.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        an.setVisible(true);
    }
}