/* Simple Commission Part 2
 * Week 3 Individual Assignment
 * David Cochrane
 * August 19, 2013
 * PRG 420
 * William Davis (Fac)
 */

package simplecommission2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleCommission2 
    
{
    // Begin Main Class
    public static void main(String args[]) 
    {
        String firstName;           // Get first name
        String lastName;            // Get last name
        int salary;                 // Fixed salary of $75000
        double sales;               // Annual Sales
        double totalCommission;     // Total of Commission
        double totalCompensation;   // Total Income
        
        // Introduction
        System.out.println("This program will calculate your commission");
        
        // Insert a blank line
        System.out.println();
        
        // Scanner from keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // Name
        System.out.println("Enter your first name.");
        firstName = keyboard.nextLine();
        
        System.out.println("Enter your last name.");
        lastName = keyboard.nextLine();
        
        // Insert a blank line
        System.out.println();
        System.out.println("Hello, " + firstName + " " + lastName + ".");
        
        //Salary information
        System.out.println("Your annual salary is $75,000 and your commission "
                + "rate is 7%.");
                
        // Insert a blank line
        System.out.println();
        
        // End of year sales total
        System.out.println(firstName + ", your current sales target is $120,000.");
        System.out.println("You will have to meet at least 80% or $96,000.00 of your sales target,");
       
        // Insert blank line
        System.out.println();
        
        System.out.println("Enter your annual sales.");
        sales = keyboard.nextDouble();
        
        // Decimal format for USD
        DecimalFormat USDFormat = new DecimalFormat("$#,##0.00");
        
        // Insert a blank line
        System.out.println();
        
        // Display data entered to user
        System.out.println( firstName + ". You entered "
                + USDFormat.format(sales) + " for your annual sales.");
        
        // Insert a blank line
        System.out.println();  
        
        // 80% of $120,000 sales target
        if (sales < 96000) // If sales target is less than 80%
        {
        
        	// Calculate the total commission
       		totalCommission = sales * 0;
        
        	// Calculate the total income
        	salary = 75000;
        	totalCompensation = salary + totalCommission; 
            
            // Results output
            System.out.println("You have not met your sales target.");
        	System.out.println( firstName + ", your total income is: ");
            
                //Blank line
        	System.out.println();
        	System.out.println("++++++++++++++");
        	System.out.println("+            +");
        	System.out.println("+ " + USDFormat.format(totalCompensation) + " +");
        	System.out.println("+            +");
        	System.out.println("++++++++++++++");
            System.out.println();
            
            // Calculate and Display potential earnings
            System.out.println("Potential commission possibilities.");
            
            //Blank line
            System.out.println();
        	System.out.println("Total Sales \t Total Compensation");
        	System.out.println("----------- \t ------------------");
            
            double minimumSales = 96000;
            double potentialCommission = minimumSales * 0.07;
            double potentialCommission1 = 101000 * 0.07;
            double potentialCommission2 = 106000 * 0.07;
            double potentialCommission3 = 111000 * 0.07;
            double potentialCommission4 = 116000 * 0.07;
            double potentialCommission5 = 121000 * 0.085;
            double potentialCommission6 = 126000 * 0.085;
            double potentialCommission7 = 131000 * 0.085;
            double potentialCommission8 = 136000 * 0.085;
            double potentialCompensation = salary + potentialCommission;
            double potentialCompensation1 = salary + potentialCommission1;
            double potentialCompensation2 = salary + potentialCommission2;
            double potentialCompensation3 = salary + potentialCommission3;
            double potentialCompensation4 = salary + potentialCommission4;
            double potentialCompensation5 = salary + potentialCommission5;
            double potentialCompensation6 = salary + potentialCommission6;
            double potentialCompensation7 = salary + potentialCommission7;
            double potentialCompensation8 = salary + potentialCommission8;
            
            System.out.println(USDFormat.format(minimumSales) + " \t  " + USDFormat.format(potentialCompensation));
            System.out.println(USDFormat.format(101000) + " \t  " + USDFormat.format(potentialCompensation1));
            System.out.println(USDFormat.format(106000) + " \t  " + USDFormat.format(potentialCompensation2));
            System.out.println(USDFormat.format(111000) + " \t  " + USDFormat.format(potentialCompensation3));
            System.out.println(USDFormat.format(116000) + " \t  " + USDFormat.format(potentialCompensation4));
            System.out.println(USDFormat.format(121000) + " \t  " + USDFormat.format(potentialCompensation5));
            System.out.println(USDFormat.format(126000) + " \t  " + USDFormat.format(potentialCompensation6));
            System.out.println(USDFormat.format(131000) + " \t  " + USDFormat.format(potentialCompensation7));
            System.out.println(USDFormat.format(136000) + " \t  " + USDFormat.format(potentialCompensation8));
        }
        
        else            
            	if (sales < 120000) // Sales target NOT met
        		{
                    
                    // Total Commission percent calculation
       				totalCommission = sales * 0.07;
        
        			// Calculate Fixed Salary + Compensation
        			salary = 75000;
        			totalCompensation = salary + totalCommission; 
            
            		// Output Results
            		System.out.println(firstName + ", you have met your goal!");
        			System.out.println("Your total income is: ");
        			System.out.println();
        			System.out.println("++++++++++++++");
        			System.out.println("+            +");
        			System.out.println("+ " + USDFormat.format(totalCompensation) + " +");
        			System.out.println("+            +");
        			System.out.println("++++++++++++++");
                        
                    // Blank line
                    System.out.println();
                    
                    // Possible Earnings
            		System.out.println(firstName + ", this is what you could have made.");
                        
                        // Blank line
            		System.out.println();
        			System.out.println("Total Sales \t Total Compensation");
        			System.out.println("----------- \t ------------------");
            
            double potentialCommission = sales * 0.07;
            double potentialCommission1 = 101000 * 0.07;
            double potentialCommission2 = 106000 * 0.07;
            double potentialCommission3 = 111000 * 0.07;
            double potentialCommission4 = 116000 * 0.07;
            double potentialCommission5 = 121000 * 0.085;
            double potentialCommission6 = 126000 * 0.085;
            double potentialCommission7 = 131000 * 0.085;
            double potentialCommission8 = 136000 * 0.085;
            double potentialCompensation = salary + potentialCommission;
            double potentialCompensation1 = salary + potentialCommission1;
            double potentialCompensation2 = salary + potentialCommission2;
            double potentialCompensation3 = salary + potentialCommission3;
            double potentialCompensation4 = salary + potentialCommission4;
            double potentialCompensation5 = salary + potentialCommission5;
            double potentialCompensation6 = salary + potentialCommission6;
            double potentialCompensation7 = salary + potentialCommission7;
            double potentialCompensation8 = salary + potentialCommission8;
            
            System.out.println(USDFormat.format(sales)  + " \t  " + USDFormat.format(potentialCompensation));
            System.out.println(USDFormat.format(101000) + " \t  " + USDFormat.format(potentialCompensation1));
            System.out.println(USDFormat.format(106000) + " \t  " + USDFormat.format(potentialCompensation2));
            System.out.println(USDFormat.format(111000) + " \t  " + USDFormat.format(potentialCompensation3));
            System.out.println(USDFormat.format(116000) + " \t  " + USDFormat.format(potentialCompensation4));
            System.out.println(USDFormat.format(121000) + " \t  " + USDFormat.format(potentialCompensation5));
            System.out.println(USDFormat.format(126000) + " \t  " + USDFormat.format(potentialCompensation6));
            System.out.println(USDFormat.format(131000) + " \t  " + USDFormat.format(potentialCompensation7));
            System.out.println(USDFormat.format(136000) + " \t  " + USDFormat.format(potentialCompensation8));
        		}
        else
                    if (sales >= 120000) // Sales target met.
        			{
                    
                    	// Calculate the total commission
       					totalCommission = sales * 0.085;
        
        				// Calculate fixed salary and commission
        				salary = 75000;
        				totalCompensation = salary + totalCommission; 
            
            			// Output Results
            		System.out.println(firstName + ", you have met your goal!");
        			System.out.println("Your total income is: ");
        			System.out.println();
        			System.out.println("++++++++++++++");
        			System.out.println("+            +");
        			System.out.println("+ " + USDFormat.format(totalCompensation) + " +");
        			System.out.println("+            +");
        			System.out.println("++++++++++++++");
                        
                    // Blank line
                    System.out.println();
                    
                    // Possible Earnings
            		System.out.println(firstName + ", this is what you could have made.");
                        
                        // Blank line
            		System.out.println();
        			System.out.println("Total Sales \t Total Compensation");
        			System.out.println("----------- \t ------------------");
            			
            double minimumSales = 120000;
            double potentialCommission = minimumSales * 0.085;
            double potentialCommission1 = 125000 * 0.085;
            double potentialCommission2 = 130000 * 0.085;
            double potentialCommission3 = 135000 * 0.085;
            double potentialCommission4 = 140000 * 0.085;
            double potentialCommission5 = 145000 * 0.085;
            double potentialCommission6 = 150000 * 0.085;
            double potentialCommission7 = 155000 * 0.085;
            double potentialCommission8 = 160000 * 0.085;
            double potentialCompensation = salary + potentialCommission;
            double potentialCompensation1 = salary + potentialCommission1;
            double potentialCompensation2 = salary + potentialCommission2;
            double potentialCompensation3 = salary + potentialCommission3;
            double potentialCompensation4 = salary + potentialCommission4;
            double potentialCompensation5 = salary + potentialCommission5;
            double potentialCompensation6 = salary + potentialCommission6;
            double potentialCompensation7 = salary + potentialCommission7;
            double potentialCompensation8 = salary + potentialCommission8;
            
           System.out.println(USDFormat.format(minimumSales) + " \t  " + USDFormat.format(potentialCompensation));
            System.out.println(USDFormat.format(125000) + " \t  " + USDFormat.format(potentialCompensation1));
            System.out.println(USDFormat.format(130000) + " \t  " + USDFormat.format(potentialCompensation2));
            System.out.println(USDFormat.format(135000) + " \t  " + USDFormat.format(potentialCompensation3));
            System.out.println(USDFormat.format(140000) + " \t  " + USDFormat.format(potentialCompensation4));
            System.out.println(USDFormat.format(145000) + " \t  " + USDFormat.format(potentialCompensation5));
            System.out.println(USDFormat.format(150000) + " \t  " + USDFormat.format(potentialCompensation6));
            System.out.println(USDFormat.format(155000) + " \t  " + USDFormat.format(potentialCompensation7));
            System.out.println(USDFormat.format(160000) + " \t  " + USDFormat.format(potentialCompensation8));
        			}
		// End
    }
}
