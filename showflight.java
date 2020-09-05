import javax.swing.*;
import java.awt.*;
 import java.awt.event.*; 
  import java.sql.*;
  import java.util.*;
  class showflight implements ActionListener{
  	      JLabel l[];
  	      JButton b[];
  	      JFrame f;
  	      int d=50,i;
          String sh,kh[];
          Vector<String> v;
            showflight(Vector<String> p){
                 	f=new JFrame();
         	f.setVisible(true);
         		f.setSize(900,900);
		f.setLayout(null);
		f.setTitle("Log in Form"); 
            	l=new JLabel[p.size()];
            	b=new JButton[p.size()];
            	for ( i=0;i<p.size();i++){
            		l[i]=new JLabel(p.elementAt(i));
            		 b[i]=new JButton("Book");
            		 l[i].setFont(new Font("Helvetica",Font.BOLD,32));
                       d+=70;
            		l[i].setBounds(50,d,700,50);
            	b[i].setBounds(770,d,100,50);
            	}
            	for (i=0;i<l.length;i++){
                   f.add(l[i]);
                   f.add(b[i]);
            	}
              for (i=0;i<b.length;i++){
                b[i].addActionListener(this);
              }
                
            }
            public void actionPerformed(ActionEvent e){
              String am="";
              int z;
              for (i=0;i<b.length;i++){
                if (e.getSource()==b[i]){
                  System.out.println("hii");
                        sh=l[i].getText();
                       kh=sh.split("    ");
                       z=i;
                       System.out.println(kh[0]);
                       am=kh[0];
                
              
              
                   try  
                    {  
                         Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc.oracle::thin:@localhost:1521:XE","system","rgukt123");
                        PreparedStatement ps = con.prepareStatement("select * from flight where name=?");  
                       ps.setString(1,am);
                        ResultSet rs = ps.executeQuery();
                        v=new Vector();
                         while(rs.next()){
                          v.add(rs.getString(1));
                          v.add(String.valueOf(rs.getDouble(4)));
                          v.add(String.valueOf(rs.getDouble(5)));
                          v.add(String.valueOf(rs.getDouble(6)));
                          v.add(rs.getString(7));
          
                                                 
                         }
                          
                        con.close();  
 
                    }  
                    catch (Exception ex)   
                    {  
                        System.out.println(ex);  
                    }

                  test th=new test(v);
                }
             }              
         }
   

            }