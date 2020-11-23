package anu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AA_PROJECT_PARADISE {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AA_PROJECT_PARADISE window = new AA_PROJECT_PARADISE();
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
	public AA_PROJECT_PARADISE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 420, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("START");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AA_projectlogin l=new AA_projectlogin();
				l.setVisible(true);
				dispose();
				
				
				
			}

			

			
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 15));
		b1.setBounds(254, 359, 85, 32);
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ANUSREE\\Desktop\\para.jpg"));
		lblNewLabel.setBounds(0, 0, 500, 463);
		frame.getContentPane().add(lblNewLabel);
	}

	protected void dispose() {
		// TODO Auto-generated method stub
		
	}
}
