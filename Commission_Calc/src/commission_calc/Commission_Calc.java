/*
 * Jason Thompson
 * jason0@phoenix.edu
 * University of Phoenix
 * PRG/420
 * William Davis (Fac)
 * 
 * 
 * Mod: 20130812: Jason Thompson: Create Initial Program:
 * ======================================================
 * Write a Java™ application using NetBeans™ Integrated Development Environment
 * (IDE) that calculates the total annual compensation of a salesperson.
 * 
 * Consider the following factors:
 * A salesperson will earn a fixed salary of 75,000. 
 * A salesperson will also receive a commission as a sales incentive.
 * Commission is a percentage of the salesperson’s annual sales.
 * The current commission is  7%  of total sales.
 * The total annual compensation is the fixed salary plus the commission earned.
 * 
 * The Java™ application should meet these technical requirements:
 * The application should have at least one class, in addition to the 
 * application’s controlling class (a controlling class is where the main function resides).
 * There should be proper documentation in the source code.
 * The application should ask the user to enter annual sales,
 * and it should display the total annual compensation.
 * Submit your program along with the screen shot.
 * ======================================================
 *  * Mod: 20130819: Jason Thompson: Add Conditions to Incentive, Create projections table:
 * ======================================================
 * Modify the Week Two Java™ application using Java™ NetBeans™ IDE 
 * to meet these additional and changed business requirements:
 * The company has recently changed its total annual compensation policy to improve sales.
 * A salesperson will continue to earn a fixed salary of  75,000. 
 * The current sales target for every salesperson is 120,000.
 * The sales incentive will only start when 80% of the sales target is met. 
 * The current commission is 7% of total sales.
 * If a salesperson exceeds the sales target, the commission will increase based
 * on an acceleration factor. The acceleration factor is 1.5.
 * The application should ask the user to enter annual sales, and it should 
 * display the total annual compensation.
 * The application should also display a table of potential total annual 
 * compensation that the salesperson could have earned, in $5000 increments above
 * the salesperson’s annual sales, until it reaches 50% above the salesperson’s annual sales. 
 * 
 * The Java™ application should also meet these technical requirements:
 * The application should have at least one class, in addition to the application’s controlling class.
 * The source code must demonstrate the use of conditional and looping structures.
 * There should be proper documentation in the source code.
 * Submit your program along with the screen shot.
 * 
 */
package commission_calc;

/**
 *
 * @author Jason Thompson
 * 
 */
import java.util.Scanner;


public class Commission_Calc {
    /**
     * @param args the command line arguments will be ignored
     *
     */
    // create an instance of a sales person model
    private static SalesPerson thSalesPerson = new SalesPerson();
    
    
    public static void main(String[] args) {
        // Main Program
        
        // enter the menu for sales person detail
        menuSalesPersonDetail();
        
        //display exit message
        System.out.print("\n\n <<<<<<< Exiting Annual Compensation Calculator >>>>>>>\n\n\n");
        
    } // end main
    
    
    public static void menuSalesPersonDetail() {
        // Menu logic for specific sales person view
        
        // input variable for main menu, intialization value==-1
        int userInput=-1;
        
        // Main Loop
        while(userInput!=5) { 
            
            // display the main screen
            displaySalesPersonDetail();
            
            if (userInput==-1) {
                // initialization. Require inital Annual Sales input
                userInput=2;                
            } else {
                // after initialization: get an optional input from the user
                System.out.print("\n Enter Option 1-5 >> ");                   
                userInput=getPositiveInt();
            }
            
            //evaluate input
            switch (userInput) {
                case 1:
                    // Base Salary
                    System.out.print("\n New Base Salary >> ");
                    thSalesPerson.setBaseSalary(getPositiveDouble());                    
                    break;
                case 2:
                    // Annual Sales
                    System.out.print("\n New Annual Sales amount >> ");
                    thSalesPerson.setSales(getPositiveDouble());                    
                    break;
                case 3:
                    // Commission Rate
                    System.out.print("\n New Commission Rate >> ");
                    thSalesPerson.setCommissionRate(getPositiveDouble());                    
                    break;
                case 4:
                    // display sales projection table
                    displaySalesPersonProjection(thSalesPerson);
                    break;
                default: 
                    // don't care
                    break;
            }
        } // End Main Loop

    } // end menuSalesPersonDetail
    
    public static void displaySalesPersonProjection(SalesPerson projectionSP) {
        // Displays projected total compensation for the ProjectionSP from 
        // the current figure, up through >=50% of current sales
        
        int userInput =0; // User Input to exit table output
        double switchBreakValue=1.5*projectionSP.getAnnualSales(); // value to end table on or after: 50% above current sales value
        int projectionFactor=0; // multiplier to increment each line on the table.
        double projectionIncrement=5000.00; // step-factor for sales projections
        double initialSales=projectionSP.getAnnualSales(); // capture initial Annual sales figure.
                
        // print table header
        System.out.print("\n ======================================================");
        System.out.print("\n  Sales Projections");
        System.out.print("\n ------------------------------------------------------");
        System.out.print("\n  - Displays projected earning potential for sales figures");
        System.out.print("\n  - in $5,000.00 increments above the current value.");
        System.out.print("\n ======================================================");
        System.out.printf("\n Annual Sales          Total Compensation");
        System.out.print("\n ------------------------------------------------------");
        
        while (projectionSP.getAnnualSales()<switchBreakValue) {
            // print row values
            // Step-up the projection 
            projectionSP.setSales(initialSales+projectionFactor*projectionIncrement); 
            // print the projection
            System.out.printf("\n $%-,20.2f $%,.2f", projectionSP.getAnnualSales(), projectionSP.getTotalCompensation());
            // increment the projection factor
            projectionFactor++;
        }
        
        // terminate table output
        System.out.print("\n ======================================================");
        
        // restore initial sales figure to projectionSP
        projectionSP.setSales(initialSales);
        
        // wait to continue until user elects to 
        while (userInput!=1) {
            System.out.print("\n  - Enter '1' to exit >");
            userInput = getPositiveInt();
        }
        
    } // end displaySalesPersonProjection

    public static void displaySalesPersonDetail() {
        // Displays main output screen

        System.out.print("\n ======================================================");
        System.out.print("\n  Annual Compensation Calculator");
        System.out.print("\n ------------------------------------------------------");
        System.out.print("\n  - This program calculates total annual compensation based on the values listed below.");
        System.out.print("\n  - Press 'Enter' after each value input.");
        System.out.print("\n  - On startup, a new Annual Sales value is required.");
        System.out.print("\n  - Enter a line number (1 to 3) to edit an item.");
        System.out.print("\n  - 4: Display sales projection table. 5: Quit Program.");
        System.out.print("\n  - Enter '5' to quit.");
        System.out.print("\n ======================================================");
        System.out.printf("\n  1) Base Salary              : $%,.2f", thSalesPerson.getBaseSalary());
        System.out.printf("\n  2) Annual Sales             : $%,.2f", thSalesPerson.getAnnualSales());
        System.out.printf("\n  3) Commission Rate          :  %.2f", thSalesPerson.getCommissionRate());
        // display a custom message for this computation, based on the current Annual Sales figure.
        if (thSalesPerson.getEarnsCommission()) {
            // earns commission
            if (thSalesPerson.getHasAccelerationFactor()) {
                // also earns acceleration factor
                System.out.printf("\n  ** Commission multiplied by acclerator (%.2f) for surpassing sales target of $%,.2f.", thSalesPerson.getAccelerationFactor(), thSalesPerson.getTargetSalesValue());                 
            } else {
                // earns commission, no acceleration factor
                System.out.printf("\n  ** Standard rate applies. This is accelerated by surpassing the Annual Sales goal of $%,.2f.", thSalesPerson.getTargetSalesValue());
            }
        } else {
            // doesn't earn commission
            System.out.printf("\n  ** Commission is not earned until Annual Sales reach at least $%,.2f.", thSalesPerson.getMinimumSalesForCommission());
        }
        System.out.printf("\n     Commission Earned        : $%,.2f", thSalesPerson.getCommission());
        System.out.print("\n ------------------------------------------------------");
        System.out.printf("\n     Total Annual Compensation: $%,.2f", thSalesPerson.getTotalCompensation());
        System.out.print("\n ======================================================");
        
    } // end displaySalesPersonDetail

    public static double getPositiveDouble() {
        // Function to get a positive number(double) from user

        double userInput = 0; // placeholder for legal input
        boolean inputIsValid = false; // switch to flip when input is validated

        // create object to catch system input
        Scanner input = new Scanner(System.in);

        // loop until a positive number is input.
        while (!inputIsValid) {

            try {
                
                userInput = input.nextDouble();
                if (userInput > 0) {
                    inputIsValid = true;
                } else {
                    System.out.println("\n Your entry is invalid. Please input a positive number.");
                }
                
            } catch (Exception e) {

                // recover from non-numerical input 
                System.out.println("\n Your entry is invalid. Please enter a valid number.");
                input.nextLine(); // flush bad input and retry

            }

        } // end while

        return userInput;

    } // end GetPositiveDouble
    
    
    public static int getPositiveInt() {
        // Function to get a positive number(Int) from user

        int userInput = 0; // placeholder for legal input
        boolean inputIsValid = false; // switch to flip when input is validated

        // create object to catch system input
        Scanner input = new Scanner(System.in);

        // loop until a positive number is input.
        while (!inputIsValid) {

            try {
                
                userInput = input.nextInt();
                if (userInput > 0) {
                    inputIsValid = true;
                } else {
                    System.out.println("\n Your entry is invalid. Please input a positive number.");
                }
                
            } catch (Exception e) {

                // recover from non-numerical input 
                System.out.println("\n Your entry is invalid. Please enter a valid number.");
                input.nextLine(); // flush bad input and retry

            }

        } // end while

        return userInput;

    } // end GetPositiveInt
    
} // end class Commission_Calc


