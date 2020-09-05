import javax.swing.*;
import java.awt.*;
 import java.awt.event.*;  
    import java.sql.*;  
class Registeration  implements ActionListener  {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
		JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf10,tf11;
		JTextArea a1;
		JRadioButton r1,r2;
		JCheckBox c1,c2,c3,c4;
		JButton b1,b2;
        ButtonGroup bg;
       public  JFrame f;
	 Registeration() {
	 	 f=new JFrame();
        Container c=f.getContentPane();
     //   c.setBackground(Color.blue);
		f.setVisible(true);
		f.setSize(800,800);
		f.setLayout(null);
		f.setTitle("Registration Form in Java"); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel("Name");
		l2=new JLabel("Source");
		l3=new JLabel("Destination");
		l4=new JLabel("Economy Class Cost");
		l5=new JLabel("Business Class Cost");
		l6=new JLabel("Celebrity Class Cost");
//		l8=new JLabel("city");
		//l9=new JLabel("Pincode");
//		l10=new JLabel("Country");
//		l11=new JLabel("Hobbies");
        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();
        tf4=new JTextField();
        tf5=new JTextField();
        tf6=new JTextField();
        // tf6=new JTextField();
        //tf7=new JTextField();
  //      tf10=new JTextField("India");
    //    tf10.setEditable(false);
      //  tf11=new JTextField();
        //  tf11.setEditable(false);
         // bg=new ButtonGroup();
       /* r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        a1=new JTextArea();*/
        //c1=new JCheckBox("Drawing");
        //c2=new JCheckBox("Singing");
        //c3=new JCheckBox("sketching");
        //c4=new JCheckBox("Others");
        /*c4.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if (e.getStateChange()==1){
                    tf11.setEditable(true);
                }
                else{
                     tf11.setEditable(false);
                }
            }
        });*/
        b1=new JButton("Submit");
          b2=new JButton("Reset");
     		l1.setBounds(80,30,200,30);
        l2.setBounds(80, 70, 200, 30);  
         l3.setBounds(80, 110, 200, 30);  
         l4.setBounds(80, 150, 200, 30);  
         l5.setBounds(80, 190, 200, 30);  
         l6.setBounds(80, 230, 200, 30);   
         //l8.setBounds(80, 500, 200, 30);
          //l10.setBounds(80, 540, 200, 30);
           //l11.setBounds(80, 580, 200, 30);

         tf1.setBounds(200,30,200,30);
           tf2.setBounds(200, 70, 200, 30);
            tf3.setBounds(200, 110, 200, 30);
             tf4.setBounds(200, 150, 200, 30);
              tf5.setBounds(200, 190, 200, 30);
             tf6.setBounds(200,230,100,30);             
                 /*  r2.setBounds(310,230,100,30);
                   a1.setBounds(200,270,300,200);*/
                //    tf6.setBounds(200, 500, 200, 30);
             //tf10.setBounds(200, 540, 200, 30);
             /*c1.setBounds(200,580,100,30);
             c2.setBounds(310,580,100,30);
             c3.setBounds(410,580,100,30);
              c4.setBounds(200,620,100,30);*/
              //tf11.setBounds(310,620,100,30);
               b1.setBounds(200,670,100,30);
         b1.addActionListener(this);
          b2.setBounds(500,670,100,30);
         b2.addActionListener(this);
        /* bg.add(r1);
         bg.add(r2);*/
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		//f.add(l7);
		//f.add(l8);
		//f.add(l10);
		//f.add(l11);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(tf4);
		f.add(tf5);
		f.add(tf6);
		//f.add(r1);
		//f.add(r2);
		//f.add(tf6);
		//f.add(tf10);
		/*f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		f.add(tf11);*/
		f.add(b1);
		f.add(b2);
		
	}
	 public void actionPerformed(ActionEvent e)   
        { 
            if (e.getSource()==b2){
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");
              //  tf10.setText("");
                tf6.setText("");
                //tf11.setText("");
                //r1.setSelected(false);
                  //c1.setSelected(false);
               /* c2.setSelected(false);
                c3.setSelected(false);
                c4.setSelected(false);*/
                //bg.clearSelection();
                


            }
        	if (e.getSource()==b1){
        		 String s1=tf1.getText();
        		 String s2=tf2.getText();
        		 String s3=tf3.getText();
        		 //String s4=tf4.getText();
                 Double s4=Double.parseDouble(tf4.getText());
        		  Double s5=Double.parseDouble(tf5.getText());
                  Double s6=Double.parseDouble(tf6.getText());
                  String s7="";
        		// String s7=a1.getText();;
               /*  if (r1.isSelected()){
                      s6="male";
                 } 
                 else{
                 	s6="female";*/
          /*       if (c1.isSelected()){
                    s7+="Drawing ";
                 }
                 if (c2.isSelected()){
                    s7+="Singing ";
                 }
                 if (c3.isSelected()){
                    s7+="Sketching ";
                 }
                 if (c4.isSelected()){
                    s7+=tf11.getText();
                 }
                 String s8=a1.getText();
                 String s9=tf6.getText();*/
                try  
                    {  
                         Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc.oracle::thin:@localhost:1521:XE","system","rgukt123");
                        PreparedStatement ps = con.prepareStatement("insert into flight values(?,?,?,?,?,?,?)");  
                        ps.setString(1, s1);  
                        ps.setString(2, s2);  
                        ps.setString(3, s3);  
                        ps.setDouble(4, s4);  
                        ps.setDouble(5, s5);  
                        ps.setDouble(6, s6);  
                         ps.setString(7, s7);  
                        /*ps.setString(8, s8);
                         ps.setString(9, s9);*/  
                        ResultSet rs = ps.executeQuery(); 
                        con.close();  
 
                    }  
                    catch (Exception ex)   
                    {  
                        System.out.println(ex);  
                    }
                    
      }
     }
}
class Sumanth{
	public static void main(String[] args) {
		new Registeration();
	}
}