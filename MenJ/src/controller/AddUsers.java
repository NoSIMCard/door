package controller;

import org.junit.Test;
import util.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddUsers {
     JFrame frame = Model.Jfr();
     JPanel panel1 = new JPanel();
     JPanel panel2 = new JPanel();
     JPanel panel3 = new JPanel();
     JPanel panel4 = new JPanel();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddUsers();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void addUser(){
//        frame.setSize(1000, 600);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        AddUsers.addUser1();
        // 设置界面可见
//        frame.setVisible(true);
//        tableTest1.DrawTable();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddUsers();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AddUsers() {
        addUser1();
    }

    // 创建步骤条
    public  void drawSteps(JPanel panel) {
        int x = 170;
        for (int i = 0; i < 3; i++) {
            JLabel Label = new JLabel("———");
            Label.setFont(new Font("宋体", Font.BOLD, 24));
            Label.setForeground(Color.gray);
            Label.setBounds(x, 40, 150, 50);
            panel.add(Label);
            x += 250;
        }
    }

    //增加用户1
    public  void addUser1() {
        frame.getContentPane().add(panel1);
        drawSteps(panel1);
        panel1.setLayout(null);
        //进度条
        JLabel oneLabel = new JLabel("① 设置密码");
        oneLabel.setFont(new Font("宋体", Font.BOLD, 24));
        oneLabel.setForeground(Color.black);
        oneLabel.setBounds(20, 40, 150, 50);
        panel1.add(oneLabel);
        JLabel twoLabel = new JLabel("② 录入卡号");
        twoLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        twoLabel.setForeground(Color.gray);
        twoLabel.setBounds(260, 40, 150, 50);
        panel1.add(twoLabel);
        JLabel threeLabel = new JLabel("③ 录入指纹");
        threeLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        threeLabel.setForeground(Color.gray);
        threeLabel.setBounds(520, 40, 150, 50);
        panel1.add(threeLabel);
        JLabel foreLabel = new JLabel("④ 录入面部信息");
        foreLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        foreLabel.setForeground(Color.gray);
        foreLabel.setBounds(770, 40, 200, 50);
        panel1.add(foreLabel);

//      input框
        JLabel idLabel = new JLabel("请输入工号：");
        idLabel.setFont(new Font("宋体", Font.BOLD, 24));
        idLabel.setBounds(180, 140, 150, 50);
        panel1.add(idLabel);
        JTextField idText = new JTextField(20);
        idText.setBounds(330, 140, 500, 50);
        panel1.add(idText);
        JLabel nameLabel = new JLabel("请输入姓名：");
        nameLabel.setFont(new Font("宋体", Font.BOLD, 24));
        nameLabel.setBounds(180, 210, 150, 50);
        panel1.add(nameLabel);
        JTextField nameText = new JTextField(20);
        nameText.setBounds(330, 210, 500, 50);
        panel1.add(nameText);
        JLabel passwordLabel = new JLabel("请输入密码: ");
        passwordLabel.setFont(new Font("宋体", Font.BOLD, 24));
        passwordLabel.setBounds(180, 280, 180, 50);
        panel1.add(passwordLabel);
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(330, 280, 500, 50);
        panel1.add(passwordText);
        JLabel passwordAgainLabel = new JLabel("再次输入密码: ");
        passwordAgainLabel.setFont(new Font("宋体", Font.BOLD, 24));
        passwordAgainLabel.setBounds(155, 350, 180, 50);
        panel1.add(passwordAgainLabel);
        JPasswordField passwordAgainText = new JPasswordField(20);
        passwordAgainText.setBounds(330, 350, 500, 50);
        panel1.add(passwordAgainText);

//      按钮
        JButton upButton = new JButton("上一页");
        upButton.setBounds(150, 450, 100, 45);
        upButton.setEnabled(false);
        panel1.add(upButton);
        JButton downButton = new JButton("下一页");
        downButton.setBounds(290, 450, 100, 45);
        downButton.setBackground(new Color(24,144,255));
        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);
                addUser2();
                panel2.setVisible(true);
            }
        });
        panel1.add(downButton);
        JButton saveButton = new JButton("保 存");
        saveButton.setBounds(600, 450, 100, 45);
        saveButton.setBackground(new Color(24,144,255));
        panel1.add(saveButton);
        JButton exitButton = new JButton("退 出");
        exitButton.setBounds(720, 450, 100, 45);
        exitButton.setBackground(new Color(24,144,255));
        panel1.add(exitButton);


    }

    //增加用户2
    public  void addUser2() {
        panel2.setLayout(null);
//        panel.setVisible(true);
        //进度条
        drawSteps(panel2);
        JLabel oneLabel = new JLabel("√ 设置密码");
        oneLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        oneLabel.setForeground(Color.gray);
        oneLabel.setBounds(20, 40, 150, 50);
        panel2.add(oneLabel);
        JLabel twoLabel = new JLabel("② 录入卡号");
        twoLabel.setFont(new Font("宋体", Font.BOLD, 24));
        twoLabel.setForeground(Color.black);
        twoLabel.setBounds(260, 40, 150, 50);
        panel2.add(twoLabel);
        JLabel threeLabel = new JLabel("③ 录入指纹");
        threeLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        threeLabel.setForeground(Color.gray);
        threeLabel.setBounds(520, 40, 150, 50);
        panel2.add(threeLabel);
        JLabel foreLabel = new JLabel("④ 录入面部信息");
        foreLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        foreLabel.setForeground(Color.gray);
        foreLabel.setBounds(770, 40, 200, 50);
        panel2.add(foreLabel);

        //input框
        JLabel idLabel = new JLabel("请输入工号：");
        idLabel.setFont(new Font("宋体", Font.BOLD, 24));
        idLabel.setBounds(180, 140, 150, 50);
        panel2.add(idLabel);
        JTextField idText = new JTextField(20);
        idText.setBounds(330, 140, 500, 50);
        panel2.add(idText);
        JLabel nameLabel = new JLabel("请输入姓名：");
        nameLabel.setFont(new Font("宋体", Font.BOLD, 24));
        nameLabel.setBounds(180, 210, 150, 50);
        panel2.add(nameLabel);
        JTextField nameText = new JTextField(20);
        nameText.setBounds(330, 210, 500, 50);
        panel2.add(nameText);
        JLabel passwordLabel = new JLabel("请输入卡号: ");
        passwordLabel.setFont(new Font("宋体", Font.BOLD, 24));
        passwordLabel.setBounds(180, 280, 180, 50);
        panel2.add(passwordLabel);
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(330, 280, 500, 50);
        panel2.add(passwordText);

        //按钮
        JButton upButton = new JButton("上一页");
        upButton.setBounds(150, 450, 100, 45);
        upButton.setBackground(new Color(24,144,255));
        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(false);
                addUser1();
                panel1.setVisible(true);
            }
        });
        panel2.add(upButton);
        JButton downButton = new JButton("下一页");
        downButton.setBounds(290, 450, 100, 45);
        downButton.setBackground(new Color(24,144,255));
        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(false);
                addUser3();
                panel3.setVisible(true);
            }
        });
        panel2.add(downButton);
        JButton saveButton = new JButton("保 存");
        saveButton.setBounds(600, 450, 100, 45);
        saveButton.setBackground(new Color(24,144,255));
        panel2.add(saveButton);
        JButton exitButton = new JButton("退 出");
        exitButton.setBounds(720, 450, 100, 45);
        exitButton.setBackground(new Color(24,144,255));
        panel2.add(exitButton);

        frame.add(panel2);
    }

    //增加用户3
    public  void addUser3() {
        panel3.setLayout(null);
        //进度条
        drawSteps(panel3);
        JLabel oneLabel = new JLabel("√ 设置密码");
        oneLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        oneLabel.setForeground(Color.gray);
        oneLabel.setBounds(20, 40, 150, 50);
        panel3.add(oneLabel);
        JLabel twoLabel = new JLabel("√ 录入卡号");
        twoLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        twoLabel.setForeground(Color.gray);
        twoLabel.setBounds(260, 40, 150, 50);
        panel3.add(twoLabel);
        JLabel threeLabel = new JLabel("③ 录入指纹");
        threeLabel.setFont(new Font("宋体", Font.BOLD, 24));
        threeLabel.setForeground(Color.black);
        threeLabel.setBounds(520, 40, 150, 50);
        panel3.add(threeLabel);
        JLabel foreLabel = new JLabel("④ 录入面部信息");
        foreLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        foreLabel.setForeground(Color.gray);
        foreLabel.setBounds(770, 40, 200, 50);
        panel3.add(foreLabel);

        //input框
        JLabel idLabel = new JLabel("请输入工号：");
        idLabel.setFont(new Font("宋体", Font.BOLD, 24));
        idLabel.setBounds(180, 140, 150, 50);
        panel3.add(idLabel);
        JTextField idText = new JTextField(20);
        idText.setBounds(330, 140, 500, 50);
        panel3.add(idText);
        JLabel nameLabel = new JLabel("请输入姓名：");
        nameLabel.setFont(new Font("宋体", Font.BOLD, 24));
        nameLabel.setBounds(180, 210, 150, 50);
        panel3.add(nameLabel);
        JTextField nameText = new JTextField(20);
        nameText.setBounds(330, 210, 500, 50);
        panel3.add(nameText);
        JLabel passwordLabel = new JLabel("请输入指纹: ");
        passwordLabel.setFont(new Font("宋体", Font.BOLD, 24));
        passwordLabel.setBounds(180, 280, 180, 50);
        panel3.add(passwordLabel);

        //按钮
        JButton upButton = new JButton("上一页");
        upButton.setBounds(150, 450, 100, 45);
        upButton.setBackground(new Color(24,144,255));
        panel3.add(upButton);
        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel3.setVisible(false);
                addUser2();
                panel2.setVisible(true);
            }
        });
        JButton downButton = new JButton("下一页");
        downButton.setBounds(290, 450, 100, 45);
        downButton.setBackground(new Color(24,144,255));
        panel3.add(downButton);
        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel3.setVisible(false);
                addUser4();
                panel4.setVisible(true);
            }
        });
        JButton saveButton = new JButton("保 存");
        saveButton.setBounds(600, 450, 100, 45);
        saveButton.setBackground(new Color(24,144,255));
        panel3.add(saveButton);
        JButton exitButton = new JButton("退 出");
        exitButton.setBounds(720, 450, 100, 45);
        exitButton.setBackground(new Color(24,144,255));
        panel3.add(exitButton);

        frame.add(panel3);
    }

    //增加用户4
    public  void addUser4() {
        panel4.setLayout(null);
        //进度条
        drawSteps(panel4);
        JLabel oneLabel = new JLabel("√ 设置密码");
        oneLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        oneLabel.setForeground(Color.gray);
        oneLabel.setBounds(20, 40, 150, 50);
        panel4.add(oneLabel);
        JLabel twoLabel = new JLabel("√ 录入卡号");
        twoLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        twoLabel.setForeground(Color.gray);
        twoLabel.setBounds(260, 40, 150, 50);
        panel4.add(twoLabel);
        JLabel threeLabel = new JLabel("√ 录入指纹");
        threeLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        threeLabel.setForeground(Color.gray);
        threeLabel.setBounds(520, 40, 150, 50);
        panel4.add(threeLabel);
        JLabel foreLabel = new JLabel("④ 录入面部信息");
        foreLabel.setFont(new Font("宋体", Font.BOLD, 24));
        foreLabel.setForeground(Color.black);
        foreLabel.setBounds(770, 40, 200, 50);
        panel4.add(foreLabel);
        //input框
        JLabel idLabel = new JLabel("请输入工号：");
        idLabel.setFont(new Font("宋体", Font.BOLD, 24));
        idLabel.setBounds(180, 140, 150, 50);
        panel4.add(idLabel);
        JTextField idText = new JTextField(20);
        idText.setBounds(330, 140, 500, 50);
        panel4.add(idText);
        JLabel nameLabel = new JLabel("请输入姓名：");
        nameLabel.setFont(new Font("宋体", Font.BOLD, 24));
        nameLabel.setBounds(180, 210, 150, 50);
        panel4.add(nameLabel);
        JTextField nameText = new JTextField(20);
        nameText.setBounds(330, 210, 500, 50);
        panel4.add(nameText);
        JLabel passwordLabel = new JLabel("请输入面部信息: ");
        passwordLabel.setFont(new Font("宋体", Font.BOLD, 24));
        passwordLabel.setBounds(130, 280, 220, 50);
        panel4.add(passwordLabel);
        //按钮
        JButton upButton = new JButton("上一页");
        upButton.setBounds(150, 450, 100, 45);
        upButton.setBackground(new Color(24,144,255));
        panel4.add(upButton);
        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel4.setVisible(false);
                addUser3();
                panel3.setVisible(true);
            }
        });
        JButton downButton = new JButton("下一页");
        downButton.setBounds(290, 450, 100, 45);
        downButton.setEnabled(false);
        panel4.add(downButton);
        JButton saveButton = new JButton("保 存");
        saveButton.setBounds(600, 450, 100, 45);
        saveButton.setBackground(new Color(24,144,255));
        panel4.add(saveButton);
        JButton exitButton = new JButton("退 出");
        exitButton.setBounds(720, 450, 100, 45);
        exitButton.setBackground(new Color(24,144,255));
        panel4.add(exitButton);
        frame.add(panel4);
    }
}
