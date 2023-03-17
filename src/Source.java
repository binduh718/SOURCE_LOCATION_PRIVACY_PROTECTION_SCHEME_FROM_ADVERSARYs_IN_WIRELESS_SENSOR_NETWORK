import java.awt.BorderLayout;
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
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.Statement;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.sound.sampled.AudioFormat.Encoding;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import java.net.*;
public class Source implements ActionListener {
	public Font f = new Font("Times new roman", Font.BOLD, 35);
	public Font f1 = new Font(" Times new roman", Font.BOLD, 18);
	public Font f2 = new Font("Times new roman", Font.BOLD, 18);
	public Font f3 = new Font("Times new roman", Font.BOLD, 16);
	public JLabel T0 = new JLabel("Source");
	public JLabel T1 = new JLabel("Select the Method");
	public JLabel T2 = new JLabel("Select the File    :");
	public JLabel T3 = new JLabel("File Path            :");
	public JLabel T4 = new JLabel();
	public JLabel T5 = new JLabel("Select The Route");
	public JLabel T6 = new JLabel("FA    -Foriegn Agent");
	public JLabel T7 = new JLabel("GFA   -Gateway Foriegn Agent");

	public JCheckBox chk1 = new JCheckBox("");
	public JComboBox TAreu = new JComboBox();
	public JButton btn = new JButton("Submit");
	public JButton send = new JButton("Init Source Ip and Key");
	public JButton enc = new JButton("Encrypt");
	public JTextArea tf = new JTextArea();
	public JScrollPane pane = new JScrollPane();
	public JButton btn1 = new JButton("Browse");

	JLabel imageLabel = new JLabel();
	JLabel image = new JLabel();
	JLabel imageLabel1 = new JLabel();
	JLabel image1 = new JLabel();

	JLabel imageLabel2 = new JLabel();
	JLabel image12 = new JLabel();

	JPanel jp = new JPanel();
	JPanel jp1 = new JPanel();
	JMenuBar mb;
	JMenu m;
	JMenuItem m1,m2,m3,mi1;
	public JFrame jf;
	public Container c;
	
	String content="";
	String path="";
	String mac="";
	String file="";
	
	int[] endata;
	Source() {
		jf = new JFrame("Service Provider::A Probabilistic Source Location Privacy Protection Scheme in Wireless Sensor Networks");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(900, 650);
		// c.setBackground(Color.DARK_GRAY);

		c.setBackground(Color.WHITE);
		T0.setBounds(450, 30, 350, 45);
		T0.setFont(f);
		
		
		mb = new JMenuBar();
		m = new JMenu("File");
		
		m1 = new JMenuItem("Uploaded Details");
		m2 = new JMenuItem("Exit");
		
		ImageIcon banner1 = new ImageIcon(this.getClass().getResource("Sprovider.PNG"));
		JLabel title1=new JLabel();
		title1.setIcon(banner1);
		title1.setBounds(0, 0, 900, 100);
		
		
		
		
		m.add(m1);
		m.add(m2);
		mb.add(m);
		 jf.setJMenuBar(mb);
		 m1.addActionListener(this);
		
		 m2.addActionListener(this);
	
		
		ImageIcon im = new ImageIcon(this.getClass().getResource("Sender.PNG"));
		JLabel image = new JLabel();
	         image.setIcon(im);
		

	 		image.setBounds(0,-10,1200,120);
		

		T0.setForeground(Color.RED);
		T2.setBounds(205, 150, 250, 45);
		T2.setFont(f2);
		T2.setForeground(Color.RED);

		T3.setBounds(205, 210, 250, 45);
		T3.setFont(f2);
		T3.setForeground(Color.RED);

		T4.setBounds(400, 210, 950, 45);
		T4.setFont(f2);
		T4.setForeground(new Color(120, 0, 0));

		T5.setBounds(660, 145, 300, 45);
		T5.setFont(f2);
		T5.setForeground(Color.CYAN);

		T6.setBounds(760, 70, 400, 35);
		T6.setFont(f2);
		T6.setForeground(Color.RED);

		T7.setBounds(760, 110, 400, 35);
		T7.setFont(f2);
		T7.setForeground(Color.YELLOW);

		btn1.setBounds(590, 153, 150, 33);
		btn1.setFont(f2);
		// btn1.setBackground(Color.WHITE);
		btn1.setForeground(new Color(120, 0, 0));

		jp.setBounds(157, 126, 719, 450);
		jp.setBackground(new Color(127, 146, 187));
		// jp1.setBackground(new Color(120,0,0));
		jp1.setBounds(155, 124, 723, 453);

		T1.setBounds(300, 550, 250, 45);
		TAreu.setBounds(650, 550, 200, 35);
		btn.setBounds(600, 520, 150, 33);
		T1.setFont(f3);
		T1.setForeground(new Color(0, 120, 0));
		btn.setFont(f2);
		// btn.setBackground(Color.WHITE);
		btn.setForeground(new Color(120, 0, 0));
		
		send.setBounds(160,520,220,33);
		send.setFont(f2);
		send.setForeground(new Color(120,0,0));
		
		
		enc.setBounds(450,520,110,33);
		enc.setFont(f2);
		enc.setForeground(new Color(120,0,0));
		
		
		
		TAreu.addItem("Mesh Route");
		TAreu.addItem(" Node ");
		TAreu.setFont(f3);
		TAreu.setBackground(Color.WHITE);
		TAreu.setForeground(Color.BLUE);
		TAreu.setFont(f);
		pane.setBounds(385, 280, 400, 200);

		tf.setColumns(20);

		tf.setForeground(Color.MAGENTA);
		tf.setFont(f2);
		tf.setRows(10);
		tf.setName("tf");
		pane.setName("pane");
		pane.setViewportView(tf);

		btn1.addActionListener(this);
		btn.addActionListener(this);
		send.addActionListener(this);
		enc.addActionListener(this);
		

		btn1.setMnemonic(KeyEvent.VK_B);
		btn.setMnemonic(KeyEvent.VK_S);
		jf.show();

		c.add(btn);
		c.add(send);
		c.add(enc);
		c.add(T2);
		c.add(T3);
		c.add(T4);

		c.add(pane, BorderLayout.CENTER);
		c.add(btn1);
		

		c.add(jp);
		c.add(jp1);
		c.add(title1);

		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});
		
		
		//c.add(image);

	}

	public void actionPerformed(ActionEvent e) {
		// DataInputStream input;

		// BufferedInputStream bis;
		BufferedOutputStream bos = null;
		
		String str = " ";
		byte[] byteArray = str.getBytes();

		String strLine = null;
		
		
		 if (e.getSource() == m1) {
		    	try {
					UIManager
							.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				java.awt.EventQueue.invokeLater(new Runnable() {
					public void run() {
						new spfiles();
					}
				});
		    }
		    if (e.getSource() == m2) {
		    	System.exit(0);
		    	
		    }
		if (e.getSource() == btn1) {

			JFileChooser chooser = new JFileChooser();

			try {

				File f = new File(new File("filename.txt").getCanonicalPath());

				chooser.setSelectedFile(f);
			} catch (IOException e1) {
			}

			chooser.showOpenDialog(btn1);
			int retval = chooser.showOpenDialog(btn1);

			if (retval == JFileChooser.APPROVE_OPTION) {
				File field = chooser.getSelectedFile();
				path=field.getAbsolutePath();
				file= field.getName();
				T4.setText(field.getAbsolutePath());
			}

			File curFile = chooser.getSelectedFile();
			try {

				FileInputStream fstream = new FileInputStream(curFile);

				DataInputStream ins = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						ins));

				StringBuffer buffer = new StringBuffer();

				while ((strLine = br.readLine()) != null) {

					buffer.append(strLine + "\n");
				}
				System.out.println(path);
				tf.setText(buffer.toString());
				
				content = tf.getText();
				PrintStream pout=new PrintStream(new FileOutputStream("sender\\"+file+".txt"));
				pout.print(content);
				pout.close();
				   MessageDigest md = MessageDigest.getInstance("SHA1");
				   FileInputStream in1 = new FileInputStream("sender\\"+file+".txt");
				   DigestInputStream dis2 = new DigestInputStream(in1, md);
				   BufferedInputStream bd = new BufferedInputStream(dis2);
				   
				   while (true) {
						int b2 = bd.read();
						if (b2 == -1)
							break;
					}
		 
					BigInteger bi2 = new BigInteger(md.digest());
					mac = bi2.toString(16);
					System.out.println(mac);
					
					

			} catch (Exception e1) {
				System.err.println("Error: " + e1.getMessage());
			}
			

		}
		
if (e.getSource() == send) {
			
	
	try
	{
	 
	
		 String ip1 = JOptionPane.showInputDialog("Enter Source IP");
		String routerip = JOptionPane.showInputDialog("Enter The Router IP to Intialise");
		
		
		Socket sc = new Socket(routerip,202);
		DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
		dout.writeUTF(ip1);
		dout.writeUTF(mac);
		
		
		DataInputStream din = new DataInputStream(sc.getInputStream());
		JOptionPane.showMessageDialog(null, din.readUTF());
		
	
	
	}
	catch(Exception e1)
	{
		e1.printStackTrace();
	}
			
		}
		if (e.getSource() == enc) {
			
			
			String str1 = tf.getText();
			Encryption encryption = new Encryption();
			endata = encryption.ecies_ex(str1);
			tf.setText("");
			for (int i = 0; i < endata.length; i++) {
				tf.append(" " + endata[i]);
			
			}
			
			
		}
		
		if (e.getSource() == btn) {


			String[] dsname = { "Select Destination", "A", "B", "C", "D", "E", "F" };
			
			String dataname = (String) JOptionPane.showInputDialog(null,
					"Select Destination", "Destination Name",
					JOptionPane.QUESTION_MESSAGE, null,  dsname,  dsname[0]);
		 
			String dest = JOptionPane.showInputDialog(null,
					"Please Enter the IP Address Of "+dataname);
			String ip = JOptionPane.showInputDialog(null,
					"Please Enter the IP Address Of Router");
			try { 
				
			DBCon db = new DBCon();
			Connection con = db.getConnection();
			
							
									
			Statement stmt2 = con.createStatement();
			String sql2 = "insert into OwnerFiles values('"+file+"','"+mac+"','"+dataname+"','"+dest+"')";
			stmt2.executeUpdate(sql2);

				Socket client = null;

				
				
					client = new Socket(ip, 2001);
					DataOutputStream dos1 = new DataOutputStream(client.getOutputStream());
					
					
			 
					dos1.writeUTF(file);
					dos1.writeUTF(mac);
					dos1.writeUTF(dataname);
					dos1.writeUTF(dest);
					
					ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
					oos.writeObject(endata);
					 DataInputStream din1 = new DataInputStream(client.getInputStream());
    				 String msg1 = din1.readUTF();
    				
    					 JOptionPane.showMessageDialog(null, msg1);
					bos = new BufferedOutputStream(client.getOutputStream());
					byteArray = new byte[8192];

					byteArray = tf.getText().getBytes();
					System.out.println(byteArray);

					bos.write(byteArray, 0, byteArray.length);
					
					bos.flush();
					bos.close();
					
				
					
			
		}
			catch(Exception ex) {ex.printStackTrace();
			 
			 }

			}
		
		
						}
				
		
	class PortListener implements Runnable {
	
		BufferedOutputStream bos = null;

		ServerSocket server;
		Socket con;
		BufferedReader br = null;
		int port;

		public PortListener(int port) {
			this.port = port;
		}

		@Override
		public void run() {
			
			
		}
	}

	public static void main(String args[]) {
		//new ServiceProvider();
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Source();
			}
		});
	}
}
