/*
 * Week 2 DQ 2
 * 
 * Write a 200 – 300 word short-answer response for the following:
 * How do arrays and combo boxes work together?
 * Write a small program in which you add the elements for an
 * array to a combo box and post the code for your program. (Day 6)
 * 
 */
package cbox1;

/**
 * @author Scott DuBois
 */

import javax.swing.*; 

public class Cbox1
{
    public static void main(String[] args) 
    {
        //Create JFrame box
        JFrame dq2 = new JFrame ("SDuBois DQ2");
        
        final int WINDOW_W = 250, //Window width
                  WINDOW_H = 50; //Window height
        
        //Set Window Size
        dq2.setSize(WINDOW_W, WINDOW_H);
        
        //Define action when window is closed
        dq2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Center window
        dq2.setLocationRelativeTo(null);
        
        //Create array string list 
        String[] os = {"Mint", "Ubuntu", "elementary", "Fedora"};
        
        //Create combobox for drop-down selection
        JComboBox osBox = new JComboBox(os);
       
        //Center text in cell
        DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
        dlcr.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
        osBox.setRenderer(dlcr);
               
        //Add combobox to window
        dq2.add(osBox);
        
        //Display window
        dq2.setVisible(true);              
    }
}
