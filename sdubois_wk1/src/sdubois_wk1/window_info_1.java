/*
 * Design, implement, test, and debug a GUI-based version of a “Hello,
 * World!” program.
 * Create a JFrame that includes a JLabel that reads “Hello, World!”
 * Use a layout manager of your choice.
 * Include an Exit button to close the program.
 * Submit the .java source file.
 */
package sdubois_wk1;

/**
 *
 * Hello World GUI
 * Scott DuBois
 * PRG/421
 * October 14, 2013
 * Roland Morales
 * 
 */

import java.awt.*;
import javax.swing.*;

public class window_info_1 extends JFrame
{

  
  public window_info_1()
  {
      //Call JFrame constructor and pass title
      super("SDuBois_Wk1");
      
      final int WINDOW_W = 250, //Window width
                WINDOW_H = 100; //Window height
      
      //Set Window Size
      setSize(WINDOW_W, WINDOW_H);
      
      //Define action when window is closed
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //Center window
      setLocationRelativeTo(null);
      
      //Label message
      JLabel helloWorld = new JLabel("Hello World!", SwingConstants.CENTER);
      helloWorld.setForeground(Color.blue);
      add(helloWorld);
      
      //Display window
      setVisible(true);    
  }
          
}
