package com.wzt;

import java.util.Arrays;

public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr={30,20,50,10,80,9,7,12,100,40,8};
        int searchnumber = 20;//search for 20
        Arrays.sort(arr);//对arr数组排序

        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,searchnumber));

    }

    public static int binarySearch(int[] array,int value){
        int low =0 ;
        int high = array.length-1;
        while (low <= high){
            int middle =(low+high)/2;
            if(value==array[middle]){
                return middle;
            }
            if (value>array[middle]){
                low=middle-1;
            }
            if (value<array[middle]){
                high = middle-1;
            }
        }
        return -1;
    }

}
