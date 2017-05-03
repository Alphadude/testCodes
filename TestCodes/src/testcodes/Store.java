/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcodes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author alphadude
 */
public class Store {
    Writer output;
    
    /*
    public void savefile(String man,String price, String year) throws IOException{
             
            Path p = Paths.get("//home//alphadude//NetBeansProjects//GUI//src//ProjectLaptop//supply.txt");
            String s = System.lineSeparator() + " "+man+"\t"+price+"\t"+year;
            System.out.println("the file was created");
        
        try {
                Files.write(p, s.getBytes(), StandardOpenOption.APPEND);
                System.out.println("the file was created and appended");
                
            } catch (Exception e) {
                
                System.err.println(e);
            }
    }
    */
    
    public void connect(String man,String price, String year){
        try{
            
            output = new BufferedWriter(new FileWriter("//home//alphadude//NetBeansProjects//GUI//src//ProjectLaptop//supply.txt",true));  //clears file every time
            output.append("\n"+man+"\t"+price+"\t"+year);
          
        }catch(Exception e){
            
            System.err.println(e);
        }
        
        
    }
    public void close() throws IOException{
        //Path.close();
        output.close();
        
    }
    
}

