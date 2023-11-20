package com.myself.other;

//引入java官方包
import java.util.Arrays;


public class Utils {
    public void ArraySort(int[] arr){
        Arrays.sort(arr);
    }
    public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
