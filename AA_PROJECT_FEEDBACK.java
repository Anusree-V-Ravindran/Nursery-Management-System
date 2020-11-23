package anu;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class AA_PROJECT_FEEDBACK extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tf1;
	private JTextField tf3;
	private JTextField tf2;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void feedback() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AA_PROJECT_FEEDBACK frame = new AA_PROJECT_FEEDBACK();
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
	public AA_PROJECT_FEEDBACK() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 1400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FEED BACK");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 47));
		lblNewLabel.setBounds(106, 10, 470, 54);
		contentPane.add(lblNewLabel);
		
		JLabel l3 = new JLabel("ABOUT OUR CUSTOMER SERVICE");
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		l3.setBounds(29, 290, 257, 31);
		contentPane.add(l3);
		
		JLabel l4 = new JLabel("ABOUT OUR PRODUCT");
		l4.setFont(new Font("Tahoma", Font.BOLD, 15));
		l4.setBounds(29, 370, 250, 31);
		contentPane.add(l4);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AA_PROJECT_USER fi=new AA_PROJECT_USER();
				fi.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(707, 647, 119, 54);
		contentPane.add(btnNewButton);
		
		JLabel l5 = new JLabel("OTHERS :");
		l5.setFont(new Font("Tahoma", Font.BOLD, 15));
		l5.setBounds(39, 498, 173, 31);
		contentPane.add(l5);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Tahoma", Font.BOLD, 15));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"EXCELLENT", "GOOD ", "NOT BAD", "POOR"}));
		cb1.setBounds(342, 283, 173, 44);
		contentPane.add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setFont(new Font("Tahoma", Font.BOLD, 15));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"EXCELLENT", "GOOD", "NOT BAD", "POOR"}));
		cb2.setBounds(342, 366, 173, 44);
		contentPane.add(cb2);
		
		JButton b1 = new JButton("SAVE");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "Anu123");
				Statement stmt = con.createStatement();
				
				if(tf1.getText().equals(" ") ||tf2.getText().equals("") ||tf3.getText().equals(" "))
				{
					JOptionPane.showMessageDialog(null,"PLEASE ENTER YOUR FEEDBACK!!!!");
				}
				else
				{
				
				String fname=tf1.getText();
				String femail=tf2.getText();
				String fservice=(String) cb1.getItemAt(cb1.getSelectedIndex());
				String fproduct=(String) cb2.getItemAt(cb2.getSelectedIndex());
				String fother=tf3.getText();
				
				String qc="Insert into feedback values('"+fname+"','"+femail+"','"+fservice+"','"+fproduct+"','"+fother+"')";
				stmt.executeUpdate(qc);
				
				System.out.println("Value insert and save");
				JOptionPane.showMessageDialog(null,"THANK YOU!!HAVE A NICE DAY");
				
				}
				
				}
				catch(Exception ap)
				{
					System.out.println(ap);
				}
				}
			
			
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 15));
		b1.setBounds(240, 652, 95, 49);
		contentPane.add(b1);
		
		JLabel l1 = new JLabel("NAME");
		l1.setFont(new Font("Tahoma", Font.BOLD, 15));
		l1.setBounds(29, 138, 85, 21);
		contentPane.add(l1);
		
		tf1 = new JTextField();
		tf1.setBounds(342, 120, 151, 39);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
	
		
		tf3 = new JTextField();
		tf3.setBounds(342, 498, 195, 54);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		JLabel l2 = new JLabel("EMAIL ID");
		l2.setFont(new Font("Tahoma", Font.BOLD, 15));
		l2.setBounds(29, 187, 109, 31);
		contentPane.add(l2);
		
		tf2 = new JTextField();
		tf2.setBounds(342, 187, 163, 44);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		table = new JTable();
		table.setBounds(753, 176, 95, -43);
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(637, 132, 598, 150);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "EMAIL", "SERVICE", "PRODUCT", "OTHER"
			}
		));
		
		JButton show = new JButton("SHOW DETAILS");
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "Anu123");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from feedback");
				
				table_1.setModel(DbUtils.resultSetToTableModel(rs));
				
				}
				catch(Exception ap)
				{
					System.out.println(ap);
				}

				
			}
		});
		show.setFont(new Font("Tahoma", Font.BOLD, 15));
		show.setBounds(818, 52, 223, 44);
		contentPane.add(show);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(371, 647, 109, 54);
		contentPane.add(btnNewButton_1);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 AA_projectlogin l=new  AA_projectlogin();
				 l.setVisible(true);
				 dispose();
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHome.setBounds(524, 647, 109, 54);
		contentPane.add(btnHome);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ANUSREE\\Desktop\\green.jpg"));
		lblNewLabel_1.setBounds(0, 10, 1402, 848);
		contentPane.add(lblNewLabel_1);
	}
}
