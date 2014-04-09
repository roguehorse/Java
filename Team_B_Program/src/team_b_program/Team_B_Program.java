/*
 * 
 * In the real world, an entire program is rarely
 * written from scratch. It is very likely that
 * there are classes or functions that already exist.
 * The key to using these existing modules successfully
 * depends on how modular the classes or functions are written.
 * 
 * In this Learning Team assignment, your mission is
 * to take a section of one team member’s Week Four
 * program and replace a similar section of another
 * team member’s Week Four program.
 * 
 */
package team_b_program;
import java.util.*;
import java.text.*;

/**
 *
 *       Team_B
 * Week_5_Team_Project
 *      PRG/420
 *  September 2, 2013
 * 
 */
public class Team_B_Program 
{

    /**
     * @param args the command line arguments
     */
    //Create instance of name collection method
    private static Names naming = new Names();
    
    //Create instance of annual sales collection method
    private static Annual eaSales = new Annual();
    
    // create an instance of a sales person model
    private static SalesPerson thSalesPerson = new SalesPerson();
    
    
    public static void main(String[] args)             
    {
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
       
        double gross; //Create variable for base gross ( both sales people )
        double gross1; //Create variable for base * .07 incentive for sales person 1
        double gross2; //Create variable for base * (.07 + .015) incentive for sales person 1
        
        double gross4; //Create variable for base * .07 incentive for sales person 2
        double gross5; //Create variable for base * (.07 + .015) incentive for sales person 2
              
        double table1; //Assign salesperson1 amount value to variable table1
        double table2; //Assign salesperson2 amount value to variable table2
        
        double salesdiff1; //Variable assigned if sales person 1 is > 2
        double salesdiff2; //Variable assigned if sales person 2 is > 1
        
        // Main Program
        
        // enter the menu for sales person detail
        menuSalesPersonDetail();
        
        naming.NameInput(); //Input salespersons names 
       
        eaSales.AnnualInput(); //Input sales values for each
        
/*********CALCULATION VALUES ASSOCIATED TO DECLARED VARIABLES******************/
                  
        table1 = eaSales.asales.get(0); //Assign salesperson1 amount value to variable table1
        table2 = eaSales.asales.get(1); //Assign salesperson2 amount value to variable table2

        
        //Calculate gross from sales value x 7% + base of $75,000       
        gross = (Double)(thSalesPerson.getBaseSalary());
        
        //Calculate gross from sales value x 7% + base of $75,000 
        gross1 = (Double)(eaSales.asales.get(0) * thSalesPerson.getCommissionRate() + thSalesPerson.getBaseSalary());
        gross4 = (Double)(eaSales.asales.get(1) * thSalesPerson.getCommissionRate() + thSalesPerson.getBaseSalary());
        
        //Calculate gross from sales value x (7% + 1.5%) + base of $75,000       
        gross2 = (Double)(eaSales.asales.get(0) * (thSalesPerson.getCommissionRate() + thSalesPerson.goalAccel()) + thSalesPerson.getBaseSalary());
        gross5 = (Double)(eaSales.asales.get(1) * (thSalesPerson.getCommissionRate() + thSalesPerson.goalAccel()) + thSalesPerson.getBaseSalary());
      
        //Determine difference between sales 
        salesdiff1 = (Double)(eaSales.asales.get(0) - eaSales.asales.get(1));
        salesdiff2 = (Double)(eaSales.asales.get(1) - eaSales.asales.get(0));
        
        
/***********DETERMINE IF EITHER SALES PERSON WIL RECEIVE BONUSES***************/        

/*************CALCULATE IF SALES PERSON 1 WILL RECEIVE BONUSES*****************/
        
        //Determine is salesperson 1 has reached $120,000 sales goal
        for (int sp1=1; sp1<2; sp1++)
         if (eaSales.asales.get(0) >= thSalesPerson.getTargetSalesValue())
         {
            System.out.println("====================================================================================");
            String A = "Bonuses will be awarded to   >>   ";
            System.out.printf("%48s",A);
             System.out.print(naming.names.get(0));
            System.out.println();
            String B = "Gross income earned will be   >>   ";
            System.out.println();
            System.out.printf("%48s",B);
            System.out.print(fmt.format(gross2));
            System.out.println();
         }
         
        //Determine if salesperson 1 has met 80% incentive requirement
         else if (eaSales.asales.get(0) >= thSalesPerson.startIncentive() * thSalesPerson.getTargetSalesValue() && eaSales.asales.get(0) < thSalesPerson.getTargetSalesValue())
         {
            System.out.println("====================================================================================");
            String C = "A sales bonus will be awarded to   >>   ";
            System.out.printf("%48s",C);
            System.out.print(naming.names.get(0));
            System.out.println();
            String D = "Gross income earned will be   >>   ";
            System.out.println();
            System.out.printf("%48s",D);
            System.out.print(fmt.format(gross1));
            System.out.println();
         }
         
        //Results if salesperson 1 incentive minimum has not been reached
         else
         {
            System.out.println("====================================================================================");
            String E = "No sales bonus will be awarded to   >>   ";
            System.out.printf("%48s",E);
            System.out.print(naming.names.get(0));
            System.out.println();
            String G = "Gross income earned will be   >>   ";
            System.out.println();
            System.out.printf("%48s",G);
            System.out.print(fmt.format(gross));
            System.out.println();
         }
        
/**************CALCULATE IF SALES PERSON 2 WILL RECEIVE BONUSES****************/
        
        //Determine is salesperson 2 has reached $120,000 sales goal
        for (int sp2=1; sp2<2; sp2++)
         if (eaSales.asales.get(1) >= thSalesPerson.getTargetSalesValue())
         {
            System.out.println("====================================================================================");
            String H = "Bonuses will be awarded to   >>   ";
            System.out.printf("%48s",H);
             System.out.print(naming.names.get(1));
            System.out.println();
            String I = "Gross income earned will be   >>   ";
            System.out.println();
            System.out.printf("%48s",I);
            System.out.print(fmt.format(gross5));
            System.out.println();
         }
        
         //Determine if salesperson 2 has met 80% incentive requirement
         else if (eaSales.asales.get(1) >= thSalesPerson.startIncentive() * thSalesPerson.getTargetSalesValue() && eaSales.asales.get(1) < thSalesPerson.getTargetSalesValue())
         {
            System.out.println("====================================================================================");
            String J = "A sales bonus will be awarded to   >>   ";
            System.out.printf("%48s",J);
            System.out.print(naming.names.get(1));
            System.out.println();
            String K = "Gross income earned will be   >>   ";
            System.out.println();
            System.out.printf("%48s",K);
            System.out.print(fmt.format(gross4));
            System.out.println();
         }
        
         //Results if salesperson 2 incentive minimum has not been reached
         else
         {
            System.out.println("====================================================================================");
            String L = "No sales bonus will be awarded to   >>   ";
            System.out.printf("%48s",L);
            System.out.print(naming.names.get(1));
            System.out.println();
            String M = "Gross income earned will be   >>   ";
            System.out.println();
            System.out.printf("%48s",M);
            System.out.print(fmt.format(gross));
            System.out.println();
         }
        
/**************************DIFFERENCE IN SALES COMPARISON**********************/
        
System.out.println("=====================================================================================");

            //Determine if sales person 1 generates more than 2
            if (eaSales.asales.get(0) > eaSales.asales.get(1))
            {
               String diff1 = " ";
               System.out.printf("%11s",diff1);
               System.out.print(naming.names.get(1));
               System.out.print(" must earn " + fmt.format(salesdiff1) + " more to match ");
               System.out.print(naming.names.get(0));
               System.out.println();
            }
            
            //Determine if sales person 2 generates more than 1
            else if (eaSales.asales.get(1) > eaSales.asales.get(0))
            {
               String diff1 = " ";
               System.out.printf("%11s",diff1);
               System.out.print(naming.names.get(0));
               System.out.print(" must earn " + fmt.format(salesdiff2) + " more to match ");
               System.out.print(naming.names.get(1));
               System.out.println();
            }
            
            //Determine if sales person 2 generates the same as 1
            else
            {
               String diff1 = " ";
               System.out.printf("%11s",diff1);
               System.out.print(naming.names.get(0));
               System.out.print(" has earned the same amount as ");
               System.out.print(naming.names.get(1));
               System.out.println();
            }        
        
/***********************CREATE TABLES FOR FIRST SALES PERSON*******************/        
             
        //Create table header before calculation insertions
            System.out.println("====================================================================================");
            String N1 = "Possible compensation for   >>   ";
            System.out.printf("%48s",N1);
            System.out.print(naming.names.get(0));
            System.out.println();
            System.out.println();
            String H1 = "Total Sales  |  Total Compensation";               
            System.out.printf("%51s",H1);
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------");
            
 /**CALCULATE TABLE VALUES BASED ON SALES PERFORMANCE FROM FIRST SALES PERSON**/ 
            
//Create ArrayList based on sales input then return results adding $5000 until 50% above sales
        while (table1 < eaSales.asales.get(0) * thSalesPerson.getAccelerationFactor())
        {
    
            //Determine if table variable is greater than $120,000
            if (table1 >= thSalesPerson.getTargetSalesValue())
            {
                //Variable gross2 receives value table(salary) x (.07 + .015) + 75000
                gross2 = (Double)(table1 * (thSalesPerson.getCommissionRate() + thSalesPerson.goalAccel()) + thSalesPerson.getBaseSalary());
                String T1 = " ";
                System.out.printf("%17s",T1);
                System.out.printf(fmt.format(table1) + "         " + fmt.format(gross2));
                table1 = table1 + 5000;
                System.out.println();
            }
            
            //Determine if table valuie is greater than 80% of $120000 and less than $120000
            else if (table1 >= thSalesPerson.startIncentive() * thSalesPerson.getTargetSalesValue() && table1 < thSalesPerson.getTargetSalesValue())
            {
                //Variable gross1 receives value table(salary) x .07 + 75000
                gross1 = (Double)(table1 * thSalesPerson.getCommissionRate() + thSalesPerson.getBaseSalary());
                if (table1 <= 99999)//Determines if value is less than 5 digits to correct formatting
                { 
                    String T1 = " ";
                    System.out.printf("%17s",T1);
                    System.out.printf(fmt.format(table1) + "          " + fmt.format(gross1));
                    table1 = table1 + 5000; //Add $5000 to table value to derive gross1 value
                    System.out.println();
                }
                
                else
                {
                    String T1 = " ";
                    System.out.printf("%17s",T1);
                    System.out.printf(fmt.format(table1) + "         " + fmt.format(gross1));
                    table1 = table1 + 5000; //Add $5000 to table value to derive gross1 value
                    System.out.println();
                }
            }
            
            //If previous two conditions are false then execute this condition
            else
            {
                //Assign base salary value to gross variable for use in table
                gross = thSalesPerson.getBaseSalary();
                
                if (table1 <= 99999)//Determines if value is less than 5 digits to correct formatting
                {
                   String T1 = " ";
                   System.out.printf("%17s",T1); 
                   System.out.printf(fmt.format(table1) + "          " + fmt.format(gross)); 
                   table1 = table1 + 5000; //Add $5000 to table value to derive gross value
                   System.out.println();
                }
                
                else
                {
                   String T1 = " ";
                   System.out.printf("%17s",T1);
                   System.out.printf(fmt.format(table1) + "         " + fmt.format(gross));
                   table1 = table1 + 5000;//Add $5000 to table value to derive gross value
                   System.out.println();
                }
            }
        }//End table creation for salesperson 1                      
        
/**********************CREATE TABLES FOR SECOND SALES PERSON*******************/        
             
            //Create table header before calculation insertions
            System.out.println("====================================================================================");
            String N2 = "Possible compensation for   >>   ";
            System.out.printf("%48s",N2);
            System.out.print(naming.names.get(1));
            System.out.println();
            System.out.println();
            String H2 = "Total Sales  |  Total Compensation";               
            System.out.printf("%51s",H2);
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------");
        
/**CALCULATE TABLE VALUES BASED ON SALES PERFORMANCE FROM SECOND SALES PERSON**/
        
//Create ArrayList based on sales input then return results adding $5000 until 50% above sales  
        while (table2 < eaSales.asales.get(1) * thSalesPerson.getAccelerationFactor())
        {
            //Determine if table variable is greater than $120,000
            if (table2 >= thSalesPerson.getTargetSalesValue())
            {
                //Variable gross2 receives value table(salary) x (.07 + .015) + 75000
                gross5 = (Double)(table2 * (thSalesPerson.getCommissionRate() + thSalesPerson.goalAccel()) + thSalesPerson.getBaseSalary());
                String T2 = " ";
                System.out.printf("%17s",T2);
                System.out.printf(fmt.format(table2) + "         " + fmt.format(gross5));
                table2 = table2 + 5000;//Add $5000 to table value to derive gross5 value
                System.out.println();
            } 
            
            //Determine if table valuie is greater than 80% of $120000 and less than $120000
            else if (table2 >= thSalesPerson.startIncentive() * thSalesPerson.getTargetSalesValue() && table2 < thSalesPerson.getTargetSalesValue())
            {
                //Variable gross4 receives value table(salary) x .07 + 75000 
                gross4 = (Double)(table2 * thSalesPerson.getCommissionRate() + thSalesPerson.getBaseSalary());
                
                if (table2 <= 99999)//Determines if value is less than 5 digits to correct formatting
                { 
                    String T2 = " ";
                    System.out.printf("%17s",T2);
                    System.out.printf(fmt.format(table2) + "          " + fmt.format(gross4));
                    table2 = table2 + 5000; //Add $5000 to table value to derive gross4 value
                    System.out.println();
                }
                
                else
                {
                    String T2 = " ";
                    System.out.printf("%17s",T2);
                    System.out.printf(fmt.format(table2) + "         " + fmt.format(gross4));
                    table2 = table2 + 5000; //Add $5000 to table value to derive gross4 value
                    System.out.println();
                }
            }
            
            //If previous two conditions are false then execute this condition
            else
            {
                //Assign base salary value to gross variable for use in table
                gross = thSalesPerson.getBaseSalary();
                
                if (table2 <= 99999)//Determines if value is less than 5 digits to correct formatting
                {
                   String T2 = " ";
                   System.out.printf("%17s",T2); 
                   System.out.printf(fmt.format(table2) + "          " + fmt.format(gross)); 
                   table2 = table2 + 5000;//Add $5000 to table value to derive gross value
                   System.out.println();
                }
                
                else
                {
                   String T2 = " ";
                   System.out.printf("%17s",T2);
                   System.out.printf(fmt.format(table2) + "        " + fmt.format(gross));
                   table2 = table2 + 5000;//Add $5000 to table value to derive gross value
                   System.out.println();
                }
            }            
        }//End table creation for salesperson2
        System.out.println("=====================================================================================");
        
    }
    
    public static void menuSalesPersonDetail() {
        // Menu logic for specific sales person view
        
        // input variable for main menu, intialization value==-1
        int userInput=-1;
        
        // Main Loop
        while(userInput!=3) 
        { 
            
            // display the main screen
            displaySalesPersonDetail();
            
            
            if (userInput==-1) {
                // initialization. Require inital Annual Sales input
                userInput=1;                
            } else {
                // after initialization: get an optional input from the user
                System.out.print("\n ------------------------------------------------------");
                System.out.print("\n     Enter Option 1 - 3 >> ");
                userInput=getPositiveInt();
            }
            
            //evaluate input
            switch (userInput) {
                case 1:
                    // Base Salary
                    System.out.print("\n ------------------------------------------------------");
                    System.out.print("\n     New Base Salary >> ");
                    thSalesPerson.setBaseSalary(getPositiveDouble());                    
                    break;
                case 2:
                     // Commission Rate
                    System.out.print("\n ------------------------------------------------------");
                    System.out.print("\n     New Commission Rate >> ");
                    thSalesPerson.setCommissionRate(getPositiveDouble());                    
                    break;
                default: 
                    // don't care
                    break;
            }
        } // End Main Loop
        
       

    } // end menuSalesPersonDetail
        
    public static void displaySalesPersonDetail() 
    {
        // Displays main output screen

        System.out.print("\n ======================================================");
        System.out.print("\n  Annual Compensation Calculator");
        System.out.print("\n ------------------------------------------------------");
        System.out.print("\n  - This program calculates total annual compensation based on the values listed below.");
        System.out.print("\n  - Press 'Enter' after each value input.");
        System.out.print("\n  - On startup, a new Annual Sales value is required.");
        System.out.print("\n  - Enter a line number (1 or 2) to edit an item.");
        //System.out.print("\n  - 4: Display sales projection table. 5: Quit Program.");
        System.out.print("\n  - Enter '3' to exit this view and continue program.");
        System.out.print("\n ======================================================");
        System.out.printf("\n  1) Base Salary              : $%,.2f", thSalesPerson.getBaseSalary());
        //System.out.printf("\n  2) Annual Sales             : $%,.2f", thSalesPerson.getAnnualSales());
        System.out.printf("\n  2) Commission Rate          :  %.2f", thSalesPerson.getCommissionRate());
        // display a custom message for this computation, based on the current Annual Sales figure.
        
    } // end displaySalesPersonDetail
    
    public static double getPositiveDouble() 
    {
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
    
    

} //End Team_B Program

