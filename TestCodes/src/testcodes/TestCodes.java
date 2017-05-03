
package testcodes;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author alphadude
 */
public class TestCodes extends JFrame implements ActionListener{
    
    private JTextField txtLaptopName,txtPrice,txtYear;
    private JButton btnsave,btnBack,btnclear;
    private JLabel lbltitle,lblmanuf,lblprice,lblyear;
    private  Font font1,font2,brown;
    
    TestCodes(){
        setSize(700,500);
        setLayout(null);
        setVisible(true);
        setTitle("ADD LAPTOP PAGE");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        font1 = new Font("FreeSans",Font.ITALIC,20);
        font2 = new Font("Comic Sans",Font.BOLD,11);
        brown = new Font("Garuda",Font.PLAIN,15);
        
        
        txtLaptopName = new JTextField();
        add(txtLaptopName);
         txtLaptopName.setBounds(280,150,200,30);
        
        txtPrice = new JTextField();
        add(txtPrice);
         txtPrice.setBounds(280,200,200,30);
        
        txtYear = new JTextField();
        add(txtYear);
        txtYear.setBounds(280,250,200,30);
        
        btnsave = new JButton();
        add(btnsave);
        btnsave.setBounds(300,350,100,50);
        btnsave.addActionListener(this);
        btnsave.setText("SAVE");
        
        btnBack = new JButton();
        add(btnBack);
        btnBack.setBounds(120,350,100,50);
        btnBack.addActionListener(this);
        btnBack.setText("BACK");
        
        btnclear = new JButton();
        add(btnclear);
        btnclear.setBounds(480,350,100,50);
        btnclear.addActionListener(this);
        btnclear.setText("CLEAR");
        
        lbltitle = new JLabel("ADD LAPTOP SCREEN");
        add(lbltitle);
        lbltitle.setFont(font1);
        lbltitle.setBounds(280,50,250,50);
        
        lblmanuf = new JLabel("MANUFACTURER");
        add(lblmanuf);
        lblmanuf.setFont(font2);
        lblmanuf.setBounds(150,150, 100, 40);
        
        lblprice = new JLabel("PRICE");
        add(lblprice);
        lblprice.setFont(brown);
        lblprice.setBounds(150, 200, 100, 40);
        
        lblyear = new JLabel("YEAR");
        add(lblyear);
        lblyear.setFont(font2);
        lblyear.setBounds(150, 250, 100, 40);
        
        
        
        
    }
    /*
    public static void main(String []args){
        AddLaptop second = new AddLaptop();
    }
*/

    @Override
    public void actionPerformed(ActionEvent e) {
        
         String finder = e.getActionCommand();
         
         if (finder.equals("SAVE")){
             
             String year,manufacturer,price;
             
             if(txtLaptopName.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Field manufacturer is Empty", "Error",JOptionPane.PLAIN_MESSAGE);
                   return;
                   
                } else{
                    manufacturer =  txtLaptopName.getText().toString().trim().toUpperCase(); 
                } 
             
              if(txtPrice.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Field Price is Empty", "Error",JOptionPane.PLAIN_MESSAGE);
                   return;
                } else{
                    price =  txtPrice.getText().toString().trim(); 
                } 
              
               if(txtYear.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Field Year is Empty", "Error",JOptionPane.PLAIN_MESSAGE);
                   return;
                } else{
                    year =  txtYear.getText().toString().trim(); 
                } 
               
               
            Store more = new Store();
            
             try {
                 
                 more.connect(manufacturer,price,year);
                 JOptionPane.showMessageDialog(null, "MISSION SUCCESFUL", "SUCCESS",JOptionPane.PLAIN_MESSAGE);
             } catch (Exception ex) {
                 
                JOptionPane.showMessageDialog(null, "CANNOT SAVE FILE", "Error",JOptionPane.PLAIN_MESSAGE); 
             }
             try {
                 more.close();
             } catch (IOException ex) {
                 Logger.getLogger(TestCodes.class.getName()).log(Level.SEVERE, null, ex);
             }
             
         } 
             
             
         if (finder.equals("BACK")){
             WelcomeScreeen next = new WelcomeScreeen();
             next.setVisible(false);
             this.setVisible(false);
         }
         if (finder.equals("CLEAR")){
             
             txtLaptopName.setText("");
             txtPrice.setText("");
             txtYear.setText("");
             
             JOptionPane.showMessageDialog(null, "CLEARED SUCCESSFULLY", "DONE",JOptionPane.PLAIN_MESSAGE); 
         }
    }
}
