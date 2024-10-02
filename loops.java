/*
Fibonacci Series In Java Programs
Subtract the Product and Sum of Digits of an Integer
Input a number and print all the factors of that number (use loops).
Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
Take integer inputs till the user enters 0 and print the largest number from all.
Addition Of Two Numbers
Intermediate Java Programs
Factorial Program In Java
Calculate Electricity Bill
Calculate Average Of N Numbers
Calculate Discount Of Product
Calculate Distance Between Two Points
Calculate Commission Percentage
Power In Java
Calculate Depreciation of Value
Calculate Batting Average
Calculate CGPA Java Program
Compound Interest Java Program
Calculate Average Marks
Sum Of N Numbers
Armstrong Number In Java
Find Ncr & Npr
Reverse A String In Java
Find if a number is palindrome or not
Future Investment Value
HCF Of Two Numbers Program
LCM Of Two Numbers
Java Program Vowel Or Consonant
Perfect Number In Java
Check Leap Year Or Not
Sum Of A Digits Of Number
Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero. */


/*1.Fibonacci series
import java.util.Scanner;
public class loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=0;
        int n2=1;
        int fib;
        System.out.print(n1+" "+n2);
        for (int i =2; i<=n; i++){
            fib = n1+n2;
            System.out.print(" "+fib);
            n1 = n2;
            n2 = fib;
          
    
    if (i==n){
      System.out.println("print the number"+fib);
    }
  }  
}
}*/



/*Subtract the Product and Sum of Digits of an Integer
class loops {
    public static void main(String[] args){
        subtractProductAndSum(678);
    }
    static void subtractProductAndSum(int n) {
      int sum = 0;
      int product = 1;
      while (n > 0) {
        sum += n % 10;
        product *= n % 10;
        n /= 10;
      }
      System.out.println(product - sum);
    }
  }*/
  
  
  /*Input a number and print all the factors of that number (use loops).
import java.util.Scanner;
public class loops{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int num = sc.nextInt();
      System.out.print("Factors are:");
      for(int i=1;i<num;i++){
        if(num%i ==0){
         
          System.out.print(" "+i);
        }

      }



    }
  }*/

/*Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.*;
public class loops{
  public static void main(String[] args){
    int num;
    int sum =0;
    do {
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
      sum = sum+num;
      System.out.println("Sum is: "+ sum);
    
    }while(num>0);


  }
}*/


/*Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.*;
public class loops{
  public static void main(String[] args){
    int num;
    int larg =1;
    do{
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
      if (num > larg){
        larg = num;
        System.out.print("largest number is:"+larg);

       }}while(num>0);
    
    

  }
}*/

/*Factorial Program In Java
import java.util.*;
public class loops{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int fact=1;
    for(int i=1;i<=num;i++)
    {
      fact=fact*i;
  
  }
  System.out.print(fact);
}}*/



/*Power In Java
import java.lang.Math;
import java.util.*;
public class loops{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number");
    int a = sc.nextInt();
    System.out.print("Enter power");
    int b = sc.nextInt();
    double power = Math.pow(a, b);
    System.out.println("output is:"+power);
  }
}*/

/*Calculate Batting Average
import java.util.*;
public class loops{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter total runs scored: ");
    int run = sc.nextInt();
    System.out.print("Enter total number of innings: ");
    int innings =sc.nextInt();
    double average = run/innings;
    System.out.println("Batting average is:"+average);

    

  }
}*/
/*Compound Interest
import java.lang.Math;
import java.util.*;
public class loops{


  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Principle amount:");
    int P = sc.nextInt();
    System.out.print("Enter Rate of Interest");
    int R = sc.nextInt();
    System.out.print("Enter Time");
    int T = sc.nextInt();
    double x = P*(1+(R/100));
    double Amount = Math.pow(x,T);
    double CI = Amount - P ;
    System.out.println("Compound Interest is:" + CI);  

}}*/
/*Armstrong number
import java.util.*;
import java.lang.Math;
public class loops{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int a = sc.nextInt();
    int rem=0;
    int arm = 0;
    int orig = a;
    while(orig!=0){
      rem = orig%10;
      arm += Math.pow(rem, 3);
      orig = orig/10;
    }
      if (arm==a){
        System.out.print("Number is armstrong");
      }
      else{
        System.out.print("Number is not armstrong");
      }
    
    
  }
}*/
/*count the  number of digits
import java.utul.*;
public class loops{
  public static void main(String[] args){
    int count=0;
    int n= 0;
    int num = 98756;
    for (int i =num;i>0;i=i/10){
      n = num%10;
      
      count = count+1;
      // num = num/10;
     

    }
    System.out.print(count);
  }
}*/
/*number is palindrome or not
import java.util.*;
public class loops{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r;
    int rev=0;
    int temp = n;
    while(n!=0){
      r = n%10;
      rev= rev*10+r;
      n = n/10;
    }
    if (rev==temp){
      System.out.println("Yes it is palindrome");
    }
    else{
      System.out.println("not a palindrome"+rev);
    }


  }
}*/




 
 
        
    
