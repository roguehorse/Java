/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.*;
import java.text.*;

/**
 *
 * @author Roguehorse
 */
class Test
{
 public static void main (String [] args)

  {
      Scanner input = new Scanner ( System.in );
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      ArrayList<String> names = new ArrayList<>();
      ArrayList<Double> sales = new ArrayList<>();
      
      //String lName1;
      //String lName2;
    
      for (int i=0; i<1 ; i++)
     {
        System.out.printf("Please enter saleperson 1 name >> ");
        names.add(input.next());
        System.out.printf("\nPlease enter saleperson 2 name >> ");
        names.add(input.next());
        System.out.println();
        System.out.println("The name entered is >> " + names.get(0));
        System.out.println("\nThe name entered is >> " + names.get(1));
     }
      
      for (int i=0; i<1 ; i++)
      {
        System.out.printf("Please enter saleperson 1 sales >> $ ");
        sales.add(input.nextDouble());
        System.out.printf("\nPlease enter saleperson 2 sales >> $ ");
        sales.add(input.nextDouble()); 
        System.out.println();
        System.out.println( names.get(0)+ "made >> " + fmt.format(sales.get(0)));
        System.out.println( names.get(1)+"\nmade >> " + fmt.format(sales.get(1)));
      }
      
     //System.out.println("The name entered is >>" +names.get(0));
     //System.out.println("The name entered is >>" +names.get(1));
  }
}
