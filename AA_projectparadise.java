package anu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AA_projectparadise extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void success() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AA_projectparadise frame = new AA_projectparadise();
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
	public AA_projectparadise() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 200, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO PARADISE AGRI FARM");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(0, 131, 486, 81);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 AA_projectAvailable_items ae=new  AA_projectAvailable_items();
				 ae.setVisible(true);
				 dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(284, 276, 113, 49);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ANUSREE\\Desktop\\Colorful-flower-bed-og.jpg"));
		lblNewLabel_1.setBounds(0, 10, 486, 453);
		contentPane.add(lblNewLabel_1);
	}
}
