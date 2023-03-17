
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class Adversary_Manager extends JFrame implements ActionListener
{
	
	
	Container c;
	
	
	
	Font f1 = new Font("Times New Roman",Font.BOLD,18);
	
	Font f3 = new Font("Times New Roman",Font.BOLD,25);
	
	Font f2 = new Font("Times New Roman",Font.BOLD,16);
	
	
	JLabel status,info;
	JMenuBar mb;
	JMenu m;
	JMenuItem m1,m2,m3,mi1;
	
	
	ImageIcon i1 = new ImageIcon(this.getClass().getResource("1.png"));
	ImageIcon i12 = new ImageIcon(this.getClass().getResource("12.png"));
	ImageIcon i3 = new ImageIcon(this.getClass().getResource("3.png"));
	
	ImageIcon gl1 = new ImageIcon(this.getClass().getResource("gl1.png"));
	ImageIcon gl12 = new ImageIcon(this.getClass().getResource("gl12.png"));
	ImageIcon gl3 = new ImageIcon(this.getClass().getResource("gl3.png"));
	
	ImageIcon bgm = new ImageIcon(this.getClass().getResource("bim.png"));
	ImageIcon ggm = new ImageIcon(this.getClass().getResource("gim.png"));
	
	ImageIcon br = new ImageIcon(this.getClass().getResource("br.png"));
	ImageIcon gr = new ImageIcon(this.getClass().getResource("gr.png"));

	ImageIcon gg1 = new ImageIcon(this.getClass().getResource("gaa.png"));
	ImageIcon gg2 = new ImageIcon(this.getClass().getResource("gpa.png"));
	
	
	ImageIcon bg1 = new ImageIcon(this.getClass().getResource("baa.png"));
	ImageIcon bg2 = new ImageIcon(this.getClass().getResource("bpa.png"));
	
	
	ImageIcon rg1 = new ImageIcon(this.getClass().getResource("raa.png"));
	ImageIcon rg2 = new ImageIcon(this.getClass().getResource("rpa.png"));
	
	
	JLabel lbr,lbg1,lbg2,lbg3,lbgm,li1,li2,li3,li4;
	
	Adversary_Manager()
	{
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white);
		
		mb = new JMenuBar();
		m = new JMenu("File");
		
		m1 = new JMenuItem("Adversary Attacker Details");
		m2 = new JMenuItem("Exit");
	
		
		m.add(m1);
		m.add(m2);
	
		mb.add(m);
		
		Border b11=BorderFactory.createLineBorder(Color.black,2);
		TitledBorder b22=new TitledBorder(b11);
		b22.setTitle("Adversary Manager");
		b22.setTitleColor(Color.blue);
		b22.setTitleFont(f2);
		JLabel bord =new JLabel();
		bord.setBorder(b22);
		bord.setBackground(Color.black);
		bord.setBounds(10, 0, 550, 290);
		c.add(bord);
		
		lbr=new JLabel();
		lbr.setIcon(br);
		lbr.setBounds(30,50, 200, 200);
		c.add(lbr);
		
		li1=new JLabel();
		li1.setIcon(i12);
		li1.setBounds(115,50, 200, 200);
		c.add(li1);

		lbgm=new JLabel();
		lbgm.setIcon(bgm);
		lbgm.setBounds(200,50, 200, 200);
		c.add(lbgm);
		
		li2=new JLabel();
		li2.setIcon(i1);
		li2.setBounds(290,-10, 200, 200);
		c.add(li2);
		
		li3=new JLabel();
		li3.setIcon(i12);
		li3.setBounds(300,50, 200, 200);
		//c.add(li3);
		
		li4=new JLabel();
		li4.setIcon(i3);
		li4.setBounds(290,110, 200, 200);
		c.add(li4);
		
		lbg1=new JLabel();
		lbg1.setIcon(bg1);
		lbg1.setBounds(400,-50, 200, 200);
		c.add(lbg1);
		
		
		
		lbg3=new JLabel();
		lbg3.setIcon(bg2);
		lbg3.setBounds(400,150, 200, 200);
		c.add(lbg3);
		
		 setJMenuBar(mb);
		 m1.addActionListener(this);
		
		 m2.addActionListener(this);
		
		setTitle("Adversary Manager::A Probabilistic Source Location Privacy Protection Scheme in Wireless Sensor Networks");
		
		
		
	
		
		
		
		
		setSize(600,380);
		setVisible(true);
		
		int[] ports = new int[]{303};
		
		
		for(int i=0;i<1;i++)
		{
			Thread th = new Thread(new portlistener(ports[i]));
			th.start();
		}
		
		
		
	}
	
	
	public class portlistener implements Runnable
	{
		int port;
		
		portlistener(int port)
		{
			this.port=port;
		}
		
		public void run()
		{

			
			
			
			

			if(this.port==303)
			{
				
				try
				{
					DBCon db = new DBCon();
					 Connection con = db.getConnection();
					
					ServerSocket sc = new ServerSocket(303);
					while(true)
					{
						Socket s = sc.accept();
						DataInputStream din = new DataInputStream(s.getInputStream());
					String at = din.readUTF();
					String node = din.readUTF();
					if(at.equalsIgnoreCase("Active"))
					{
						lbr.setVisible(false);
						lbr.setIcon(gr);
						lbr.setVisible(true);
						Thread.sleep(1000);
						
						li1.setVisible(false);
						li1.setIcon(gl12);
						li1.setVisible(true);
						Thread.sleep(1000);
						lbgm.setVisible(false);
						lbgm.setIcon(ggm);
						lbgm.setVisible(true);
						Thread.sleep(1000);
						li2.setVisible(false);
						li2.setIcon(gl1);
						li2.setVisible(true);
						Thread.sleep(1000);
						lbg1.setVisible(false);
						lbg1.setIcon(gg1);
						lbg1.setVisible(true);
						Thread.sleep(1000);
						
					
					
						Statement stmt = con.createStatement();
						SimpleDateFormat sdfDate = new SimpleDateFormat(
								"dd/MM/yyyy");
						SimpleDateFormat sdfTime = new SimpleDateFormat(
								"HH:mm:ss");

						Date now = new Date();

						String strDate = sdfDate.format(now);
						String strTime = sdfTime.format(now);
						String dt = strDate + "   " + strTime;
						
						String sql1 = "insert into status values('"+at+"','"+node+"','"+dt+"')";
						stmt.executeUpdate(sql1);
						 JOptionPane.showMessageDialog(null, "Adversary Attacker Found in " +node);
						Thread.sleep(1000);
						
							lbg1.setVisible(false);
							lbg1.setIcon(rg1);
							lbg1.setVisible(true);
							Thread.sleep(1000);
							DataOutputStream dout = new DataOutputStream(s.getOutputStream());
							dout.writeUTF("success");
							
							Thread.sleep(3000);
							refresh();
						
						
					}
					if(at.equalsIgnoreCase("Passive"))
					{
						lbr.setVisible(false);
						lbr.setIcon(gr);
						lbr.setVisible(true);
						Thread.sleep(1000);
						li1.setVisible(false);
						li1.setIcon(gl12);
						li1.setVisible(true);
						Thread.sleep(1000);
						lbgm.setVisible(false);
						lbgm.setIcon(ggm);
						lbgm.setVisible(true);
						Thread.sleep(1000);
						li4.setVisible(false);
						li4.setIcon(gl3);
						li4.setVisible(true);
						Thread.sleep(1000);
						lbg3.setVisible(false);
						lbg3.setIcon(gg2);
						lbg3.setVisible(true);
						Thread.sleep(1000);
						
						
						Statement stmt = con.createStatement();
						SimpleDateFormat sdfDate = new SimpleDateFormat(
								"dd/MM/yyyy");
						SimpleDateFormat sdfTime = new SimpleDateFormat(
								"HH:mm:ss");

						Date now = new Date();

						String strDate = sdfDate.format(now);
						String strTime = sdfTime.format(now);
						String dt = strDate + "   " + strTime;
						
						String sql1 = "insert into status values('"+at+"','"+node+"','"+dt+"')";
						stmt.executeUpdate(sql1);
						
						 JOptionPane.showMessageDialog(null, "Adversary Attacker Found in " +node);
						Thread.sleep(1000);
						
						
						
							lbg3.setVisible(false);
							lbg3.setIcon(rg2);
							lbg3.setVisible(true);
							Thread.sleep(1000);
							DataOutputStream dout = new DataOutputStream(s.getOutputStream());
							dout.writeUTF("success");
							Thread.sleep(3000);
							refresh();
						
						
						
					}
						
					
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			
			

		
		
}
}

	
	
	
	
	
	public void actionPerformed(ActionEvent e)
	{
			
		if(e.getSource()==m2)
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
					new Attacker_details();
				}
			});
		}
		
		
	}
	
	public void refresh()
	{
		try
		{
			lbr.setVisible(false);
			lbr.setIcon(br);
			lbr.setVisible(true);
			
			li1.setVisible(false);
			li1.setIcon(i12);
			li1.setVisible(true);

			lbgm.setVisible(false);
			lbgm.setIcon(bgm);
			lbgm.setVisible(true);
			
			li2.setVisible(false);
			li2.setIcon(i1);
			li2.setVisible(true);
			
			li3.setVisible(false);
			li3.setIcon(i12);
			li3.setVisible(true);
			
			li4.setVisible(false);
			li4.setIcon(i3);
			li4.setVisible(true);
			
			lbg1.setVisible(false);
			lbg1.setIcon(bg1);
			lbg1.setVisible(true);
			
			lbg3.setVisible(false);
			lbg3.setIcon(bg2);
			lbg3.setVisible(true);
			
			
	
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
				new Adversary_Manager();
			}
		});
	}
	
	

}
