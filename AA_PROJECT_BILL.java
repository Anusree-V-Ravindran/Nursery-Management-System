package anu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Caret;
import javax.swing.JScrollPane;
import net.proteanit.sql.DbUtils;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.ImageIcon;

public class AA_PROJECT_BILL extends JFrame {

	private JPanel contentPane;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf2;
	private JTextField tf8;
	private JTextField tf1;
	private JTextField tf3;
	private JTextField tf4;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton buttonshow;
	private JButton delete;
	private JButton clear;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AA_PROJECT_BILL frame = new AA_PROJECT_BILL();
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
	public AA_PROJECT_BILL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 1700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("BILL");
		l1.setFont(new Font("Verdana", Font.BOLD, 58));
		l1.setBounds(136, 10, 190, 71);
		contentPane.add(l1);
		
		JLabel b1 = new JLabel("ITEMES");
		b1.setFont(new Font("Tahoma", Font.BOLD, 20));
		b1.setBounds(37, 421, 93, 34);
		contentPane.add(b1);
		
		JLabel b2 = new JLabel("QUANTITY");
		b2.setFont(new Font("Tahoma", Font.BOLD, 20));
		b2.setBounds(37, 491, 136, 45);
		contentPane.add(b2);
		
		tf5 = new JTextField();
		tf5.setBounds(246, 410, 168, 45);
		contentPane.add(tf5);
		tf5.setColumns(10);
		
		tf6 = new JTextField();
		tf6.setBounds(246, 491, 168, 41);
		contentPane.add(tf6);
		tf6.setColumns(10);
		
		JButton calculate = new JButton("CALCULATE");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=" ";
			int t1=Integer.parseInt(tf6.getText());
			int t2=Integer.parseInt(tf7.getText());
			s=String.valueOf(" "+t1*t2);
			tf8.setText(s);
			JOptionPane.showMessageDialog(null,s);			
			}
		});
		calculate.setFont(new Font("Tahoma", Font.BOLD, 18));
		calculate.setBounds(170, 617, 147, 60);
		contentPane.add(calculate);
		
		JLabel b3 = new JLabel("PRICE");
		b3.setFont(new Font("Tahoma", Font.BOLD, 20));
		b3.setBounds(37, 560, 106, 40);
		contentPane.add(b3);
		
		tf7 = new JTextField();
		tf7.setBounds(246, 563, 168, 44);
		contentPane.add(tf7);
		tf7.setColumns(10);
		
		JButton back = new JButton("BACK");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AA_projectAvailable_items i3=new AA_projectAvailable_items();
				dispose();
			}
		});
		back.setFont(new Font("Tahoma", Font.BOLD, 15));
		back.setBounds(990, 731, 128, 45);
		contentPane.add(back);
		
		JLabel b0 = new JLabel("NAME");
		b0.setFont(new Font("Tahoma", Font.BOLD, 18));
		b0.setBounds(37, 191, 106, 34);
		contentPane.add(b0);
		
		tf2 = new JTextField();
		tf2.setBounds(248, 189, 166, 45);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf8 = new JTextField();
		tf8.setBounds(123, 687, 203, 111);
		contentPane.add(tf8);
		tf8.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(51, 117, 122, 38);
		contentPane.add(lblNewLabel);
		
		tf1 = new JTextField();
		tf1.setBounds(246, 119, 172, 41);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PHONE NUMBER");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(37, 256, 159, 33);
		contentPane.add(lblNewLabel_1);
		
		tf3 = new JTextField();
		tf3.setBounds(246, 256, 172, 50);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DATE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(37, 341, 122, 34);
		contentPane.add(lblNewLabel_2);
		
		tf4 = new JTextField();
		tf4.setBounds(246, 339, 168, 45);
		contentPane.add(tf4);
		tf4.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(468, 171, 925, 468);
		contentPane.add(scrollPane);
		
		
		table = new JTable();
	
	
		
	table.addMouseListener(new MouseAdapter() {
			@Override
		public void mouseClicked(MouseEvent arg0) {
				
				DefaultTableModel dtm =(DefaultTableModel) table.getModel();
				String id1=(String) dtm.getValueAt(table.getSelectedRow(),0).toString();
				String name1=(String) dtm.getValueAt(table.getSelectedRow(), 1).toString();
			    String ph1=(String) dtm.getValueAt(table.getSelectedRow(), 2).toString();
			    
				String d1=(String) dtm.getValueAt(table.getSelectedRow(), 3).toString();
				String i1=(String) dtm.getValueAt(table.getSelectedRow(), 4).toString();
				String q1=(String) dtm.getValueAt(table.getSelectedRow(), 5).toString();
				String p1=(String) dtm.getValueAt(table.getSelectedRow(), 6).toString();
				String tp=(String) dtm.getValueAt(table.getSelectedRow(), 7).toString();
				tf1.setText(id1);
			   tf2.setText(name1);
				tf3.setText(ph1);
				tf4.setText(d1);
				tf5.setText(i1);
				tf6.setText(q1);
				tf7.setText(p1);
				tf8.setText(tp);
				
			}
		});
		scrollPane.setViewportView(table);
		table.setFont(new Font("Tahoma", Font.BOLD, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "NAME", "PHONE NO", "DATE", "ITEM", "QUANTITY", "PRICE", "TOTAL"
			}
		));
		
		buttonshow = new JButton("SHOW DETAILS");
		buttonshow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "Anu123");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from bill ");
				
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
				}
				catch(Exception ap)
				{
					System.out.println(ap);
				}

			}
		});
		buttonshow.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonshow.setBounds(725, 108, 168, 34);
		contentPane.add(buttonshow);
		
		JButton save = new JButton("SAVE");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "Anu123");
				Statement stmt = con.createStatement();
				
				if(tf1.getText().equals(" ") ||tf2.getText().equals("") ||tf3.getText().equals(" ")||tf4.getText().equals(" ")||tf5.getText().equals("")||tf6.getText().equals(" ")||tf7.getText().equals(" "))
				{
					JOptionPane.showMessageDialog(null,"Please enter values!!!!");
				}
				else
				{
				String id=tf1.getText();
				String name=tf2.getText();
				String pn=tf3.getText();
				String d=tf4.getText();
				String i=tf5.getText();
				String q=tf6.getText();
				String p=tf7.getText();
				String t=tf8.getText();
				String qc="insert into bill values ('"+id+"','"+name+"','"+pn+"','"+d+"','"+i+"','"+q+"','"+p+"','"+t+"')";
				
				stmt.executeUpdate(qc);
				
				System.out.println("Value insert and save");
				JOptionPane.showMessageDialog(null,"Value saved!");
				
				}
				
			}
			
			catch(Exception ap)
			{
				System.out.println(ap);
			}
			}
		});
		save.setFont(new Font("Tahoma", Font.BOLD, 15));
		save.setBounds(391, 731, 116, 45);
		contentPane.add(save);
		
		JButton update = new JButton("UPDATE");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String pid=tf1.getText();
				String pname=tf2.getText();
				String pn=tf3.getText();
				String d=tf4.getText();
				String i=tf5.getText();
				String q=tf6.getText();
				String p=tf7.getText();
				String t=tf8.getText();
				DefaultTableModel dfm=(DefaultTableModel) table.getModel();	
				dfm.setValueAt(pid, table.getSelectedRow(), 0);
				dfm.setValueAt(pname, table.getSelectedRow(), 1);
				dfm.setValueAt(pn, table.getSelectedRow(), 2);
				dfm.setValueAt(d, table.getSelectedRow(), 3);
				dfm.setValueAt(i, table.getSelectedRow(), 4);
				dfm.setValueAt(q, table.getSelectedRow(), 5);
				dfm.setValueAt(p, table.getSelectedRow(), 6);
				dfm.setValueAt(t, table.getSelectedRow(), 7);
				
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "Anu123");
				Statement stmt = con.createStatement();
				
				String sql="update bill set id='"+pid+"' ,name='"+pname+"',phnno='"+pn+"',date1='"+d+"',item='"+i+"',qty='"+q+"',price='"+p+"',total='"+t+"' where id='"+pid+"'";
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
		update.setFont(new Font("Tahoma", Font.BOLD, 15));
		update.setBounds(547, 731, 106, 45);
		contentPane.add(update);
		
		delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ac) {
				
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "Anu123");
				Statement stmt = con.createStatement();
				String pid=tf1.getText();
				String sql="delete from bill where id='"+pid+"'";
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
		delete.setFont(new Font("Tahoma", Font.BOLD, 15));
		delete.setBounds(676, 731, 106, 45);
		contentPane.add(delete);
		
		clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				tf6.setText("");
				tf7.setText("");
				tf8.setText("");
				
			}
		});
		clear.setFont(new Font("Tahoma", Font.BOLD, 15));
		clear.setBounds(843, 731, 106, 45);
		contentPane.add(clear);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ANUSREE\\Desktop\\green.jpg"));
		lblNewLabel_3.setBounds(0, 10, 1567, 855);
		contentPane.add(lblNewLabel_3);
	}
}
