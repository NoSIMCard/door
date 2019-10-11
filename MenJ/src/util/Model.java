package util;

import javax.swing.*;

public class Model {
    static final JFrame frame = new JFrame();
    static final JPanel Timepanel = new JPanel();
    static final JPanel Userpanel = new JPanel();
    static final JPanel Menupanel = new JPanel();
    static final JPanel addUser = new JPanel();
    static final JPanel Highpanel = new JPanel();
    static final JPanel MenJpanel = new JPanel();
    static final JPanel Networkpanel = new JPanel();
    static final JPanel Verifypanel = new JPanel();

    public static JFrame Jfr(){
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        return frame;
    }

    public static JPanel MenuPanel(){
        Menupanel.setLayout(null);
        Menupanel.setBounds(0, 0, 262, 578);
        return Menupanel;
    }

    public static JPanel TimePanel(){
        Timepanel.setLayout(null);
        Timepanel.setBounds(0, 0, 262, 578);
        return Timepanel;
    }

    public static JPanel UserPanel(){
        Userpanel.setLayout(null);
        Userpanel.setBounds(263, 0, 731, 578);
        return Userpanel;
    }

    public static JPanel HighSetup(){
        Highpanel.setLayout(null);
        Highpanel.setBounds(0, 0, 262, 578);
        return Highpanel;
    }

    public static JPanel MenJPanel(){
        MenJpanel.setBounds(0, 0, 262, 578);
        MenJpanel.setLayout(null);
        return MenJpanel;
    }

    public static JPanel NetworkPanel(){
        Networkpanel.setBounds(0, 0, 262, 578);
        Networkpanel.setLayout(null);
        return Networkpanel;
    }

    public static JPanel VerifyPanel(){
        Verifypanel.setBounds(0, 0, 262, 578);
        Verifypanel.setLayout(null);
        return Verifypanel;
    }
}
