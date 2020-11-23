package anu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AA_PROJECT_TREE extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField t;

	/**
	 * Launch the application.
	 */
	public static void tree() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AA_PROJECT_TREE frame = new AA_PROJECT_TREE();
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
	public AA_PROJECT_TREE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton r1 = new JRadioButton("BANYAN TREE");
		buttonGroup.add(r1);
		r1.setFont(new Font("Tahoma", Font.BOLD, 15));
		r1.setBounds(38, 97, 170, 33);
		contentPane.add(r1);
		
		JRadioButton r2 = new JRadioButton("NEEM TREE");
		buttonGroup.add(r2);
		r2.setFont(new Font("Tahoma", Font.BOLD, 15));
		r2.setBounds(38, 132, 150, 38);
		contentPane.add(r2);
		
		JRadioButton r3 = new JRadioButton("MAHOGANY ");
		buttonGroup.add(r3);
		r3.setFont(new Font("Tahoma", Font.BOLD, 15));
		r3.setBounds(38, 183, 170, 38);
		contentPane.add(r3);
		
		JRadioButton r4 = new JRadioButton("ALOE VERA TREE");
		buttonGroup.add(r4);
		r4.setFont(new Font("Tahoma", Font.BOLD, 15));
		r4.setBounds(38, 223, 183, 46);
		contentPane.add(r4);
		
		JRadioButton r5 = new JRadioButton("DRAGON TREE");
		buttonGroup.add(r5);
		r5.setFont(new Font("Tahoma", Font.BOLD, 15));
		r5.setBounds(38, 289, 150, 33);
		contentPane.add(r5);
		
		JRadioButton r6 = new JRadioButton("PEEPAL TREE");
		buttonGroup.add(r6);
		r6.setFont(new Font("Tahoma", Font.BOLD, 15));
		r6.setBounds(38, 324, 149, 40);
		contentPane.add(r6);
		
		JLabel lblNewLabel = new JLabel("TREES");
		lblNewLabel.setForeground(new Color(255, 69, 0));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 45));
		lblNewLabel.setBounds(10, 10, 566, 44);
		contentPane.add(lblNewLabel);
		
		JButton s = new JButton("SELECT");
		s.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=" ";
				if(r1.isSelected())
				{
					s="Banyan TREE  \n*leaf bud is covered by two large scales \n *Location -Go left  \n * price-250";
					t.setText(s);
					JOptionPane.showMessageDialog(null,s);
					
				}
				if(r2.isSelected())
				{
					s="NEEM TREE \n *Fast growing tree \n*Location - Turn right \n *price-300";
					t.setText(s);
					JOptionPane.showMessageDialog(null,s);
				}
				if(r3.isSelected())
				{
					s="MAHOGANY \n *tall evergreen tree with hard wood that turns reddish brown at maturity \n * Location - Straight \n Price-200 ";
					t.setText(s);
					JOptionPane.showMessageDialog(null,s);
				}
				if(r4.isSelected())
				{
					s="ALOE VERA TREE  \n *For hair grow \n*Location -Go straight and trun left \n price -30";
					t.setText(s);
					JOptionPane.showMessageDialog(null,s);
				}
				if(r5.isSelected())
				{
					s="DRAGON TREE \n *known for its thick, red resin, called “dragon's blood. \n Location- First left then second right \n Price-120";
					t.setText(s);
					JOptionPane.showMessageDialog(null,s);
				}
				if(r6.isSelected())
				{
					s="PEEPAL TREE \n *bodhi tree, pippala tree, peepul tree \n *Location- Second left then right \n Price-180";
					t.setText(s);
					JOptionPane.showMessageDialog(null,s);
				}
				
			}
		});
		s.setFont(new Font("Tahoma", Font.BOLD, 15));
		s.setBounds(177, 370, 104, 31);
		contentPane.add(s);
		
		t = new JTextField();
		t.setBounds(70, 423, 332, 110);
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
		btnNewButton.setBounds(438, 515, 85, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ANUSREE\\Desktop\\green.jpg"));
		lblNewLabel_1.setBounds(0, 0, 586, 563);
		contentPane.add(lblNewLabel_1);
	}

}
