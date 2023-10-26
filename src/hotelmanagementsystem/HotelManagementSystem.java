package hotelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HotelManagementSystem extends JFrame implements ActionListener {
    //Constructor//
    HotelManagementSystem(){
        setSize(1920,1080); //Should be the same as image size
        setVisible(true);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/background.jpg"));
        JLabel image=new JLabel();
        image.setBounds(0, 0, 1920,1080);
        image.setIcon(i1);//Important
        add(image);
        //Adding Text
        JLabel text=new JLabel("HOTEL MANAGEMENT SYSTEM");
        text.setBounds(20,700,1000,100);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serif",Font.ITALIC,60));
        image.add(text);  
        
        JButton button=new JButton("NEXT");
        button.addActionListener(this);
        
        button.setFont(new Font("serif",Font.ITALIC,20));
        button.setBounds(1300,730,150,50);
        image.add(button);

}
 
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
        }
       

    public static void main(String[] args) {
        new HotelManagementSystem();
    }
    
}

