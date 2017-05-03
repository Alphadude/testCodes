/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcodes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author alphadude
 */
public class SaveFile extends JFrame implements ActionListener {
    
    private JLabel lblnumber, lblman,lblmodeler,lblpricetag;
    private JLabel lblmanufacturer, lblmodel,lblprice;
    private JButton btnext; 
 
    public SaveFile(){
        setSize(700,500);
        setLayout(null);
        setVisible(true);
        setTitle("LIST OF LAPTOPS");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblnumber = new JLabel("S/N");
        lblnumber.setBounds(50, 30, 50,50);
        add(lblnumber);
        
        lblman = new JLabel("MANUFACTURER");
        lblman.setBounds(150, 30, 150,50);
        add(lblman);
        
        lblpricetag = new JLabel("PRICE");
        lblpricetag.setBounds(550, 30, 100,50);
        add(lblpricetag);
        
        lblmodeler = new JLabel("MODEL");
        lblmodeler.setBounds(350, 30, 100,50);
        add(lblmodeler);
        
        lblmanufacturer = new JLabel();
        add(lblmanufacturer);
        
        lblprice = new JLabel();
        add(lblprice);
        
        lblmodel = new JLabel();
        add(lblmodel);
        
        btnext = new JButton();
        add(btnext);
        btnext.setText("BACK");
        btnext.setBounds(300, 400, 100, 50);
        btnext.addActionListener(this);
        
    }
        
       
    public static void main(String []args){
        SaveFile money = new SaveFile();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String finder = e.getActionCommand();
        
        if(finder.equals("BACK")){
            this.setVisible(false);
            WelcomeScreeen men = new WelcomeScreeen();
            men.setVisible(true);
            
        }
    }

    
}

