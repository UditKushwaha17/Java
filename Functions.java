/*Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

Define a program to find out whether a given number is even or odd.

A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

Write a program to print the sum of two numbers entered by user by defining your own method.

Define a method that returns the product of two numbers entered by user.

Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

Define a method to find out if a number is prime or not.

Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

 
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1
Write a function to find if a number is a palindrome or not. Take number as parameter.

Convert the programs in flow of program, first java, conditionals & loops assignments into functions.

Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

Write a function that returns all prime numbers between two given numbers.

Write a function that returns the sum of first n natural numbers.*/


/*Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.*;
public class Functions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maxi(a, b, c);
        mini(a, b, c);

    }
        static void maxi(int a, int b, int c){
            if(a>b && a>c){
                System.out.println("a is maximum");
            }
            else if(b>a && b>c){
                System.out.println("b is maximum");
            }
            else{
                System.out.println("c is maximum");
            }
        } 
        static void mini(int a, int b, int c){
            if(a<b && a<c){
                System.out.println("a is minimum");   
            }
            else if(b<a && b<c){
                System.out.println("b is minimum");   
            }
            else{
                System.out.println("c is minimum");   
            }

            
        }

}*/
/*Define a program to find out whether a given number is even or odd.
import java.util.*;
public class Functions{
    static int a;
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        odeve();
    }
    static void odeve(){
        if(a%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }

}*/
/*A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.*;
public class Functions{
    static int age;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        eligib();
    }
    static void eligib(){
        if(age>18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }

    }
}*/
/*Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.*;
public class Functions{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        System.out.print(addi(a, b ));
    }
    static int addi(int a, int b){
       int  sum = a+b;
       return sum;
    }
}*/
/* Define a method to find out if a number is prime or not.
import java.util.*;
public class Functions {
    public static void main(String[] args){
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        primo(a);
    }

    static void primo(int a){
        if (a <= 1) {
            System.out.println(a + " is not prime");
            return;
        }

        if (a == 2) {
            System.out.println(a + " is prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                System.out.println(a + " is not prime");
                return;
            }
        }

        System.out.println(a + " is prime");
    }
}*/
/*Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

 
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
import java.util.*;
public class Functions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        grades(marks);

    }
        static void grades(int marks){
            if(marks>=91 && marks<=100){
                System.out.println("Grade AA");
            }
            else if(marks>=81 && marks<=90){
                System.out.println("Grade AB");
            }
            else if(marks>=71 && marks<=80){
                System.out.println("Grade BB");
            }
            else if(marks>=61 && marks<=70){
                System.out.println("Grade BC");
            }
            else if(marks>=51 && marks<=60){
                System.out.println("Grade CD");
            }
            else if(marks>=41 && marks<=50){
                System.out.println("Grade DD");

            }
            if(marks<=40){
                System.out.println("Fail");
            }

        }
    }*/
/*factorial using function
import java.util.*;
public class Functions{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.print(facto(num));

}
static int facto(int num){
    int factoria =1;
    for(int i=1;i<=num;i++){
        factoria = factoria*i;}
        return factoria;
    

}
}*/
/*palindrome
import java.util.*;
public class Functions{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        pal(a);

    }
    

    static void pal(int a){
        int rev=0;
        int rem;
        int temp = a;
        while(temp>0){
            rem = temp%10;
            rev=rev*10+rem;
            temp = temp/10;
        }
    if(rev==a){
        System.out.println("palindrome");
        }
    else{
        System.out.println("not palindrome");
        }
    }
}*/
/*prime numbers between two numbers
import java.util.*;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int start = sc.nextInt();
        System.out.print("Enter the second number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (Prime(i)) {
                System.out.println(i);
            }
        }
    }

      Method to check if a number is prime
    static boolean Prime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If num is divisible by any number other than 1 and itself, it is not prime
            }
        }
        return true; // num is prime
    }
}
*/
