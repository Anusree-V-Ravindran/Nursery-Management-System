package anu;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class AA_PROJECT_EMPLOYEE extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AA_PROJECT_EMPLOYEE frame = new AA_PROJECT_EMPLOYEE();
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
	public AA_PROJECT_EMPLOYEE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE DETAILS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblNewLabel.setBounds(171, 10, 758, 72);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EMPLOYEE ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(41, 144, 124, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EMPLOYEE NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(41, 227, 147, 32);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("STATE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(52, 304, 113, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("SALARY/DAY");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(52, 389, 113, 32);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("DAYS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(52, 460, 113, 40);
		contentPane.add(lblNewLabel_5);
		
		tf1 = new JTextField();
		tf1.setBounds(249, 129, 135, 47);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(249, 208, 149, 47);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Andhra Pradesh ", "Arunachal Pradesh ", "Assam ", "Bihar ", "Goa ", "Gujarat ", "Haryana ", "Himachal Pradesh ", "Jammu & Kashmir ", "Jharkhand ", "Karnataka ", "Kerala ", "Madhya Pradesh ", "Maharashtra ", "Manipur ", "Meghalaya ", "Mizoram ", "Nagaland ", "Odisha ", "Punjab ", "Rajasthan ", "Sikkim ", "Tamil Nadu ", "Telangana ", "Tripura ", "Uttarakhand ", "Uttar Pradesh ", "West Bengal "}));
		cb1.setFont(new Font("Tahoma", Font.BOLD, 15));
		cb1.setBounds(248, 304, 177, 32);
		contentPane.add(cb1);
		
		t3 = new JTextField();
		t3.setBounds(251, 377, 147, 40);
		contentPane.add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(249, 460, 149, 40);
		contentPane.add(t4);
		t4.setColumns(10);
		
		JButton btnNewButton = new JButton("SALARY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s=" ";
				int ts=Integer.parseInt(t3.getText());
				int td=Integer.parseInt(t4.getText());
				s=String.valueOf(" "+ts*td);
				t5.setText(s);
				JOptionPane.showMessageDialog(null,s);		
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(190, 523, 107, 40);
		contentPane.add(btnNewButton);
		
		t5 = new JTextField();
		t5.setBounds(125, 573, 259, 109);
		contentPane.add(t5);
		t5.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AA_projectAvailable_items i3=new AA_projectAvailable_items();
				i3.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(762, 727, 124, 47);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SAVE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "Anu123");
				Statement stmt = con.createStatement();
				
				if(tf1.getText().equals(" ") ||tf2.getText().equals("") ||t3.getText().equals(" "))
				{
					JOptionPane.showMessageDialog(null,"PLEASE ENTER DETAILS!!!!");
				}
				else
				{
				
				String eid=tf1.getText();
				String ename=tf2.getText();
				String state=(String) cb1.getItemAt(cb1.getSelectedIndex());
				String salary=t3.getText();
				String days=t4.getText();
				String totalsalary=t5.getText();
				
				String qc="Insert into empanu values('"+eid+"','"+ename+"','"+state+"','"+salary+"','"+days+"','"+totalsalary+"')";
				stmt.executeUpdate(qc);
				
				System.out.println("Value insert and save");
				JOptionPane.showMessageDialog(null,"THANK YOU!! EMPLOYEE DETAILS ADDED");
				
				}
				
				}
				catch(Exception ap)
				{
					System.out.println(ap);
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(125, 727, 99, 47);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DELETE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "Anu123");
				Statement stmt = con.createStatement();
				String id=tf1.getText();
				String sql="delete from empanu where eid='"+id+"'";
				System.out.println(sql);
				stmt.executeUpdate(sql);
				JOptionPane.showMessageDialog(null, "VALUES DELETED!!!!");
				
			}
			
			catch(Exception ap)
			{
				System.out.println(ap);
			}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(440, 727, 92, 47);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("UPDATE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=tf1.getText();
				String name=tf2.getText();
				String estate=(String) cb1.getItemAt(cb1.getSelectedIndex());
				String esalary=t3.getText();
				String edays=t4.getText();
				String etotalsalary=t5.getText();
				DefaultTableModel dfm=(DefaultTableModel) table.getModel();	
				dfm.setValueAt(id, table.getSelectedRow(), 0);
				dfm.setValueAt(name, table.getSelectedRow(), 1);
				dfm.setValueAt(estate, table.getSelectedRow(), 2);
				dfm.setValueAt(esalary, table.getSelectedRow(), 3);
				dfm.setValueAt(edays, table.getSelectedRow(), 4);
				dfm.setValueAt(etotalsalary, table.getSelectedRow(), 5);
				
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "Anu123");
				Statement stmt = con.createStatement();
				
				String sql="update empanu set eid='"+id+"' ,ename='"+name+"',state='"+estate+"',salary='"+esalary+"',days='"+edays+"',total_salary='"+etotalsalary+"' where eid='"+id+"'";
				System.out.println(sql);
				stmt.executeUpdate(sql);
				JOptionPane.showMessageDialog(null, "VALUES UPDATED!!!!");
				
			}
			
			catch(Exception ap)
			{
				System.out.println(ap);
			}
				
				
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBounds(271, 727, 99, 47);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("CLEAR");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5.setBounds(584, 727, 85, 47);
		contentPane.add(btnNewButton_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(585, 201, 681, 100);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel dtm =(DefaultTableModel) table.getModel();
				String id1=(String) dtm.getValueAt(table.getSelectedRow(),0).toString();
				String name1=(String) dtm.getValueAt(table.getSelectedRow(), 1).toString();
			    String state=(String) dtm.getValueAt(table.getSelectedRow(), 2).toString();
			    
				String salary=(String) dtm.getValueAt(table.getSelectedRow(), 3).toString();
				String days=(String) dtm.getValueAt(table.getSelectedRow(), 4).toString();
				String totalsalary=(String) dtm.getValueAt(table.getSelectedRow(), 5).toString();
				
				tf1.setText(id1);
			   tf2.setText(name1);
			   cb1.setSelectedItem(cb1);;
				t3.setText(salary);
				t4.setText(days);
				t5.setText(totalsalary);
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "NAME", "STATE", "SALARY", "DAYS", "TOTAL SALARY"
			}
		));
		
		JButton show = new JButton("SHOW DETAILS");
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "Anu123");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from empanu");
				
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
				}
				catch(Exception ap)
				{
					System.out.println(ap);
				}
			}
		});
		show.setFont(new Font("Tahoma", Font.BOLD, 15));
		show.setBounds(684, 126, 202, 50);
		contentPane.add(show);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\ANUSREE\\Desktop\\green.jpg"));
		lblNewLabel_6.setBounds(10, 10, 1507, 856);
		contentPane.add(lblNewLabel_6);
	}

}
