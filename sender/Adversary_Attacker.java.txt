import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.MessageDigest;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.*;

import javax.swing.*;

public class Adversary_Attacker extends JFrame implements ActionListener
{
	Container c;
	JButton jb,jb1,jb2,jb3;
	JLabel al;
	//JTextArea tf;
	JTextField t1,t2;
	String keyword = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	public Font f1 = new Font("Times new roman", Font.BOLD, 18);
	String hash;
	String data;
	Adversary_Attacker()
	{
		JScrollPane pane = new JScrollPane();
		setTitle("Adversary Attacker::A Probabilistic Source Location Privacy Protection Scheme in Wireless Sensor Networks");
		c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		al=new JLabel("Enter Your IP Address to Route Data");
		al.setForeground(Color.RED);
		jb = new JButton("Attack Dataset");
		jb.setBounds(50,450,120,30);
		al.setBounds(60,-10,200,100);
		
		jb3 = new JButton("Generate Sign");
		jb3.setBounds(200,150,120,30);
		
		
		jb1 = new JButton("Attack Node");
		jb1.setBounds(250,150,130,30);
		
		jb2 = new JButton("Exit");
		jb2.setBounds(400,150,100,30);
		
		jb.addActionListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
		//c.add(jb);
		c.add(jb1);
		c.add(jb2);
		//c.add(jb3);
		c.add(al);	
	/*	tf = new JTextArea();
		tf.setColumns(100);
		tf.setForeground(Color.black);
		tf.setFont(f1);
		tf.setRows(200);
		tf.setName("tf");
		pane.setName("pane");
		pane.setViewportView(tf);
		pane.setBounds(250, 50, 350, 350);*/
		t1=new JTextField();
		t1.setFont(f1);
		t1.setForeground(Color.blue);
		t1.setBounds(250, 90, 300, 30);
		
		t2=new JTextField();
		t2.setFont(f1);
		t2.setForeground(Color.blue);
		t2.setBounds(250, 30, 300, 30);
	
		c.add(pane, BorderLayout.CENTER);
		//c.add(t1);
		c.add(t2);
		setSize(650,250);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jb)
		{
			
			
		}
		if(e.getSource()==jb3)
		{
			
			
			try
			{
				data=t2.getText();
				PrintStream p = new PrintStream(new FileOutputStream("Attacker\\attack.txt"));
				p.print(new String(data));
				MessageDigest md = MessageDigest.getInstance("SHA1");
				FileInputStream fstream1 = new FileInputStream("Attacker\\attack.txt");
				DigestInputStream dis1 = new DigestInputStream(fstream1, md);
				BufferedInputStream bis1 = new BufferedInputStream(dis1);
				while (true) {
					int b1 = bis1.read();
					if (b1 == -1)
						break;
				}
				BigInteger bi1 = new BigInteger(md.digest());
				 hash = bi1.toString(16);
				 t1.setText(hash);
				
		}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		if(e.getSource()==jb1)
		{
			
			
			
			
			try
			{
		
			
				String[] dsname = { "Select Nodes","N3", "N5", "N8", "N10", "N13"  };
				
				String dataname = (String) JOptionPane.showInputDialog(null,
						"Select Nodes", "Node Name",
						JOptionPane.QUESTION_MESSAGE, null,  dsname,  dsname[0]);
				String ip = JOptionPane.showInputDialog(null,
						"Please Enter the IP Address Of Router");

				
				Socket sc1 = new Socket(ip,444);
				DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
				data=t2.getText();
				dout1.writeUTF(dataname);
				dout1.writeUTF(data);
				
				
				
				DataInputStream oin = new DataInputStream(sc1.getInputStream());
				String msg1 = (String) oin.readUTF();
				if(msg1.equalsIgnoreCase("success"))
				{
					JOptionPane.showMessageDialog(null, "Attack Completed");
					
				}
			
				else if(msg1.equalsIgnoreCase("failure"))
				{
					JOptionPane.showMessageDialog(null, "Attack Failure" );
				}
				
				
				
			
				
			
		}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			
			
			
			
			
			
			
			
		}
		if(e.getSource()==jb2)
		{
			System.exit(0);
		}
		
	}
	public static void main(String[] args) {
		
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Adversary_Attacker();
			}
		});
	}

}
