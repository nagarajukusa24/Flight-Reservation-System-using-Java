

import java.awt.EventQueue;

import javax.swing.*;
//import javax.swing.JLabel;
import java.awt.BorderLayout;
//import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
//import javax.swing.JScrollPane;
//import javax.swing.SwingConstants;
//import javax.swing.JScrollBar;
 import java.sql.*;
import java.util.*;

 public class test extends JFrame implements ActionListener{

	 JFrame frame;
	 JButton[] button;
	 int[] col;
	 int ko,pa;
	 JButton b1;
	 Vector<String> y;
	 String ha;
	 String[] ka;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public  test(Vector<String> ps) {
	 	col=new int[27];
	 	for (int i=0;i<27;i++){
	 		col[i]=1;
	 	}

		frame = new JFrame();
		frame.setVisible(true);
	 	//frame.setSize(900,900);
		frame.setLayout(null);
		frame.setTitle("Booking"); 
		 	y=ps;
	 	ko=0;
	 	b1=new JButton("submit");
	 	b1.setBounds(500,550,100,50);
	 	frame.add(b1);	 	
	 	b1.addActionListener(this);
		button=new JButton[27];
		frame.getContentPane().setLayout(null);
		 
		
		 button[2] = new JButton("3");
		button[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[2]==1){
					button[2].setBackground(Color.red);
                	col[2]=2;
				}
				else if (col[2]==2){
					button[2].setBackground(Color.blue);
					col[2]=1;
				}
			}
		});
	
		button[2].setBounds(314, 87, 76, 65);
		frame.getContentPane().add(button[2]);
		
		JLabel lblNewLabel = new JLabel("Economy");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(10, 25, 158, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblBusiness = new JLabel("Business");
		lblBusiness.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBusiness.setForeground(Color.BLUE);
		lblBusiness.setBounds(23, 200, 157, 47);
		frame.getContentPane().add(lblBusiness);
		
		JLabel lblCelebrity = new JLabel("Celebrity");
		lblCelebrity.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCelebrity.setForeground(Color.RED);
		lblCelebrity.setBounds(21, 391, 162, 37);
		frame.getContentPane().add(lblCelebrity);
		
		button[0] = new JButton("1");
		button[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[0]==1){
					button[0].setBackground(Color.red);
                	col[0]=2;
				}
				else if (col[0]==2){
					button[0].setBackground(Color.blue);
					col[0]=1;
				}
			}
		});
		button[0].setBounds(72, 87, 76, 64);
		frame.getContentPane().add(button[0]);
		
		button[3] = new JButton("4");
		button[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[3]==1){
					button[3].setBackground(Color.red);
                	col[3]=2;
				}
				else if (col[3]==2){
					button[3].setBackground(Color.blue);
					col[3]=1;
				}
			}
		});
		button[3].setBounds(426, 86, 76, 64);
		frame.getContentPane().add(button[3]);
		
		 button[4] = new JButton("5");
		 button[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[4]==1){
					button[4].setBackground(Color.red);
                	col[4]=2;
				}
				else if (col[4]==2){
					button[4].setBackground(Color.blue);
					col[4]=1;
				}
			}
		});
		button[4].setBounds(544, 86, 76, 65);
		frame.getContentPane().add(button[4]);
		
		 button[5] = new JButton("6");
		 button[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[5]==1){
					button[5].setBackground(Color.red);
                	col[5]=2;
				}
				else if (col[5]==2){
					button[5].setBackground(Color.blue);
					col[5]=1;
				}
			}
		});
		button[5].setBounds(668, 88, 76, 64);
		frame.getContentPane().add(button[5]);
		
		 button[8] = new JButton("9");
		 button[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[8]==1){
					button[8].setBackground(Color.red);
                	col[8]=2;
				}
				else if (col[8]==2){
					button[8].setBackground(Color.blue);
					col[8]=1;
				}
			}
		});
		button[8].setBounds(1007, 85, 76, 65);
		frame.getContentPane().add(button[8]);
		
		 button[6]= new JButton("7");
		 button[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[6]==1){
					button[6].setBackground(Color.red);
                	col[6]=2;
				}
				else if (col[6]==2){
					button[6].setBackground(Color.blue);
					col[6]=1;
				}
			}
		});
		button[6].setBounds(784, 87, 76, 64);
		frame.getContentPane().add(button[6]);
		
		 button[7] = new JButton("8");
		 button[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[7]==1){
					button[7].setBackground(Color.red);
                	col[7]=2;
				}
				else if (col[7]==2){
					button[7].setBackground(Color.blue);
					col[7]=1;
				}
			}
		});
		button[7].setBounds(897, 86, 76, 65);
		frame.getContentPane().add(button[7]);
		
		 button[1] = new JButton("2");
		 button[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[1]==1){
					button[1].setBackground(Color.red);
                	col[1]=2;
				}
				else if (col[1]==2){
					button[1].setBackground(Color.blue);
					col[1]=1;
				}
			}
		});
		button[1].setBounds(194, 89, 76, 64);
		frame.getContentPane().add(button[1]);
		
		 button[11] = new JButton("12");
		 button[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[11]==1){
					button[11].setBackground(Color.red);
                	col[11]=2;
				}
				else if (col[11]==2){
					button[11].setBackground(Color.blue);
					col[11]=1;
				}
			}
		});
		button[11].setBounds(318, 262, 76, 65);
		frame.getContentPane().add(button[11]);
		
		 button[9] = new JButton("10");
		 button[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[9]==1){
					button[9].setBackground(Color.red);
                	col[9]=2;
				}
				else if (col[9]==2){
					button[9].setBackground(Color.blue);
					col[9]=1;
				}
			}
		});
		button[9].setBounds(76, 262, 76, 64);
		frame.getContentPane().add(button[9]);
		
		 button[12] = new JButton("13");
		 button[12].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[12]==1){
					button[12].setBackground(Color.red);
                	col[12]=2;
				}
				else if (col[12]==2){
					button[12].setBackground(Color.blue);
					col[12]=1;
				}
			}
		});
		button[12].setBounds(430, 261, 76, 64);
		frame.getContentPane().add(button[12]);
		
		 button[13] = new JButton("14");
		 button[13].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[13]==1){
					button[13].setBackground(Color.red);
                	col[13]=2;
				}
				else if (col[13]==2){
					button[13].setBackground(Color.blue);
					col[13]=1;
				}
			}
		});
		button[13].setBounds(548, 261, 76, 65);
		frame.getContentPane().add(button[13]);
		
		 button[14] = new JButton("15");
		 button[14].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[14]==1){
					button[14].setBackground(Color.red);
                	col[14]=2;
				}
				else if (col[14]==2){
					button[14].setBackground(Color.blue);
					col[14]=1;
				}
			}
		});
		button[14].setBounds(672, 263, 76, 64);
		frame.getContentPane().add(button[14]);
		
		 button[17] = new JButton("18");
		 button[17].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[17]==1){
					button[17].setBackground(Color.red);
                	col[17]=2;
				}
				else if (col[17]==2){
					button[17].setBackground(Color.blue);
					col[17]=1;
				}
			}
		});
		button[17].setBounds(1011, 260, 76, 65);
		frame.getContentPane().add(button[17]);
		
		 button[15] = new JButton("16");
		 button[15].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[15]==1){
					button[15].setBackground(Color.red);
                	col[15]=2;
				}
				else if (col[15]==2){
					button[15].setBackground(Color.blue);
					col[15]=1;
				}
			}
		});
		button[15].setBounds(788, 262, 76, 64);
		frame.getContentPane().add(button[15]);
		
		 button[16] = new JButton("17");
		 button[16].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[16]==1){
					button[16].setBackground(Color.red);
                	col[16]=2;
				}
				else if (col[16]==2){
					button[16].setBackground(Color.blue);
					col[16]=1;
				}
			}
		});
		button[16].setBounds(901, 261, 76, 65);
		frame.getContentPane().add(button[16]);
		
		 button[10] = new JButton("11");
		 button[10].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[10]==1){
					button[10].setBackground(Color.red);
                	col[10]=2;
				}
				else if (col[10]==2){
					button[10].setBackground(Color.blue);
					col[10]=1;
				}
			}
		});
		button[10].setBounds(198, 264, 76, 64);
		frame.getContentPane().add(button[10]);
		
		 button[20] = new JButton("21");
		 button[20].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[20]==1){
					button[20].setBackground(Color.red);
                	col[20]=2;
				}
				else if (col[20]==2){
					button[20].setBackground(Color.blue);
					col[20]=1;
				}
			}
		});
		button[20].setBounds(308, 461, 76, 65);
		frame.getContentPane().add(button[20]);
		
		 button[18] = new JButton("19");
		 button[18].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[18]==1){
					button[18].setBackground(Color.red);
                	col[18]=2;
				}
				else if (col[18]==2){
					button[18].setBackground(Color.blue);
					col[18]=1;
				}
			}
		});
		button[18].setBounds(66, 461, 76, 64);
		frame.getContentPane().add(button[18]);
		
		 button[21] = new JButton("22");
		  button[21].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[21]==1){
					button[21].setBackground(Color.red);
                	col[21]=2;
				}
				else if (col[21]==2){
					button[21].setBackground(Color.blue);
					col[21]=1;
				}
			}
		});
		button[21].setBounds(420, 460, 76, 64);
		frame.getContentPane().add(button[21]);
		
		 button[22] = new JButton("23");
		  button[22].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[22]==1){
					button[22].setBackground(Color.red);
                	col[22]=2;
				}
				else if (col[22]==2){
					button[22].setBackground(Color.blue);
					col[22]=1;
				}
			}
		});
		button[22].setBounds(538, 460, 76, 65);
		frame.getContentPane().add(button[22]);
		
		 button[23] = new JButton("24");
		  button[23].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[23]==1){
					button[23].setBackground(Color.red);
                	col[23]=2;
				}
				else if (col[23]==2){
					button[23].setBackground(Color.blue);
					col[23]=1;
				}
			}
		});
		button[23].setBounds(662, 462, 76, 64);
		frame.getContentPane().add(button[23]);
		
		 button[26] = new JButton("27");
		  button[26].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[26]==1){
					button[26].setBackground(Color.red);
                	col[26]=2;
				}
				else if (col[26]==2){
					button[26].setBackground(Color.blue);
					col[26]=1;
				}
			}
		});
		button[26].setBounds(1001, 459, 76, 65);
		frame.getContentPane().add(button[26]);
		
		 button[24] = new JButton("25");
		  button[24].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[24]==1){
					button[24].setBackground(Color.red);
                	col[24]=2;
				}
				else if (col[24]==2){
					button[24].setBackground(Color.blue);
					col[24]=1;
				}
			}
		});
		button[24].setBounds(778, 461, 76, 64);
		frame.getContentPane().add(button[24]);
		
		 button[25] = new JButton("26");
		  button[25].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[25]==1){
					button[25].setBackground(Color.red);
                	col[25]=2;
				}
				else if (col[25]==2){
					button[25].setBackground(Color.blue);
					col[25]=1;
				}
			}
		});
		button[25].setBounds(891, 460, 76, 65);
		frame.getContentPane().add(button[25]);
		
		 button[19] = new JButton("20");
		  button[19].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (col[19]==1){
					button[19].setBackground(Color.red);
                	col[19]=2;
				}
				else if (col[19]==2){
					button[19].setBackground(Color.blue);
					col[19]=1;
				}
			}
		});
		button[19].setBounds(188, 463, 76, 64);
		frame.getContentPane().add(button[19]);
		for (int i=0;i<27;i++){
	 		button[i].setBackground(Color.blue);
	 	}

             ha=ps.elementAt(4);
             if (ha==null){
             	ha="";
             }
             else{
             	System.out.println("hii"+ha);
              ka=ha.split("_");
             System.out.println(ka.length);
             for (int i=0;i<ka.length;i++){
             	 pa=Integer.parseInt(ka[i]);
             	 System.out.println(pa);
             	 col[pa-1]=3;
             	 button[pa-1].setBackground(Color.green);

             }     
         }
		
	}
	public void actionPerformed(ActionEvent e){
		double cost=0;;
		String za="";
		String ma="";
		int i;
		if (e.getSource()==b1){
			for (i=0;i<9;i++){
				if (col[i]==2){
					ma=y.elementAt(1);
                  cost+=Double.parseDouble(ma);
                   za+=(i+1)+"_";
				} 
			}
			for (i=9;i<18;i++){
				if (col[i]==2){
					ma=y.elementAt(2);
                  cost+=Double.parseDouble(ma);
                   za+=(i+1)+"_";
				} 
			}
			for (i=18;i<27;i++){
				if (col[i]==2){
					ma=y.elementAt(3);
                  cost+=Double.parseDouble(ma);
                   za+=(i+1)+"_";
				}
				} 
				if (ha==null)
				ha="";
			ha+=za;
			System.out.println(ha);
			 try  
                    {  
                         Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc.oracle::thin:@localhost:1521:XE","system","rgukt123");
                        PreparedStatement ps = con.prepareStatement("update flight set seats=? where name=?");  
                       ps.setString(1,ha);
                       ps.setString(2,y.elementAt(0));
                        ResultSet rs = ps.executeQuery();
                      
                          
                        con.close();  
 
                    }  
                    catch (Exception ex)   
                    {  
                        System.out.println(ex);  
                    }

                     JOptionPane.showMessageDialog(frame,"Your reservation  costs "+cost+" rupees");
                     frame.setVisible(false);
                     dispose();

             }   

			
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
