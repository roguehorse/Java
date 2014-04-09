package commission;
//Class Base with one method baseSalary
public class Base
{
    public double baseSalary()    
    {
       int bSalary;
       bSalary = 75000;
       return bSalary;
    }

 
    public double pIncentive()          
    {
        double percent;
        percent = .07;
        return percent;
    }
      
    public void description()
    {
         //Print line 
        System.out.print( " Gross salary is determined by adding\n");
        //Call print line from object variable salary
        System.out.print( " base salary to annual sales\n");
        //Print line
        System.out.print( " at 7% of total sales.\n\n");
        //Print line
        System.out.print( "Please enter the sales amount $");
        //Collect input value into variable sales
    }
}//End class Base