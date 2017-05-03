/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcodes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alphadude
 */
public class SearchLaptop extends JFrame implements ActionListener{
    private JTextField txtSearch,txtname,txtprice,txtyear;
    private JButton btnSearch, btnBack;
    private JComboBox list;
    private JLabel lblsearch,lblname,lblprice,lblyear,lbltitle,lblSyear,lbltext;
    
    String [] years = {"0","1","2","3","4","5"};
    
    SearchLaptop(){
        setSize(700,500);
        setLayout(null);
        setVisible(true);
        setTitle("SEARCH PAGE");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        list = new JComboBox(years);
        add(list);
        list.setBounds(300, 50, 200, 30);
        
        lblSyear = new JLabel("SEARCH BY YEAR");
        add(lblSyear);
        lblSyear.setBounds(200, 50,100 , 50);
        
        lbltext = new JLabel("SEARCHED RESULT APPEARS BELOW");
        add(lbltext);
        lbltext.setBounds(250, 150, 400, 50);
        
        lbltitle = new JLabel("SEARCH HERE");
        lbltitle.setBounds(200, 100, 300, 50);
        add(lbltitle);
        
        txtSearch = new JTextField();
        txtSearch.setBounds(300, 100, 200, 30);
        add(txtSearch);
        
        txtname = new JTextField();
        txtname.setBounds(300, 200, 200, 30);
        add(txtname);
        
        txtprice = new JTextField();
        txtprice.setBounds(300, 250, 200, 30);
        add(txtprice);
        
        txtyear = new JTextField();
        add(txtyear);
        txtyear.setBounds(300, 300,200, 30);
        
        btnSearch = new JButton();
        add(btnSearch);
        btnSearch.setText("SEARCH");
        btnSearch.setBounds(200, 350, 100, 50);
        
        btnBack = new JButton();
        btnBack.setText("BACK");
        btnBack.addActionListener(this);
        add(btnBack);
        btnBack.setBounds(450, 350, 100, 50);
        
        lblname = new JLabel("MANUFACTURER");
        lblname.setBounds(200, 200, 100,40);
        add(lblname);
        
        
        lblprice = new JLabel("PRICE");
        lblprice.setBounds(200, 250, 100,40);
        add(lblprice);
        
        lblyear = new JLabel("YEAR");
        lblyear.setBounds(200, 300, 100, 40);
        add(lblyear);
        
        
    }
    /*
    public static void main(String []args){
        SearchLaptop third = new SearchLaptop();
    }
*/

    @Override
    public void actionPerformed(ActionEvent e) {
        String mover = e.getActionCommand();
        
        if (mover.equals("BACK")){
            WelcomeScreeen ben = new WelcomeScreeen();
            ben.setVisible(true);
            this.setVisible(false);
        }
    }
    
}
