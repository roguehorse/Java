/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salesprojectv3;

/**
 *
 * @author Roguehorse
 */
public class Basev3 
{
       double s = 75000; //Adjust this value when setting BASE SALARY
     double g = 120000; //Adjust this value to set SALES GOAL
     double p = .07; //Adjust this value when setting INCENTIVE PERCENTAGE
     double i = .80; //Adjust this value to determine INCENTIVE START
     double m = .015; //Adjust this value for BONUS ACCELERATOR
     double t = 1.5; //Adjust this value to modify TABLE PRINT LENGTH MULTIPLIER 
     
     void description() //Description of annual salary determination 
    {
        System.out.println( " Gross salary is determined by adding");//Salary explanation
        System.out.println( " base salary to annual sales incentive value.\n");//Salary explanation
       
        System.out.printf( " Base salary is currently set at $%.2f\n\n",s);//Define base salary value
  
        System.out.printf( " Annual sales incentive percentage value is currently set at- %.2f\n\n",p);//Define sales incentive value
        
        System.out.println( " Salespersons will begin to collect incentives once");//Define when incentive kicks in
        System.out.printf( " they have reached a percentage of the sales goal set at- %.2f\n\n",i);//Define when incentive kicks in

        System.out.printf( " The sales goal is currently set at $%.2f\n\n",g);//Define the sales goal value

        System.out.println( " A bonus incentive value will be added to sales that exceed the goal!\n");//Define there is an incentive accelerator
     
        System.out.print( " Please enter the sales amount $");//Collect input value into variable sales
    }
     
   double baseSalary()//Base salary variable set   
    {
       double bSalary = s;//Base salary value !!Change value above only!!
       return bSalary;
    }
   
    double pIncentive()//Incentive percentage variable set         
    {
        double percent = p;//incentive percentage !!Change value above only!!
        return percent;
    }
    
    double startIncentive()//Sales incentive initiation value
    {
        double startincent = i;//incentive start !!Change value above only!!
        return startincent;
    }
    
    double salesGoal()//Sales goal value
    {
        double goal = g;//sales goal level !!Change value above only!!
        return goal;
    }
    
    double goalAccel()//Sales goal acceleration value
    {
        double goalaccel = m;//sales goal acceleration !!Change value above only!!
        return goalaccel;
    }
    
    double tLength()//Sets table print length value
    {
        double ptable = t;//Sets table print length variable !!Change value above only!!
        return ptable;
    }  
}
