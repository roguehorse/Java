/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salesprojectv2;
/**
 *
 * @author Scott DuBois aka Roguehorse
 */
public class Basev2 
{
     double s = 75000; //Adjust this value when setting BASE SALARY
     double g = 120000; //Adjust this value to set SALES GOAL
     double p = .07; //Adjust this value when setting INCENTIVE PERCENTAGE
     double i = .80; //Adjust this value to determine INCENTIVE START
     double m = 1.5; //Adjust this value for BONUS MULTIPLIER
     
     void description() //Description of annual salary detrmination 
       //Values in description must be modified manually
    {
         //Salary explanation 
        System.out.println( " Gross salary is determined by adding");
        //Salary explanation
        System.out.println( " base salary to annual sales");
        //Salary explanation
        System.out.println( " incentive at 07% of total sales.\n");
        //Salary explanation
        System.out.println( " Base salary is set to $75,000.\n");
        //Define when incentive kicks in
        System.out.println( " Salespersons will begin to collect incentives");
        //Print line
        System.out.println( " once 80% of a sales goal");
        //Define when incentive kicks in
        System.out.println( " set at $120,000 has been reached.");
        //Print line  
        System.out.println();
        //Print empty line       
        System.out.print( " Please enter the sales amount $");
        //Collect input value into variable sales
    }
     
   double baseSalary() //Base salary variable set   
    {
       double bSalary;
       bSalary = s; //Base salary value !!Change value above only!!
       return bSalary;
    }
   
    double pIncentive() //Incentive percentage variable set         
    {
        double percent;
        percent = p; //incentive percentage !!Change value above only!!
        return percent;
    }
    
    double startIncentive() //Sales incentive initiation value
    {
        double startincent;
        startincent = i; //incentive start !!Change value above only!!
        return startincent;
    }
    
    double salesGoal() //Sales goal value
    {
        double goal;
        goal = g; //sales goal level !!Change value above only!!
        return goal;
    }
    double goalMultiplier() //Sales goal multiplier value
    {
        double goalmulti;
        goalmulti = m; //sales goal multiplier !!Change value above only!!
        return goalmulti;
    }
}
