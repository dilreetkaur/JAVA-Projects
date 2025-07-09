
package travel.management.system;

import java.awt.Color;
import javax.swing.*;


public class AddCustomer extends JFrame{
    
    JLabel labelusername;
    JComboBox comboid;
    JTextField tfnumber;
    AddCustomer(){
        setBounds(450,200,850,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel ("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lbid = new JLabel ("Id");
        lbid.setBounds(30,90,150,25);
        add(lbid);
        
        comboid = new JComboBox(new String[] {"Passport", "Aadhar Card", "Pan Card", "Ration Card"});
        comboid.setBounds(220,90,150,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
        JLabel lblnumber = new JLabel ("Number");
        lblnumber.setBounds(30,130,150,25);
        add(lblnumber);
        
        tfnumber = new JTextField();
        tfnumber.setBounds(220,130,150,25);
        add(tfnumber);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new AddCustomer();
    }
    
}
