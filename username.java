import javax.swing.*;
import java.awt.*;
 import java.awt.event.*; 
  import java.sql.*;
  class Username implements ActionListener{
  	      JLabel l1,l2,l3;
  	      JTextField t1,t2;
  	      JButton b1,b2;
  	      JFrame f;
  	      String msg="";
         Username(){
         	f=new JFrame();
         	f.setVisible(true);
         		f.setSize(800,800);
		f.setLayout(null);
		f.setTitle("Log in Form"); 
            l1=new JLabel("Username");
            l2=new JLabel("Password");
              l3=new JLabel("Credentails mismatch!");
              l3.setForeground(Color.red);
              l3.setVisible(false);
           l1.setFont(new Font("Helvetica",Font.BOLD,32));
             l2.setFont(new Font("Helvetica",Font.BOLD,32));
              l3.setFont(new Font("Helvetica",Font.BOLD,32));
              t1=new JTextField();
              t2=new JTextField();
              b1=new JButton("Login");
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
         	String username=t1.getText();
         	String password=t2.getText();
         	String a="";
         	int g=0;
         	 try  
                    {  
                         Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc.oracle::thin:@localhost:1521:XE","system","rgukt123");
                        PreparedStatement ps = con.prepareStatement("select * from customers where username=?");  
                       ps.setString(1,username);
                        ResultSet rs = ps.executeQuery();
                         while(rs.next()){
                         	g=1;
                         	a=rs.getString(4);
                         }
                         if (g==1){
                         if (a.equals(password)){
                         	
                         Registeration r=new Registeration();
                         r.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                         	 
                             // new form();
                         }
                         else{
                         	 l3.setVisible(true);
                         	//f.add(l3);
                         }
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
  		new Username();	
  	}
  }