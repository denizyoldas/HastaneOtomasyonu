package FormUI;

import javax.swing.*;

public class gtsWork {
    private JButton button1;
    private JPanel tttt;


    public static void main(String[] args) {
        JFrame frame = new JFrame("My second Frame");
        frame.setContentPane(new gtsWork().tttt);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setLocation(200,200);
        frame.setVisible(true);
    }
}
