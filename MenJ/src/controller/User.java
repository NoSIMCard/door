package controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import util.Model;

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

//	private JFrame frame;
	private JTable table;
	JPanel panel_1 = Model.UserPanel();
    JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new User().initialize(Model.Jfr());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
//	public User(JFrame frame) {
//		initialize(frame);
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(JFrame frame) {
		frame.getContentPane().add(panel_1);
		
		table = new JTable();
		table.setBounds(45, 44, 641, 412);
		panel_1.add(table);
		
		JButton button_7 = new JButton("添加用户");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                System.out.println(1);
                Model.UserPanel().setVisible(false);
                Model.MenuPanel().setVisible(false);
//                panel.setVisible(false);
                new AddUsers();
//                Model.TimePanel().setVisible(true);
			}
		});
		button_7.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		button_7.setBounds(6, 485, 132, 58);
		panel_1.add(button_7);
		
		JButton button_8 = new JButton("管理员设置");
		button_8.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		button_8.setBounds(144, 485, 150, 58);
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
