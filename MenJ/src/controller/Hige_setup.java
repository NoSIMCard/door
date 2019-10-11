package controller;

import util.Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Hige_setup {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hige_setup window = new Hige_setup();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hige_setup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = Model.HighSetup();
		
		JLabel label = new JLabel("门禁系统");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		label.setBounds(79, 20, 150, 34);
		panel.add(label);
		
		JButton button = new JButton("用户管理");
		button.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		button.setBounds(32, 129, 197, 49);
		panel.add(button);
		
		JButton button_1 = new JButton("验证设置");
		button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		button_1.setBounds(32, 190, 197, 49);
		panel.add(button_1);
		
		JButton button_2 = new JButton("时间设置");
		button_2.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		button_2.setBounds(32, 262, 197, 49);
		panel.add(button_2);
		
		JButton button_3 = new JButton("高级设置");
		button_3.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		button_3.setBounds(32, 323, 197, 49);
		panel.add(button_3);
		
		JButton button_4 = new JButton("网络设置");
		button_4.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		button_4.setBounds(32, 388, 197, 49);
		panel.add(button_4);
		
		JButton button_5 = new JButton("退出");
		button_5.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		button_5.setBounds(32, 449, 197, 49);
		panel.add(button_5);
		
		JButton button_6 = new JButton("记录查询");
		button_6.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		button_6.setBounds(32, 66, 197, 49);
		panel.add(button_6);
		
		JButton button_7 = new JButton("恢复出厂设置");
		button_7.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		button_7.setBounds(427, 306, 188, 66);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("系统信息");
		button_8.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		button_8.setBounds(722, 306, 188, 66);
		frame.getContentPane().add(button_8);
	}
}
