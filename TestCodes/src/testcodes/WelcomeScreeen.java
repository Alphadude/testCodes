/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcodes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author alphadude
 */
public class WelcomeScreeen extends JFrame implements ActionListener{
    
    private JButton btnAdd,btnSearch,btnlist;
    private JLabel lblwelcome,lblpics,lblcompName;
    private ImageIcon image;
    
    WelcomeScreeen(){
        setSize(700,500);
        setLayout(null);
        setTitle("WELCOME PAGE");
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        image = new ImageIcon("//home//alphadude//NetBeansProjects//GUI//src//ProjectLaptop//pic.jpg");
        
        btnAdd = new JButton();
        add(btnAdd);
        btnAdd.setBounds(100, 350,100, 50);
        btnAdd.addActionListener(this);
        btnAdd.setText("ADD");
        
        btnSearch = new JButton();
        add(btnSearch);
        btnSearch.setBounds(300, 350, 100,50);
        btnSearch.addActionListener(this);
        btnSearch.setText("SEARCH");
        
        btnlist = new JButton();
        add(btnlist);
        btnlist.setBounds(500, 350, 100,50);
        btnlist.addActionListener(this);
        btnlist.setText("LIST");
        
        lblwelcome = new JLabel("WELCOME");
        lblwelcome.setBounds(300,100, 100, 40);
        add(lblwelcome);
        
        lblpics = new JLabel();
        lblpics.setBounds(150,150,400,200);
        lblpics.setIcon(image);
        add(lblpics);
        
        lblcompName = new JLabel("GODFREY LAPTOP COMPANY");
        lblcompName.setBounds(250, 50, 200,50);
        add(lblcompName);
        
        image = new ImageIcon();
        
    }
    public static void main(String []args){
        WelcomeScreeen first = new WelcomeScreeen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String picker = e.getActionCommand();
        
        if(picker.equals("ADD")){
            TestCodes one = new TestCodes();
            one.setVisible(true);
            this.setVisible(false);
            
        }
        if (picker.equals("SEARCH")){
            SearchLaptop two = new SearchLaptop();
            two.setVisible(true);
            this.setVisible(false);
        }
        if (picker.equals("LIST")){
            SaveFile two = new SaveFile();
            two.setVisible(true);
            this.setVisible(false);
        }
        
    }
    
    
    
}

