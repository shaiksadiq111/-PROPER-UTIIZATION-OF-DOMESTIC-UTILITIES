import java.awt.*;
import javax.swing.*;
import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*; 
 import java.util.Scanner;  
 import java.util.Random;  
 import java.lang.Exception;
 
import javax.swing.plaf.LayerUI;

import java.io.*;
import java.util.*;





import java.util.*;

class Emp implements Serializable
{
	int oil;
	int sugar;
	int senamon;
	int rice;
	
}






class Demo extends JFrame implements ActionListener
{
	
	
	
	
	
	JFrame f1,f2,f3,f4,f5,f6,f7,f8,f9;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b34,b50,b101,b102,b103,b104,b111;
		JTextField tf119,tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20,tf21,tf22,tf23,tf24,tf25,tf26,tf27,tf28,tf29,tf30,tf31,tf32,tf33,tf34,tf35,tf36,tf37,tf38,tf39,tf40,tf41,tf42,tf43,tf44,tf45,tf46,tf47,tf48,tf49,tf50,tf51,tf52,tf53,tf54,tf55,tf56,tf57;
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l100,l101,
		l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47,l50,l90;
	
	
	
	
	Emp obj[]=new Emp[100];

	
	Demo()
	{
		f1=new JFrame("frame 1");
		Font f=new Font("erif",Font.BOLD,30);
		
		JPanel heading;
		heading=new JPanel();
		heading.setBackground(new Color(0,0,0,80));
		
		
		
		heading.setBounds(0,0,900,100);
		
		JLabel name=new JLabel("Login");
		name.setForeground(Color.WHITE);
	name.setBounds(200,50,400,50);
		name.setFont(f);
		heading.add(name);
		
		
		//heading.setBackground(Color.blue);
		//heading.setBackground(Color.blue);
		//heading.setBounds(0,0,900,100);
		
		
		JPanel login=new JPanel();
		login.setLayout(null);
		
		login.setSize(400,350);
		login.setBackground(new Color(0,0,0,60));
		login.setBounds(250,175,400,350);
		
		
		 tf119=new JTextField();
		tf119.setBounds(50,100,300,50);
		
		tf119.setForeground(Color.BLACK);
		tf119.setBackground(Color.WHITE);
		login.add(tf119);
		
		JPasswordField password=new JPasswordField();
		password.setBackground(Color.WHITE);
	
		password.setForeground(Color.BLACK);
		
			password.setBounds(50,170,300,50);
		login.add(password);
		
		JButton signup=new JButton("Sign Up");
		signup.setBounds(50,250,100,50);
		signup.setBackground(Color.cyan);
		login.add(signup);
		
		b34=new JButton("Login");
		b34.setBounds(250,250,100,50);
		
		b34.setBackground(Color.cyan);
		login.add(b34);
		b34.addActionListener(this);
		
		
		
		
		
		
		f1.setSize(900,600);
		f1.setLayout(null);
		f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon background_image=new ImageIcon("sadiq3.jpg");
		Image img=background_image.getImage();
		Image temp_img=img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
		background_image=new ImageIcon(temp_img);
		JLabel background=new JLabel("",background_image,JLabel.CENTER);
		
		background.add(login);
		background.add(heading);
		background.setBounds(0,0,900,600);
	f1.add(background);
		f1.setVisible(true);
	}
	
	
	
	
	
	int u=-1;

int Grains[]=new int[100];
int Pulses[]=new int[100];
int Oils[]=new int[100];
int Spices[]=new int[100];
int Baking[]=new int[100];
int Snacks[]=new int[100];
int Cleaning[]=new int[100];
int Vegitables[]=new int[100];


int n=0;
int Month[]=new int[100];


int savings=0;
int Actual_Grain=3000;
int Actual_Pulses=2000;
int Actual_Oil=3000;
int Actual_Spices=1000;
int Actual_Baking=1000;
int Actual_Snacks=500;
int Actual_Cleaning=2000;
int Actual_Vegitables=4000;
	
	
		
	 int totalgrains=0,totalpulses=0,totaloils=0,totalbaking=0,totalsnacks=0,totalcleaning=0,totalvegetables=0;
			 int month_wise[]=new int[100];
			 
	
	
	
	
	
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		
		
			
		
if(ae.getSource()==b34)
 {
		

				
				f2=new JFrame("frame 2");
			f1.setVisible(false);
			
			
			
			String ch;
			ch=tf119.getText();
			if(ch.equals("sadiq"))
			{
			
			
			
			
			
		
		

		
		
		l1=new JLabel("Enter Cost of Grains & Tiffin Iteams Consumption");
		l1.setForeground(Color.green);
	
		Font font=new Font("lucida",Font.BOLD,20);
		l1.setFont(font);
		
		l1.setBounds(50,50,1000,30);
		f2.add(l1);
		
		tf1=new JTextField();
		tf1.setBounds(50,80,100,30);
		f2.add(tf1);
		
		
		
		
		
		
		
		l2=new JLabel("Enter Cost of Pulses Consumption");
		l2.setForeground(Color.green);
		
			Font font1=new Font("lucida",Font.BOLD,20);
		l2.setFont(font1);
		l2.setBounds(50,110,1000,30);
		f2.add(l2);
		
		tf2=new JTextField();
		tf2.setBounds(50,140,100,30);
		f2.add(tf2);
		
		
		

		
		
		
		
		l3=new JLabel("Enter Cost of Oils ");
		l3.setForeground(Color.green);
		l3.setBounds(50,170,1000,30);
		f2.add(l3);
			Font font2=new Font("lucida",Font.BOLD,20);
		l3.setFont(font2);
		
		tf3=new JTextField();
		tf3.setBounds(50,200,100,30);
		f2.add(tf3);
		
		
		
		
		
		
		
		
		l4=new JLabel("Enter the cost Beverages,Spices & Condiments");
		l4.setForeground(Color.green);
		l4.setBounds(50,230,1000,30);
		f2.add(l4);
			Font font3=new Font("lucida",Font.BOLD,20);
		l4.setFont(font3);
		
		tf4=new JTextField();
		tf4.setBounds(50,260,100,30);
		f2.add(tf4);
		
		
		l5=new JLabel("Enter cost Nuts,Seeds,Dry Fruits & Baking Iteams");
		l5.setForeground(Color.green);
		l5.setBounds(50,290,1000,30);
			Font font4=new Font("lucida",Font.BOLD,20);
		l5.setFont(font4);
		f2.add(l5);
		
		tf5=new JTextField();
		tf5.setBounds(50,320,100,30);
		f2.add(tf5);
		
		
		
		
		l6=new JLabel("Enter Cost of Snacks");
		l6.setForeground(Color.green);
		l6.setBounds(50,360,1000,30);
		f2.add(l6);
			Font font5=new Font("lucida",Font.BOLD,20);
		l6.setFont(font5);
		
		tf6=new JTextField();
		tf6.setBounds(50,390,100,30);
		f2.add(tf6);
		
		l7=new JLabel("Enter Cost fof Cleaning Products ");
		l7.setForeground(Color.green);
		l7.setBounds(50,430,1000,30);
		f2.add(l7);
			Font font6=new Font("lucida",Font.BOLD,20);
		l7.setFont(font6);
		
		tf7=new JTextField();
		tf7.setBounds(50,460,100,30);
		f2.add(tf7);
		
		
		
		l8=new JLabel("Enter cost of vegetables");
		l8.setForeground(Color.green);
		l8.setBounds(50,490,1000,30);
			Font font7=new Font("lucida",Font.BOLD,20);
		l8.setFont(font7);
		f2.add(l8);
		
		tf8=new JTextField();
		tf8.setBounds(50,520,100,30);
		f2.add(tf8);
		
		
		
		
		
		
		  l24=new JLabel("Enter the salalary:");
		  l24.setForeground(Color.green);
			l24.setBounds(500,490,1000,30);
				Font font8=new Font("lucida",Font.BOLD,20);
		l24.setFont(font8);
		   f2.add(l24);
		   
		   	tf11=new JTextField();
		tf11.setBounds(500,520,100,30);
		f2.add(tf11);
		
		
		
		
		
		
		
		
		
	
		
		
		b5=new JButton("SUBMIT");
		b5.setBounds(50,550,100,30);
		b5.setForeground(Color.red);
		f2.add(b5);
		b5.addActionListener(this);
		
		b7=new JButton("CLEAR");
		b7.setBounds(500,550,100,30);
		b7.setForeground(Color.red);
		f2.add(b7);
		b7.addActionListener(this);
		
		
		
		
		
		
		l5=new JLabel("Display list");
		l5.setBounds(50,580,1000,30);
		f2.add(l5);
		
			tf9=new JTextField();
		tf9.setBounds(50,610,100,30);
		f2.add(tf9);
		
			b6=new JButton("press");
		b6.setBounds(50,640,100,30);
		b6.setForeground(Color.red);
		f2.add(b6);
		b6.addActionListener(this);
		
		
		
		
		
		
		
		
		ImageIcon background_image1=new ImageIcon("sadiq15.jpg");
		Image img1=background_image1.getImage();
		Image temp_img1=img1.getScaledInstance(1000,1000,Image.SCALE_SMOOTH);
		background_image1=new ImageIcon(temp_img1);
		JLabel background1=new JLabel("",background_image1,JLabel.CENTER);
		
		
		
		
	
		background1.setBounds(0,0,1000,1000);
	f2.add(background1);
		
		
		
		
		
		
		
		f2.setLayout(null);
		f2.setSize(1000,1000);
		f2.setVisible(true);
		
		
		
		
		
		
	
			}
		
		
			
		}
		
		
		
		
if(ae.getSource()==b8)
{
	
	f4=new JFrame("frame 3");
	f4.setSize(700,700);
	f4.setBackground(Color.green);
	f4.setLayout(null);
	
	
	
	
	
	
	 l34=new JLabel("1.Grains");
	 l34.setBounds(200,200,300,50);
	 f4.add(l34);
	 
	 	Font font9=new Font("lucida",Font.BOLD,20);
		l34.setFont(font9);
	 
	 l34.setForeground(Color.red);
	 
	l35=new JLabel("2.Oils");
	 l35.setBounds(200,230,300,50);
	 f4.add(l35);
	 l35.setForeground(Color.red);
	
	Font font15=new Font("lucida",Font.BOLD,20);
		l35.setFont(font15);
	
	l36=new JLabel("3.Spices");
	 l36.setBounds(200,260,300,50);
	 f4.add(l36);
	 l36.setForeground(Color.red);
	
		Font font10=new Font("lucida",Font.BOLD,20);
		l36.setFont(font10);
 l37=new JLabel("4.Baking");
  l37.setBounds(200,290,300,50);
	 f4.add(l37);
	 
	 
	 
	 Font font16=new Font("lucida",Font.BOLD,20);
		l37.setFont(font16);
	 
	 
	 l37.setForeground(Color.red);
 
l38=new JLabel ("5.Snacks");
 l38.setBounds(200,320,300,50);
	 f4.add(l38);
	 l38.setForeground(Color.red);
	Font font11=new Font("lucida",Font.BOLD,20);
		l38.setFont(font11);

 l39=new JLabel("6.Cleaning");
  l39.setBounds(200,350,300,50);
	 f4.add(l39);
	 l39.setForeground(Color.red);
 
 Font font12=new Font("lucida",Font.BOLD,20);
		l39.setFont(font12);
 
 l40=new JLabel("7.Vegitables");
  l40.setBounds(200,380,300,50);
	 f4.add(l40);
	 l40.setForeground(Color.red);
 
 Font font13=new Font("lucida",Font.BOLD,20);
		l40.setFont(font13);
	
	
	b15=new JButton("Home Page");
	b15.setBounds(200,450,200,50);
	f4.add(b15);
	b15.setBackground(Color.blue);
	
	
	
	
	
	
	
		ImageIcon background_image4=new ImageIcon("sadiq21.jpg");
		Image img4=background_image4.getImage();
		Image temp_img4=img4.getScaledInstance(1000,1000,Image.SCALE_SMOOTH);
		background_image4=new ImageIcon(temp_img4);
		JLabel background4=new JLabel("",background_image4,JLabel.CENTER);
		
		
		
		
	
		background4.setBounds(0,0,1000,1000);
	f4.add(background4);
		
	
	
	
	
	
	 
	 b15.addActionListener(this);
	 
	 
	 f4.setVisible(true);
	
	
	
	
}
if(ae.getSource()==b9)
		{
			int n=Integer.parseInt(tf9.getText());
			
			       Emp obj1[]=new Emp[100];
			  
	 
		for(int c=0;c<n;c++)
		{
			FileInputStream fis= new FileInputStream("hund.txt");
		     ObjectInputStream ois = new ObjectInputStream(fis);
			
			obj1[c]=new Emp();
	   obj1[c]=(Emp)ois.readObject();
		}
		
			 
			// int totalgrains=0,totalpulses=0,totaloils=0,totalbaking=0,totalsnacks=0,totalcleaning=0,totalvegetables=0;
			 //int month_wise[]=new int[100];
			 
			 for(int c=0;c<n;c++)
			 {
				 totalgrains=totalgrains+Grains[c];
				 totalpulses=totalpulses+Pulses[c];
				 totaloils=totaloils+Oils[c];
				 totalbaking=totalbaking+Baking[c];
				 totalsnacks=totalsnacks+Snacks[c];
				 totalcleaning=totalcleaning+Cleaning[c];
				 totalvegetables=totalvegetables+Vegitables[c];
				 month_wise[c]=Grains[c]+Pulses[c]+Oils[c]+Baking[c]+Snacks[c]+Cleaning[c];
				 System.out.println("month"+(c+1)+"="+month_wise[c]);
				
				 
			 }
			 int max=-1;
			 int index=0;
			 
			 for(int c=0;c<n;c++)
			 {
				 if(month_wise[c]>max)
				 {
					 max=month_wise[c];
					 index=c+1;
					 
				 }
			 }
			 
			 
			 
			 
			 
			 
			 
			 
			 
			tf10=new JTextField();
			 tf10.setBounds(500,200,50,30);
			 f2.add(tf10);
			 
			 
		 
String s=String.valueOf(index);
			 
			 tf10.setText(s);
			  l23=new JLabel("--->MONTH CONSUMPTION IS MORE");
			l23.setBounds(550,200,1000,30);
			l23.setForeground(Color.red);
		   f2.add(l23);
		   
		 
		  
	
	
		   
			 
			 
			
			 System.out.println("");
			  System.out.println("");
			   System.out.println("");
			   int savings=0;
			   
			 
			 
			 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			f5=new JFrame("frame 5");
			f5.setSize(900,900);
					f5.setVisible(true);
			
				    tf22=new JTextField();
					tf22.setBounds(30,30,900,30);
					f5.add(tf22);
					
					tf23=new JTextField();
					tf23.setBounds(30,70,900,30);
					f5.add(tf23);
					
					tf24=new JTextField();
					tf24.setBounds(30,100,900,30);
					f5.add(tf24);
					
					tf25=new JTextField();
					tf25.setBounds(30,140,900,30);
					f5.add(tf25);
					
					tf26=new JTextField();
					tf26.setBounds(30,170,900,30);
					f5.add(tf26);
		
		
		b101=new JButton("GO TO MENU");
		b101.setBounds(30,250,100,30);
		b101.setBackground(Color.blue);
		b101.setForeground(Color.red);
		f5.add(b101);
		b101.addActionListener(this);
		
		
		
		
		
				
			
			
			for(int i=0;i<n;i++)
			        {
						 System.out.println((i+1)+"  month Expendicture="+month_wise[i]+" Salary="+Month[i]);
				System.out.println("Grains="+Grains[i]+"+Pulses="+Pulses[i]+"+Oils="+Oils[i]+"+Spices="+Spices[i]+"+Baking="+Baking[i]+"+Snacks="+Snacks[i]+"+Cleaning="+Cleaning[i]+"+Vegitables="+Vegitables[i]);
				System.out.println("TOTAL="+month_wise[i]);
				System.out.println("Savings="+(Month[i]-month_wise[i]));
				 System.out.println("*****************************************************");
				savings=savings+(Month[i]-month_wise[i]);
				 	 
			
				
			       }
				   
				  System.out.println("TOTAL SAVINGS:"+savings);
				 
				  	  tf22.setText("1month expendicture="+String.valueOf(month_wise[0])+" Salary="+String.valueOf(Month[0])+"  2month expendicture="+String.valueOf(month_wise[1])+" Salary="+String.valueOf(Month[1]));
				  
				  tf23.setText("Grains="+String.valueOf(Grains[0])+" Pulses="+String.valueOf(Pulses[0])+" Oils="+String.valueOf(Oils[0])+" Spices="+String.valueOf(Spices[0])+" Baking="+String.valueOf(Baking[0])+" Snacks="+String.valueOf(Snacks[0])+" Cleaning="+String.valueOf(Cleaning[0])+" Vegitables="+String.valueOf(Vegitables[0]));
				   
				   tf24.setText("1TOTAL="+String.valueOf(month_wise[0])+" 2TOTAL="+String.valueOf(month_wise[1]));
				   tf25.setText("1savings="+String.valueOf((Month[0]-month_wise[0]))+" 2savings="+String.valueOf((Month[0]-month_wise[0])));
				   
				   tf26.setText("Total savings="+String.valueOf(savings));

					
					f5.setLayout(null);
					
				
					
					
					
					
					
				 
		
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		if(ae.getSource()==b101)
		{
			f5.setVisible(false);
			f3.setVisible(true);
			
		}
		
		
		
		if(ae.getSource()==b10)
		{
			
			
			f6=new JFrame("frame f6");
			f6.setSize(900,900);
			f6.setLayout(null);
				   System.out.println("Grains="+totalgrains);
				   System.out.println("Pulses="+totalpulses);
				    System.out.println("Oils="+totaloils);
					System.out.println("Baking="+totalbaking);
						System.out.println("Snacks="+totalsnacks);
						System.out.println("Cleaning="+totalcleaning);
						System.out.println("vegetables="+totalvegetables);
						
						
					 System.out.println("*****************************************************");
					 
					tf27=new JTextField();
					tf27.setBounds(30,30,700,30);
					f6.add(tf27);
					
					tf28=new JTextField();
					tf28.setBounds(30,70,700,30);
					f6.add(tf28);
					
					tf29=new JTextField();
					tf29.setBounds(30,110,700,30);
					f6.add(tf29);
					
					
					tf30=new JTextField();
					tf30.setBounds(30,150,700,30);
					f6.add(tf30);
					
					tf31=new JTextField();
					tf31.setBounds(30,190,700,30);
					f6.add(tf31);
					
					tf32=new JTextField();
					tf32.setBounds(30,230,700,30);
					f6.add(tf32);
					
					b102=new JButton("Go To Menu");
					b102.setBounds(30,290,100,30);
					b102.setBackground(Color.blue);
					b102.setForeground(Color.red);
					f6.add(b102);
					b102.addActionListener(this);
					
					tf27.setText("Grains="+String.valueOf(totalgrains));
					tf28.setText("Pulses="+String.valueOf(totalpulses));
					tf29.setText("Oils="+String.valueOf(totaloils));
					tf30.setText("Snacks="+String.valueOf(totalsnacks));
					tf31.setText("Cleaning="+String.valueOf(totalcleaning));
					tf32.setText("Vegitables="+String.valueOf(totalvegetables));
					
					
				   
			
			
			
			
			
			
			
			
			
			
			
			
			
	
			
			f6.setVisible(true);
		}
		if(ae.getSource()==b102)
		{
			f6.setVisible(false);
			f3.setVisible(true);
			
			
		}
		if(ae.getSource()==b11)
		{
			f7=new JFrame("frame 7");
			f7.setSize(900,900);
			f7.setLayout(null);
			
			
			for(int i=0;i<n;i++)
				 {
				 System.out.println("Actual Grain limit="+Actual_Grain+"  Used="+Grains[i]);
				  System.out.println("Actual Pulses limit="+Actual_Pulses+"  Used="+Pulses[i]);
				   System.out.println("Actual Oils limit="+Actual_Oil+"  Used="+Oils[i]);
				    System.out.println("Actual Baking limit="+Actual_Baking+"  Used="+Baking[i]);
					 System.out.println("Actual Snacks limit="+Actual_Snacks+"  Used="+Snacks[i]);
					  System.out.println("Actual cleaning limit="+Actual_Cleaning+"  Used="+Cleaning[i]);
					  
					  System.out.println("*****************************************************");
					 
					   System.out.println("*****************************************************");
				 
				 }
				 
				 tf33=new JTextField();
				 tf33.setBounds(30,30,700,30);
				 f7.add(tf33);
				 
				 
				  tf34=new JTextField();
				 tf34.setBounds(30,70,700,30);
				 f7.add(tf34);
				 
				 
				  tf35=new JTextField();
				 tf35.setBounds(30,110,700,30);
				 f7.add(tf35);
				 
				 
				 
				  tf36=new JTextField();
				 tf36.setBounds(30,150,700,30);
				 f7.add(tf36);
				 
				 
				  tf37=new JTextField();
				 tf37.setBounds(30,190,700,30);
				 f7.add(tf37);
				 
				 
				  tf38=new JTextField();
				 tf38.setBounds(30,230,700,30);
				 f7.add(tf38);
				 
				
				   tf39=new JTextField();
				 tf39.setBounds(30,270,700,30);
				 f7.add(tf39);
				 
				   tf39=new JTextField();
				 tf39.setBounds(30,310,700,30);
				 f7.add(tf39);
				 
				 
				   tf39=new JTextField();
				 tf39.setBounds(30,350,700,30);
				 f7.add(tf39);
				 
				   tf40=new JTextField();
				 tf40.setBounds(30,390,700,30);
				 f7.add(tf40);
				 
				   tf41=new JTextField();
				 tf41.setBounds(30,430,700,30);
				 f7.add(tf41);
				 
				 tf42=new JTextField();
				 tf42.setBounds(30,470,700,30);
				 f7.add(tf42);
				 
				 tf43=new JTextField();
				 tf43.setBounds(30,510,700,30);
				 f7.add(tf43);
				 
				 tf44=new JTextField();
				 tf44.setBounds(30,550,700,30);
				 f7.add(tf44);
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 b103=new JButton("Go TO Menu");
				 b103.setBounds(30,650,100,30);
				 b103.setBackground(Color.blue);
				 b103.setForeground(Color.red);
				 f7.add(b103);
				 b103.addActionListener(this);
				 
				 tf33.setText("Actual Grain limit="+String.valueOf(Actual_Grain)+"  Used="+String.valueOf(Grains[0]));
				 tf34.setText("Actual Pulses limit="+String.valueOf(Actual_Pulses)+"  Used="+String.valueOf(Pulses[0]));
				 tf35.setText("Actual Oils limit="+String.valueOf(Actual_Oil)+"  Used="+String.valueOf(Oils[0]));
				 tf36.setText("Actual Baking limit="+String.valueOf(Actual_Baking)+"  Used="+String.valueOf(Baking[0]));
				 tf37.setText("Actual Snacks limit="+String.valueOf(Actual_Snacks)+"  Used="+String.valueOf(Snacks[0]));
				 tf38.setText("Actual cleaning limit="+String.valueOf(Actual_Cleaning)+"  Used="+String.valueOf(Cleaning[0]));
			
				 tf39.setText("Actual Grain limit="+String.valueOf(Actual_Grain)+"  Used="+String.valueOf(Grains[1]));
				 tf40.setText("Actual Pulses limit="+String.valueOf(Actual_Pulses)+"  Used="+String.valueOf(Pulses[1]));
				 tf41.setText("Actual Oils limit="+String.valueOf(Actual_Oil)+"  Used="+String.valueOf(Oils[1]));
				 tf42.setText("Actual Baking limit="+String.valueOf(Actual_Baking)+"  Used="+String.valueOf(Baking[1]));
				 tf43.setText("Actual Snacks limit="+String.valueOf(Actual_Snacks)+"  Used="+String.valueOf(Snacks[1]));
				 tf44.setText("Actual cleaning limit="+String.valueOf(Actual_Cleaning)+"  Used="+String.valueOf(Cleaning[1]));
			
			
				 
			
			
			
			f7.setVisible(true);
		}
		if(ae.getSource()==b103)
		{
			f7.setVisible(false);
			f3.setVisible(true);
		}
		
		
		
		if(ae.getSource()==b12)
		{
			f8=new JFrame("frame 8");
			f8.setSize(900,900);
			f8.setLayout(null);
			
				 
				 System.out.println("Grains="+Grains[0]);
				  System.out.println("Pulses"+Pulses[0]);
				   System.out.println("Oils"+Oils[0]);
				    System.out.println("Baking"+Baking[0]);
					 System.out.println("Snacks"+Snacks[0]);
					  System.out.println("Cleaning"+Cleaning[0]);
					  
			
			 tf45=new JTextField();
				 tf45.setBounds(30,30,700,30);
				 f8.add(tf45);
				 
				  tf46=new JTextField();
				 tf46.setBounds(30,70,700,30);
				 f8.add(tf46);
				 
				  tf47=new JTextField();
				 tf47.setBounds(30,110,700,30);
				 f8.add(tf47);
				 
				  tf48=new JTextField();
				 tf48.setBounds(30,150,700,30);
				 f8.add(tf48);
				 
				  tf49=new JTextField();
				 tf49.setBounds(30,190,700,30);
				 f8.add(tf49);
				 
				  tf50=new JTextField();
				 tf50.setBounds(30,230,700,30);
				 f8.add(tf50);
				 
				 b104=new JButton("Go To Menu");
				 b104.setBounds(30,280,100,30);
				 b104.setBackground(Color.blue);
				 b104.setForeground(Color.red);
				 f8.add(b104);
				 b104.addActionListener(this);
				 
				 tf45.setText("Grains="+String.valueOf(Grains[0]));
			tf46.setText("Pulses"+String.valueOf(Pulses[0]));
			tf47.setText("Oils"+String.valueOf(Oils[0]));
			tf48.setText("Baking"+String.valueOf(Baking[0]));
			tf49.setText("Snacks"+String.valueOf(Snacks[0]));
			tf50.setText("Cleaning"+String.valueOf(Cleaning[0]));
			
	      f8.setVisible(true);
		}
		if(ae.getSource()==b104)
		{
			f8.setVisible(false);
			f3.setVisible(true);
		}
		
		
		if(ae.getSource()==b13)
		{
			
			f9=new JFrame("frame 9");
			f9.setSize(900,900);
			f9.setLayout(null);
			l101=new JLabel("check in console");
			l101.setBounds(50,200,1000,50);
			f9.add(l101);
			
			
			if(Actual_Grain>Grains[0])
				 {
					 System.out.println("Yeah! Decent Usage of");
					 System.out.println("Boiled Rice 5-7kg");
					 System.out.println("Idli Rice 5kg");
					 System.out.println("Raw Rice-2kg");
					 System.out.println("Basmati Rice 2kg");
					 System.out.println("Brown RICE -1kg");
					 System.out.println("Wheat Flour-2kg");
					 System.out.println("Maida-1kg\nRava-1kg");
				 }
				if(Actual_Grain<Grains[0])
				{
					System.out.println("Your crossing limits about Grains & Tiffn Iteams\nTry to controll");
					System.out.println("Rice has several nutrients and minerals, but despite all the good things");
					System.out.println("it is has a high glycemic index, which can actually lead to diabetes. The presence of starch");
					System.out.println("takes too much time to break down the carbs. Hence, too much of rice especially white rice must");
					System.out.println("be avoided to stay away from various lifestyle diseases");
					
				}
				  System.out.println("*****************************************************");
				  
				  
				  
				  if(Actual_Pulses>Pulses[0])
				  {
					 System.out.println("Yeah! Decent usage of ");
					System.out.println("Urad Dal");
					System.out.println("Moong Dal");
					System.out.println("Channa Dal");
					System.out.println("Chickpeas");
					System.out.println("Dried Green Peas");
					System.out.println("Green Gram ");
					System.out.println("Frozen Corn");
				  }
				  if(Actual_Pulses<Pulses[0])
				  {
					  System.out.println("Try to controll puluses Expendicture");
					  
				  }
				   System.out.println("*****************************************************");
				   
				     if(Actual_Oil>Oils[0])
				  {
					  System.out.println("Yeah! Decent usage of");
					  
					  System.out.println("Sunflower oil or vegetable oil");
					  System.out.println("Rice Bran Oil");
					 System.out.println("Sesame oil");
					  System.out.println("coconut oil");
					  System.out.println("olive oil"); 
					 System.out.println("Ghee");
				  }
				  if(Actual_Oil<Oils[0]);
				  {
					  System.out.println("Try to controll Oil usage");
					   System.out.println(" Under normal operating conditions, excess oil consumption is generally a mechanical problem");
					   System.out.println("In the majority of cases where oil consumption problems have been investigated, it usually turns out to be a leak issue");
					  System.out.println("–either the valve cover gasket is leaking, crankshaft seals leaking, or one of the main seals is leaking.");
					  
				  }
				   System.out.println("*****************************************************");
				   
				     if(Actual_Baking>Baking[0])
				  {
					  System.out.println("Yeah! Decent usage of");
					    System.out.println("Cashews");
					    System.out.println("Raisins");
					    System.out.println("Almonds");
					    System.out.println("Dates");
					    System.out.println("nuts");
				  }
				  if(Actual_Baking<Baking[0])
				  {
					  System.out.println("Try to control usage of baking iteans");
					  
				  }
				   System.out.println("*****************************************************");
				   
				   if(Actual_Cleaning<Cleaning[0])
				   {
					   System.out.println("Nice maintanince of house about cleaning");
				   }
				   
				     System.out.println("*****************************************************");
					 
					 if(Actual_Vegitables<Vegitables[0])
					 {
						 System.out.println("Nice maintanince of vegitables keep it up");
						  System.out.println("its good for health ");
						  System.out.println("A diet rich in vegetables and fruits can lower blood pressure");
						    System.out.println("reduce the risk of heart disease and stroke, prevent some types of cancer, lower risk");
						    System.out.println("of eye and digestive problems, and have a positive effect upon blood sugar, which can help keep appetite in check.");
						  
						 
					 }
					 if(Actual_Vegitables>Vegitables[0])
					 {
						  System.out.println("A diet rich in vegetables and fruits can lower blood pressure");
						    System.out.println("reduce the risk of heart disease and stroke, prevent some types of cancer, lower risk");
						    System.out.println("of eye and digestive problems, and have a positive effect upon blood sugar, which can help keep appetite in check.");
						  
						 
					 }
					 
					 f9.setVisible(true);
		}
		
		
		if(ae.getSource()==b14)
		{
			System.exit(0);  
		}
		
		
		
		
		
		
if(ae.getSource()==b7)
{
	tf1.setText("");
	tf2.setText("");
	tf3.setText("");
	tf4.setText("");
	tf5.setText("");
	tf6.setText("");
	tf7.setText("");
	tf8.setText("");
}
		
		
	if(ae.getSource()==b15)
	{
		f3.setVisible(true);
	}		
		
		
		
	if(ae.getSource()==b5)
		{
			 u=u+1;
			 
			 System.out.println(u);
			
	int oil1,sugar1,senamon1,rice1;
	              
				
				
				FileOutputStream fos=new FileOutputStream("hund.txt");
				  
				
			ObjectOutput oos=new ObjectOutputStream(fos);
				
			
			obj[u]=new Emp();
			Grains[u]=Integer.parseInt(tf1.getText());
			oil1=Integer.parseInt(tf1.getText());
		   obj[u].oil=oil1;
		   
			
			
			Pulses[u]=Integer.parseInt(tf2.getText());
			sugar1=Integer.parseInt(tf2.getText());
		   obj[u].sugar=sugar1;
		  
		   
		   
		   Oils[u]=Integer.parseInt(tf3.getText());
		   
		   
			
			Spices[u]=Integer.parseInt(tf4.getText());
			senamon1=Integer.parseInt(tf4.getText());
			
			
		    obj[u].senamon=senamon1;
			
			
			Baking[u]=Integer.parseInt(tf5.getText());
			rice1=Integer.parseInt(tf5.getText());
			obj[u].rice=rice1;
			
			Snacks[u]=Integer.parseInt(tf6.getText());
			Cleaning[u]=Integer.parseInt(tf7.getText());
			Vegitables[u]=Integer.parseInt(tf8.getText());
			
			
			Month[u]=Integer.parseInt(tf11.getText());
			
			
			
			
			
			
			
				oos.writeObject(obj[u]);
			
		
			
		}
		
		
		if(ae.getSource()==b50)
		{
			
			f2.setVisible(true);
			
		}
		
		
		
		
		if(ae.getSource()==b6)
		{
			
			f2.setVisible(false);
			f3=new JFrame("frame 3");
			
			
				
	l23=new JLabel("1.Display List");
		l23.setBounds(600,150,100,50);
		f3.add(l23);
		
		l24=new JLabel("2.Display Months Expenditure & Savings");
		l24.setBounds(600,180,400,50);
		f3.add(l24);
		
		l25=new JLabel("3.Display iteam wise Expenditure");
		l25.setBounds(600,210,400,50);
		f3.add(l25);
		
		l26=new JLabel("4.Limit & Your usage");
		l26.setBounds(600,240,400,50);
		f3.add(l26);
		
		l27=new JLabel("5.Next Month Expendicture predict");
		l27.setBounds(600,270,400,50);
		f3.add(l27);
		
		l28=new JLabel("6.Health & Environment condtion");
		l28.setBounds(600,300,400,50);
		f3.add(l28);
		
		
		l29=new JLabel("7.Exit");
		l29.setBounds(600,330,400,50);
		f3.add(l29);
		
		
		
		
		
		b50=new JButton("Back");
		b50.setBounds(0,50,100,40);
		b50.setBackground(Color.red);
		f3.add(b50);
		b50.addActionListener(this);
		
		
		
		
		
		l50=new JLabel("MENU");
		l50.setBounds(0,110,200,50);
		l50.setForeground(Color.yellow);
		f3.add(l50);
		
		b8=new JButton("1");
		b8.setBounds(0,150,100,30);
		b8.setBackground(Color.PINK);
		b8.setForeground(Color.red);
		f3.add(b8);
		b8.addActionListener(this);
		
		
		b9=new JButton("2");
		b9.setBounds(0,180,100,30);
		
		b9.setBackground(Color.PINK);
		
		b9.setForeground(Color.red);
		f3.add(b9);
		b9.addActionListener(this);
		
		
		b10=new JButton("3");
		b10.setBounds(0,210,100,30);
	
		b10.setForeground(Color.red);
		b10.setBackground(Color.PINK);
		f3.add(b10);
		b10.addActionListener(this);
		
		b11=new JButton("4");
		b11.setBounds(0,240,100,30);
		
		b11.setForeground(Color.red);
		b11.setBackground(Color.PINK);
		f3.add(b11);
		b11.addActionListener(this);
		
		b12=new JButton("5");
		b12.setBounds(0,270,100,30);
		
		b12.setForeground(Color.red);
		b12.setBackground(Color.PINK);
		f3.add(b12);
		b12.addActionListener(this);
		
		b13=new JButton("6");
		b13.setBounds(0,300,100,30);
		b13.setForeground(Color.red);
		b13.setBackground(Color.PINK);
		f3.add(b13);
		b13.addActionListener(this);
		
		
		
		b14=new JButton("7");
		b14.setBounds(0,330,100,30);
		
		b14.setForeground(Color.red);
		b14.setBackground(Color.PINK);
		f3.add(b14);
		b14.addActionListener(this);
		
			b111=new JButton("8");
		b111.setBounds(0,360,100,30);
		
		b111.setForeground(Color.red);
		b111.setBackground(Color.PINK);
		f3.add(b111);
		b111.addActionListener(this);
		
		
		
		
		
		
			
		ImageIcon background_image2=new ImageIcon("sadiq12.png");
		Image img2=background_image2.getImage();
		Image temp_img2=img2.getScaledInstance(1000,1000,Image.SCALE_SMOOTH);
		background_image2=new ImageIcon(temp_img2);
		JLabel background2=new JLabel("",background_image2,JLabel.CENTER);
		
		background2.setBounds(0,0,1000,1000);
		f3.add(background2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
f3.setSize(1000,1000);
			f3.setLayout(null);
		
		f3.setVisible(true);
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
			
		}
		
		
		
		
		
		
	/*if(ae.getSource()==b6)
{
	n=Integer.parseInt(tf9.getText());
	
           Emp obj1[]=new Emp[100];
			  
	 
		for(int c=0;c<n;c++)
		{
			FileInputStream fis= new FileInputStream("hund.txt");
		     ObjectInputStream ois = new ObjectInputStream(fis);
			
			obj1[c]=new Emp();
	   obj1[c]=(Emp)ois.readObject();
	
		
			 
			// int totalgrains=0,totalpulses=0,totaloils=0,totalbaking=0,totalsnacks=0,totalcleaning=0,totalvegetables=0;
			 //int month_wise[]=new int[100];
			 
			 for(int c=0;c<n;c++)
			 {
				 totalgrains=totalgrains+Grains[c];
				 totalpulses=totalpulses+Pulses[c];
				 totaloils=totaloils+Oils[c];
				 totalbaking=totalbaking+Baking[c];
				 totalsnacks=totalsnacks+Snacks[c];
				 totalcleaning=totalcleaning+Cleaning[c];
				 totalvegetables=totalvegetables+Vegitables[c];
				 month_wise[c]=Grains[c]+Pulses[c]+Oils[c]+Baking[c]+Snacks[c]+Cleaning[c];
				 System.out.println("month"+(c+1)+"="+month_wise[c]);
				
				 
			 }
			 int max=-1;
			 int index=0;
			 
			 for(int c=0;c<n;c++)
			 {
				 if(month_wise[c]>max)
				 {
					 max=month_wise[c];
					 index=c+1;
					 
				 }
			 }
			 
			 
			 
			 
			 
			 
			 
			 
			 
			tf10=new JTextField();
			 tf10.setBounds(500,200,50,30);
			 f2.add(tf10);
			 
			 
		 
String s=String.valueOf(index);
			 
			 tf10.setText(s);
			  l23=new JLabel("--->MONTH CONSUMPTION IS MORE");
			l23.setBounds(550,200,1000,30);
			l23.setForeground(Color.red);
		   f2.add(l23);
		   
		 
		  
	
	
		   
			 
			 
			
			 System.out.println("");
			  System.out.println("");
			   System.out.println("");
			   int savings=0;
			   
			 
			 
			 
			 	
		
			   
			 
			 
	



int Actual_Grain=3000;
int Actual_Pulses=2000;
int Actual_Oils=3000;
int Actual_Spices=1000;
int Actual_Baking=1000;
int Actual_Snacks=500;
int Actual_Cleaning=2000;
int Actual_Vegitables=4000;
			 
			 while(true)
			 {
				 System.out.println("");
				  System.out.println("");
				   System.out.println("");
				 System.out.println("Select serivces:");
			 System.out.println("1.Display List");
			  System.out.println("2.Display Months Expenditure & Savings");
			   System.out.println("3.Display iteam wise Expenditure");
			 System.out.println("4.Limit & Your usage");
			System.out.println("5.Next Month Expendicture predict");
				
				  System.out.println("6.Health & Environment condtion");
				  System.out.println("7.Exit");
				  
			 Scanner sc=new Scanner(System.in);
			  System.out.println("");
			   System.out.println("");
			    System.out.println("");
				 
				 int j=sc.nextInt();
				 switch(j)
				 {
					 case 1:
					 System.out.println("Grains");
					 System.out.println("Oils");
					 System.out.println("Spices");
					 System.out.println("Baking");
					 System.out.println("Snacks");
					 System.out.println("Cleaning");
					 System.out.println("Vegitables");
					 break;
					 
					 case 2:
					 for(int i=0;i<n;i++)
			        {
						 System.out.println((i+1)+"  month Expendicture="+month_wise[i]+" Salary="+Month[i]);
				System.out.println("Grains="+Grains[i]+"+Pulses="+Pulses[i]+"+Oils="+Oils[i]+"+Spices="+Spices[i]+"+Baking="+Baking[i]+"+Snacks="+Snacks[i]+"+Cleaning="+Cleaning[i]+"+Vegitables="+Vegitables[i]);
				System.out.println("TOTAL="+month_wise[i]);
				System.out.println("Savings="+(Month[i]-month_wise[i]));
				 System.out.println("*****************************************************");
				savings=savings+(Month[i]-month_wise[i]);
				 	 
			
				
			       }
				    System.out.println("TOTAL SAVINGS:"+savings);
				   break;
				   
				   case 3:
				  
				
				   
				   System.out.println("Grains="+totalgrains);
				   System.out.println("Pulses="+totalpulses);
				    System.out.println("Oils="+totaloils);
					System.out.println("Baking="+totalbaking);
						System.out.println("Snacks="+totalsnacks);
						System.out.println("Cleaning="+totalcleaning);
						System.out.println("vegetables="+totalvegetables);
						
						
					 System.out.println("*****************************************************");
					 break;
					
				   
				     
					
					
				 
				 case 4:
				 for(int i=0;i<n;i++)
				 {
				 System.out.println("Actual Grain limit="+Actual_Grain+"  Used="+Grains[i]);
				  System.out.println("Actual Pulses limit="+Actual_Pulses+"  Used="+Pulses[i]);
				   System.out.println("Actual Oils limit="+Actual_Oil+"  Used="+Oils[i]);
				    System.out.println("Actual Baking limit="+Actual_Baking+"  Used="+Baking[i]);
					 System.out.println("Actual Snacks limit="+Actual_Snacks+"  Used="+Snacks[i]);
					  System.out.println("Actual cleaning limit="+Actual_Cleaning+"  Used="+Cleaning[i]);
					  
					  System.out.println("*****************************************************");
					 
					   System.out.println("*****************************************************");
				 
				 }
				 break;
				 
				 case 5:
				 int avg_grain=totalgrains/n,avg_pulses=totalpulses/n,avg_oil=totaloils/n,avg_baking=totalbaking/n,avg_snacks=totalsnacks/n,avg_cleaning=totalcleaning/n,avg_vegitables=totalvegetables/n;
				 
				 
				 System.out.println("Grains="+avg_grain);
				  System.out.println("Pulses"+avg_pulses);
				   System.out.println("Oils"+avg_oil);
				    System.out.println("Baking"+avg_baking);
					 System.out.println("Snacks"+avg_snacks);
					  System.out.println("Cleaning"+avg_cleaning);
					  
					  
				 
				 break;
				 case 6:
				 if(Actual_Grain>Grains[0])
				 {
					 System.out.println("Yeah! Decent Usage of");
					 System.out.println("Boiled Rice 5-7kg");
					 System.out.println("Idli Rice 5kg");
					 System.out.println("Raw Rice-2kg");
					 System.out.println("Basmati Rice 2kg");
					 System.out.println("Brown RICE -1kg");
					 System.out.println("Wheat Flour-2kg");
					 System.out.println("Maida-1kg\nRava-1kg");
				 }
				if(Actual_Grain<Grains[0])
				{
					System.out.println("Your crossing limits about Grains & Tiffn Iteams\nTry to controll");
					System.out.println("Rice has several nutrients and minerals, but despite all the good things");
					System.out.println("it is has a high glycemic index, which can actually lead to diabetes. The presence of starch");
					System.out.println("takes too much time to break down the carbs. Hence, too much of rice especially white rice must");
					System.out.println("be avoided to stay away from various lifestyle diseases");
					
				}
				  System.out.println("*****************************************************");
				  
				  
				  
				  if(Actual_Pulses>Pulses[0])
				  {
					 System.out.println("Yeah! Decent usage of ");
					System.out.println("Urad Dal");
					System.out.println("Moong Dal");
					System.out.println("Channa Dal");
					System.out.println("Chickpeas");
					System.out.println("Dried Green Peas");
					System.out.println("Green Gram ");
					System.out.println("Frozen Corn");
				  }
				  if(Actual_Pulses<Pulses[0])
				  {
					  System.out.println("Try to controll puluses Expendicture");
					  
				  }
				   System.out.println("*****************************************************");
				   
				     if(Actual_Oil>Oils[0])
				  {
					  System.out.println("Yeah! Decent usage of");
					  
					  System.out.println("Sunflower oil or vegetable oil");
					  System.out.println("Rice Bran Oil");
					 System.out.println("Sesame oil");
					  System.out.println("coconut oil");
					  System.out.println("olive oil"); 
					 System.out.println("Ghee");
				  }
				  if(Actual_Oil<Oils[0]);
				  {
					  System.out.println("Try to controll Oil usage");
					   System.out.println(" Under normal operating conditions, excess oil consumption is generally a mechanical problem");
					   System.out.println("In the majority of cases where oil consumption problems have been investigated, it usually turns out to be a leak issue");
					  System.out.println("–either the valve cover gasket is leaking, crankshaft seals leaking, or one of the main seals is leaking.");
					  
				  }
				   System.out.println("*****************************************************");
				   
				     if(Actual_Baking>Baking[0])
				  {
					  System.out.println("Yeah! Decent usage of");
					    System.out.println("Cashews");
					    System.out.println("Raisins");
					    System.out.println("Almonds");
					    System.out.println("Dates");
					    System.out.println("nuts");
				  }
				  if(Actual_Baking<Baking[0])
				  {
					  System.out.println("Try to control usage of baking iteans");
					  
				  }
				   System.out.println("*****************************************************");
				   
				   if(Actual_Cleaning<Cleaning[0])
				   {
					   System.out.println("Nice maintanince of house about cleaning");
				   }
				   
				     System.out.println("*****************************************************");
					 
					 if(Actual_Vegitables<Vegitables[0])
					 {
						 System.out.println("Nice maintanince of vegitables keep it up");
						  System.out.println("its good for health ");
						  System.out.println("A diet rich in vegetables and fruits can lower blood pressure");
						    System.out.println("reduce the risk of heart disease and stroke, prevent some types of cancer, lower risk");
						    System.out.println("of eye and digestive problems, and have a positive effect upon blood sugar, which can help keep appetite in check.");
						  
						 
					 }
					 if(Actual_Vegitables>Vegitables[0])
					 {
						  System.out.println("A diet rich in vegetables and fruits can lower blood pressure");
						    System.out.println("reduce the risk of heart disease and stroke, prevent some types of cancer, lower risk");
						    System.out.println("of eye and digestive problems, and have a positive effect upon blood sugar, which can help keep appetite in check.");
						  
						 
					 }
					 
					 break;
					 case 7:
					 System.exit(0);  
                          break;
				 }
					 
				   
	

	}
}
	*/			  
				 
			 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}catch(Exception e)
		{
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[])
	{
		new Demo();
	}
}