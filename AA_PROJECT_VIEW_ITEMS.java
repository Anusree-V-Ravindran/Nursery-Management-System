package anu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class AA_PROJECT_VIEW_ITEMS extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AA_PROJECT_VIEW_ITEMS frame = new AA_PROJECT_VIEW_ITEMS();
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
	public AA_PROJECT_VIEW_ITEMS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(65, 244, 656, 442);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ITEM ID", "ITEM NAME", "ITEM PRICE", "ITEM LOCATION"
			}
		));
		
		JButton btnNewButton = new JButton("SHOW AVAILABLE ITEMS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "Anu123");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from items ");
				
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
				}
				catch(Exception ap)
				{
					System.out.println(ap);
				}

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(247, 148, 305, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AA_PROJECT_USER ui=new AA_PROJECT_USER();
				ui.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(279, 716, 124, 47);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("SHOW AVAILABLE ITEMS");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblNewLabel.setBounds(0, 10, 745, 70);
		contentPane.add(lblNewLabel);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AA_projectlogin l=new  AA_projectlogin();
				 l.setVisible(true);
				 dispose();
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHome.setBounds(96, 716, 124, 47);
		contentPane.add(btnHome);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ANUSREE\\Desktop\\green.jpg"));
		lblNewLabel_1.setBounds(0, 10, 786, 771);
		contentPane.add(lblNewLabel_1);
	}

}
