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
 * ======================================================
*/
package commission_calc;

/**
 *
 * @author Jason Thompson
 * 
 */

public class SalesPerson {
    // this class handles values and calculations for the modeled sales person.
    
    private boolean thHasAccelerationFactor=false; // class variable indicates whether incentive accelerator applies
    private boolean thEarnsCommission=false; // class variable indicates whether commission is earned, based on annual sales.
    private double thBaseSalary=75000.00; // class variable for Base Salary element   
    private double thAnnualSales=0.00;    // class variable for Sales element
    private double thCommissionRate=0.07; // class variable for Commission Rate element
    private double thTargetSales=120000.00;  // class variable for target sales goal
    private double thMinimumCompSales=0.8; // class variable for minimum percentage of target sales before Commission is earned
    private double thAccelerationFactor=1.5; // class variable for Commission Rate bonus factor for Exceeding sales goal
    
    
    
    public double getTotalCompensation() {
        // calculate total compensation based on private stored values
        return thBaseSalary+getCommission();
    } // end getTotalCompensation
    
    
    public double getCommission() {
        // calculate commission amount based on the stored rate and annual sales
        // if annual sales are less than thMinimumCompSales, 0
        // if annual sales are > target sales, use thCommissionRate*thAccelerationFactor
        // for annual sales between the two, use thCommissionRate
        
        double calculatedCommission=0.00; // default commission, target threshhold not met
        thHasAccelerationFactor=false;
        thEarnsCommission=false;
        
        if (thAnnualSales>=(getMinimumSalesForCommission())) {
            // sales must meet or exceed the target sales threashhold to receive commission
            thEarnsCommission=true;
            // check to see whether accelerator applies
            if (thAnnualSales<=thTargetSales) {
                // standard commission rate applies
                calculatedCommission=thAnnualSales*thCommissionRate;
            } else {
                // accelerator applies
                calculatedCommission=thAnnualSales*thCommissionRate*thAccelerationFactor;
                thHasAccelerationFactor=true;
            }
        }        
        
        return calculatedCommission;
    } // end getCommission
    
    public double getMinimumSalesForCommission() {
        // return minimum annual sales value a sales person must achieve in order to earn commission
        return thMinimumCompSales*thTargetSales;
    } // end getMinimumSalesForCommission
    
    public boolean getEarnsCommission() {
        // return whether or not commission is earned based on annaul sales
        return thEarnsCommission;
    } // end getEarnsCommission
    
    public double getTargetSalesValue() {
        // return stored value for private class variable for Target Sales
        return thTargetSales;
    } // end getTargetSalesValue
    
    public double getAccelerationFactor() {
        // return commision acceleration factor
        return thAccelerationFactor;
    } // end getAccelerationFactor
    
    public boolean getHasAccelerationFactor() {
        // return value of private class variable indicating whether acceleration factor applies
        return thHasAccelerationFactor;
    } // end getHasAccelerationFactor
    
    public double getBaseSalary () {
        // return stored base salary amount 
        return thBaseSalary;
    } // end getBaseSalary
    
    
    public void setBaseSalary(double baseSalary) {
        // allow modification of the private class variable for base salary
        thBaseSalary=baseSalary;
    } // end setBaseSalary
    
    
    public double getAnnualSales () {
        // return the value for the private class variable for annual sales total
        return thAnnualSales;
    } // end getAnnualSales
    
    
    public void setSales(double annualSales) {
        // allow modification of the private class variable for annual sales
        thAnnualSales=annualSales;
        getTotalCompensation();
    } // end setSales
    
    
    public double getCommissionRate() {
        // return the value for the private class variable for commission rate
        return thCommissionRate;
    } // end getCommissionRate
    
    
    public void setCommissionRate(double commissionRate) {
        // allow modification of the private class variable for commission rate
        thCommissionRate=commissionRate;
    } // end setCommissionRate
    
} // end Class SalesPerson
