import java.util.Scanner;
public class sumfunc {
    public static void main(String[] args){
        int d = sum();
        System.out.println("Sum of Numbers is:"+d);
    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b =sc.nextInt();
        int add = a+b;
        return add; 


    }

}
