
package hotelmanagementsystem;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame{
    Dashboard(){
        setBounds(0,0,1920,1080);
        setLayout(null);
        setVisible(true);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dash.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,1920,1080);
        add(image);
        
        JLabel text=new JLabel("We Welcome You!");
        text.setBounds(600,60,1000,50);
        text.setFont(new Font("Tahoma",Font.ITALIC,45));
        image.add(text);
        
        JMenuBar mb= new JMenuBar();
        mb.setBounds(0,0,1920,45);
        image.add(mb);
        //Adding Menus
        JMenu hotel =new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.GRAY);
        mb.add(hotel);
        
        JMenu admin =new JMenu("ADMIN");
        admin.setForeground(Color.GRAY);
        mb.add(admin);
        
        JMenuItem reception=new JMenuItem("RECEPTION");
        hotel.add(reception);  
        reception.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				new Reception().setVisible(true);
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
       
        JMenuItem addemployee=new JMenuItem("ADD EMPLOYEE");
        admin.add(addemployee);
        
        addemployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				new AddEmployee().setVisible(true);
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
        
  
        
         JMenuItem addrooms=new JMenuItem("ADD ROOMS");
        admin.add(addrooms);
        addrooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				new AddRooms().setVisible(true);
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
         JMenuItem adddrivers=new JMenuItem("ADD DRIVERS");
        admin.add(adddrivers);
        adddrivers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				new AddDrivers().setVisible(true);
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
        
    } 
   public static void main(String[] args){
       new Dashboard();
       
   }
    
}
