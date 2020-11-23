package anu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class AA_PROJECT_FRUIT extends JFrame {

	private JPanel contentPane;
	private JTextField t;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void fruit() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AA_PROJECT_FRUIT frame = new AA_PROJECT_FRUIT();
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
	public AA_PROJECT_FRUIT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton r1 = new JRadioButton("MANGO TREE");
		buttonGroup.add(r1);
		r1.setFont(new Font("Tahoma", Font.BOLD, 15));
		r1.setBounds(36, 115, 156, 39);
		contentPane.add(r1);
		
		JRadioButton r2 = new JRadioButton("GUAVA");
		buttonGroup.add(r2);
		r2.setFont(new Font("Tahoma", Font.BOLD, 15));
		r2.setBounds(36, 186, 103, 21);
		contentPane.add(r2);
		
		JRadioButton r3 = new JRadioButton("POMEGRANATE");
		buttonGroup.add(r3);
		r3.setFont(new Font("Tahoma", Font.BOLD, 15));
		r3.setBounds(36, 236, 175, 46);
		contentPane.add(r3);
		
		JRadioButton r4 = new JRadioButton("PAPAYA");
		buttonGroup.add(r4);
		r4.setFont(new Font("Tahoma", Font.BOLD, 15));
		r4.setBounds(36, 300, 103, 21);
		contentPane.add(r4);
		
		JRadioButton r5 = new JRadioButton("PINEAPPLE");
		buttonGroup.add(r5);
		r5.setFont(new Font("Tahoma", Font.BOLD, 15));
		r5.setBounds(36, 344, 156, 27);
		contentPane.add(r5);
		
		JLabel lblNewLabel = new JLabel("FRUITS TREE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 49));
		lblNewLabel.setBounds(10, 10, 566, 80);
		contentPane.add(lblNewLabel);
		
		JButton s = new JButton("SELECT");
		s.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=" ";
				if(r1.isSelected())
				{
					s="MANGO TREE  \n*Lowers blood pressure \n *Location -Go left  then second right \n * price-250";
					t.setText(s);
					JOptionPane.showMessageDialog(null,s);
					
				}
				if(r2.isSelected())
				{
					s="GUAVA TREE \n *Helps in losing weight. \n*Location - Turn right \n *price-300";
					t.setText(s);
					JOptionPane.showMessageDialog(null,s);
				}
				if(r3.isSelected())
				{
					s="POMEGRANATE \n *grow in almost any soil that has good internal drainage \n * Location - Straight and second right \n Price-200 ";
					t.setText(s);
					JOptionPane.showMessageDialog(null,s);
				}
				if(r4.isSelected())
				{
					s="PAPAYA  \n *used widely in folk medicine for many ailments: the juice \n*Location -Go straight and trun left \n price -60";
					t.setText(s);
					JOptionPane.showMessageDialog(null,s);
				}
				if(r5.isSelected())
				{
					s="PINEAPPLE \n *can grow pineapple plants outdoors.. \n Location- First left then second right \n Price-120";
					t.setText(s);
					JOptionPane.showMessageDialog(null,s);
				}
				
			
			}
		});
		s.setFont(new Font("Tahoma", Font.BOLD, 15));
		s.setBounds(179, 377, 103, 39);
		contentPane.add(s);
		
		t = new JTextField();
		t.setBounds(108, 436, 267, 102);
		contentPane.add(t);
		t.setColumns(10);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AA_projectAvailable_items i=new AA_projectAvailable_items();
				dispose();
			
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(425, 471, 85, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ANUSREE\\Desktop\\green.jpg"));
		lblNewLabel_1.setBounds(0, 0, 586, 576);
		contentPane.add(lblNewLabel_1);
	}
}
