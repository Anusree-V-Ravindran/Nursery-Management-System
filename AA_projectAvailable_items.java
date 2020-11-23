package anu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AA_projectAvailable_items extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public  static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AA_projectAvailable_items frame = new AA_projectAvailable_items();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AA_projectAvailable_items() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 200, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("BILL");
		b1.setBackground(new Color(34, 139, 34));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AA_PROJECT_BILL b=new AA_PROJECT_BILL();
				b.setVisible(true);
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 15));
		b1.setBounds(732, 172, 177, 72);
		contentPane.add(b1);
		
		JButton bemp = new JButton("EMPLOYEES");
		bemp.setBackground(new Color(34, 139, 34));
		bemp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AA_PROJECT_EMPLOYEE ki=new AA_PROJECT_EMPLOYEE();
				ki.setVisible(true);
				dispose();
				
			}
		});
		bemp.setFont(new Font("Tahoma", Font.BOLD, 15));
		bemp.setBounds(732, 267, 177, 72);
		contentPane.add(bemp);
		
		JButton btnNewButton_4 = new JButton("EXIT");
		btnNewButton_4.setBackground(new Color(51, 153, 0));
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBounds(732, 562, 177, 72);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("ITEMS");
		btnNewButton.setBackground(new Color(0, 153, 0));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item i=new item();
				i.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(732, 55, 177, 72);
		contentPane.add(btnNewButton);
		
		JButton btnViewFeedback = new JButton("VIEW FEEDBACK");
		btnViewFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AA_PROJECT_VIEW_FEEDBACK f1=new AA_PROJECT_VIEW_FEEDBACK();
				f1.setVisible(true);
				dispose();
			}
		});
		btnViewFeedback.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnViewFeedback.setBackground(new Color(34, 139, 34));
		btnViewFeedback.setBounds(732, 381, 177, 72);
		contentPane.add(btnViewFeedback);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 AA_projectlogin l=new  AA_projectlogin();
				 l.setVisible(true);
				 dispose();
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHome.setBackground(new Color(34, 139, 34));
		btnHome.setBounds(732, 463, 177, 72);
		contentPane.add(btnHome);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ANUSREE\\Desktop\\green.jpg"));
		lblNewLabel.setBounds(0, 0, 986, 663);
		contentPane.add(lblNewLabel);
	}
}
