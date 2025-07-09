
package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class DashBoard extends JFrame {
    
    DashBoard(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1= new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2= new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        JButton AddPersonalDetails = new JButton("Add  Personal details");
        AddPersonalDetails.setBounds(0,0,300,50);
        AddPersonalDetails.setBackground(new Color(0,0,102));
        AddPersonalDetails.setForeground(Color.WHITE);
        AddPersonalDetails.setFont( new Font("Tahoma",Font.PLAIN,20));
        AddPersonalDetails.setMargin(new Insets(0,0,0,60));
        p2.add(AddPersonalDetails);
        
       JButton updatePersonalDetails = new JButton("Update Personal details");
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont( new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        p2.add(updatePersonalDetails);
        
        JButton viewPersonalDetails = new JButton("View Personal details");
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont( new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        p2.add(viewPersonalDetails);
        
        JButton deletePersonalDetails = new JButton("Delete Personal details");
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont( new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,50));
        p2.add(deletePersonalDetails);
        
         JButton  checkpackages = new JButton("Check Packages");
        checkpackages.setBounds(0,200,300,50);
        checkpackages.setBackground(new Color(0,0,102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont( new Font("Tahoma",Font.PLAIN,20));
        checkpackages.setMargin(new Insets(0,0,0,50));
        p2.add(checkpackages);
        
        JButton  bookkpackages = new JButton("Book Packages");
        bookkpackages.setBounds(0,250,300,50);
        bookkpackages.setBackground(new Color(0,0,102));
        bookkpackages.setForeground(Color.WHITE);
        bookkpackages.setFont( new Font("Tahoma",Font.PLAIN,20));
        bookkpackages.setMargin(new Insets(0,0,0,120));
        p2.add(bookkpackages);
        
        JButton  viewpackages = new JButton("View Packages ");
        viewpackages.setBounds(0,300,300,50);
        viewpackages.setBackground(new Color(0,0,102));
        viewpackages.setForeground(Color.WHITE);
        viewpackages.setFont( new Font("Tahoma",Font.PLAIN,20));
        viewpackages.setMargin(new Insets(0,0,0,120));
        p2.add(viewpackages);
        
        JButton  viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0,350,300,50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont( new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        p2.add(viewhotels);
        
        JButton  bookhotels = new JButton("Book Hotels");
        bookhotels.setBounds(0,400,300,50);
        bookhotels.setBackground(new Color(0,0,102));
        bookhotels.setForeground(Color.WHITE);
        bookhotels.setFont( new Font("Tahoma",Font.PLAIN,20));
        bookhotels.setMargin(new Insets(0,0,0,140));
        p2.add(bookhotels);
        
         JButton  bookedhotels = new JButton("View Booked Hotels");
        bookedhotels.setBounds(0,450,300,50);
        bookedhotels.setBackground(new Color(0,0,102));
        bookedhotels.setForeground(Color.WHITE);
        bookedhotels.setFont( new Font("Tahoma",Font.PLAIN,20));
        bookedhotels.setMargin(new Insets(0,0,0,70));
        p2.add(bookedhotels);
        
         JButton  destinantions = new JButton("Destinations");
        destinantions.setBounds(0,500,300,50);
        destinantions.setBackground(new Color(0,0,102));
        destinantions.setForeground(Color.WHITE);
        destinantions.setFont( new Font("Tahoma",Font.PLAIN,20));
        destinantions.setMargin(new Insets(0,0,0,125));
        p2.add(destinantions);
        
        JButton  payments = new JButton("Payment");
        payments.setBounds(0,550,300,50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.WHITE);
        payments.setFont( new Font("Tahoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,155));
        p2.add(payments);
       
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text = new JLabel("Travel & Tourism Management System");
        text.setBounds(400,70,1000,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.PLAIN,45));
        image.add(text);
        
        setVisible(true);
    }
    
    public static void main(String[] args){
        new DashBoard();
    }
    
}
