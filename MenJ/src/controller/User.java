package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class User {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User window = new User();
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
	public User() {
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
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 262, 578);
		frame.getContentPane().add(panel);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(263, 0, 731, 578);
		frame.getContentPane().add(panel_1);
		
		table = new JTable();
		table.setBounds(45, 44, 641, 412);
		panel_1.add(table);
		
		JButton button_7 = new JButton("添加用户");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_7.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		button_7.setBounds(6, 485, 132, 58);
		panel_1.add(button_7);
		
		JButton button_8 = new JButton("管理员设置");
		button_8.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		button_8.setBounds(144, 485, 132, 58);
		panel_1.add(button_8);
		
		JButton button_9 = new JButton("上一页");
		button_9.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		button_9.setBounds(306, 485, 132, 58);
		panel_1.add(button_9);
		
		JButton button_10 = new JButton("下一页");
		button_10.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		button_10.setBounds(439, 485, 132, 58);
		panel_1.add(button_10);
		
		JButton button_11 = new JButton("删除用户");
		button_11.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		button_11.setBounds(581, 485, 132, 58);
		panel_1.add(button_11);
	}
}
