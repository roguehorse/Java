/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salesproject;

// Call scanner class from Java utilities
import java.util.Scanner;

/**
 *
 * @author Scott DuBois aka Roguehorse
 */
public class SalesProject 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 

    {   
        // Call scanner into variable input
        Scanner input = new Scanner ( System.in ); 
        
        // Create variable salary and assign new object Base from class Base
        Base salary = new Base();
               
        Double sales; // Create integer variable sales
        Double gross; // Create integer variable gross
        
        // Retrieve baseSalary method from Base class
        salary.description();
        
        // Collect input value into variable sales
        sales = input.nextDouble();
        
        // Calculate gross from commission value x 7% + base of $75,000       
        gross = (Double)(sales * salary.pIncentive() + salary.baseSalary());
        
        // Create empty line
        System.out.println();
        
        // Return annual gross income value with commission incentive included
        System.out.printf( "The gross income earned is $%.2f\n",gross );
        
    }// End Main
    
 }// End of program
