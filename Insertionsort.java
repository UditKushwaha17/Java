import java.util.*;
public class Insertionsort{
    public static void main(String[] args){
        int[] arr = {9,6,45,56,8,-1};
        sorted(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp= arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]= temp;
                }
                else{
                    break;
                }
            }
        }
    }
}