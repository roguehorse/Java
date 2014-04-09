/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package commission; //Package definition
import java.util.Scanner; //Scanner class call for user input

/**
 *
 * @author Scott DuBois aka Roguehorse
 */

public class Commission //Declare class Commission

{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) //Main program call
            
            
    {   
        //Call scanner into variable input
        Scanner input = new Scanner ( System.in ); 
        
        //Create variable salary and assign new object Base from class Base
        Base salary = new Base();
        
               
        double sales; //Create doubler integer variable sales
        double gross; //Create double integer variable gross
        
        //Description of gross income with incentive
        salary.description();
        //Collect input value into variable sales
        sales = input.nextDouble();
        //Calculate gross from commission value x 7% + base of $75,000       
        gross = (Double)(sales * salary.pIncentive() + salary.baseSalary());
        //Create empty line
        System.out.println();
        //Return annual gross income value with commission incentive included
        System.out.printf( "The gross income earned is $%.2f\n ",gross );
    }//End Main
}//End class Commission
