import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Frame;
import javax.swing.JOptionPane;

class HomePage  implements ActionListener
{
	Frame fr;
	Button b1,b2,b3,b4;
	
	HomePage()
	{ 
		
		fr=new Frame("HomePage");	
		b1=new Button("Register");
		b1.setBounds(580,250,220,60);
		Color b = new Color(255,255,0);
		b1.setBackground(b);
        	b1.setForeground(Color.BLACK);
		fr.add(b1);
		
		b2=new Button("Issue Book");
		b2.setBounds(580,320,220,60);

		b2.setBackground(b);
        	b2.setForeground(Color.BLACK);
		fr.add(b2);
		
		b3=new Button("Return Book");
		b3.setBounds(580,390,220,60);
		b3.setBackground(b);
        	b3.setForeground(Color.BLACK);
		fr.add(b3);
		
		b4=new Button("Exit");
		b4.setBounds(580,480,220,60);
		b4.setBackground(b);
        	b4.setForeground(Color.BLACK);
		fr.add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	
		fr.setLayout(null);
		fr.setSize(1500,1500);
		fr.setVisible(true);
		Color yellow = new Color(255,175,175);
		fr.setBackground(yellow); 
		
		
	}
	


	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{
			new registeration();
			fr.setVisible(false);
		}
		else if(e.getSource()==b2)
		{
			new Issue();
			fr.setVisible(false);
		}
		else if(e.getSource()==b3)
		{
			new Return();
			fr.setVisible(false);
		}
		else if(e.getSource()==b4)
		{
			System.exit(0);
	}	}
	
	public static void main(String args[])
	{
		new HomePage();
		
	}
}


class Login extends Frame implements ActionListener {

    Label lb1, lb2;
    TextField tf1, tf2;
    Button btn;

    Login() {
        super("Library Management System");
        setBackground(Color.CYAN);
        lb1 = new Label("USERNAME:");
        lb1.setBounds(50, 50, 100, 20);
        add(lb1);

        tf1 = new TextField();
        tf1.setBounds(160, 50, 100, 20);
        add(tf1);

        lb2= new Label("PASSWORD:");
        lb2.setBounds(50, 80, 100, 20);
        add(lb2);

        tf2= new TextField();
        tf2.setBounds(160, 80, 100, 20);
        add(tf2);

        btn = new Button("Login");
        btn.setBounds(100, 120, 80, 20);
        btn.setBackground(Color.GREEN);
        btn.setForeground(Color.WHITE);
        btn.addActionListener(this);
        add(btn);

        setSize(500, 300);
        setLayout(null);
        setVisible(true);
    }

  public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==btn)
			{
                 
                  if(tf1.getText().length()==0||tf2.getText().length()==0)
                      {
                        JOptionPane.showMessageDialog(null,"Please Enter Something!!");
                      }

                    else if(tf1.getText().equals("Shweta") && tf2.getText().equals("1234"))
                     {
                        JOptionPane.showMessageDialog(null, "Successfully Login!!!");
                        new HomePage();	
		}
                     }
                    else
                     {
                       JOptionPane.showMessageDialog(null,"Invalid!!!!");
                     }
                     
       }
    public static void main(String[] args) {
        new Login();
    }
}


class registeration implements ActionListener
{
	Frame f;
	Label ab,l1,l2,l3,l4,l5,l6,l7;
	TextField tf1,tf2,tf3,tf4,tf5;
	Button b1,b2;
     Choice stream,c;
	
	
	registeration()
	{
		f=new Frame("Student Registeration");
		
          l1=new Label("Student ID:");
		l1.setBounds(50,50,150,20);
		f.add(l1);
          
          tf1=new TextField(50);
		tf1.setBounds(200,50,150,20);
		f.add(tf1);

		l2=new Label("FirstName:");
		l2.setBounds(50,90,150,20);
		f.add(l2);

		tf2=new TextField(50);
		tf2.setBounds(200,90,150,20);
		f.add(tf2);

		l3=new Label("LastName:");
		l3.setBounds(50,130,150,20);
		f.add(l3);

		tf3=new TextField(50);
		tf3.setBounds(200,130,150,20);
		f.add(tf3);
          

		l4=new Label("Email ID");
		l4.setBounds(50,170,150,20);
		f.add(l4);

		tf4=new TextField(50);
		tf4.setBounds(200,170,150,20);
		f.add(tf4);

		l5=new Label("Contact:");
		l5.setBounds(50,210,150,20);
		f.add(l5);

		tf5=new TextField(50);
		tf5.setBounds(200,210,150,20);
		f.add(tf5);

		CheckboxGroup cg1;
          Checkbox female,male;
          cg1=new CheckboxGroup();
          ab= new Label("Gender:");
          ab.setBounds(50,250,50,20);
          female=new Checkbox("Female",cg1,false);
          female.setBounds(200,250,50,20);
          male=new Checkbox("Male",cg1,false);
          male.setBounds(300,250,50,20);
          f.add(ab);
          f.add(female);
          f.add(male); 
	    l6 = new Label("Stream:");
          l6.setBounds(50,290,50,20);
          f.add(l6);
           l7= new Label("Class:");
           l7.setBounds(50,330,50,20);
            f.add(l7);
		 stream=new Choice();
           c=new Choice();
                 
                    stream.setBounds(200, 290, 75, 75);    
                    stream.add("BCOM");
                    stream.add("BBI");
                    stream.add("BSC-IT");
                    stream.add("BFM");
                    stream.add("BMS");
                    stream.add("BSC-MICRO");
                    stream.add("BSC-BIOTEC");
                    stream.add("BSC-CS");
                    f.add(stream);
                    c.setBounds(200,330,75,75);
                    c.add("FY");
                    c.add("SY");
                    c.add("TY");
                    f.add(c);


		b1=new Button("Login");
		b1.setBounds(50,500,100,30);
		f.add(b1);
		b1.setBackground(Color.ORANGE);
        	b1.setForeground(Color.WHITE);

		b2=new Button("Back");
		b2.setBounds(150,500,100,30);
		f.add(b2);
		b2.setBackground(Color.ORANGE);
        	b2.setForeground(Color.WHITE);

		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		f.setSize(1500,1500);
		f.setLayout(null);
		f.setVisible(true);
	}
	
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
			{
			JOptionPane.showMessageDialog(null, "You had be Registered Sucessfully!!");
                String sID=tf1.getText();
				String fn=tf2.getText();
				String ln=tf3.getText();
				String eID=tf4.getText();
				String contact=tf5.getText();
				
                 System.out.println("Student ID: "+sID);
				System.out.println("FirstName: "+fn);
				System.out.println("LastName: "+ln);
				System.out.println("Email ID: "+eID);
				System.out.println("Contact : "+contact);
				
			
			}
			else
			{
				new HomePage();
				f.setVisible(false);
			}
		}
		

}


class Issue implements ActionListener
{  
     Frame frame;
	Label l1,l2,l3,l4,l5,l6,m;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,n;
	Choice bn;
     Button a,submit;
	
	Issue()
	{
		frame=new Frame("Issue Book");
		          l1 = new Label("Book No:");
                    l1.setBounds(50,50,100,30);
                    frame.add(l1);
                    tf1=new TextField(15);
                    tf1.setBounds(200,50,100,30);                 
                    frame.add(tf1);

                    l2= new Label("Book Name:");
                    l2.setBounds(50,90,100,30);
                    frame.add(l2);
               
                    bn=new Choice();
                    bn.setBounds(200,95,150,75);    
                    bn.add("Data Structure");
                    bn.add("Computer Networking");
                    bn.add("Computer Graphics");
                    bn.add("Core Java");
                    bn.add("Web Development");
                    bn.add("Python");
                    bn.add("Software Engineering");
                    bn.add("Digital Electronics");
                              
                    frame.add(bn);

                    l3 = new Label("Book Author:");
                    l3.setBounds(50,130,100,30);                 
                    frame.add(l3);
                    tf3=new TextField(15);
                    tf3.setBounds(200,130,100,30);                 
                    frame.add(tf3);

                    l4= new Label("Student ID:");
                    l4.setBounds(50,170,100,30);                
                    frame.add(l4);
                    tf4=new TextField(10);
                    tf4.setBounds(200,170,100,30);                 
                    frame.add(tf4);

                    l5 = new Label("Student Name:");
                    l5.setBounds(50,210,100,30);                 
                    frame.add(l5);
                    tf5=new TextField(15);
                    tf5.setBounds(200,210,100,30);                 
                    frame.add(tf5);

                    l6 = new Label("Contact:");
                    l6.setBounds(50,250,100,30);                 
                    frame.add(l6);
                    tf6=new TextField(15);
                    tf6.setBounds(200,250,100,30);                 
                    frame.add(tf6);
                      

                    m=new Label("Issue Date:");
                    m.setBounds(50,290,100,30);                
                    frame.add(m);

                    n=new TextField(15);
                    n.setBounds(200,290,100,30);               
                    frame.add(n);

                    a=new Button("Get Author");
                    a.setBackground(Color.YELLOW);
                    a.setBounds(50,350,100,30);
                    frame.add(a);
                    
                    submit=new Button("Submit");
                    submit.setBackground(Color.YELLOW);
                    submit.setBounds(200,350,100,30);

                    frame.add(submit);
                    a.addActionListener(this);
		          submit.addActionListener(this);
                    
		frame.setSize(800,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
		
	
	public void actionPerformed(ActionEvent e)
	{
      if(e.getSource()==a)
                     {
                      tf3.setText("Allen Downey");
                     }
      if(e.getSource()==submit)
                     {
                     
                      JOptionPane.showMessageDialog(null, "Book Successfully Issued!!");
                      String si=tf4.getText();
                      String sn=tf5.getText();
                      String bno=tf1.getText();
			     String bau=tf3.getText();
			     String issdate=n.getText();
			     System.out.println("------Book after Issued-------");
                     System.out.println("Student ID: "+si);
                     System.out.println("Student Name: "+sn);
                     System.out.println("Issue date: "+issdate);
                     System.out.println("Book Number: "+bno);
			     System.out.println("Book Author: "+bau);
				
                     new HomePage();
			       frame.setVisible(false);
                     }
			
	}
}

class Return implements ActionListener
{
	Frame frame;
	Label l1,l2,l3,m,ab;
	TextField tf1,n,tf2,tf3;
	Button a,b;
	
	Return()
	{
		frame=new Frame("Returning book");
		
                    l1 = new Label("Student ID:");
                    l1.setBounds(50,50,100,30);
                    frame.add(l1);
                    tf1=new TextField(15);
                    tf1.setBounds(200,50,100,30);                 
                    frame.add(tf1);

                    l2= new Label("Book No:");
                    l2.setBounds(50,90,100,30);
                    frame.add(l2);
                    tf2=new TextField(15);
                    tf2.setBounds(200,90,100,30);
                    frame.add(tf2);
                    
                    CheckboxGroup cg1;
                    Checkbox yes,no;
                    cg1=new CheckboxGroup();
                    ab= new Label("Do you like to Visit my Library Again:");
                    ab.setBounds(50,130,200,20);
                    frame.add(ab);

                    yes=new Checkbox("Yes",cg1,false);
                    yes.setBounds(300,130,50,20);
                    frame.add(yes);

                    no=new Checkbox("No",cg1,false);
                    no.setBounds(350,130,50,20);
                    frame.add(no);
                  
                     
                    l3= new Label("No of Days you had taken book:");
                    l3.setBounds(50,170,200,30);
                    frame.add(l3);
                    tf3=new TextField(15);
                    tf3.setBounds(300,170,50,30);
                    frame.add(tf3);

                    Button a=new Button("Submit");
                    a.setBackground(Color.YELLOW);
                    a.setBounds(50,220,50,20);
                    frame.add(a);
                    a.addActionListener(this);

                    Button b=new Button("Back");
                    b.setBackground(Color.YELLOW);
                    b.setBounds(100,220,50,20);
                    frame.add(b);
                    b.addActionListener(this);
                  

		frame.setSize(800,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)

       {
       if(tf1.getText().length()>5)
                      {
                        JOptionPane.showMessageDialog(null,"Please enter correct ID!!");
                      }
       else if(tf3.getText().length()>1)
                      {
                        JOptionPane.showMessageDialog(null,"You have to pay the Fine!!");
                      }
       else
                     {
                     
                     JOptionPane.showMessageDialog(null, "Thank you!!Visit Again!!!!!!");
                     String sid=tf1.getText();
				String bno=tf3.getText();
			
				System.out.println("------Book after Returned-------");
				System.out.println("Student ID: "+sid);
                      System.out.println("Book Number: "+bno);
		
				
                     new HomePage();
			       frame.setVisible(false);
                     }
       }

}


	
