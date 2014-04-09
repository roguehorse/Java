package commision;

public class Commision
{   
    //Fixed salary.
    private final double Fix_Sal = 75000;
    //Commission.
    private final double Comm = 7.0;
    //Acceleration factor.
    private final double Accel_Factor = 1.50;
    //Sales target.
    double target = 120000;         
    //Sales incentive threshold.
    double thresh = .80;

    String spName;    //Salesperson's name
    double annSales;   //Annual sales
    double commRate;  //Commission rate.  
    double commEarned;  //Commission earned.   
    double totalAnnComp; //Total annual commission

    //Constructor
    public Commision()
    {
        spName = "Unknown";
        annSales = 0.0;
    }

    ////Parameterized Constructor
    public Commision(String name, double sales)
    {
        spName = name;
        annSales = sales;
    }

    //Set name of salesperson
    public void setName(String name)
    {
        spName = name;
    }

    //Ruturn name of salesperson
    public String getName()
    {
        return spName;
    }

    //Set the annual sales
    public void setSales(double sales)
    {
        annSales = sales;
    }

    //Returns the value in annualSales
    public double getSales()
    {
        return annSales;
    }

    //Calculate and return commission earned
    public double getComm()
    {
    //Check if sale is greater than or equal to 80% of target. 
    if (annSales >= (target * thresh))
    {
            if (annSales > target) //Checks if annual sales exceed target.
            {   
            //Commission rate.
                commRate = (Comm * Accel_Factor)/100;
        commEarned = commRate * annSales;
            }
            else
            {
        commRate = Comm/100;
        commEarned = commRate * annSales;
            }
    }
    else
        {
        commRate = 0;
        commEarned = 0;
    }
    return commEarned;
    }

    /*
     * Calculate and return total annual compensation.
     */ 
    public double getAnnComp ()
    {
    totalAnnComp = Fix_Sal + commEarned;
    return totalAnnComp;
    }
}