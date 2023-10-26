
package hotelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddEmployee extends JFrame implements ActionListener{
    
	JTextField name,age,sal,phone,aadhar,emaill;
        JRadioButton rbmale,rbfemale;
        JButton save;
        JComboBox c1;
    AddEmployee(){
           getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("ADD EMPLOYEE DETAILS");
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(1920,1080);
            getContentPane().setLayout(null);
			
            JLabel namee = new JLabel("NAME");
            namee.setFont(new Font("Tahoma", Font.PLAIN, 17));
            namee.setBounds(60, 30, 150, 27);
            add(namee);
            
            name = new JTextField();
            name.setBounds(200, 30, 150, 27);
            add(name);
			
            save = new JButton("SAVE");
            save.setBounds(200, 420, 150, 30);
            save.setBackground(Color.BLACK);
            save.setForeground(Color.WHITE);
            save.addActionListener(this);
            add(save);
            //Age
            JLabel agee = new JLabel("AGE");
            agee.setFont(new Font("Tahoma", Font.PLAIN, 17));
            agee.setBounds(60, 80, 150, 27);
            add(agee);
			
            age = new JTextField();
            age.setBounds(200, 80, 150, 27);
            add(age);
            //Age
            //Gender
            JLabel Gender = new JLabel("GENDER");
            Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Gender.setBounds(60, 120, 150, 27);
            add(Gender);
		
            rbmale = new JRadioButton("MALE");
            rbmale.setBackground(Color.WHITE);
            rbmale.setBounds(200, 120, 70, 27);
            add(rbmale);
	
            rbfemale = new JRadioButton("FEMALE");
            rbfemale.setBackground(Color.WHITE);
            rbfemale.setBounds(280, 120, 70, 27);
            add(rbfemale);
            ButtonGroup bg=new ButtonGroup();
            bg.add(rbmale);
            bg.add(rbfemale);
            //Gender
       		//Dropdown
            String str[] = {"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
            c1 = new JComboBox(str);
            c1.setBackground(Color.WHITE);
            c1.setBounds(200,170,150,30);
            add(c1);
            //Dropdown
            //Nationality	
            JLabel salary = new JLabel("SALARY");
            salary.setFont(new Font("Tahoma", Font.PLAIN, 17));
            salary.setBounds(60, 220, 150, 27);
            add(salary);
			
            sal = new JTextField();
            sal.setBounds(200, 220, 150, 27);
            add(sal);
            // Nationality
	//Phone
            JLabel Name = new JLabel("PHONE");
            Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Name.setBounds(60, 270, 150, 27);
            add(Name);
	
            phone = new JTextField();
            phone.setBounds(200, 270, 150, 27);
            add(phone);
            //Phone
	
            JLabel Phno = new JLabel("AADHAR");
            Phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Phno.setBounds(60, 320, 150, 27);
            add(Phno);
			
            aadhar = new JTextField();
            aadhar.setBounds(200, 320, 150, 27);
            add(aadhar);
	
            
            JLabel email = new JLabel("EMAIL");
            email.setFont(new Font("Tahoma", Font.PLAIN, 17));
            email.setBounds(60, 370, 150, 27);
            add(email);
			
            emaill = new JTextField();
            emaill.setBounds(200, 370, 150, 27);
            add(emaill);
	
            setVisible(true);
	
            JLabel AddPassengers = new JLabel("ADD EMPLOYEE DETAILS");
            AddPassengers.setForeground(Color.BLUE);
            AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
            AddPassengers.setBounds(450, 24, 442, 35);
            add(AddPassengers);
            
             ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/addemployee.jpg"));
            Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
            ImageIcon i2 = new ImageIcon(i3);
            JLabel image = new JLabel(i2);
            image.setBounds(410,80,480,410);
            add(image);
            
            }
    @Override
    public void actionPerformed(ActionEvent ae)
                    
            {
                String name1=name.getText();
                String age1=age.getText();
                String sall=sal.getText();
                String ph=phone.getText();
                String em=emaill.getText();
                String aad=aadhar.getText();
                String gender=null;
                if(rbmale.isSelected()){
                
                gender="Male";
                }
                else if(rbfemale.isSelected()){
                gender="Female";
                }
                String job=(String)c1.getSelectedItem(); 
                try{
                conn c = new conn();
                        String str = "INSERT INTO employee values( '"+name1+"', '"+age1+"', '"+gender+"','"+job+"', '"+sall+"', '"+ph+"','"+aad+"', '"+em+"')";
                        
                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Employee Added");
                        setVisible(false);
                }
                catch(Exception e){
                    
                e.printStackTrace();}
                
                
            }
    public static void main(String[] args ){
    new AddEmployee();
    
    }
}
