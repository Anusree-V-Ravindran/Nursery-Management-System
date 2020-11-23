package anu;
import java.awt.*;
import java.sql.*;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class AA_projectlogin extends JFrame {
	
	private JPanel contentPane;
	private JTextField t1;
	private JPasswordField t2;
	/**
	 * @wbp.nonvisual location=746,174
	 */
	private final JSpinner spinner = new JSpinner();
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AA_projectlogin frame = new AA_projectlogin();
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
	public AA_projectlogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(250, 200, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("LOGIN");
		b1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "Anu123");
					PreparedStatement ps=con.prepareStatement("select * from login where uname= ? and upass=?");
					ps.setString(1,t1.getText());
					ps.setString(2, t2.getText());
					
					ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
						System.out.println("USER EXIST!!!");
						JOptionPane.showMessageDialog(null," USER SUCCESSFULLY LOGGED IN!!");
						if(t1.getText().equals("Anu")&& t2.getText().equals("Anu@123"))
						{
							closeform();
							 AA_projectparadise a=new  AA_projectparadise();
						a.setVisible(true);
						dispose();
					   }
					
				//	else
					//{
						//closeform();
					
				//		 AA_PROJECT_FEEDBACK f=new  AA_PROJECT_FEEDBACK();
					//	 f.setVisible(true);
				//	}
				}
					else
					{
						JOptionPane.showMessageDialog(null," Invalid user name or password!!");
					}
					
					rs.close();
					ps.close();
				}
				catch(Exception ae)
				{
					System.out.println(ae);
				}
				
				
			}

			private void closeform() {
				// TODO Auto-generated method stub
				
			}
		});
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setForeground(new Color(0, 0, 0));
		b1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 12));
		b1.setBounds(44, 331, 111, 48);
		contentPane.add(b1);
		
		t1 = new JTextField();
		t1.setBounds(208, 97, 217, 40);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JPasswordField();
		t2.setBounds(208, 188, 217, 40);
		contentPane.add(t2);
		
		JLabel uname = new JLabel("USER NAME");
		uname.setForeground(Color.WHITE);
		uname.setBackground(Color.WHITE);
		uname.setFont(new Font("Sitka Text", Font.BOLD, 15));
		uname.setBounds(24, 107, 124, 28);
		contentPane.add(uname);
		
		JLabel pwd = new JLabel("PASSWORD");
		pwd.setForeground(Color.WHITE);
		pwd.setFont(new Font("Sitka Text", Font.BOLD, 16));
		pwd.setBounds(24, 200, 116, 28);
		contentPane.add(pwd);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(375, 330, 101, 48);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("USER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "Anu123");
				Statement stmt = con.createStatement();
				
				if(t1.getText().equals(" ") ||t2.getText().equals("") )
				{
					JOptionPane.showMessageDialog(null,"Please enter values!!!!");
				}
				else
				{
					String u=t1.getText();
					String p=t2.getText();
				
				String qc="insert into user0 values ('"+u+"','"+p+"')";
				
				stmt.executeUpdate(qc);
				
				System.out.println("LOGGED IN");
				JOptionPane.showMessageDialog(null,"LOGGED IN!");
				
				}
				
			}
			
			catch(Exception ap)
			{
				System.out.println(ap);
			}
				
						closeform();
					
						AA_PROJECT_USER u=new AA_PROJECT_USER();
						 u.setVisible(true);
						 dispose();
					}

			private void closeform() {
				// TODO Auto-generated method stub
				 				
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(190, 331, 116, 48);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ANUSREE\\Desktop\\5.jpg"));
		lblNewLabel_1.setBounds(0, 0, 486, 463);
		contentPane.add(lblNewLabel_1);
	}
}
