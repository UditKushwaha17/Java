import java.util.*;
public class Selectionsort{
    public static void main(String[] ags){
        int[] arr = {4,5,-2,5,7,1};
        sorted(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sorted(int[] arr){
        
        for(int i=0; i<arr.length;i++){
        int end = arr.length-i-1;
        int max = maxi(arr,end);
        swap(arr, max, end);
        }

    }
    static int maxi(int[] arr,int  end){
        int max = 0;
        for(int i =0 ; i<=end; i++){
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;


    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}