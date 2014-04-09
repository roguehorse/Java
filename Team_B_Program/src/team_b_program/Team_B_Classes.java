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


/**
 *
 *        Team_B
 * Week_5_Team_Project
 *       PRG/420
 *  September 2, 2013
 * 
 */

class Team_B_Classes
{
   //Place holder class 
}


class SalesPerson 
{
    // this class handles values and calculations for the modeled sales person.
    
    private double thBaseSalary=75000.00; // class variable for Base Salary element   
    private double thAnnualSales=0.00;    // class variable for Sales element
    private double thCommissionRate=0.07; // class variable for Commission Rate element
    private double thTargetSales=120000.00;  // class variable for target sales goal
    private double thAccelerationFactor=1.5; // class variable for Commission Rate bonus factor for Exceeding sales goal

       
    public double getTargetSalesValue() {
        // return stored value for private class variable for Target Sales
        return thTargetSales;
    } // end getTargetSalesValue
    
    public double getAccelerationFactor() {
        // return commision acceleration factor
        return thAccelerationFactor;
    } // end getAccelerationFactor

    
    public double getBaseSalary () {
        // return stored base salary amount 
        return thBaseSalary;
    } // end getBaseSalary
    
    
    public void setBaseSalary(double baseSalary) {
        // allow modification of the private class variable for base salary
        thBaseSalary=baseSalary;
    } // end setBaseSalary

        
    public double getCommissionRate() {
        // return the value for the private class variable for commission rate
        return thCommissionRate;
    } // end getCommissionRate
    
    
    public void setCommissionRate(double commissionRate) {
        // allow modification of the private class variable for commission rate
        thCommissionRate=commissionRate;
    } // end setCommissionRate 
    
    
    double goalAccel()//Sales goal acceleration value
    {
        double goalaccel = 0.015;//sales goal acceleration !!Change value above only!!
        return goalaccel;
    }
    
    
    double startIncentive()//Sales incentive initiation value
    {
        double startincent = .80;//incentive start !!Change value above only!!
        return startincent;
    }
}


/**********************COLLECT NAMES OF SALES PERSONS**************************/
class Names
{
 ArrayList<String> names = new ArrayList<>();//Collect names of two salespeople in an ArrayList
 Scanner input = new Scanner ( System.in );//Invoke scanner to collect input

   public void NameInput()
    {
      System.out.println("\n=====================================================================================\n");
      for (int x=1; x<3; x++)//Loop until both names are entered into ArrayList
      {
        String sp1 = "Please enter saleperson " + x + " first name   >>   ";
        System.out.printf("%48s",sp1);
        names.add(input.next());
      }
      System.out.println("\n=====================================================================================\n");
    }
}


/**************COLLECT ANNUAL SALES AMOUNTS FROM SALES PERSONS*****************/
class Annual
{
 ArrayList<String> names = new ArrayList<>();    
 ArrayList<Double> asales = new ArrayList<>();
 Scanner input = new Scanner ( System.in );

   public void AnnualInput()
    {
       double z;//Assign variable for validation loop prior to assigning to ArrayList
       for (int x=1; x<3; x++)//Loop twice for two sales people
       {
        String sp2 = "Please enter saleperson " + x + " sales   >>   $";
        System.out.printf("%49s",sp2);
        z = input.nextDouble();//Assign input to variable
        if (z <= 0)//Determine if variable holds a valid input
        {
            String validate1 = "!!  Please enter a value greater than 0  !!";//Ask for valid input
            System.out.printf("%69s",validate1);
            System.out.println();
            x = x-1;//Remove one from loop counter until input is valid
        }
        
        else
        {
           asales.add(z);//Add input from variable to ArrayList once validated
        }
        
       }
       System.out.println();
       
    }   
}