/*Write a program to print whether a number is even or odd, also take input from the user.
Take name as input and print a greeting message for that particular name.
Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
Take 2 numbers as input and print the largest number.
Input currency in rupees and output in USD.
To calculate Fibonacci Series up to n numbers.
To find out whether the given String is Palindrome or not.
To find Armstrong Number between two given number.*/




/* Write a program to print whether a number is even or odd, also take input from the user.
import java.util.*;
public class Firstassign {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        if( a%2==0){
            System.out.println("Number is even");}
        else{
            System.out.println("Number is odd");
        }

        }

    }*/
    

/*Take name as input and print a greeting message for that particular name. 
import java.util.*;
public class Firstassign{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Happy to see you on our desk Mr/Mrs " + name);

    }
}*/

/*Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest. 
import java.util.*;
public class Firstassign{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle amount:");
        int P = sc.nextInt();
        System.out.print("Enter  time in years:");
        int T = sc.nextInt();
        System.out.print("Enter Interest Rate:");
        int R = sc.nextInt();
        float SI = (P*R*T)/100;
        System.out.println("The simple interest on your amount is: " + SI );



    }
}*/
/* Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.*;
public class Firstassign{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operator: ");
        char op = sc.next().trim().charAt(0);
        System.out.print("Enter first number:");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        if (op == '+'){
            float sum = a+b;
            System.out.println("Sum is:" + sum);

        }
        else if(op == '-'){
            float diff = a-b;
            System.out.println("Difference is:" + diff);

        }
        else if(op == '*'){
            float prod = a*b;
            System.out.println("Product is:"+ prod);
        }
        else if(op == '/'){
            float divi = a/b;
            System.out.println("Division is:"+ divi);
        }
        else{
            System.out.println("ENter valid operator");
        }


    }
}*/
/*To calculate Fibonacci Series up to n numbers. 
import java.util.*;
public class Firstassign{
    public static void main(String[] args){
        int a=0;
        int b=1;
        int c=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term");
        int k = sc.nextInt();
        for(int i=2; i<= k; i++){
            c = a+b;
            System.out.println(" " + c);
            a = b;
            b = c;

        }
    }
} */
/* To find out whether the given String is Palindrome or not.
import java.util.*;
public class Firstassign{
    public static void main(String[] args){
        String rev = "";
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int length = name.length();
        for(int i=length-1;i>=0;i=i-1){
            rev = rev + name.charAt(i);
            }
        if(name.equals(rev)){
                System.out.println("string is palindrome");
            }
        else{
                System.out.println("not a palindrome");
            }





    }

    

}*/
/*To find Armstrong Number between two given number.*/
import java.util.*;
public class Firstassign{
    public static void main(String[] args){
     
        int rem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int i;
        for(i=a;i<b;i++){
            int n = i;
            int num = 0;
            while(n!= 0){
                rem = n%10;
                num = num +(rem*rem*rem);
                n = n/10;       }
            if (num == i){
                System.out.println(" " + i);  
            }
    }}
}





