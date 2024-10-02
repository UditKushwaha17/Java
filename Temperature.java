import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in celcius: ");
        float temp = sc.nextFloat();
        float f = ( temp*9/5) + 32;
        System.out.println("Temperature in Farenheit is: " + f);
        //float k = temp + 273.5 ;
        //System.out.println("Temperature in Kelvin is: " + k);

          
    }

}
