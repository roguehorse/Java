/*
 * Calculator Data Class
 * 
 */
package calculator_v1;

/**
 *
 * Retail Calculator
 * Scott DuBois
 * PRG/421
 * October 21, 2013
 * Roland Morales
 * 
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class calcdata1 extends JFrame
{

    //Create main panel
    private JPanel panel;              //Panel to hold data
    
    //Item data
    private JLabel item1;              //Item selection variable
    private JTextField item1a;         //Item select text field entry
       
    //Department combo box
    private JPanel depart;             //Create department selction panel
    private JLabel dep1;               //Department selection variable
    private JComboBox dep1a;           //Combo box department selection
    
    //Departments string for combo box
    private String[] deps = { " ", "Motherboards", "Processors", "Video", "RAM", 
                              "Storage" };
    
    //Set original price
    private JLabel oprice1;            //Original price text
    private JTextField oprice1a;       //Original price text entry
    String priceselect;
    
    //Set discount value
    private JLabel dvalue1;            //Discount value text
    private JTextField dvalue1a;       //Discount value text entry
    String percentselect;
    
    //Window data
    private final int WINDOW_W = 500;  //Set window width
    private final int WINDOW_H = 270;  //Set window height
    
    //Calculate item price reduction
    private JButton item1calc;         //Calculate discount for item
    
    //End calc display panel
    private JPanel dpanel;             //Create display display panel 
    private JTextArea calcdisplay;     //Text area for calc results
    private JList calclist;            //Items added to panel
    
    /*
     * Construct items
     */
    
  public calcdata1()
  {
      
      //Call JFrame constructor and pass title
      super("Retail Calculator");
      
      //Define action when window is closed
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //Set layout manager
      setLayout(new BorderLayout());
        
      //Set Window Size
      setSize(WINDOW_W, WINDOW_H);
      setResizable(false);
                    
      //Build the panel to hold content
      departPanel();
      buildPanel();
      displayPanel();
      
      //Add the panel to frame
      add(dpanel, BorderLayout.NORTH);
      add(panel, BorderLayout.CENTER);
      add(calcdisplay, BorderLayout.SOUTH);
     
      //Center window
      setLocationRelativeTo(null);
          
      //Display window
      setVisible(true);
      
  }

  /*
   * Build panels to hold action items
   */
  
  private void departPanel()
  {
      
      //Create department selection panel
      dpanel = new JPanel();
      
      //Create user action components for department
      dep1 = new JLabel ("                   Select Department");
      dep1a = new JComboBox(deps);
     
      //Center text in combo box
      DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
      dlcr.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
      dep1a.setRenderer(dlcr);
       
      
      //Add items to panel
      dpanel.add(dep1);
      dpanel.add(dep1a);
      
      
  }
   
  private void buildPanel()
  {
      
     //Create the panel
     panel = new JPanel();
    
     //Create user action components for item
     item1 = new JLabel ("Item to be marked down");
     item1a = new JTextField (15);

     //Create user action for original price entry
     oprice1 = new JLabel ("                                 Enter original price $");
     oprice1a = new JTextField (5);
     
     //Create user action for discount entry
     dvalue1 = new JLabel ("                          Enter discount percentage %");
     dvalue1a = new JTextField (2);
     //String percentselect = (String) dvalue1a.getText();
        
     //Create calculate button
     item1calc = new JButton("      Calculate      ");
     
     //Add action listener to calc cutton
     item1calc.addActionListener(new CalcButtonListener());
     
     //Add all items to the panel
     panel.add(item1);
     panel.add(item1a);
     panel.add(oprice1);
     panel.add(oprice1a);
     panel.add(dvalue1);
     panel.add(dvalue1a);
     panel.add(item1calc);
   
  }
    
  private class CalcButtonListener implements ActionListener
  {

      @Override
      public void actionPerformed(ActionEvent e)
      {

        //Variable to hold result
        Double result;
        Double percent;
        Double total;

        //Convert String to Double
        Double priceselect = Double.parseDouble(oprice1a.getText());
        Double percentselect = Double.parseDouble(dvalue1a.getText());
          
        //Calculate value from all inputs
        percent = (Double) percentselect * .01;
        result = (Double) priceselect * (Double) percent;
        total = (Double) priceselect - (Double) result;
          
        //Collect data from variable inputs
        String itemselect = (String) item1a.getText();
        String departselect = (String) dep1a.getSelectedItem();
        String priceselect2 = (String) oprice1a.getText();
        
        //Insert data into text area
        calcdisplay.setText("" + itemselect + " in the " + departselect + " department "
                 + " was " + priceselect2 + " is now " + total);
        calcdisplay.append("\n");
          
      }
  }

  private void displayPanel()
  {
      
      //Create panel to hold calc data
      calcdisplay = new JTextArea(6,5);
      calcdisplay.setEditable(false);
      calcdisplay.setLineWrap(true);
      calcdisplay.setWrapStyleWord(true);
         
      //Create list to go in panel
      calclist = new JList();
      
      //Set number of visible rows
      calclist.setVisibleRowCount(6);
      
      //Make scroll pane with list
      JScrollPane calcscroll = new JScrollPane(calclist);
      
      //Add pane to panel
      calcdisplay.add(calcscroll);
           
  }

}
