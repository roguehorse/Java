package calculation.project;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Micah
 */
public class CalculationProject {
    
    public static void main(String args[]) 
    {
        String firstName;           // Get user's first name
        int salary;                 // User's fixed annual salary
        double commissionRate;      // User's commission rate
        double sales;               // User's annual sales
        double totalCommission;     // User's total commission earned
        double totalCompensation;   // User's total compensation

        
        // Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);
        
        // Get user name
        System.out.println("Please enter your first name.");
        firstName = keyboard.nextLine();
        
        // puts in blank line
        System.out.println();
        
        // Display user information
        System.out.println("Hello, " + firstName);
        System.out.println("Your annual salary is $75,000 and your commission "
                + "rate is 7%.");
        
        // adds another blank line
        System.out.println();
        
        // Get annual sales total
        System.out.println(firstName + ", your current sales target is $120,000.");
        System.out.println("If you did not meet at least 80% of your sales target,");
        System.out.println("you will not receive a commission for your sales.");
        System.out.println();
        System.out.println("Please enter your annual sales for this year.");
        sales = keyboard.nextDouble();
        
        // Set decimal format for USD
        DecimalFormat USDFormat = new DecimalFormat("$#,##0.00");
        
        // another blank line
        System.out.println();
        
        // Display user results
        System.out.println("Thanks, " + firstName + ". You entered "
                + USDFormat.format(sales) + " for your annual sales.");
        
        // Insert a blank line
        System.out.println();  
        
        // Use nested decision structure to determine if at least 80% of sales target was met.
        if (sales < 96000) // Sales target not met, not eligible for commission.
        {
        
        	// Calculate the total commission
       		totalCommission = sales * 0;
        
        	// Calculate the total compensation
        	salary = 75000;
        	totalCompensation = salary + totalCommission; 
            
            // Display results
            System.out.println("Oh, too bad! You didn't meet your sales target.");
        	System.out.println("Your total compensation for this year is: ");
        	System.out.println();
        	System.out.println(USDFormat.format(totalCompensation));
            System.out.println();
            
            // Calculate and Display potential earnings
            System.out.println("Look at what you could have made.");
            System.out.println();
        	System.out.println("Total Sales \t Total Compensation");
        	System.out.println("----------- \t ------------------");
            
            double minimumSales = 96000;
            double potentialCommission = minimumSales * 0.07;
            double potentialCommission1 = 101000 * 0.07;
            double potentialCommission2 = 106000 * 0.07;
            double potentialCommission3 = 111000 * 0.07;
            double potentialCommission4 = 116000 * 0.07;
            double potentialCompensation = salary + potentialCommission;
            double potentialCompensation1 = salary + potentialCommission1;
            double potentialCompensation2 = salary + potentialCommission2;
            double potentialCompensation3 = salary + potentialCommission3;
            double potentialCompensation4 = salary + potentialCommission4;
            
            System.out.println(USDFormat.format(minimumSales) + " \t  " + USDFormat.format(potentialCompensation));
            System.out.println(USDFormat.format(101000) + " \t  " + USDFormat.format(potentialCompensation1));
            System.out.println(USDFormat.format(106000) + " \t  " + USDFormat.format(potentialCompensation2));
            System.out.println(USDFormat.format(111000) + " \t  " + USDFormat.format(potentialCompensation3));
            System.out.println(USDFormat.format(116000) + " \t " + USDFormat.format(potentialCompensation4));
            
        }
        
        else            
            	if (sales < 120000) // Sales target not met, but eligible for commission.
        		{
                    
                    // Calculate the total commission
       				totalCommission = sales * 0.07;
        
        			// Calculate the total compensation
        			salary = 75000;
        			totalCompensation = salary + totalCommission; 
            
            		// Display results
            		System.out.println("Good job!");
        			System.out.println("Your total compensation for this year is: ");
        			System.out.println(USDFormat.format(totalCompensation));
                    System.out.println();
                    
                    double minimumSales = 96000;
            double potentialCommission = minimumSales * 0.07;
            double potentialCommission1 = 101000 * 0.07;
            double potentialCommission2 = 106000 * 0.07;
            double potentialCommission3 = 111000 * 0.07;
            double potentialCommission4 = 116000 * 0.07;
            double potentialCompensation = salary + potentialCommission;
            double potentialCompensation1 = salary + potentialCommission1;
            double potentialCompensation2 = salary + potentialCommission2;
            double potentialCompensation3 = salary + potentialCommission3;
            double potentialCompensation4 = salary + potentialCommission4;
            
            System.out.println(USDFormat.format(minimumSales) + " \t  " + USDFormat.format(potentialCompensation));
            System.out.println(USDFormat.format(101000) + " \t  " + USDFormat.format(potentialCompensation1));
            System.out.println(USDFormat.format(106000) + " \t  " + USDFormat.format(potentialCompensation2));
            System.out.println(USDFormat.format(111000) + " \t  " + USDFormat.format(potentialCompensation3));
            System.out.println(USDFormat.format(116000) + " \t " + USDFormat.format(potentialCompensation4));
                    
        		}
        else
                    if (sales >= 120000) // Sales target met.
        			{
                    
                    	// Calculate the total commission
       					totalCommission = sales * 0.085;
        
        				// Calculate the total compensation
        				salary = 75000;
        				totalCompensation = salary + totalCommission; 
            
            			// Display results
            			System.out.println("Great job!");
        				System.out.println("Your total compensation for this year is: ");
        				System.out.println(USDFormat.format(totalCompensation));
                        System.out.println();
                        
                        //potential sales commission
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
            double potentialCommission9 = 165000 * 0.085;
            double potentialCommission10 = 170000 * 0.085;
            double potentialCommission11 = 175000 * 0.085;
            double potentialCommission12 = 180000 * 0.085;
            double potentialCompensation = salary + potentialCommission;
            double potentialCompensation1 = salary + potentialCommission1;
            double potentialCompensation2 = salary + potentialCommission2;
            double potentialCompensation3 = salary + potentialCommission3;
            double potentialCompensation4 = salary + potentialCommission4;
            double potentialCompensation5 = salary + potentialCommission5;
            double potentialCompensation6 = salary + potentialCommission6;
            double potentialCompensation7 = salary + potentialCommission7;
            double potentialCompensation8 = salary + potentialCommission8;
            double potentialCompensation9 = salary + potentialCommission9;
            double potentialCompensation10 = salary + potentialCommission10;
            double potentialCompensation11 = salary + potentialCommission11;
            double potentialCompensation12 = salary + potentialCommission12;
            
            System.out.println(USDFormat.format(minimumSales) + " \t  " + USDFormat.format(potentialCompensation));
            System.out.println(USDFormat.format(125000) + " \t  " + USDFormat.format(potentialCompensation1));
            System.out.println(USDFormat.format(130000) + " \t  " + USDFormat.format(potentialCompensation2));
            System.out.println(USDFormat.format(135000) + " \t  " + USDFormat.format(potentialCompensation3));
            System.out.println(USDFormat.format(140000) + " \t " + USDFormat.format(potentialCompensation4));
            System.out.println(USDFormat.format(145000) + " \t " + USDFormat.format(potentialCompensation5));
            System.out.println(USDFormat.format(150000) + " \t " + USDFormat.format(potentialCompensation6));
            System.out.println(USDFormat.format(155000) + " \t " + USDFormat.format(potentialCompensation7));
            System.out.println(USDFormat.format(160000) + " \t " + USDFormat.format(potentialCompensation8));
            System.out.println(USDFormat.format(165000) + " \t " + USDFormat.format(potentialCompensation9));
            System.out.println(USDFormat.format(170000) + " \t " + USDFormat.format(potentialCompensation10));
            System.out.println(USDFormat.format(175000) + " \t " + USDFormat.format(potentialCompensation11));
            System.out.println(USDFormat.format(180000) + " \t " + USDFormat.format(potentialCompensation12));
                        
        			}
		// end nested decision structure
    }
}