/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapplet;

import javax.swing.JApplet;
import java.awt.*;
import javax.swing.JLabel;

/**
 *
 * @author roguehorse
 */
public class NewJApplet1 extends JApplet 
{

    public void init() 
    {
        // Create JLabel
        JLabel label = new JLabel("first applet");
        
        // Set layout manager
        setLayout(new FlowLayout());
        
        // Add the label to the content pane.
        add(label);
        
        
    }
    // TODO overwrite start(), stop() and destroy() methods
}
