import java.awt.BorderLayout;

import javax.swing.Timer;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.DriverManager;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;






import java.io.*;
import java.awt.event.*;
import java.sql.*;

public class NodeA extends JFrame implements ActionListener {

	
	Socket socket;
	ServerSocket serverSocket;

	public Font f = new Font("Times new roman", Font.BOLD, 22);
	public Font f1 = new Font("Times new roman", Font.BOLD, 15);
	public Font f2 = new Font("Arial", Font.BOLD, 14);
	public Font f3 = new Font("Times new roman", Font.BOLD, 18);
	
	public JTextArea tf = new JTextArea();
	public JScrollPane pane = new JScrollPane();
	
	public JLabel imagelabel = new JLabel();
	public JFrame jf;
	public Container c;
	FileOutputStream fout;
	String fname, tot;
	
	NodeA() {
		StringBuffer buffer = new StringBuffer();

		ImageIcon img1 = new ImageIcon(this.getClass().getResource("EndUser.png"));
		imagelabel.setIcon(img1);
		imagelabel.setBounds(0, 0, 500, 85);

		jf = new JFrame("Node A::A Probabilistic Source Location Privacy Protection Scheme in Wireless Sensor Networks");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(470, 450);
		jf.setResizable(false);
		c.setBackground(Color.white);
	
		Border b11=BorderFactory.createLineBorder(Color.black,2);
		
		
		TitledBorder b22=new TitledBorder(b11);
		b22.setTitle("File Receiving");
		b22.setTitleColor(Color.blue);
		b22.setTitleFont(f2);
		JLabel bord =new JLabel();
		bord.setBorder(b22);
		bord.setBackground(Color.black);
		bord.setBounds(10, 110, 440, 310);
		c.add(bord);
	
		
		pane.setBounds(30, 130, 410, 280);

		tf.setColumns(20);

		tf.setForeground(Color.MAGENTA);
		tf.setFont(f1);
		tf.setRows(10);
		tf.setName("tf");
		tf.setEditable(false);
		pane.setName("pane");
		pane.setViewportView(tf);
		
		
		jf.show();
		
		c.add(pane, BorderLayout.CENTER);
		
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});
		
		int[] ports = new int[] {101};
		for(int i=0;i<1;i++)
		{
			Thread th = new Thread(new PortListener(ports[i]));
			th.start();
		}
		c.add(imagelabel);
	
	}
	
	class PortListener implements Runnable
	{
		
		int port;
		
		public PortListener(int port)
		{
			this.port=port;
		}
		
		public void run()
		{
			if(this.port==101)
			{
				try {
						
	
					ServerSocket serverSocket = new ServerSocket(101);
					System.out.println("i am Receiver & listening...");

					while (true) {
						socket = serverSocket.accept();
						
						ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
						int data[] = (int[])ois.readObject();
                        
                        Decryption d = new Decryption();
						 String dec = d.decrypt(data);
						 tf.setText(dec);
							
						DataOutputStream d1 = new DataOutputStream(socket.getOutputStream());
						d1.writeUTF("Data Received successfully ");
						

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	public static void main(String args[]) {
		//new NodeA();
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NodeA();
			}
		});
	}

	public void actionPerformed(ActionEvent ae) {

		

	}

}
