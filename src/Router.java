import java.awt.Color;
import java.net.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;



public class Router implements ActionListener {

	
	JMenuBar mb;
	JMenu m;
	JMenuItem m1,m2,m3,mi1;
	public Font f2 = new Font("Times new roman", Font.BOLD, 18);
	JFrame jf;
	Container c;	
	int endata[];
	
	ImageIcon bn1 = new ImageIcon(this.getClass().getResource("bn1.png"));
	ImageIcon bn2 = new ImageIcon(this.getClass().getResource("bn2.png"));
	ImageIcon bn3 = new ImageIcon(this.getClass().getResource("bn3.png"));
	ImageIcon bn4 = new ImageIcon(this.getClass().getResource("bn4.png"));
	ImageIcon bn5 = new ImageIcon(this.getClass().getResource("bn5.png"));
	ImageIcon bn6 = new ImageIcon(this.getClass().getResource("bn6.png"));
	ImageIcon bn7 = new ImageIcon(this.getClass().getResource("bn7.png"));
	ImageIcon bn8 = new ImageIcon(this.getClass().getResource("bn8.png"));
	ImageIcon bn9 = new ImageIcon(this.getClass().getResource("bn9.png"));
	ImageIcon bn10 = new ImageIcon(this.getClass().getResource("bn10.png"));
	ImageIcon bn11 = new ImageIcon(this.getClass().getResource("bn11.png"));
	ImageIcon bn12 = new ImageIcon(this.getClass().getResource("bn12.png"));
	ImageIcon bn13 = new ImageIcon(this.getClass().getResource("bn13.png"));
	
	ImageIcon gn1 = new ImageIcon(this.getClass().getResource("gn1.png"));
	ImageIcon gn2 = new ImageIcon(this.getClass().getResource("gn2.png"));
	ImageIcon gn3 = new ImageIcon(this.getClass().getResource("gn3.png"));
	ImageIcon gn4 = new ImageIcon(this.getClass().getResource("gn4.png"));
	ImageIcon gn5 = new ImageIcon(this.getClass().getResource("gn5.png"));
	ImageIcon gn6 = new ImageIcon(this.getClass().getResource("gn6.png"));
	ImageIcon gn7 = new ImageIcon(this.getClass().getResource("gn7.png"));
	ImageIcon gn8 = new ImageIcon(this.getClass().getResource("gn8.png"));
	ImageIcon gn9 = new ImageIcon(this.getClass().getResource("gn9.png"));
	ImageIcon gn10 = new ImageIcon(this.getClass().getResource("gn10.png"));
	ImageIcon gn11 = new ImageIcon(this.getClass().getResource("gn11.png"));
	ImageIcon gn12 = new ImageIcon(this.getClass().getResource("gn12.png"));
	ImageIcon gn13 = new ImageIcon(this.getClass().getResource("gn13.png"));
	
	ImageIcon rn1 = new ImageIcon(this.getClass().getResource("rn1.png"));
	ImageIcon rn2 = new ImageIcon(this.getClass().getResource("rn2.png"));
	ImageIcon rn3 = new ImageIcon(this.getClass().getResource("rn3.png"));
	ImageIcon rn4 = new ImageIcon(this.getClass().getResource("rn4.png"));
	ImageIcon rn5 = new ImageIcon(this.getClass().getResource("rn5.png"));
	ImageIcon rn6 = new ImageIcon(this.getClass().getResource("rn6.png"));
	ImageIcon rn7 = new ImageIcon(this.getClass().getResource("rn7.png"));
	ImageIcon rn8 = new ImageIcon(this.getClass().getResource("rn8.png"));
	ImageIcon rn9 = new ImageIcon(this.getClass().getResource("rn9.png"));
	ImageIcon rn10 = new ImageIcon(this.getClass().getResource("rn10.png"));
	ImageIcon rn11 = new ImageIcon(this.getClass().getResource("rn11.png"));
	ImageIcon rn12 = new ImageIcon(this.getClass().getResource("rn12.png"));
	ImageIcon rn13 = new ImageIcon(this.getClass().getResource("rn13.png"));
	
	ImageIcon bs1 = new ImageIcon(this.getClass().getResource("bs1.png"));
	ImageIcon gs1 = new ImageIcon(this.getClass().getResource("gs1.png"));
	
	ImageIcon bd1 = new ImageIcon(this.getClass().getResource("bd1.png"));
	ImageIcon gd1 = new ImageIcon(this.getClass().getResource("gd1.png"));
	
	
	ImageIcon b1 = new ImageIcon(this.getClass().getResource("b1.png"));
	ImageIcon b2 = new ImageIcon(this.getClass().getResource("b2.png"));
	ImageIcon b3 = new ImageIcon(this.getClass().getResource("b3.png"));
	ImageIcon b4 = new ImageIcon(this.getClass().getResource("b4.png"));
	ImageIcon b5 = new ImageIcon(this.getClass().getResource("b5.png"));
	ImageIcon b6 = new ImageIcon(this.getClass().getResource("b6.png"));
	ImageIcon b7 = new ImageIcon(this.getClass().getResource("b7.png"));
	ImageIcon b8 = new ImageIcon(this.getClass().getResource("b8.png"));
	ImageIcon b9 = new ImageIcon(this.getClass().getResource("b9.png"));
	ImageIcon b10 = new ImageIcon(this.getClass().getResource("b10.png"));
	ImageIcon b11 = new ImageIcon(this.getClass().getResource("b11.png"));
	ImageIcon b12 = new ImageIcon(this.getClass().getResource("b12.png"));
	ImageIcon b13 = new ImageIcon(this.getClass().getResource("b13.png"));
	ImageIcon b14 = new ImageIcon(this.getClass().getResource("b14.png"));

	ImageIcon g1 = new ImageIcon(this.getClass().getResource("g1.png"));
	ImageIcon g2 = new ImageIcon(this.getClass().getResource("g2.png"));
	ImageIcon g3 = new ImageIcon(this.getClass().getResource("g3.png"));
	ImageIcon g4 = new ImageIcon(this.getClass().getResource("g4.png"));
	ImageIcon g5 = new ImageIcon(this.getClass().getResource("g5.png"));
	ImageIcon g6 = new ImageIcon(this.getClass().getResource("g6.png"));
	ImageIcon g7 = new ImageIcon(this.getClass().getResource("g7.png"));
	ImageIcon g8 = new ImageIcon(this.getClass().getResource("g8.png"));
	ImageIcon g9 = new ImageIcon(this.getClass().getResource("g9.png"));
	ImageIcon g10 = new ImageIcon(this.getClass().getResource("g10.png"));
	ImageIcon g11 = new ImageIcon(this.getClass().getResource("g11.png"));
	ImageIcon g12 = new ImageIcon(this.getClass().getResource("g12.png"));
	ImageIcon g13 = new ImageIcon(this.getClass().getResource("g13.png"));
	ImageIcon g14 = new ImageIcon(this.getClass().getResource("g14.png"));
	
	
	
	
	JLabel linf1,linf2,linf3,lb1,lb2,lb3,l41,l42,l43;
	
	JLabel lbn1,lbn2,lbn3,lbn4,lbn5,lbn6,lbn7,lbn8,lbn9,lbn10,lbn11,lbn12,lbn13; 

	JLabel lbs1,lbd1,ljam,li1,li2,li3,li4,li5,li6,li7,li8,li9,li10,li11,li12,li13,li14,li15,li16,li17,li18,li19,li20;
	JLabel li21,li22,li23,li24,li25,li26;
	JLabel l1,l2,l3;
	int tn1,tn2,tn3;
	
	Router()
	{
		
		jf = new JFrame("Router::A Probabilistic Source Location Privacy Protection Scheme in Wireless Sensor Networks");
		c = jf.getContentPane();
		c.setLayout(null);	
		c.setBackground(Color.WHITE);
		mb = new JMenuBar();
		m = new JMenu("File");
		m1 = new JMenuItem("Node Info Details");
		m2 = new JMenuItem("Routing Path Details");
		m3 = new JMenuItem("Exit");
		m.add(m1);
		m.add(m2);
		m.add(m3);
		mb.add(m);
	    jf.setJMenuBar(mb);
	    m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		
		ImageIcon banner1 = new ImageIcon(this.getClass().getResource("RouterTitle.PNG"));
		JLabel title1=new JLabel();
		title1.setIcon(banner1);
		title1.setBounds(0, 0, 900, 100);
		
		
		
		lbs1=new JLabel();
		lbs1.setIcon(bs1);
		lbs1.setBounds(-10, 180, 200, 200);
		c.add(lbs1);
		
		lbn1=new JLabel();
		lbn1.setIcon(bn1);
		lbn1.setBounds(90,110, 200, 200);
		c.add(lbn1);
		
		lbn2=new JLabel();
		lbn2.setIcon(bn2);
		lbn2.setBounds(90,185, 200, 200);
		c.add(lbn2);
		
		lbn3=new JLabel();
		lbn3.setIcon(bn3);
		lbn3.setBounds(90,260, 200, 200);
		c.add(lbn3);
		
		lbn4=new JLabel();
		lbn4.setIcon(bn4);
		lbn4.setBounds(190,150, 200, 200);
		c.add(lbn4);
		
		lbn5=new JLabel();
		lbn5.setIcon(bn5);
		lbn5.setBounds(190,225, 200, 200);
		c.add(lbn5);
		
		lbn6=new JLabel();
		lbn6.setIcon(bn6);
		lbn6.setBounds(290,110, 200, 200);
		c.add(lbn6);
		
		lbn7=new JLabel();
		lbn7.setIcon(bn7);
		lbn7.setBounds(290,185, 200, 200);
		c.add(lbn7);
		
		lbn8=new JLabel();
		lbn8.setIcon(bn8);
		lbn8.setBounds(290,260, 200, 200);
		c.add(lbn8);
		
		lbn9=new JLabel();
		lbn9.setIcon(bn9);
		lbn9.setBounds(400,150, 200, 200);
		c.add(lbn9);
		
		lbn10=new JLabel();
		lbn10.setIcon(bn10);
		lbn10.setBounds(400,225, 200, 200);
		c.add(lbn10);
		
		lbn11=new JLabel();
		lbn11.setIcon(bn11);
		lbn11.setBounds(510,110, 200, 200);
		c.add(lbn11);
		
		lbn12=new JLabel();
		lbn12.setIcon(bn12);
		lbn12.setBounds(510,185, 200, 200);
		c.add(lbn12);
		
		lbn13=new JLabel();
		lbn13.setIcon(bn13);
		lbn13.setBounds(510,260, 200, 200);
		c.add(lbn13);
		
		
		li1=new JLabel();
		li1.setIcon(b1);
		li1.setBounds(55,140, 200, 200);
		c.add(li1);
		
		li2=new JLabel();
		li2.setIcon(b5);
		li2.setBounds(58,185, 200, 200);
		c.add(li2);
		
		li3=new JLabel();
		li3.setIcon(b3);
		li3.setBounds(55,230, 200, 200);
		c.add(li3);
		
		li4=new JLabel();
		li4.setIcon(b4);
		li4.setBounds(105,148, 200, 200);
		c.add(li4);
		
		li5=new JLabel();
		li5.setIcon(b4);
		li5.setBounds(105,223, 200, 200);
		c.add(li5);
		
		li6=new JLabel();
		li6.setIcon(b6);
		li6.setBounds(135,130, 200, 200);
		c.add(li6);
		
		li7=new JLabel();
		li7.setIcon(b7);
		li7.setBounds(135,205, 200, 200);
		c.add(li7);
		
		li8=new JLabel();
		li8.setIcon(b8);
		li8.setBounds(135,240, 200, 200);
		c.add(li8);
		
		li9=new JLabel();
		li9.setIcon(b4);
		li9.setBounds(208,188, 200, 200);
		c.add(li9);
		
		li10=new JLabel();
		li10.setIcon(b9);
		li10.setBounds(238,130, 200, 200);
		c.add(li10);
		
		li11=new JLabel();
		li11.setIcon(b10);
		li11.setBounds(238,200, 200, 200);
		c.add(li11);
		
		li12=new JLabel();
		li12.setIcon(b11);
		li12.setBounds(238,245, 200, 200);
		c.add(li12);
		
		li13=new JLabel();
		li13.setIcon(b4);
		li13.setBounds(310,148, 200, 200);
		c.add(li13);
		
		li14=new JLabel();
		li14.setIcon(b4);
		li14.setBounds(310,223, 200, 200);
		c.add(li14);
		
		li15=new JLabel();
		li15.setIcon(b6);
		li15.setBounds(340,130, 200, 200);
		c.add(li15);
		
		li16=new JLabel();
		li16.setIcon(b7);
		li16.setBounds(340,205, 200, 200);
		c.add(li16);
		
		li17=new JLabel();
		li17.setIcon(b8);
		li17.setBounds(340,240, 200, 200);
		c.add(li17);
		
		li18=new JLabel();
		li18.setIcon(b4);
		li18.setBounds(420,188, 200, 200);
		c.add(li18);
		
		li19=new JLabel();
		li19.setIcon(b9);
		li19.setBounds(450,130, 200, 200);
		c.add(li19);
		
		li20=new JLabel();
		li20.setIcon(b10);
		li20.setBounds(450,200, 200, 200);
		c.add(li20);
		
		li21=new JLabel();
		li21.setIcon(b11);
		li21.setBounds(450,245, 200, 200);
		c.add(li21);
		
		li22=new JLabel();
		li22.setIcon(b4);
		li22.setBounds(530,148, 200, 200);
		c.add(li22);
		
		li23=new JLabel();
		li23.setIcon(b4);
		li23.setBounds(530,223, 200, 200);
		c.add(li23);
		
		li24=new JLabel();
		li24.setIcon(b12);
		li24.setBounds(570,140, 200, 200);
		c.add(li24);
		
		li25=new JLabel();
		li25.setIcon(b5);
		li25.setBounds(570,185, 200, 200);
		c.add(li25);
		
		li26=new JLabel();
		li26.setIcon(b14);
		li26.setBounds(570,230, 200, 200);
		c.add(li26);
		
		lbd1=new JLabel();
		lbd1.setIcon(bd1);
		lbd1.setBounds(590,180, 200, 200);
		c.add(lbd1);
		

		l1=new JLabel("1");
		l1.setFont(f2);
		l1.setForeground(Color.blue);
		l1.setBounds(63,133, 200, 200);
		c.add(l1);
		
		l2=new JLabel("2");
		l2.setFont(f2);
		l2.setForeground(Color.blue);
		l2.setBounds(63,175, 200, 200);
		c.add(l2);
		
		l3=new JLabel("3");
		l3.setFont(f2);
		l3.setForeground(Color.blue);
		l3.setBounds(63,235, 200, 200);
		c.add(l3);
		c.add(title1);
	
		
		
		l1.setVisible(false);
		l2.setVisible(false);
		l3.setVisible(false);
		
		
		
		jf.setSize(910,500);
		jf.show();
		
		Socket client = null;
		int[] ports = new int[] { 2000,2001,202,444,4431};

		for (int i = 0; i < 5; i++) {
			Thread t = new Thread(new PortListener(ports[i]));
			t.setName("Listener-" + ports[i]);
			t.start();
		}
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
			
		if(e.getSource()==m3)
		{
		System.exit(0);
			
		}
		else if(e.getSource()==m1)
		{
			
			try {
				UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new nodesinfo();
				}
			});
		}
		else if(e.getSource()==m2)
		{
			
			try {
				UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new rpathdetails();
				}
			});
		}
		
		
	}
	
	class PortListener implements Runnable {
		
		BufferedOutputStream bos = null;

		ServerSocket server;
		DataInputStream di;
		
		BufferedReader br = null;
		int port;

		public PortListener(int port) {
			this.port = port;
		}

		@Override
		public void run() {
			
			
			if (this.port == 444) {
				try {

					ServerSocket server3 = new ServerSocket(444);
					Socket con2;
					while (true) {
						con2 = server3.accept();
						DataInputStream din = new DataInputStream(
								con2.getInputStream());
							
						String node = (String)din.readUTF();
						String ip = (String)din.readUTF();
						
												
							DBCon db = new DBCon();
							Connection con = db.getConnection();
							
											
													
							Statement stmt2 = con.createStatement();
							String sql2 = "update Nodesinfo set status='Adversary Attacker',destip='"+ip+"' where Nname='"+node+"'";
							stmt2.executeUpdate(sql2);
							
							
							
							DataOutputStream dout = new DataOutputStream(con2.getOutputStream());
							dout.writeUTF("success");
									
						}
						
					}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				}
			if(this.port==202)
			{
				
				try
				{
				ServerSocket sc = new ServerSocket(202);
				while(true)
				{
					Socket s = sc.accept();
					DataInputStream din = new DataInputStream(s.getInputStream());
					String dip=din.readUTF();
					String hash=din.readUTF();
					
					
					DBCon db = new DBCon();
					Connection con = db.getConnection();
					

					for(int i=1;i<=13;i++)
					{
						String nodename="N"+i;
						String sql = "update Nodesinfo set sig='"+hash+"', destip='"+dip+"',injdata='null', status='Normal' where Nname='"+nodename+"'";
						Statement stmt = con.createStatement();
						stmt.executeUpdate(sql);
						
					
					
					DataOutputStream dout = new DataOutputStream(s.getOutputStream());
					dout.writeUTF("Nodes Initialised Successfully");
					
					}
					
					
					
				}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
				
			}
			if (this.port == 4431) {
				try {

					ServerSocket server3 = new ServerSocket(4431);
					Socket con2;
					while (true) {
						con2 = server3.accept();
						DataInputStream din = new DataInputStream(
								con2.getInputStream());
							
						String node = (String)din.readUTF();
						String hash = (String)din.readUTF();
						String data = (String)din.readUTF();
						
						
												
							DBCon db = new DBCon();
							Connection con = db.getConnection();
							
											
													
							Statement stmt2 = con.createStatement();
							String sql2 = "update Nodesinfo set status='Active Attacker',sig='"+hash+"',injdata='"+data+"' where Nname='"+node+"'";
							stmt2.executeUpdate(sql2);
							
							
							
							DataOutputStream dout = new DataOutputStream(con2.getOutputStream());
							dout.writeUTF("success");
								
								
							
							
							
						}
						
					}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				}
			if(this.port==2001){
				
				try{
					server = new ServerSocket(2001);
				
				while(true){
					
					Socket s1 = server.accept();
					
					
					DataInputStream in = new DataInputStream(s1
							.getInputStream());
                    
					String file = in.readUTF();
					String mac = in.readUTF();
					String dname = in.readUTF();
					String dip=in.readUTF();
					
					
					ObjectInputStream ois = new ObjectInputStream(s1.getInputStream());
					endata=(int[])ois.readObject();
					
					lbs1.setVisible(false);
					 lbs1.setIcon(gs1);
					 lbs1.setVisible(true);
					 Thread.sleep(1000);
					
					Random r1 = new Random();
					 
					 tn1 = r1.nextInt(50);
					 tn2= r1.nextInt(50);
					 tn3 = r1.nextInt(50);
					
					 l1.setVisible(false);
					 l1.setText(Integer.toString(tn1));
					 l1.setVisible(true);
					 
					 l2.setVisible(false);
					 l2.setText(Integer.toString(tn2));
					 l2.setVisible(true);
					 
					 l3.setVisible(false);
					 l3.setText(Integer.toString(tn3));
					 l3.setVisible(true);
					 
					 Thread.sleep(1000);
					 
					
					 
					 if(tn1<=tn2 && tn1<=tn3)
					 {
						 li1.setVisible(false);
						 li1.setIcon(g1);
						 li1.setVisible(true);
						 Thread.sleep(1000);
						 
						 lbn1.setVisible(false);
						 lbn1.setIcon(gn1);
						 lbn1.setVisible(true);
						 Thread.sleep(1000);
						 
						 DBCon db = new DBCon();
						 Connection con = db.getConnection();
						 Statement stmt = con.createStatement();
							String sql = "select * from Nodesinfo where Nname='N1' and sig='"+mac+"' and injdata='null' ";
							ResultSet rs = stmt.executeQuery(sql);
							if(rs.next()==true)
							{
								li6.setVisible(false);
								 li6.setIcon(g6);
								 li6.setVisible(true);
								 Thread.sleep(1000);
								 
								 lbn4.setVisible(false);
								 lbn4.setIcon(gn4);
								 lbn4.setVisible(true);
								 Thread.sleep(1000);
								 
								 Statement stmt4 = con.createStatement();
									String sql4 = "select * from Nodesinfo where Nname='N4' and sig='"+mac+"' and injdata='null' ";
									ResultSet rs4 = stmt4.executeQuery(sql4);
									if(rs4.next()==true)
									{
										li10.setVisible(false);
										 li10.setIcon(g9);
										 li10.setVisible(true);
										 Thread.sleep(1000);
										 
										 lbn6.setVisible(false);
										 lbn6.setIcon(gn6);
										 lbn6.setVisible(true);
										 Thread.sleep(1000);
										 Statement stmt6 = con.createStatement();
											String sql6 = "select * from Nodesinfo where Nname='N6' and sig='"+mac+"' and injdata='null' ";
											ResultSet rs6 = stmt6.executeQuery(sql6);
											if(rs6.next()==true)
											{
												 li15.setVisible(false);
												 li15.setIcon(g6);
												 li15.setVisible(true);
												 Thread.sleep(1000);
												 
												 lbn9.setVisible(false);
												 lbn9.setIcon(gn9);
												 lbn9.setVisible(true);
												 Thread.sleep(1000);
												 
												 Statement stmt9 = con.createStatement();
													String sql9 = "select * from Nodesinfo where Nname='N9' and sig='"+mac+"' and injdata='null' ";
													ResultSet rs9 = stmt9.executeQuery(sql9);
													if(rs9.next()==true)
													{
														 li19.setVisible(false);
														 li19.setIcon(g9);
														 li19.setVisible(true);
														 Thread.sleep(1000);
														 
														 lbn11.setVisible(false);
														 lbn11.setIcon(gn11);
														 lbn11.setVisible(true);
														 Thread.sleep(1000);
														 Statement stmt11 = con.createStatement();
															String sql11 = "select * from Nodesinfo where Nname='N11' and sig='"+mac+"' and injdata='null' ";
															ResultSet rs11 = stmt11.executeQuery(sql11);
															if(rs11.next()==true)
															{
																
																li24.setVisible(false);
																 li24.setIcon(g12);
																 li24.setVisible(true);
																 Thread.sleep(1000);
																 
																 funcnD(s1,dname,dip,endata);
															}
															else if(rs11.next()==false)
															{
																
																 Socket sc1 = new Socket("localhost",303);
									            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
									            				 dout1.writeUTF("Active");
									            				 dout1.writeUTF("N11");
									            				 
									            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
									            				 String msg1 = din1.readUTF();
									            				 
									            				 if(msg1.equalsIgnoreCase("success"))
									            				 {
																
									            					 Thread.sleep(1000);
																lbn11.setVisible(false);
																 lbn11.setIcon(rn11);
																 lbn11.setVisible(true);
																 Thread.sleep(1000);
																 
																 JOptionPane.showMessageDialog(null, "Active Attacker Found in N11");
																	int i = JOptionPane.showConfirmDialog(null, "Do you want to Localise the Node");
																	if(i==0)
																	{
																		Statement stmt2 = con.createStatement();
																		String sql2 = "update Nodesinfo set status='Normal',sig='"+mac+"',injdata='null' where Nname='N11'";
																		stmt2.executeUpdate(sql2);
																		
																		li19.setVisible(false);
																		 li19.setIcon(g9);
																		 li19.setVisible(true);
																		 Thread.sleep(1000);
																		 
																		 lbn9.setVisible(false);
																		 lbn9.setIcon(gn9);
																		 lbn9.setVisible(true);
																		 Thread.sleep(1000);
																		 
																		 li18.setVisible(false);
																		 li18.setIcon(g4);
																		 li18.setVisible(true);
																		 Thread.sleep(1000);
																		 
																		 lbn10.setVisible(false);
																		 lbn10.setIcon(gn10);
																		 lbn10.setVisible(true);
																		 Thread.sleep(1000);
																		 
																		 li20.setVisible(false);
																		 li20.setIcon(g10);
																		 li20.setVisible(true);
																		 Thread.sleep(1000);
																		 
																		 lbn12.setVisible(false);
																		 lbn12.setIcon(gn12);
																		 lbn12.setVisible(true);
																		 Thread.sleep(1000);
																		 
																		 li25.setVisible(false);
																		 li25.setIcon(g5);
																		 li25.setVisible(true);
																		 Thread.sleep(1000);
																		 
																		 funcnD(s1,dname,dip,endata);
																		
																		
																		 
																		 
																		
																	}
																	else if(i==1)
																	{
																		 Statement stmt100 = con.createStatement();
																			String sql100 = "select * from Nodesinfo where Nname='N11'  ";
																			ResultSet rs100 = stmt100.executeQuery(sql100);
																			if(rs100.next()==true)
																			{
																				
																			String inj=rs100.getString(4);
																		
																		Decryption d = new Decryption();
																		 String dec = d.decrypt(endata);
																		String data=dec+inj;
																		
																		Encryption encryption = new Encryption();
																		int edata[] = encryption.ecies_ex(data);
																		
																		li24.setVisible(false);
																		 li24.setIcon(g12);
																		 li24.setVisible(true);
																		 Thread.sleep(1000);
																		
																		 funcnD(s1,dname,dip,edata);
																		
																			}
																	}
															}
														 
															}}
													else if(rs9.next()==false)
													{
														 
														 Socket sc1 = new Socket("localhost",303);
							            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
							            				 dout1.writeUTF("Active");
							            				 dout1.writeUTF("N9");
							            				 
							            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
							            				 String msg1 = din1.readUTF();
							            				 
							            				 if(msg1.equalsIgnoreCase("success"))
							            				 {
														
							            					 Thread.sleep(1000);
														lbn9.setVisible(false);
														 lbn9.setIcon(rn9);
														 lbn9.setVisible(true);
														 Thread.sleep(1000);
														
														JOptionPane.showMessageDialog(null, "Active Attacker Found in N9");
														int i = JOptionPane.showConfirmDialog(null, "Do you want to Localise the Node");
														if(i==0)
														{
															Statement stmt2 = con.createStatement();
															String sql2 = "update Nodesinfo set status='Normal',sig='"+mac+"',injdata='null' where Nname='N9'";
															stmt2.executeUpdate(sql2);
															
															
															li15.setVisible(false);
															 li15.setIcon(g6);
															 li15.setVisible(true);
															 Thread.sleep(1000);
															 
															 lbn6.setVisible(false);
															 lbn6.setIcon(gn6);
															 lbn6.setVisible(true);
															 Thread.sleep(1000);
															 
															 li13.setVisible(false);
															 li13.setIcon(g4);
															 li13.setVisible(true);
															 Thread.sleep(1000);
															 
															 lbn7.setVisible(false);
															 lbn7.setIcon(gn7);
															 lbn7.setVisible(true);
															 Thread.sleep(1000);
															 
															 li16.setVisible(false);
															 li16.setIcon(g7);
															 li16.setVisible(true);
															 Thread.sleep(1000);
															 
															 lbn10.setVisible(false);
															 lbn10.setIcon(gn10);
															 lbn10.setVisible(true);
															 Thread.sleep(1000);
															 
															 li20.setVisible(false);
															 li20.setIcon(g10);
															 li20.setVisible(true);
															 Thread.sleep(1000);
															 
															 lbn12.setVisible(false);
															 lbn12.setIcon(gn12);
															 lbn12.setVisible(true);
															 Thread.sleep(1000);
															 
															 li25.setVisible(false);
															 li25.setIcon(g5);
															 li25.setVisible(true);
															 Thread.sleep(1000);
															
															
															 
															 funcnD(s1,dname,dip,endata);
															 
															
														}
														else if(i==1)
														{
															 Statement stmt100 = con.createStatement();
																String sql100 = "select * from Nodesinfo where Nname='N9'  ";
																ResultSet rs100 = stmt100.executeQuery(sql100);
																if(rs100.next()==true)
																{
																	
																String inj=rs100.getString(4);
															
															Decryption d = new Decryption();
															 String dec = d.decrypt(endata);
															String data=dec+inj;
															
															Encryption encryption = new Encryption();
															int edata[] = encryption.ecies_ex(data);
															
															
															 
															 li19.setVisible(false);
															 li19.setIcon(g9);
															 li19.setVisible(true);
															 Thread.sleep(1000);
															 
															 lbn11.setVisible(false);
															 lbn11.setIcon(gn11);
															 lbn11.setVisible(true);
															 Thread.sleep(1000);
															 
															 li24.setVisible(false);
															 li24.setIcon(g12);
															 li24.setVisible(true);
															 Thread.sleep(1000);
															 
															 funcnD(s1,dname,dip,edata);
															
																}
														}
													}
													}}
											else if(rs6.next()==false)
											{
												
												 Socket sc1 = new Socket("localhost",303);
					            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
					            				 dout1.writeUTF("Active");
					            				 dout1.writeUTF("N6");
					            				 
					            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
					            				 String msg1 = din1.readUTF();
					            				 
					            				 if(msg1.equalsIgnoreCase("success"))
					            				 {
												
					            					 Thread.sleep(1000);
												lbn6.setVisible(false);
												 lbn6.setIcon(rn6);
												 lbn6.setVisible(true);
												 Thread.sleep(1000);
												 
												JOptionPane.showMessageDialog(null, "Active Attacker Found in N6");
												int i = JOptionPane.showConfirmDialog(null, "Do you want to Localise the Node");
												if(i==0)
												{
													Statement stmt2 = con.createStatement();
													String sql2 = "update Nodesinfo set status='Normal',sig='"+mac+"',injdata='null' where Nname='N6'";
													stmt2.executeUpdate(sql2);
													
													li10.setVisible(false);
													 li10.setIcon(g9);
													 li10.setVisible(true);
													 Thread.sleep(1000);
													 
													 lbn4.setVisible(false);
													 lbn4.setIcon(gn4);
													 lbn4.setVisible(true);
													 Thread.sleep(1000);
													 
													 li9.setVisible(false);
													 li9.setIcon(g4);
													 li9.setVisible(true);
													 Thread.sleep(1000);
													 
													 lbn5.setVisible(false);
													 lbn5.setIcon(gn5);
													 lbn5.setVisible(true);
													 Thread.sleep(1000);
													 
													 li11.setVisible(false);
													 li11.setIcon(g10);
													 li11.setVisible(true);
													 Thread.sleep(1000);
													 
													lbn7.setVisible(false);
													 lbn7.setIcon(gn7);
													 lbn7.setVisible(true);
													 Thread.sleep(1000);
													 
													 li16.setVisible(false);
													 li16.setIcon(g7);
													 li16.setVisible(true);
													 Thread.sleep(1000);
													 
													 lbn10.setVisible(false);
													 lbn10.setIcon(gn10);
													 lbn10.setVisible(true);
													 Thread.sleep(1000);
													 
													 li20.setVisible(false);
													 li20.setIcon(g10);
													 li20.setVisible(true);
													 Thread.sleep(1000);
													 
													 lbn12.setVisible(false);
													 lbn12.setIcon(gn12);
													 lbn12.setVisible(true);
													 Thread.sleep(1000);
													 
													 li25.setVisible(false);
													 li25.setIcon(g5);
													 li25.setVisible(true);
													 Thread.sleep(1000);
																									 
													
													 
													 funcnD(s1,dname,dip,endata);
													
												}
												else if(i==1)
												{
													 Statement stmt100 = con.createStatement();
														String sql100 = "select * from Nodesinfo where Nname='N6'  ";
														ResultSet rs100 = stmt100.executeQuery(sql100);
														if(rs100.next()==true)
														{
															
														String inj=rs100.getString(4);
													
													Decryption d = new Decryption();
													 String dec = d.decrypt(endata);
													String data=dec+inj;
													
													Encryption encryption = new Encryption();
													int edata[] = encryption.ecies_ex(data);
													
													 
													 
													 li15.setVisible(false);
													 li15.setIcon(g6);
													 li15.setVisible(true);
													 Thread.sleep(1000);
													 
													 lbn9.setVisible(false);
													 lbn9.setIcon(gn9);
													 lbn9.setVisible(true);
													 Thread.sleep(1000);
													 
													 li19.setVisible(false);
													 li19.setIcon(g9);
													 li19.setVisible(true);
													 Thread.sleep(1000);
													 
													 lbn11.setVisible(false);
													 lbn11.setIcon(gn11);
													 lbn11.setVisible(true);
													 Thread.sleep(1000);
													 
													 li24.setVisible(false);
													 li24.setIcon(g12);
													 li24.setVisible(true);
													 Thread.sleep(1000);
													 
													 funcnD(s1,dname,dip,edata);
													
													
														}
												}
											}
										 
											}}
									else if(rs4.next()==false)
									{
										
										 Socket sc1 = new Socket("localhost",303);
			            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
			            				 dout1.writeUTF("Active");
			            				 dout1.writeUTF("N4");
			            				 
			            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
			            				 String msg1 = din1.readUTF();
			            				 
			            				 if(msg1.equalsIgnoreCase("success"))
			            				 {
										
			            					 Thread.sleep(1000);
										lbn4.setVisible(false);
										 lbn4.setIcon(rn4);
										 lbn4.setVisible(true);
										 Thread.sleep(1000);
										 
										JOptionPane.showMessageDialog(null, "Active Attacker Found in N4");
										int i = JOptionPane.showConfirmDialog(null, "Do you want to Localise the Node");
										if(i==0)
										{
											Statement stmt2 = con.createStatement();
											String sql2 = "update Nodesinfo set status='Normal',sig='"+mac+"',injdata='null' where Nname='N4'";
											stmt2.executeUpdate(sql2);
											
											li6.setVisible(false);
											 li6.setIcon(g6);
											 li6.setVisible(true);
											 Thread.sleep(1000);
											 
											 lbn1.setVisible(false);
											 lbn1.setIcon(gn1);
											 lbn1.setVisible(true);
											 Thread.sleep(1000);
											 
											 li4.setVisible(false);
											 li4.setIcon(g4);
											 li4.setVisible(true);
											 Thread.sleep(1000);
											 
											 lbn2.setVisible(false);
											 lbn2.setIcon(gn2);
											 lbn2.setVisible(true);
											 Thread.sleep(1000);
											
											 li7.setVisible(false);
											 li7.setIcon(g7);
											 li7.setVisible(true);
											 Thread.sleep(1000);
											 
											 lbn5.setVisible(false);
											 lbn5.setIcon(gn5);
											 lbn5.setVisible(true);
											 Thread.sleep(1000);
											 
											 li11.setVisible(false);
											 li11.setIcon(g10);
											 li11.setVisible(true);
											 Thread.sleep(1000);
											 
											 lbn7.setVisible(false);
											 lbn7.setIcon(gn7);
											 lbn7.setVisible(true);
											 Thread.sleep(1000);
											 
											 li16.setVisible(false);
											 li16.setIcon(g7);
											 li16.setVisible(true);
											 Thread.sleep(1000);
											 
											 lbn10.setVisible(false);
											 lbn10.setIcon(gn10);
											 lbn10.setVisible(true);
											 Thread.sleep(1000);
											 
											 li20.setVisible(false);
											 li20.setIcon(g10);
											 li20.setVisible(true);
											 Thread.sleep(1000);
											 
											 lbn12.setVisible(false);
											 lbn12.setIcon(gn12);
											 lbn12.setVisible(true);
											 Thread.sleep(1000);
											 
											 li25.setVisible(false);
											 li25.setIcon(g5);
											 li25.setVisible(true);
											 Thread.sleep(1000);
											 
											 funcnD(s1,dname,dip,endata);
											
											
										}
										else if(i==1)
										{
											 Statement stmt100 = con.createStatement();
												String sql100 = "select * from Nodesinfo where Nname='N4'  ";
												ResultSet rs100 = stmt100.executeQuery(sql100);
												if(rs100.next()==true)
												{
													
												String inj=rs100.getString(4);
											
											Decryption d = new Decryption();
											 String dec = d.decrypt(endata);
											String data=dec+inj;
											
											Encryption encryption = new Encryption();
											int edata[] = encryption.ecies_ex(data);
											
											
											 
											 
											 lbn4.setVisible(false);
											 lbn4.setIcon(gn4);
											 lbn4.setVisible(true);
											 Thread.sleep(1000);
											 
											 li10.setVisible(false);
											 li10.setIcon(g9);
											 li10.setVisible(true);
											 Thread.sleep(1000);
											 
											 lbn6.setVisible(false);
											 lbn6.setIcon(gn6);
											 lbn6.setVisible(true);
											 Thread.sleep(1000);
											 
											 li15.setVisible(false);
											 li15.setIcon(g6);
											 li15.setVisible(true);
											 Thread.sleep(1000);
											 
											 lbn9.setVisible(false);
											 lbn9.setIcon(gn9);
											 lbn9.setVisible(true);
											 Thread.sleep(1000);
											 
											 li19.setVisible(false);
											 li19.setIcon(g9);
											 li19.setVisible(true);
											 Thread.sleep(1000);
											 
											 lbn11.setVisible(false);
											 lbn11.setIcon(gn11);
											 lbn11.setVisible(true);
											 Thread.sleep(1000);
											 
											 li24.setVisible(false);
											 li24.setIcon(g12);
											 li24.setVisible(true);
											 Thread.sleep(1000);
											 funcnD(s1,dname,dip,edata);
												}
										}
									}
								
									}}
							else if(rs.next()==false)
							{
								 
								 Socket sc1 = new Socket("localhost",303);
	            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
	            				 dout1.writeUTF("Active");
	            				 dout1.writeUTF("N1");
	            				 
	            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
	            				 String msg1 = din1.readUTF();
	            				 
	            				 if(msg1.equalsIgnoreCase("success"))
	            				 {
								
	            					 Thread.sleep(1000); 
								lbn1.setVisible(false);
								 lbn1.setIcon(rn1);
								 lbn1.setVisible(true);
								 Thread.sleep(1000);
								
								JOptionPane.showMessageDialog(null, "Active Attacker Found in N1");
								int i = JOptionPane.showConfirmDialog(null, "Do you want to Localise the Node");
								if(i==0)
								{
									Statement stmt2 = con.createStatement();
									String sql2 = "update Nodesinfo set status='Normal',sig='"+mac+"',injdata='null' where Nname='N1'";
									stmt2.executeUpdate(sql2);
									
									li1.setVisible(false);
									 li1.setIcon(g1);
									 li1.setVisible(true);
									 Thread.sleep(1000);
									 
									 li2.setVisible(false);
									 li2.setIcon(g2);
									 li2.setVisible(true);
									 Thread.sleep(1000);
									
									lbn2.setVisible(false);
									 lbn2.setIcon(gn2);
									 lbn2.setVisible(true);
									 Thread.sleep(1000);
									
									 li7.setVisible(false);
									 li7.setIcon(g7);
									 li7.setVisible(true);
									 Thread.sleep(1000);
									 
									 lbn5.setVisible(false);
									 lbn5.setIcon(gn5);
									 lbn5.setVisible(true);
									 Thread.sleep(1000);
									 
									 li11.setVisible(false);
									 li11.setIcon(g10);
									 li11.setVisible(true);
									 Thread.sleep(1000);
									 
									 lbn7.setVisible(false);
									 lbn7.setIcon(gn7);
									 lbn7.setVisible(true);
									 Thread.sleep(1000);
									 
									 li16.setVisible(false);
									 li16.setIcon(g7);
									 li16.setVisible(true);
									 Thread.sleep(1000);
									 
									 lbn10.setVisible(false);
									 lbn10.setIcon(gn10);
									 lbn10.setVisible(true);
									 Thread.sleep(1000);
									 
									 li20.setVisible(false);
									 li20.setIcon(g10);
									 li20.setVisible(true);
									 Thread.sleep(1000);
									 
									 lbn12.setVisible(false);
									 lbn12.setIcon(gn12);
									 lbn12.setVisible(true);
									 Thread.sleep(1000);
									 
									 li25.setVisible(false);
									 li25.setIcon(g5);
									 li25.setVisible(true);
									 Thread.sleep(1000);
									 
									 funcnD(s1,dname,dip,endata);
									
									
								}
								else if(i==1)
								{
									 Statement stmt100 = con.createStatement();
										String sql100 = "select * from Nodesinfo where Nname='N1'  ";
										ResultSet rs100 = stmt100.executeQuery(sql100);
										if(rs100.next()==true)
										{
											
										String inj=rs100.getString(4);
									
									Decryption d = new Decryption();
									 String dec = d.decrypt(endata);
									String data=dec+inj;
									
									Encryption encryption = new Encryption();
									int edata[] = encryption.ecies_ex(data);
									
									li6.setVisible(false);
									 li6.setIcon(g6);
									 li6.setVisible(true);
									 Thread.sleep(1000); 
									
									lbn4.setVisible(false);
									 lbn4.setIcon(gn4);
									 lbn4.setVisible(true);
									 Thread.sleep(1000);
									 
									 li10.setVisible(false);
									 li10.setIcon(g9);
									 li10.setVisible(true);
									 Thread.sleep(1000);
									 
									 lbn6.setVisible(false);
									 lbn6.setIcon(gn6);
									 lbn6.setVisible(true);
									 Thread.sleep(1000);
									 
									 li15.setVisible(false);
									 li15.setIcon(g6);
									 li15.setVisible(true);
									 Thread.sleep(1000);
									 
									 lbn9.setVisible(false);
									 lbn9.setIcon(gn9);
									 lbn9.setVisible(true);
									 Thread.sleep(1000);
									 
									 li19.setVisible(false);
									 li19.setIcon(g9);
									 li19.setVisible(true);
									 Thread.sleep(1000);
									 
									 lbn11.setVisible(false);
									 lbn11.setIcon(gn11);
									 lbn11.setVisible(true);
									 Thread.sleep(1000);
									 
									 li24.setVisible(false);
									 li24.setIcon(g12);
									 li24.setVisible(true);
									 Thread.sleep(1000);
									 funcnD(s1,dname,dip,edata);
										}
								}
	            				 }}
						 
					 }
					 
					 else if(tn2<=tn1 && tn2<=tn3)
					 {
						 li2.setVisible(false);
						 li2.setIcon(g2);
						 li2.setVisible(true);
						 Thread.sleep(1000);
						 
						 lbn2.setVisible(false);
						 lbn2.setIcon(gn2);
						 lbn2.setVisible(true);
						 Thread.sleep(1000);
						 
						 DBCon db = new DBCon();
						 Connection con = db.getConnection();
						 Statement stmt = con.createStatement();
							String sql = "select * from Nodesinfo where Nname='N2' and sig='"+mac+"' and injdata='null' ";
							ResultSet rs2 = stmt.executeQuery(sql);
							if(rs2.next()==true)
							{
								 li7.setVisible(false);
								 li7.setIcon(g7);
								 li7.setVisible(true);
								 Thread.sleep(1000);
								 
								 lbn5.setVisible(false);
								 lbn5.setIcon(gn5);
								 lbn5.setVisible(true);
								 Thread.sleep(1000);
							
								 Statement stmt5 = con.createStatement();
									String sql5 = "select * from Nodesinfo where Nname='N5' and destip='"+dip+"'  ";
									ResultSet rs5 = stmt5.executeQuery(sql5);
									if(rs5.next()==true)
									{
										 li11.setVisible(false);
										 li11.setIcon(g10);
										 li11.setVisible(true);
										 Thread.sleep(1000);
										 
										 lbn7.setVisible(false);
										 lbn7.setIcon(gn7);
										 lbn7.setVisible(true);
										 Thread.sleep(1000);
										 
										 Statement stmt7 = con.createStatement();
											String sql7 = "select * from Nodesinfo where Nname='N7' and sig='"+mac+"' and injdata='null' ";
											ResultSet rs7 = stmt7.executeQuery(sql7);
											if(rs7.next()==true)
											{
												 li16.setVisible(false);
												 li16.setIcon(g7);
												 li16.setVisible(true);
												 Thread.sleep(1000);
												 
												 lbn10.setVisible(false);
												 lbn10.setIcon(gn10);
												 lbn10.setVisible(true);
												 Thread.sleep(1000);
												 
												
												 Statement stmt10 = con.createStatement();
													String sql10 = "select * from Nodesinfo where Nname='N10' and destip='"+dip+"'  ";
													ResultSet rs10 = stmt10.executeQuery(sql10);
													if(rs10.next()==true)
													{
														 li20.setVisible(false);
														 li20.setIcon(g10);
														 li20.setVisible(true);
														 Thread.sleep(1000);
														 
														 lbn12.setVisible(false);
														 lbn12.setIcon(gn12);
														 lbn12.setVisible(true);
														 Thread.sleep(1000);
														 
														 Statement stmt12 = con.createStatement();
															String sql12 = "select * from Nodesinfo where Nname='N12' and sig='"+mac+"' and injdata='null' ";
															ResultSet rs12 = stmt12.executeQuery(sql12);
															if(rs12.next()==true)
															{
																li25.setVisible(false);
																 li25.setIcon(g5);
																 li25.setVisible(true);
																 Thread.sleep(1000);
																 
																 funcnD(s1,dname,dip,endata);
															}
															else if(rs12.next()==false)
															{
																 Socket sc1 = new Socket("localhost",303);
									            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
									            				 dout1.writeUTF("Active");
									            				 dout1.writeUTF("N12");
									            				 
									            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
									            				 String msg1 = din1.readUTF();
									            				 
									            				 if(msg1.equalsIgnoreCase("success"))
									            				 {
																
									            					 Thread.sleep(1000); 
																lbn12.setVisible(false);
																 lbn12.setIcon(rn12);
																 lbn12.setVisible(true);
																 Thread.sleep(1000);
																JOptionPane.showMessageDialog(null, "Active Attacker Found in N12");
																int i = JOptionPane.showConfirmDialog(null, "Do you want to Localise the Node");
																if(i==0)
																{
																	Statement stmt2 = con.createStatement();
																	String sql2 = "update Nodesinfo set status='Normal',sig='"+mac+"',injdata='null' where Nname='N12'";
																	stmt2.executeUpdate(sql2);
																	
																	 li20.setVisible(false);
																	 li20.setIcon(g10);
																	 li20.setVisible(true);
																	 Thread.sleep(1000);
																	 
																	 lbn10.setVisible(false);
																	 lbn10.setIcon(gn10);
																	 lbn10.setVisible(true);
																	 Thread.sleep(1000);
																	 
																	 li21.setVisible(false);
																	 li21.setIcon(g11);
																	 li21.setVisible(true);
																	 Thread.sleep(1000);
																	 
																	 lbn13.setVisible(false);
																	 lbn13.setIcon(gn13);
																	 lbn13.setVisible(true);
																	 Thread.sleep(1000);
																	
																	 li26.setVisible(false);
																	 li26.setIcon(g14);
																	 li26.setVisible(true);
																	 Thread.sleep(1000);
																	 funcnD(s1,dname,dip,endata);
																	
																}
																else if(i==1)
																{
																	 Statement stmt100 = con.createStatement();
																		String sql100 = "select * from Nodesinfo where Nname='N12'  ";
																		ResultSet rs100 = stmt100.executeQuery(sql100);
																		if(rs100.next()==true)
																		{
																			
																		String inj=rs100.getString(4);
																	
																	Decryption d = new Decryption();
																	 String dec = d.decrypt(endata);
																	String data=dec+inj;
																	
																	Encryption encryption = new Encryption();
																	int edata[] = encryption.ecies_ex(data);
																	
																	li25.setVisible(false);
																	 li25.setIcon(g5);
																	 li25.setVisible(true);
																	 Thread.sleep(1000);
																	 
																	 funcnD(s1,dname,dip,edata);
																		}
																}
															}

														 
														
															}}
													else if(rs10.next()==false)
													{

														 Socket sc1 = new Socket("localhost",303);
							            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
							            				 dout1.writeUTF("Passive");
							            				 dout1.writeUTF("N10");
							            				 
							            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
							            				 String msg1 = din1.readUTF();
							            				 
							            				 if(msg1.equalsIgnoreCase("success"))
							            				 {
														lbn10.setVisible(false);
														 lbn10.setIcon(rn10);
														 lbn10.setVisible(true);
														 Thread.sleep(1000);
														 JOptionPane.showMessageDialog(null, "Adversary Attacker Found in N10");
														Statement stmt2 = con.createStatement();
														String sql2 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N10'";
														stmt2.executeUpdate(sql2);
														
														lbn10.setVisible(false);
														 lbn10.setIcon(gn10);
														 lbn10.setVisible(true);
														 Thread.sleep(1000);
														 li21.setVisible(false);
														 li21.setIcon(g11);
														 li21.setVisible(true);
														 Thread.sleep(1000);
														 
														 lbn13.setVisible(false);
														 lbn13.setIcon(gn13);
														 lbn13.setVisible(true);
														 Thread.sleep(1000);
														
														
														 
														Statement stmt13 = con.createStatement();
														String sql13 = "select * from Nodesinfo where Nname='N13' and destip='"+dip+"'  ";
														ResultSet rs13 = stmt13.executeQuery(sql13);
														if(rs13.next()==true)
														{
															 li26.setVisible(false);
															 li26.setIcon(g14);
															 li26.setVisible(true);
															 Thread.sleep(1000);
															 funcnD(s1,dname,dip,endata);
														}
														else if(rs13.next()==false)
														{
															 Socket sc11 = new Socket("localhost",303);
								            				 DataOutputStream dout11 = new DataOutputStream(sc11.getOutputStream());
								            				 dout11.writeUTF("Passive");
								            				 dout11.writeUTF("N13");
								            				 
								            				 DataInputStream din11 = new DataInputStream(sc11.getInputStream());
								            				 String msg11 = din11.readUTF();
								            				 
								            				 if(msg11.equalsIgnoreCase("success"))
								            				 {
															
								            					 Thread.sleep(1000);
															lbn13.setVisible(false);
															 lbn13.setIcon(rn13);
															 lbn13.setVisible(true);
															 Thread.sleep(1000);
															 
															 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N13");
															 
															Statement stmt21 = con.createStatement();
															String sql21 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N13'";
															stmt21.executeUpdate(sql21);
															
															lbn13.setVisible(false);
															 lbn13.setIcon(gn13);
															 lbn13.setVisible(true);
															 Thread.sleep(1000);
															li26.setVisible(false);
															 li26.setIcon(g14);
															 li26.setVisible(true);
															 Thread.sleep(1000);
															 funcnD(s1,dname,dip,endata);
														}
														}
													}
													
														}}
											else if(rs7.next()==false)
											{
												
												 Socket sc1 = new Socket("localhost",303);
					            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
					            				 dout1.writeUTF("Active");
					            				 dout1.writeUTF("N7");
					            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
					            				 String msg1 = din1.readUTF();
					            				 
					            				 if(msg1.equalsIgnoreCase("success"))
					            				 {
												
					            				 Thread.sleep(1000);
												 lbn7.setVisible(false);
												 lbn7.setIcon(rn7);
												 lbn7.setVisible(true);
												 Thread.sleep(1000);
												 
												JOptionPane.showMessageDialog(null, "Active Attacker Found in N7");
												int i = JOptionPane.showConfirmDialog(null, "Do you want to Localise the Node");
												if(i==0)
												{
													Statement stmt2 = con.createStatement();
													String sql2 = "update Nodesinfo set status='Normal',sig='"+mac+"',injdata='null' where Nname='N7'";
													stmt2.executeUpdate(sql2);
													
													li11.setVisible(false);
													 li11.setIcon(g10);
													 li11.setVisible(true);
													 Thread.sleep(1000);
													 
													 lbn5.setVisible(false);
													 lbn5.setIcon(gn5);
													 lbn5.setVisible(true);
													 Thread.sleep(1000);
													 
													 li12.setVisible(false);
													 li12.setIcon(g11);
													 li12.setVisible(true);
													 Thread.sleep(1000);
													
													lbn8.setVisible(false);
													 lbn8.setIcon(gn8);
													 lbn8.setVisible(true);
													 Thread.sleep(1000);
													 
													 li17.setVisible(false);
													 li17.setIcon(g8);
													 li17.setVisible(true);
													 Thread.sleep(1000);
													 
													 lbn10.setVisible(false);
													 lbn10.setIcon(gn10);
													 lbn10.setVisible(true);
													 Thread.sleep(1000);
													 
													 li21.setVisible(false);
													 li21.setIcon(g11);
													 li21.setVisible(true);
													 Thread.sleep(1000);
													 
													 lbn13.setVisible(false);
													 lbn13.setIcon(gn13);
													 lbn13.setVisible(true);
													 Thread.sleep(1000);
													
													 li26.setVisible(false);
													 li26.setIcon(g14);
													 li26.setVisible(true);
													 Thread.sleep(1000);
													 funcnD(s1,dname,dip,endata);
													
												}
												else if(i==1)
												{
													 Statement stmt100 = con.createStatement();
														String sql100 = "select * from Nodesinfo where Nname='N7'  ";
														ResultSet rs100 = stmt100.executeQuery(sql100);
														if(rs100.next()==true)
														{
															
														String inj=rs100.getString(4);
													
													Decryption d = new Decryption();
													 String dec = d.decrypt(endata);
													String data=dec+inj;
													
													Encryption encryption = new Encryption();
													int edata[] = encryption.ecies_ex(data);
													
													 li16.setVisible(false);
													 li16.setIcon(g7);
													 li16.setVisible(true);
													 Thread.sleep(1000);
													 
													 lbn10.setVisible(false);
													 lbn10.setIcon(gn10);
													 lbn10.setVisible(true);
													 Thread.sleep(1000);
													 
													li20.setVisible(false);
													 li20.setIcon(g10);
													 li20.setVisible(true);
													 Thread.sleep(1000);
													 
													 lbn12.setVisible(false);
													 lbn12.setIcon(gn12);
													 lbn12.setVisible(true);
													 Thread.sleep(1000);
													
													li25.setVisible(false);
													 li25.setIcon(g5);
													 li25.setVisible(true);
													 Thread.sleep(1000);
													 
													 funcnD(s1,dname,dip,edata);
														}
												}
											}

											}}
									else if(rs5.next()==false)
									{
										 Socket sc1 = new Socket("localhost",303);
			            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
			            				 dout1.writeUTF("Passive");
			            				 dout1.writeUTF("N5");
			            				 
			            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
			            				 String msg1 = din1.readUTF();
			            				 
			            				 if(msg1.equalsIgnoreCase("success"))
			            				 {
										lbn5.setVisible(false);
										 lbn5.setIcon(rn5);
										 lbn5.setVisible(true);
										 Thread.sleep(1000);
										 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N5");
										Statement stmt2 = con.createStatement();
										String sql2 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N5'";
										stmt2.executeUpdate(sql2);
										
										lbn5.setVisible(false);
										 lbn5.setIcon(gn5);
										 lbn5.setVisible(true);
										 Thread.sleep(1000);
										 
										 li12.setVisible(false);
										 li12.setIcon(g11);
										 li12.setVisible(true);
										 Thread.sleep(1000);
										
										lbn8.setVisible(false);
										 lbn8.setIcon(gn8);
										 lbn8.setVisible(true);
										 Thread.sleep(1000);
										 
										 
										Statement stmt8 = con.createStatement();
										String sql8 = "select * from Nodesinfo where Nname='N8' and destip='"+dip+"'  ";
										ResultSet rs8 = stmt8.executeQuery(sql8);
										if(rs8.next()==true)
										{
											li17.setVisible(false);
											 li17.setIcon(g8);
											 li17.setVisible(true);
											 Thread.sleep(1000);
											 
											 lbn10.setVisible(false);
											 lbn10.setIcon(gn10);
											 lbn10.setVisible(true);
											 Thread.sleep(1000);
											 
											 
											Statement stmt10 = con.createStatement();
											String sql10 = "select * from Nodesinfo where Nname='N10' and destip='"+dip+"'  ";
											ResultSet rs10 = stmt10.executeQuery(sql10);
											if(rs10.next()==true)
											{
												li21.setVisible(false);
												 li21.setIcon(g11);
												 li21.setVisible(true);
												 Thread.sleep(1000);
												 
												 lbn13.setVisible(false);
												 lbn13.setIcon(gn13);
												 lbn13.setVisible(true);
												 Thread.sleep(1000);
												
												
												 
												Statement stmt13 = con.createStatement();
												String sql13 = "select * from Nodesinfo where Nname='N13' and destip='"+dip+"'  ";
												ResultSet rs13 = stmt13.executeQuery(sql13);
												if(rs13.next()==true)
												{
													 li26.setVisible(false);
													 li26.setIcon(g14);
													 li26.setVisible(true);
													 Thread.sleep(1000);
													 funcnD(s1,dname,dip,endata);
												}
												else if(rs13.next()==false)
												{
													 Socket sc11 = new Socket("localhost",303);
						            				 DataOutputStream dout11 = new DataOutputStream(sc11.getOutputStream());
						            				 dout11.writeUTF("Passive");
						            				 dout11.writeUTF("N13");
						            				 
						            				 DataInputStream din11 = new DataInputStream(sc11.getInputStream());
						            				 String msg11 = din11.readUTF();
						            				 
						            				 if(msg11.equalsIgnoreCase("success"))
						            				 {
													
						            					 Thread.sleep(1000);
													lbn13.setVisible(false);
													 lbn13.setIcon(rn13);
													 lbn13.setVisible(true);
													 Thread.sleep(1000);
													 
													 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N13");
													 
													Statement stmt21 = con.createStatement();
													String sql21 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N13'";
													stmt21.executeUpdate(sql21);
													
													lbn13.setVisible(false);
													 lbn13.setIcon(gn13);
													 lbn13.setVisible(true);
													 Thread.sleep(1000);
													li26.setVisible(false);
													 li26.setIcon(g14);
													 li26.setVisible(true);
													 Thread.sleep(1000);
													 funcnD(s1,dname,dip,endata);
												}
												}}
											else if(rs10.next()==false)
											{
												 Socket sc11 = new Socket("localhost",303);
					            				 DataOutputStream dout11 = new DataOutputStream(sc11.getOutputStream());
					            				 dout11.writeUTF("Passive");
					            				 dout11.writeUTF("N10");
					            				 
					            				 DataInputStream din11 = new DataInputStream(sc11.getInputStream());
					            				 String msg11 = din11.readUTF();
					            				 
					            				 if(msg11.equalsIgnoreCase("success"))
					            				 {
												lbn10.setVisible(false);
												 lbn10.setIcon(rn10);
												 lbn10.setVisible(true);
												 Thread.sleep(1000);
												 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N10");
												Statement stmt21 = con.createStatement();
												String sql21 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N10'";
												stmt21.executeUpdate(sql21);
												
												lbn10.setVisible(false);
												 lbn10.setIcon(gn10);
												 lbn10.setVisible(true);
												 Thread.sleep(1000);
												 li21.setVisible(false);
												 li21.setIcon(g11);
												 li21.setVisible(true);
												 Thread.sleep(1000);
												lbn13.setVisible(false);
												 lbn13.setIcon(gn13);
												 lbn13.setVisible(true);
												 Thread.sleep(1000);
												li26.setVisible(false);
												 li26.setIcon(g14);
												 li26.setVisible(true);
												 Thread.sleep(1000);
												 funcnD(s1,dname,dip,endata);
											}
											}}
										else if(rs8.next()==false)
										{
											 Socket sc11 = new Socket("localhost",303);
				            				 DataOutputStream dout11 = new DataOutputStream(sc11.getOutputStream());
				            				 dout11.writeUTF("Passive");
				            				 dout11.writeUTF("N8");
				            				 
				            				 DataInputStream din11 = new DataInputStream(sc11.getInputStream());
				            				 String msg11 = din11.readUTF();
				            				 
				            				 if(msg11.equalsIgnoreCase("success"))
				            				 {
											lbn8.setVisible(false);
											 lbn8.setIcon(rn8);
											 lbn8.setVisible(true);
											 Thread.sleep(1000);
											 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N8");
											Statement stmt21 = con.createStatement();
											String sql21 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N8'";
											stmt21.executeUpdate(sql21);
											
											lbn8.setVisible(false);
											 lbn8.setIcon(gn8);
											 lbn8.setVisible(true);
											 Thread.sleep(1000);
											 li17.setVisible(false);
											 li17.setIcon(g8);
											 li17.setVisible(true);
											 Thread.sleep(1000);
											lbn10.setVisible(false);
											 lbn10.setIcon(gn10);
											 lbn10.setVisible(true);
											 Thread.sleep(1000);
											 li21.setVisible(false);
											 li21.setIcon(g11);
											 li21.setVisible(true);
											 Thread.sleep(1000);
											lbn13.setVisible(false);
											 lbn13.setIcon(gn13);
											 lbn13.setVisible(true);
											 Thread.sleep(1000);
											li26.setVisible(false);
											 li26.setIcon(g14);
											 li26.setVisible(true);
											 Thread.sleep(1000);
											 funcnD(s1,dname,dip,endata);
										}
										}
									}
									}
									
							}
							else if(rs2.next()==false)
							{
								 Socket sc1 = new Socket("localhost",303);
	            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
	            				 dout1.writeUTF("Active");
	            				 dout1.writeUTF("N2");
	            				 
	            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
	            				 String msg1 = din1.readUTF();
	            				 
	            				 if(msg1.equalsIgnoreCase("success"))
	            				 {
								
	            					 Thread.sleep(1000);
								lbn2.setVisible(false);
								 lbn2.setIcon(rn2);
								 lbn2.setVisible(true);
								 Thread.sleep(1000);
								JOptionPane.showMessageDialog(null, "Active Attacker Found in N2");
								int i = JOptionPane.showConfirmDialog(null, "Do you want to Localise the Node");
								if(i==0)
								{
									Statement stmt2 = con.createStatement();
									String sql2 = "update Nodesinfo set status='Normal',sig='"+mac+"',injdata='null' where Nname='N2'";
									stmt2.executeUpdate(sql2);
									
									li2.setVisible(false);
									 li2.setIcon(g2);
									 li2.setVisible(true);
									 Thread.sleep(1000);
									
									li3.setVisible(false);
									 li3.setIcon(g3);
									 li3.setVisible(true);
									 Thread.sleep(1000);
									
									lbn3.setVisible(false);
									 lbn3.setIcon(gn3);
									 lbn3.setVisible(true);
									 Thread.sleep(1000);
									
									li8.setVisible(false);
									 li8.setIcon(g8);
									 li8.setVisible(true);
									 Thread.sleep(1000);
									
									 lbn5.setVisible(false);
									 lbn5.setIcon(gn5);
									 lbn5.setVisible(true);
									 Thread.sleep(1000);
									 
									 li12.setVisible(false);
									 li12.setIcon(g11);
									 li12.setVisible(true);
									 Thread.sleep(1000);
									
									lbn8.setVisible(false);
									 lbn8.setIcon(gn8);
									 lbn8.setVisible(true);
									 Thread.sleep(1000);
									 
									 li17.setVisible(false);
									 li17.setIcon(g8);
									 li17.setVisible(true);
									 Thread.sleep(1000);
									 
									 lbn10.setVisible(false);
									 lbn10.setIcon(gn10);
									 lbn10.setVisible(true);
									 Thread.sleep(1000);
									 
									 li21.setVisible(false);
									 li21.setIcon(g11);
									 li21.setVisible(true);
									 Thread.sleep(1000);
									 
									 lbn13.setVisible(false);
									 lbn13.setIcon(gn13);
									 lbn13.setVisible(true);
									 Thread.sleep(1000);
									
									 li26.setVisible(false);
									 li26.setIcon(g14);
									 li26.setVisible(true);
									 Thread.sleep(1000);
									 funcnD(s1,dname,dip,endata);
									
								}
								else if(i==1)
								{
									 Statement stmt100 = con.createStatement();
										String sql100 = "select * from Nodesinfo where Nname='N2'  ";
										ResultSet rs100 = stmt100.executeQuery(sql100);
										if(rs100.next()==true)
										{
											
										String inj=rs100.getString(4);
									
									Decryption d = new Decryption();
									 String dec = d.decrypt(endata);
									String data=dec+inj;
									
									Encryption encryption = new Encryption();
									int edata[] = encryption.ecies_ex(data);
									
									 
									 li7.setVisible(false);
									 li7.setIcon(g7);
									 li7.setVisible(true);
									 Thread.sleep(1000);
									 
									 lbn5.setVisible(false);
									 lbn5.setIcon(gn5);
									 lbn5.setVisible(true);
									 Thread.sleep(1000);
									
									li11.setVisible(false);
									 li11.setIcon(g10);
									 li11.setVisible(true);
									 Thread.sleep(1000);
									 
									 lbn7.setVisible(false);
									 lbn7.setIcon(gn7);
									 lbn7.setVisible(true);
									 Thread.sleep(1000);
									 
									li16.setVisible(false);
									 li16.setIcon(g7);
									 li16.setVisible(true);
									 Thread.sleep(1000);
									 
									 lbn10.setVisible(false);
									 lbn10.setIcon(gn10);
									 lbn10.setVisible(true);
									 Thread.sleep(1000);
									 
									li20.setVisible(false);
									 li20.setIcon(g10);
									 li20.setVisible(true);
									 Thread.sleep(1000);
									 
									 lbn12.setVisible(false);
									 lbn12.setIcon(gn12);
									 lbn12.setVisible(true);
									 Thread.sleep(1000);
									
									li25.setVisible(false);
									 li25.setIcon(g5);
									 li25.setVisible(true);
									 Thread.sleep(1000);
									 
									 funcnD(s1,dname,dip,edata);
										}
								}
							} 
							} }
					 
					 else  if(tn3<=tn2 && tn3<=tn1)
					 {
						 li3.setVisible(false);
						 li3.setIcon(g3);
						 li3.setVisible(true);
						 Thread.sleep(1000);
						
						lbn3.setVisible(false);
						 lbn3.setIcon(gn3);
						 lbn3.setVisible(true);
						 Thread.sleep(1000);
						 
						 DBCon db = new DBCon();
						 Connection con = db.getConnection();
						 Statement stmt = con.createStatement();
							String sql = "select * from Nodesinfo where Nname='N3' and destip='"+dip+"'  ";
							ResultSet rs3 = stmt.executeQuery(sql);
							if(rs3.next()==true)
							{
								
								li8.setVisible(false);
								 li8.setIcon(g8);
								 li8.setVisible(true);
								 Thread.sleep(1000);
								
								 lbn5.setVisible(false);
								 lbn5.setIcon(gn5);
								 lbn5.setVisible(true);
								 Thread.sleep(1000);
								 
								
								Statement stmt5 = con.createStatement();
								String sql5 = "select * from Nodesinfo where Nname='N5' and destip='"+dip+"'  ";
								ResultSet rs5 = stmt5.executeQuery(sql5);
								if(rs5.next()==true)
								{
									 li12.setVisible(false);
									 li12.setIcon(g11);
									 li12.setVisible(true);
									 Thread.sleep(1000);
									
									lbn8.setVisible(false);
									 lbn8.setIcon(gn8);
									 lbn8.setVisible(true);
									 Thread.sleep(1000);
									 
									 
									Statement stmt8 = con.createStatement();
									String sql8 = "select * from Nodesinfo where Nname='N8' and destip='"+dip+"'  ";
									ResultSet rs8 = stmt8.executeQuery(sql8);
									if(rs8.next()==true)
									{
										li17.setVisible(false);
										 li17.setIcon(g8);
										 li17.setVisible(true);
										 Thread.sleep(1000);
										 
										 lbn10.setVisible(false);
										 lbn10.setIcon(gn10);
										 lbn10.setVisible(true);
										 Thread.sleep(1000);
										 
										 
										Statement stmt10 = con.createStatement();
										String sql10 = "select * from Nodesinfo where Nname='N10' and destip='"+dip+"'  ";
										ResultSet rs10 = stmt10.executeQuery(sql10);
										if(rs10.next()==true)
										{
											li21.setVisible(false);
											 li21.setIcon(g11);
											 li21.setVisible(true);
											 Thread.sleep(1000);
											 
											 lbn13.setVisible(false);
											 lbn13.setIcon(gn13);
											 lbn13.setVisible(true);
											 Thread.sleep(1000);
											
											
											 
											Statement stmt13 = con.createStatement();
											String sql13 = "select * from Nodesinfo where Nname='N13' and destip='"+dip+"'  ";
											ResultSet rs13 = stmt13.executeQuery(sql13);
											if(rs13.next()==true)
											{
												 li26.setVisible(false);
												 li26.setIcon(g14);
												 li26.setVisible(true);
												 Thread.sleep(1000);
												 funcnD(s1,dname,dip,endata);
											}
											else if(rs13.next()==false)
											{
												 Socket sc1 = new Socket("localhost",303);
					            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
					            				 dout1.writeUTF("Passive");
					            				 dout1.writeUTF("N13");
					            				 
					            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
					            				 String msg1 = din1.readUTF();
					            				 
					            				 if(msg1.equalsIgnoreCase("success"))
					            				 {
												
					            					 Thread.sleep(1000);
												lbn13.setVisible(false);
												 lbn13.setIcon(rn13);
												 lbn13.setVisible(true);
												 Thread.sleep(1000);
												 
												 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N13");
												 
												Statement stmt2 = con.createStatement();
												String sql2 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N13'";
												stmt2.executeUpdate(sql2);
												
												lbn13.setVisible(false);
												 lbn13.setIcon(gn13);
												 lbn13.setVisible(true);
												 Thread.sleep(1000);
												li26.setVisible(false);
												 li26.setIcon(g14);
												 li26.setVisible(true);
												 Thread.sleep(1000);
												 funcnD(s1,dname,dip,endata);
											}
											}}
										else if(rs10.next()==false)
										{
											 Socket sc1 = new Socket("localhost",303);
				            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
				            				 dout1.writeUTF("Passive");
				            				 dout1.writeUTF("N10");
				            				 
				            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
				            				 String msg1 = din1.readUTF();
				            				 
				            				 if(msg1.equalsIgnoreCase("success"))
				            				 {
											lbn10.setVisible(false);
											 lbn10.setIcon(rn10);
											 lbn10.setVisible(true);
											 Thread.sleep(1000);
											 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N10");
											Statement stmt2 = con.createStatement();
											String sql2 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N10'";
											stmt2.executeUpdate(sql2);
											
											lbn10.setVisible(false);
											 lbn10.setIcon(gn10);
											 lbn10.setVisible(true);
											 Thread.sleep(1000);
											 li21.setVisible(false);
											 li21.setIcon(g11);
											 li21.setVisible(true);
											 Thread.sleep(1000);
											 
											 lbn13.setVisible(false);
											 lbn13.setIcon(gn13);
											 lbn13.setVisible(true);
											 Thread.sleep(1000);
											
											
											 
											Statement stmt13 = con.createStatement();
											String sql13 = "select * from Nodesinfo where Nname='N13' and destip='"+dip+"'  ";
											ResultSet rs13 = stmt13.executeQuery(sql13);
											if(rs13.next()==true)
											{
												 li26.setVisible(false);
												 li26.setIcon(g14);
												 li26.setVisible(true);
												 Thread.sleep(1000);
												 funcnD(s1,dname,dip,endata);
											}
											else if(rs13.next()==false)
											{
												 Socket sc11 = new Socket("localhost",303);
					            				 DataOutputStream dout11 = new DataOutputStream(sc11.getOutputStream());
					            				 dout11.writeUTF("Passive");
					            				 dout11.writeUTF("N13");
					            				 
					            				 DataInputStream din11 = new DataInputStream(sc11.getInputStream());
					            				 String msg11 = din11.readUTF();
					            				 
					            				 if(msg11.equalsIgnoreCase("success"))
					            				 {
												
					            					 Thread.sleep(1000);
												lbn13.setVisible(false);
												 lbn13.setIcon(rn13);
												 lbn13.setVisible(true);
												 Thread.sleep(1000);
												 
												 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N13");
												 
												Statement stmt21 = con.createStatement();
												String sql21 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N13'";
												stmt21.executeUpdate(sql21);
												
												lbn13.setVisible(false);
												 lbn13.setIcon(gn13);
												 lbn13.setVisible(true);
												 Thread.sleep(1000);
												li26.setVisible(false);
												 li26.setIcon(g14);
												 li26.setVisible(true);
												 Thread.sleep(1000);
												 funcnD(s1,dname,dip,endata);
											}
											}
										}
										}}
									else if(rs8.next()==false)
									{
										 Socket sc1 = new Socket("localhost",303);
			            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
			            				 dout1.writeUTF("Passive");
			            				 dout1.writeUTF("N8");
			            				 
			            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
			            				 String msg1 = din1.readUTF();
			            				 
			            				 if(msg1.equalsIgnoreCase("success"))
			            				 {
										lbn8.setVisible(false);
										 lbn8.setIcon(rn8);
										 lbn8.setVisible(true);
										 Thread.sleep(1000);
										 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N8");
										Statement stmt2 = con.createStatement();
										String sql2 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N8'";
										stmt2.executeUpdate(sql2);
										
										lbn8.setVisible(false);
										 lbn8.setIcon(gn8);
										 lbn8.setVisible(true);
										 Thread.sleep(1000);

											li17.setVisible(false);
											 li17.setIcon(g8);
											 li17.setVisible(true);
											 Thread.sleep(1000);
											 
											 lbn10.setVisible(false);
											 lbn10.setIcon(gn10);
											 lbn10.setVisible(true);
											 Thread.sleep(1000);
											 
											 
											Statement stmt10 = con.createStatement();
											String sql10 = "select * from Nodesinfo where Nname='N10' and destip='"+dip+"'  ";
											ResultSet rs10 = stmt10.executeQuery(sql10);
											if(rs10.next()==true)
											{
												li21.setVisible(false);
												 li21.setIcon(g11);
												 li21.setVisible(true);
												 Thread.sleep(1000);
												 
												 lbn13.setVisible(false);
												 lbn13.setIcon(gn13);
												 lbn13.setVisible(true);
												 Thread.sleep(1000);
												
												
												 
												Statement stmt13 = con.createStatement();
												String sql13 = "select * from Nodesinfo where Nname='N13' and destip='"+dip+"'  ";
												ResultSet rs13 = stmt13.executeQuery(sql13);
												if(rs13.next()==true)
												{
													 li26.setVisible(false);
													 li26.setIcon(g14);
													 li26.setVisible(true);
													 Thread.sleep(1000);
													 funcnD(s1,dname,dip,endata);
												}
												else if(rs13.next()==false)
												{
													 Socket sc11 = new Socket("localhost",303);
						            				 DataOutputStream dout11 = new DataOutputStream(sc11.getOutputStream());
						            				 dout11.writeUTF("Passive");
						            				 dout11.writeUTF("N13");
						            				 
						            				 DataInputStream din11 = new DataInputStream(sc11.getInputStream());
						            				 String msg11 = din11.readUTF();
						            				 
						            				 if(msg11.equalsIgnoreCase("success"))
						            				 {
													
						            					 Thread.sleep(1000);
													lbn13.setVisible(false);
													 lbn13.setIcon(rn13);
													 lbn13.setVisible(true);
													 Thread.sleep(1000);
													 
													 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N13");
													 
													Statement stmt21 = con.createStatement();
													String sql21 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N13'";
													stmt21.executeUpdate(sql21);
													
													lbn13.setVisible(false);
													 lbn13.setIcon(gn13);
													 lbn13.setVisible(true);
													 Thread.sleep(1000);
													li26.setVisible(false);
													 li26.setIcon(g14);
													 li26.setVisible(true);
													 Thread.sleep(1000);
													 funcnD(s1,dname,dip,endata);
												}
												}}
											else if(rs10.next()==false)
											{
												 Socket sc11 = new Socket("localhost",303);
					            				 DataOutputStream dout11 = new DataOutputStream(sc11.getOutputStream());
					            				 dout11.writeUTF("Passive");
					            				 dout11.writeUTF("N10");
					            				 
					            				 DataInputStream din11 = new DataInputStream(sc11.getInputStream());
					            				 String msg11 = din11.readUTF();
					            				 
					            				 if(msg11.equalsIgnoreCase("success"))
					            				 {
												lbn10.setVisible(false);
												 lbn10.setIcon(rn10);
												 lbn10.setVisible(true);
												 Thread.sleep(1000);
												 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N10");
												Statement stmt21 = con.createStatement();
												String sql21 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N10'";
												stmt21.executeUpdate(sql21);
												
												lbn10.setVisible(false);
												 lbn10.setIcon(gn10);
												 lbn10.setVisible(true);
												 Thread.sleep(1000);
												 li21.setVisible(false);
												 li21.setIcon(g11);
												 li21.setVisible(true);
												 Thread.sleep(1000);
												lbn13.setVisible(false);
												 lbn13.setIcon(gn13);
												 lbn13.setVisible(true);
												 Thread.sleep(1000);
												li26.setVisible(false);
												 li26.setIcon(g14);
												 li26.setVisible(true);
												 Thread.sleep(1000);
												 funcnD(s1,dname,dip,endata);
											}
											}
									}
									}}
								else if(rs5.next()==false)
								{
									 Socket sc1 = new Socket("localhost",303);
		            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
		            				 dout1.writeUTF("Passive");
		            				 dout1.writeUTF("N5");
		            				 
		            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
		            				 String msg1 = din1.readUTF();
		            				 
		            				 if(msg1.equalsIgnoreCase("success"))
		            				 {
									lbn5.setVisible(false);
									 lbn5.setIcon(rn5);
									 lbn5.setVisible(true);
									 Thread.sleep(1000);
									 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N5");
									Statement stmt2 = con.createStatement();
									String sql2 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N5'";
									stmt2.executeUpdate(sql2);
									
									lbn5.setVisible(false);
									 lbn5.setIcon(gn5);
									 lbn5.setVisible(true);
									 Thread.sleep(1000);
									 
									 li12.setVisible(false);
									 li12.setIcon(g11);
									 li12.setVisible(true);
									 Thread.sleep(1000);
									
									lbn8.setVisible(false);
									 lbn8.setIcon(gn8);
									 lbn8.setVisible(true);
									 Thread.sleep(1000);
									 
									 
									Statement stmt8 = con.createStatement();
									String sql8 = "select * from Nodesinfo where Nname='N8' and destip='"+dip+"'  ";
									ResultSet rs8 = stmt8.executeQuery(sql8);
									if(rs8.next()==true)
									{
										li17.setVisible(false);
										 li17.setIcon(g8);
										 li17.setVisible(true);
										 Thread.sleep(1000);
										 
										 lbn10.setVisible(false);
										 lbn10.setIcon(gn10);
										 lbn10.setVisible(true);
										 Thread.sleep(1000);
										 
										 
										Statement stmt10 = con.createStatement();
										String sql10 = "select * from Nodesinfo where Nname='N10' and destip='"+dip+"'  ";
										ResultSet rs10 = stmt10.executeQuery(sql10);
										if(rs10.next()==true)
										{
											li21.setVisible(false);
											 li21.setIcon(g11);
											 li21.setVisible(true);
											 Thread.sleep(1000);
											 
											 lbn13.setVisible(false);
											 lbn13.setIcon(gn13);
											 lbn13.setVisible(true);
											 Thread.sleep(1000);
											
											
											 
											Statement stmt13 = con.createStatement();
											String sql13 = "select * from Nodesinfo where Nname='N13' and destip='"+dip+"'  ";
											ResultSet rs13 = stmt13.executeQuery(sql13);
											if(rs13.next()==true)
											{
												 li26.setVisible(false);
												 li26.setIcon(g14);
												 li26.setVisible(true);
												 Thread.sleep(1000);
												 funcnD(s1,dname,dip,endata);
											}
											else if(rs13.next()==false)
											{
												 Socket sc11 = new Socket("localhost",303);
					            				 DataOutputStream dout11 = new DataOutputStream(sc11.getOutputStream());
					            				 dout11.writeUTF("Passive");
					            				 dout11.writeUTF("N13");
					            				 
					            				 DataInputStream din11 = new DataInputStream(sc11.getInputStream());
					            				 String msg11 = din11.readUTF();
					            				 
					            				 if(msg11.equalsIgnoreCase("success"))
					            				 {
												
					            					 Thread.sleep(1000);
												lbn13.setVisible(false);
												 lbn13.setIcon(rn13);
												 lbn13.setVisible(true);
												 Thread.sleep(1000);
												 
												 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N13");
												 
												Statement stmt21 = con.createStatement();
												String sql21 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N13'";
												stmt21.executeUpdate(sql21);
												
												lbn13.setVisible(false);
												 lbn13.setIcon(gn13);
												 lbn13.setVisible(true);
												 Thread.sleep(1000);
												li26.setVisible(false);
												 li26.setIcon(g14);
												 li26.setVisible(true);
												 Thread.sleep(1000);
												 funcnD(s1,dname,dip,endata);
											}
											}}
										else if(rs10.next()==false)
										{
											 Socket sc11 = new Socket("localhost",303);
				            				 DataOutputStream dout11 = new DataOutputStream(sc11.getOutputStream());
				            				 dout11.writeUTF("Passive");
				            				 dout11.writeUTF("N10");
				            				 
				            				 DataInputStream din11 = new DataInputStream(sc11.getInputStream());
				            				 String msg11 = din11.readUTF();
				            				 
				            				 if(msg11.equalsIgnoreCase("success"))
				            				 {
											lbn10.setVisible(false);
											 lbn10.setIcon(rn10);
											 lbn10.setVisible(true);
											 Thread.sleep(1000);
											 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N10");
											Statement stmt21 = con.createStatement();
											String sql21 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N10'";
											stmt21.executeUpdate(sql21);
											
											lbn10.setVisible(false);
											 lbn10.setIcon(gn10);
											 lbn10.setVisible(true);
											 Thread.sleep(1000);
											 li21.setVisible(false);
											 li21.setIcon(g11);
											 li21.setVisible(true);
											 Thread.sleep(1000);
											lbn13.setVisible(false);
											 lbn13.setIcon(gn13);
											 lbn13.setVisible(true);
											 Thread.sleep(1000);
											li26.setVisible(false);
											 li26.setIcon(g14);
											 li26.setVisible(true);
											 Thread.sleep(1000);
											 funcnD(s1,dname,dip,endata);
										}
										}}
									else if(rs8.next()==false)
									{
										 Socket sc11 = new Socket("localhost",303);
			            				 DataOutputStream dout11 = new DataOutputStream(sc11.getOutputStream());
			            				 dout11.writeUTF("Passive");
			            				 dout11.writeUTF("N8");
			            				 
			            				 DataInputStream din11 = new DataInputStream(sc11.getInputStream());
			            				 String msg11 = din11.readUTF();
			            				 
			            				 if(msg11.equalsIgnoreCase("success"))
			            				 {
										lbn8.setVisible(false);
										 lbn8.setIcon(rn8);
										 lbn8.setVisible(true);
										 Thread.sleep(1000);
										 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N8");
										Statement stmt21 = con.createStatement();
										String sql21 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N8'";
										stmt21.executeUpdate(sql21);
										
										lbn8.setVisible(false);
										 lbn8.setIcon(gn8);
										 lbn8.setVisible(true);
										 Thread.sleep(1000);
										 li17.setVisible(false);
										 li17.setIcon(g8);
										 li17.setVisible(true);
										 Thread.sleep(1000);
										lbn10.setVisible(false);
										 lbn10.setIcon(gn10);
										 lbn10.setVisible(true);
										 Thread.sleep(1000);
										 li21.setVisible(false);
										 li21.setIcon(g11);
										 li21.setVisible(true);
										 Thread.sleep(1000);
										lbn13.setVisible(false);
										 lbn13.setIcon(gn13);
										 lbn13.setVisible(true);
										 Thread.sleep(1000);
										li26.setVisible(false);
										 li26.setIcon(g14);
										 li26.setVisible(true);
										 Thread.sleep(1000);
										 funcnD(s1,dname,dip,endata);
									}
									}
								}
								}}
							else if(rs3.next()==false)
							{
								 Socket sc1 = new Socket("localhost",303);
	            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
	            				 dout1.writeUTF("Passive");
	            				 dout1.writeUTF("N3");
	            				 
	            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
	            				 String msg1 = din1.readUTF();
	            				 
	            				 if(msg1.equalsIgnoreCase("success"))
	            				 {
								lbn3.setVisible(false);
								 lbn3.setIcon(rn3);
								 lbn3.setVisible(true);
								 Thread.sleep(1000);
								 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N3");
								Statement stmt2 = con.createStatement();
								String sql2 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N3'";
								stmt2.executeUpdate(sql2);
								
								lbn3.setVisible(false);
								 lbn3.setIcon(gn3);
								 lbn3.setVisible(true);
								 Thread.sleep(1000);
								li8.setVisible(false);
								 li8.setIcon(g8);
								 li8.setVisible(true);
								 Thread.sleep(1000);
								
								 lbn5.setVisible(false);
								 lbn5.setIcon(gn5);
								 lbn5.setVisible(true);
								 Thread.sleep(1000);
								 
								
								Statement stmt5 = con.createStatement();
								String sql5 = "select * from Nodesinfo where Nname='N5' and destip='"+dip+"'  ";
								ResultSet rs5 = stmt5.executeQuery(sql5);
								if(rs5.next()==true)
								{
									 li12.setVisible(false);
									 li12.setIcon(g11);
									 li12.setVisible(true);
									 Thread.sleep(1000);
									
									lbn8.setVisible(false);
									 lbn8.setIcon(gn8);
									 lbn8.setVisible(true);
									 Thread.sleep(1000);
									 
									 
									Statement stmt8 = con.createStatement();
									String sql8 = "select * from Nodesinfo where Nname='N8' and destip='"+dip+"'  ";
									ResultSet rs8 = stmt8.executeQuery(sql8);
									if(rs8.next()==true)
									{
										li17.setVisible(false);
										 li17.setIcon(g8);
										 li17.setVisible(true);
										 Thread.sleep(1000);
										 
										 lbn10.setVisible(false);
										 lbn10.setIcon(gn10);
										 lbn10.setVisible(true);
										 Thread.sleep(1000);
										 
										 
										Statement stmt10 = con.createStatement();
										String sql10 = "select * from Nodesinfo where Nname='N10' and destip='"+dip+"'  ";
										ResultSet rs10 = stmt10.executeQuery(sql10);
										if(rs10.next()==true)
										{
											li21.setVisible(false);
											 li21.setIcon(g11);
											 li21.setVisible(true);
											 Thread.sleep(1000);
											 
											 lbn13.setVisible(false);
											 lbn13.setIcon(gn13);
											 lbn13.setVisible(true);
											 Thread.sleep(1000);
											
											
											 
											Statement stmt13 = con.createStatement();
											String sql13 = "select * from Nodesinfo where Nname='N13' and destip='"+dip+"'  ";
											ResultSet rs13 = stmt13.executeQuery(sql13);
											if(rs13.next()==true)
											{
												 li26.setVisible(false);
												 li26.setIcon(g14);
												 li26.setVisible(true);
												 Thread.sleep(1000);
												 funcnD(s1,dname,dip,endata);
											}
											else if(rs13.next()==false)
											{
												 Socket sc11 = new Socket("localhost",303);
					            				 DataOutputStream dout11 = new DataOutputStream(sc11.getOutputStream());
					            				 dout11.writeUTF("Passive");
					            				 dout11.writeUTF("N13");
					            				 
					            				 DataInputStream din11 = new DataInputStream(sc11.getInputStream());
					            				 String msg11 = din11.readUTF();
					            				 
					            				 if(msg11.equalsIgnoreCase("success"))
					            				 {
												
					            					 Thread.sleep(1000);
												lbn13.setVisible(false);
												 lbn13.setIcon(rn13);
												 lbn13.setVisible(true);
												 Thread.sleep(1000);
												 
												 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N13");
												 
												Statement stmt21 = con.createStatement();
												String sql21 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N13'";
												stmt21.executeUpdate(sql21);
												
												lbn13.setVisible(false);
												 lbn13.setIcon(gn13);
												 lbn13.setVisible(true);
												 Thread.sleep(1000);
												li26.setVisible(false);
												 li26.setIcon(g14);
												 li26.setVisible(true);
												 Thread.sleep(1000);
												 funcnD(s1,dname,dip,endata);
											}
											}}
										else if(rs10.next()==false)
										{
											 Socket sc11 = new Socket("localhost",303);
				            				 DataOutputStream dout11 = new DataOutputStream(sc11.getOutputStream());
				            				 dout11.writeUTF("Passive");
				            				 dout11.writeUTF("N10");
				            				 
				            				 DataInputStream din11 = new DataInputStream(sc11.getInputStream());
				            				 String msg11 = din11.readUTF();
				            				 
				            				 if(msg11.equalsIgnoreCase("success"))
				            				 {
											lbn10.setVisible(false);
											 lbn10.setIcon(rn10);
											 lbn10.setVisible(true);
											 Thread.sleep(1000);
											 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N10");
											Statement stmt21 = con.createStatement();
											String sql21 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N10'";
											stmt21.executeUpdate(sql21);
											
											lbn10.setVisible(false);
											 lbn10.setIcon(gn10);
											 lbn10.setVisible(true);
											 Thread.sleep(1000);
											 li21.setVisible(false);
											 li21.setIcon(g11);
											 li21.setVisible(true);
											 Thread.sleep(1000);
											lbn13.setVisible(false);
											 lbn13.setIcon(gn13);
											 lbn13.setVisible(true);
											 Thread.sleep(1000);
											li26.setVisible(false);
											 li26.setIcon(g14);
											 li26.setVisible(true);
											 Thread.sleep(1000);
											 funcnD(s1,dname,dip,endata);
										}
										}}
									else if(rs8.next()==false)
									{
										 Socket sc11 = new Socket("localhost",303);
			            				 DataOutputStream dout11 = new DataOutputStream(sc11.getOutputStream());
			            				 dout11.writeUTF("Passive");
			            				 dout11.writeUTF("N8");
			            				 
			            				 DataInputStream din11 = new DataInputStream(sc11.getInputStream());
			            				 String msg11 = din11.readUTF();
			            				 
			            				 if(msg11.equalsIgnoreCase("success"))
			            				 {
										lbn8.setVisible(false);
										 lbn8.setIcon(rn8);
										 lbn8.setVisible(true);
										 Thread.sleep(1000);
										 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N8");
										Statement stmt21 = con.createStatement();
										String sql21 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N8'";
										stmt21.executeUpdate(sql21);
										
										lbn8.setVisible(false);
										 lbn8.setIcon(gn8);
										 lbn8.setVisible(true);
										 Thread.sleep(1000);
										 li17.setVisible(false);
										 li17.setIcon(g8);
										 li17.setVisible(true);
										 Thread.sleep(1000);
										lbn10.setVisible(false);
										 lbn10.setIcon(gn10);
										 lbn10.setVisible(true);
										 Thread.sleep(1000);
										 li21.setVisible(false);
										 li21.setIcon(g11);
										 li21.setVisible(true);
										 Thread.sleep(1000);
										lbn13.setVisible(false);
										 lbn13.setIcon(gn13);
										 lbn13.setVisible(true);
										 Thread.sleep(1000);
										li26.setVisible(false);
										 li26.setIcon(g14);
										 li26.setVisible(true);
										 Thread.sleep(1000);
										 funcnD(s1,dname,dip,endata);
									}
									}}
								else if(rs5.next()==false)
								{
									 Socket sc11 = new Socket("localhost",303);
		            				 DataOutputStream dout11 = new DataOutputStream(sc11.getOutputStream());
		            				 dout11.writeUTF("Passive");
		            				 dout11.writeUTF("N5");
		            				 
		            				 DataInputStream din11 = new DataInputStream(sc11.getInputStream());
		            				 String msg11 = din11.readUTF();
		            				 
		            				 if(msg11.equalsIgnoreCase("success"))
		            				 {
									lbn5.setVisible(false);
									 lbn5.setIcon(rn5);
									 lbn5.setVisible(true);
									 Thread.sleep(1000);
									 JOptionPane.showMessageDialog(null, "Passive Attacker Found in N5");
									Statement stmt21 = con.createStatement();
									String sql21 = "update Nodesinfo set status='Normal',destip='"+dip+"' where Nname='N5'";
									stmt21.executeUpdate(sql21);
									
									 lbn5.setVisible(false);
									 lbn5.setIcon(gn5);
									 lbn5.setVisible(true);
									 Thread.sleep(1000);
									 li12.setVisible(false);
									 li12.setIcon(g11);
									 li12.setVisible(true);
									 Thread.sleep(1000);
									lbn8.setVisible(false);
									 lbn8.setIcon(gn8);
									 lbn8.setVisible(true);
									 Thread.sleep(1000);
									 li17.setVisible(false);
									 li17.setIcon(g8);
									 li17.setVisible(true);
									 Thread.sleep(1000);
									lbn10.setVisible(false);
									 lbn10.setIcon(gn10);
									 lbn10.setVisible(true);
									 Thread.sleep(1000);
									 li21.setVisible(false);
									 li21.setIcon(g11);
									 li21.setVisible(true);
									 Thread.sleep(1000);
									lbn13.setVisible(false);
									 lbn13.setIcon(gn13);
									 lbn13.setVisible(true);
									 Thread.sleep(1000);
									li26.setVisible(false);
									 li26.setIcon(g14);
									 li26.setVisible(true);
									 Thread.sleep(1000);
									 funcnD(s1,dname,dip,endata);
								}
								}}
											
							}
							}}
				
				}
				
				catch(Exception ex){
					System.out.println(ex);					
				}
			}
		}
	
		
	}
	
	
	public void funcnD(Socket s,String dname,String dip,int content[])
	{
		
		

		try
		{
			
			
			 
				 lbd1.setVisible(false);
					lbd1.setIcon(gd1);
					 lbd1.setVisible(true);
				
			 if(dname.equalsIgnoreCase("A"))   
             {
           	  Socket s3=new Socket(dip,101);
           	  
           	ObjectOutputStream oos = new ObjectOutputStream(s3.getOutputStream());
			oos.writeObject(content);
                    
                     DataInputStream dis = new DataInputStream(s3.getInputStream());
						String message = dis.readUTF();
						 DataOutputStream dout1=new DataOutputStream(s.getOutputStream());
                    dout1.writeUTF(message+" By A");
             }
             if(dname.equalsIgnoreCase("B"))   
             {
           	  Socket s3=new Socket(dip,102);
           	ObjectOutputStream oos = new ObjectOutputStream(s3.getOutputStream());
			oos.writeObject(content);
                   
                     DataInputStream dis = new DataInputStream(s3.getInputStream());
						String message = dis.readUTF();
						 DataOutputStream dout1=new DataOutputStream(s.getOutputStream());
                    dout1.writeUTF(message+" By B");
             }
             if(dname.equalsIgnoreCase("C"))   
             {
           	  Socket s3=new Socket(dip,103);
           	ObjectOutputStream oos = new ObjectOutputStream(s3.getOutputStream());
			oos.writeObject(content);
                    
                     DataInputStream dis = new DataInputStream(s3.getInputStream());
						String message = dis.readUTF();
						 DataOutputStream dout1=new DataOutputStream(s.getOutputStream());
                    dout1.writeUTF(message+" By C");
             }
             if(dname.equalsIgnoreCase("D"))   
             {
           	  Socket s3=new Socket(dip,104);
           	ObjectOutputStream oos = new ObjectOutputStream(s3.getOutputStream());
			oos.writeObject(content);
                    
                     DataInputStream dis = new DataInputStream(s3.getInputStream());
						String message = dis.readUTF();
						 DataOutputStream dout1=new DataOutputStream(s.getOutputStream());
                    dout1.writeUTF(message+" By D");
             }
             if(dname.equalsIgnoreCase("E"))   
             {
           	  Socket s3=new Socket(dip,105);
           	ObjectOutputStream oos = new ObjectOutputStream(s3.getOutputStream());
			oos.writeObject(content);
                
                     DataInputStream dis = new DataInputStream(s3.getInputStream());
						String message = dis.readUTF();
						 DataOutputStream dout1=new DataOutputStream(s.getOutputStream());
                    dout1.writeUTF(message+" By E");
             }
             if(dname.equalsIgnoreCase("F"))   
             {
           	  Socket s3=new Socket(dip,106);
           	ObjectOutputStream oos = new ObjectOutputStream(s3.getOutputStream());
			oos.writeObject(content);
                  
                     DataInputStream dis = new DataInputStream(s3.getInputStream());
						String message = dis.readUTF();
						 DataOutputStream dout1=new DataOutputStream(s.getOutputStream());
                    dout1.writeUTF(message+" By F");
             }
             Thread.sleep(2000);   
			refresh();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void refresh()
	{
		try
		{
			Thread.sleep(3000);
			l1.setVisible(false);
			l2.setVisible(false);
			l3.setVisible(false);
		
			
			 lbn1.setVisible(false);
			 lbn1.setIcon(bn1);
			 lbn1.setVisible(true);
			 
			 lbn2.setVisible(false);
			 lbn2.setIcon(bn2);
			 lbn2.setVisible(true);
			 
			 lbn3.setVisible(false);
			 lbn3.setIcon(bn3);
			 lbn3.setVisible(true);
			 
			 lbn4.setVisible(false);
			 lbn4.setIcon(bn4);
			 lbn4.setVisible(true);
			 
			 lbn5.setVisible(false);
			 lbn5.setIcon(bn5);
			 lbn5.setVisible(true);
			 
			 lbn6.setVisible(false);
			 lbn6.setIcon(bn6);
			 lbn6.setVisible(true);
			 
			 lbn7.setVisible(false);
			 lbn7.setIcon(bn7);
			 lbn7.setVisible(true);
			 
			 lbn8.setVisible(false);
			 lbn8.setIcon(bn8);
			 lbn8.setVisible(true);
			 
			 lbn9.setVisible(false);
			 lbn9.setIcon(bn9);
			 lbn9.setVisible(true);
			 
			 lbn10.setVisible(false);
			 lbn10.setIcon(bn10);
			 lbn10.setVisible(true);
			 
			 lbn11.setVisible(false);
			 lbn11.setIcon(bn11);
			 lbn11.setVisible(true);
			 
			 lbn12.setVisible(false);
			 lbn12.setIcon(bn12);
			 lbn12.setVisible(true);
			 
			 lbn13.setVisible(false);
			 lbn13.setIcon(bn13);
			 lbn13.setVisible(true);
			 
			
			 
			
			 
	 			li1.setVisible(false);
				 li1.setIcon(b1);
				 li1.setVisible(true);
				 
				 li2.setVisible(false);
				 li2.setIcon(b5);
				 li2.setVisible(true);
				 
				 li3.setVisible(false);
				 li3.setIcon(b3);
				 li3.setVisible(true);
				 
				 li4.setVisible(false);
				 li4.setIcon(b4);
				 li4.setVisible(true);
				 
				 li5.setVisible(false);
				 li5.setIcon(b4);
				 li5.setVisible(true);
				 
				 li6.setVisible(false);
				 li6.setIcon(b6);
				 li6.setVisible(true);
				 
				 li7.setVisible(false);
				 li7.setIcon(b7);
				 li7.setVisible(true);
				 
				 li8.setVisible(false);
				 li8.setIcon(b8);
				 li8.setVisible(true);
				 
				 li9.setVisible(false);
				 li9.setIcon(b4);
				 li9.setVisible(true);
				 
				 li10.setVisible(false);
				 li10.setIcon(b9);
				 li10.setVisible(true);
				 
				 li11.setVisible(false);
				 li11.setIcon(b10);
				 li11.setVisible(true);
				 
				 li12.setVisible(false);
				 li12.setIcon(b11);
				 li12.setVisible(true);
				 
				 li13.setVisible(false);
				 li13.setIcon(b4);
				 li13.setVisible(true);
				 
				 li14.setVisible(false);
				 li14.setIcon(b4);
				 li14.setVisible(true);
				 
				 li15.setVisible(false);
				 li15.setIcon(b6);
				 li15.setVisible(true);
				 
				 li16.setVisible(false);
				 li16.setIcon(b7);
				 li16.setVisible(true);
				 
				 li17.setVisible(false);
				 li17.setIcon(b8);
				 li17.setVisible(true);
				 
				 li18.setVisible(false);
				 li18.setIcon(b4);
				 li18.setVisible(true);
				 
				 li19.setVisible(false);
				 li19.setIcon(b9);
				 li19.setVisible(true);
				 
				 li20.setVisible(false);
				 li20.setIcon(b10);
				 li20.setVisible(true);
				 
				 li21.setVisible(false);
				 li21.setIcon(b11);
				 li21.setVisible(true);
				 
				 li22.setVisible(false);
				 li22.setIcon(b4);
				 li22.setVisible(true);
				 
				 li23.setVisible(false);
				 li23.setIcon(b4);
				 li23.setVisible(true);
				 
				 li24.setVisible(false);
				 li24.setIcon(b12);
				 li24.setVisible(true);
				 
				 li25.setVisible(false);
				 li25.setIcon(b5);
				 li25.setVisible(true);
				 
				 li26.setVisible(false);
				 li26.setIcon(b14);
				 li26.setVisible(true);
				 
				
				 
				
				
				 lbd1.setVisible(false);
					lbd1.setIcon(bd1);
					 lbd1.setVisible(true);
					 
					 lbs1.setVisible(false);
						lbs1.setIcon(bs1);
						 lbs1.setVisible(true);
			 
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}
	public static void main(String[] args) {
		//new Router();
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Router();
			}
		});
		
	}
	
	
}
