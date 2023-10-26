package hotelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
    public class Login extends JFrame implements ActionListener{
        JTextField username;
        JPasswordField password;
        JButton login,cancel;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(500,200,600,300);
        setVisible(true);
        //USERNAME
        JLabel user=  new JLabel("USERNAME");
        user.setBounds(40,20,100,30);
        add(user);
        //PASSWORD
        JLabel pass=new JLabel("PASSWORD");
        pass.setBounds(40,60,100,30);
        add(pass);
        //Username Text Field
        username=new JTextField();
        username.setBounds(150,20,150,30);
        add(username);
        //Password Text Field
        password=new JPasswordField();
        password.setBounds(150,60,150,30);
        add(password);
        //Login Button
        login=new JButton("LOGIN");
        login.setBounds(    37,110,120,30);
         login.addActionListener(this);
        add(login);
        cancel=new JButton("CANCEL");
        cancel.setBounds(    180,110,120,30);
        cancel.addActionListener(this);
        add(cancel);
        //Image
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
         Image  i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);    
         JLabel image=new JLabel(i3);
         image.setBounds(350,-20,200,200);
         image.setIcon(i3);
         add(image);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
               String user= username.getText();
               String pass=password.getText();
               try{
               conn c=new conn();
               String query="select * from login where username ='"+user+"' and password='"+pass+"'";
               ResultSet rs=c.s.executeQuery(query);
               if(rs.next()){
                   setVisible(false);
                   new Dashboard();
               }
               else{
               JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                       }
               
               }
               catch(Exception e){
               e.printStackTrace()
                       ;}
             }
             if(ae.getSource()==cancel){
                 setVisible(false);
             }
         }
    
    public static void main(String[] args){
        new Login(); 
    }
}
