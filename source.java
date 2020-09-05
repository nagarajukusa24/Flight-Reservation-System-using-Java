import javax.swing.*;
import java.awt.*;
 import java.awt.event.*; 
  import java.sql.*;
  import java.util.*;
  class Source implements ActionListener{
  	      JLabel l1,l2,l3;
  	      JTextField t1,t2;
  	      JButton b1,b2;
  	      JFrame f;
          Vector<String> v;

         Source(){
         	f=new JFrame();
         	f.setVisible(true);
         		f.setSize(800,800);
		f.setLayout(null);
		f.setTitle("Log in Form"); 
            l1=new JLabel("Source");
            l2=new JLabel("Destination");
              l3=new JLabel("No such flights!");
              l3.setForeground(Color.red);
              l3.setVisible(false);
           l1.setFont(new Font("Helvetica",Font.BOLD,32));
             l2.setFont(new Font("Helvetica",Font.BOLD,32));
              l3.setFont(new Font("Helvetica",Font.BOLD,32));
              t1=new JTextField();
              t2=new JTextField();
              b1=new JButton("GO");
              b2=new JButton("Back");
              l1.setBounds(80,200,200,100);
                l2.setBounds(80,310,200,100);
                l3.setBounds(80,400,600,50);
                  t1.setBounds(290,220,200,50);
                    t2.setBounds(290,340,200,50);
                    b1.setBounds(180,500,100,50);
                     b2.setBounds(380,500,100,50);
                     

                    f.add(l1);
                   f.add(l2);
                    f.add(t1);
                    f.add(t2);
                    f.add(b1);
                    f.add(b2);
                    f.add(l3);
                    b1.addActionListener(this);


         }
        
         public void actionPerformed(ActionEvent e){
         	l3.setVisible(false);
         	String source=t1.getText();
         	String dest=t2.getText();
         	String a="";
          String z="";
         	int g=0;
         	 try  
                    {  
                         Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc.oracle::thin:@localhost:1521:XE","system","rgukt123");
                        PreparedStatement ps = con.prepareStatement("select * from flight where source=? and destination=?");  
                       ps.setString(1,source);
                       ps.setString(2,dest);
                        ResultSet rs = ps.executeQuery();
                        v=new Vector<String>();
                         while(rs.next()){
                         	g=1;
                          z=rs.getString(1)+"    "+rs.getDouble(4)+" "+rs.getDouble(5)+" "+rs.getDouble(6)+" ";
                          v.add(z);                         
                         }
                           if (g==1){
                              showflight sh=new showflight(v);                        
                     }
                     else{
                     	//f.add(l3);
                     	 l3.setVisible(true);
                     }  
                        con.close();  
 
                    }  
                    catch (Exception ex)   
                    {  
                        System.out.println(ex);  
                    }

         }
   
  }
  class Sumanth{
  	public static void main(String[] args) {
  		new Source();	
  	}
  }