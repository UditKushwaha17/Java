import java.util.*;
public class Demo{
    public static void main(String[] args){
        
        int[] arr = {20,56,78,45,30,20,67};
        harp(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void harp(int[] arr){
        boolean swapped;
        for (int i=0;i<arr.length;i++){
            swapped = false;
            for(int j =1; j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                int temp =arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                swapped = true;
            }}if(!swapped){
                break;
            }
        }
    }
}