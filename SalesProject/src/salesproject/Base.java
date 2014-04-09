package salesproject;
//Class Base with one method baseSalary
public class Base
{
    // Define method to display text defining base salary value
    public void description()
    {
       System.out.print( " Gross salary is determined by adding\n");
       System.out.println( " base salary of $75,000 + sales incentive");
       System.out.print( " at 7% of total sales.\n\n");
       System.out.print( "Please enter the sales amount $");
    }// End Method description
    
    // Define method to assign base salary
    public int baseSalary()  
    {
       int bSalary;
       bSalary = 75000;
       return bSalary;
    }// End method baseSalary
    
    // Define method to assign sales commission percentage
    public double pIncentive()          
    {
       double percent;
       percent = .07;
       return percent;
    }// End method pIncentive
    
}//End class Base