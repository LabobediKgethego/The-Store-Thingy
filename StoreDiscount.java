import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
     static int rows;
     static double totalSum;
     public static void main(String args[]) {
      //int x=10;
      //int y=25;
      //int z=x+y;
     

      //System.out.println("Sum of x+y = " + z);
      buySomething();
   
       }
       public static void buySomething()
       {
       Scanner enterUserName = new Scanner(System.in);
      System.out.println("Enter username:");
      String userName = enterUserName.nextLine(); 
      System.out.println("HEY "+userName.toUpperCase()+" Buy Something, press corresponding number to buy, e.g press 1 to buy Apple");
      System.out.println("1. Apple Bag P10"+"\n"+"2. Orange Bag P30"+"\n"+"3. Microwave P300"+"\n"+"4. Refridgerator P1000"+"\n"+"You want to buy: ");
      Scanner enterBuySomething = new Scanner(System.in);
      String buySomething = enterBuySomething.nextLine(); 
      System.out.println("You bought: ");
      if(buySomething.contains("1")){
          rows = rows + 1;
          System.out.println(rows+".Apple Bag for $10");
         
       totalSum = totalSum+ 10.00;
        //System.out.println("You owe: "+totalSum);
      }
      if(buySomething.contains("2")){
          rows = rows + 1;
          System.out.println(rows+".Orange Bag for $30");
          totalSum = totalSum+ 30.00;
          //System.out.println("You owe: "+"P30");
      }
      if(buySomething.contains("3")){
          rows = rows + 1;
          System.out.println(rows+".Microwave for $300");
          totalSum = totalSum+ 300.00;
          //System.out.println("You owe: "+"P300");
      }
      if(buySomething.contains("4")){
          rows = rows + 1;
          System.out.println(rows+".Refridgerator for $1000");
          totalSum = totalSum+ 1000.00;
          //System.out.println("You owe: "+"P1000");
      }
      else if(!buySomething.contains("4")^buySomething.contains("3")^buySomething.contains("2")^buySomething.contains("1")){
          System.out.println("Your request cannot be processed");
      }
      
      System.out.println("Total Before Discount: BWP"+totalSum);
      System.out.println(" ");
      Scanner enterWhatAreYou = new Scanner(System.in);
      System.out.println("Please choose what category you fall in:");
      System.out.println("1. Employee of the store"+"\n"+"2. Affiliate of the store"+"\n"+"3. Custormer of the for over 2 years " +"\n"+"4. Not any of the above "+"\n"+"5. $5 Discount for every $100 " );
      String whatAreYou = enterWhatAreYou.nextLine(); 
      
      if(whatAreYou.equals("1")){
          //int discount = (int) 0.3;
          double discount = totalSum*0.30;
          double newTotalSum = totalSum-discount;
          System.out.println("Employee Discount:  $"+discount);
          System.out.println("Total After Employee Discount: $"+newTotalSum);
      }
      if(whatAreYou.equals("2")){
          //int discount = (int) 0.3;
          double discount = totalSum*0.10;
          double newTotalSum = totalSum-discount;
          System.out.println("Affiliate Discount:  $"+discount);
          System.out.println("Total After Affiliate Discount: $"+newTotalSum);
      }
      if(whatAreYou.equals("3")){
          //int discount = (int) 0.3;
          double discount = totalSum*0.05;
          double newTotalSum = totalSum-discount;
          System.out.println("Customer Discount:  $"+discount);
          System.out.println("Total After Customer Discount: $"+newTotalSum);
      }
      if(whatAreYou.equals("4")){
          System.out.println("Sorry you do not have a discount");
      }
      
      //else{
           //System.out.println("Sorry you do not have a discount");
      //}
      if(whatAreYou.equals("5")){
          double discount1 = totalSum%100;
          double discount2 = totalSum-discount1;
          double discount3 = discount2*0.05;
          double newTotalSum = totalSum-discount3;
          System.out.println("$5 Discount for every $100: $"+discount3);
          System.out.println("Total After Customer Discount: $"+newTotalSum);

      }

       }
       
} 
      
     
