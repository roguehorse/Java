/*
 *Write an applet that includes a pie chart.
 * 
 * Use a news article with statistics that are good candidates for a pie
 * chart: for example, political candidate preferences; percentages of
 * those for, against, or undecided about a ballot measure; and so forth.
 * 
 * Cite the source for your input statistics.
 * 
 * Submit the Java source applet along with an HTML file to launch it.
 * 
 * Sorces:
 * http://commons.wikimedia.org/wiki/File:Wikimedia_OS_share_pie_chart.png
 * 
 */
package pie_v1;

/**
 *
 * Pie Chart
 * Scott DuBois
 * PRG/421
 * November 4, 2013
 * Roland Morales
 * 
 */

import java.applet.Applet;
import java.awt.*;

public class Pie_v1 extends Applet
{
    //Percentage of users for each platform in degrees.
    //Nunbers derived from data and converted by formula
    //percentage * 360 / 100 then rounded for int value
    int w7=137, wxp=84, wv=28, wo=5; 
    int mac=27, iph=25, ipa=11; 
    int and=17, lin=6, oth=20;
        
    //Size of chart
    int w=400, h=400;
    int x=350, y=85;
    
    //Define slices
    int angle, degree;
    
   
    public void paint(Graphics g)
    {
        //Set background color of applet window
        setBackground(Color.WHITE);
        
/***************** Pie Chart Text ***********************/        
        
        //Windows 7 text
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.BLUE);
        g.drawString("**", 60, 150);
        g.setColor(Color.BLACK);
        g.drawString("  37.94%  Windows 7", 80, 150);
        
        //Windows XP text
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.CYAN);
        g.drawString("**", 60, 180);
        g.setColor(Color.BLACK);
        g.drawString("  23.4%    Windows XP", 80, 180);
        
        //Windows Vista text
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.GRAY);
        g.drawString("**", 60, 210);
        g.setColor(Color.BLACK);
        g.drawString("  7.67%    Windows Vista", 80, 210);
        
        //Windows Other text
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.BLACK);
        g.drawString("**", 60, 240);
        g.drawString("  1.44%    Windows Other", 80, 240);
        
        //Mac text
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.MAGENTA);
        g.drawString("**", 60, 270);
        g.setColor(Color.BLACK);
        g.drawString("  7.46%    Mac", 80, 270);
        
        //iPhone text
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.ORANGE);
        g.drawString("**", 60, 300);
        g.setColor(Color.BLACK);
        g.drawString("  7%         iPhone", 80, 300);
        
        //iPad text
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.PINK);
        g.drawString("**", 60, 330);
        g.setColor(Color.BLACK);
        g.drawString("  2.98%    iPad", 80, 330);
        
        //Android text
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.GREEN);
        g.drawString("**", 60, 360);
        g.setColor(Color.BLACK);
        g.drawString("  4.73%    Android", 80, 360);
        
        //Linux text
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.YELLOW);
        g.drawString("**", 60, 390);
        g.setColor(Color.BLACK);
        g.drawString("  1.53%    Linux", 80, 390);
        
        //Other text
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.DARK_GRAY);
        g.drawString("**", 60, 420);
        g.setColor(Color.BLACK);
        g.drawString("  5.85%    Other", 80, 420);
        
         
/**************** Create Pie Chart *********************/        
        
        //Windows 7 slice
        angle = 0;
        degree = (int)(137);
        g.setColor(Color.BLUE);
        g.fillArc(x, y, w, h, angle, degree);

       //Windows XP slice
        angle = degree;
        degree = (int)(84);
        g.setColor(Color.CYAN);
        g.fillArc(x, y, w, h, angle, degree);
        
        //Windows Vista slice
        angle = angle + degree;
        degree = (int)(28);
        g.setColor(Color.GRAY);
        g.fillArc(x, y, w, h, angle, degree);
       
        //Windows Other slice
        angle = angle + degree;
        degree = (int)(5);
        g.setColor(Color.BLACK);
        g.fillArc(x, y, w, h, angle, degree);

        //Mac slice
        angle = angle + degree;
        degree = (int)(27);
        g.setColor(Color.MAGENTA);
        g.fillArc(x, y, w, h, angle, degree);
        
        //iPhone slice
        angle = angle + degree;
        degree = (int)(25);
        g.setColor(Color.ORANGE);
        g.fillArc(x, y, w, h, angle, degree);
        
        //iPad slice
        angle = angle + degree;
        degree = (int)(11);
        g.setColor(Color.PINK);
        g.fillArc(x, y, w, h, angle, degree);
        
        //Android slice
        angle = angle + degree;
        degree = (int)(17);
        g.setColor(Color.GREEN);
        g.fillArc(x, y, w, h, angle, degree);
        
        //Linux slice
        angle = angle + degree;
        degree = (int)(6);
        g.setColor(Color.YELLOW);
        g.fillArc(x, y, w, h, angle, degree);
        
        //Other slice
        angle = angle + degree;
        degree = (int)(21);
        g.setColor(Color.DARK_GRAY);
        g.fillArc(x, y, w, h, angle, degree);
        
    }
}
