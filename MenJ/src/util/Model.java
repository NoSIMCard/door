package util;

import javax.swing.*;

public class Model {
    public static JFrame Jfr(){
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        return frame;
    }

    public static JPanel TimePanel(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 262, 578);
        return panel;
    }
}
