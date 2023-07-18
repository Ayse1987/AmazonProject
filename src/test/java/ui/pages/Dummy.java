package ui.pages;

import java.util.Arrays;

public abstract class Dummy implements Dummy2 {
   

public static void a(){

}
//public abstract void ye();

    public static void main(String[] args) {
    secondBiggestNum();

        int arr1[]={1,3,5};
        int arr2[]={4,6,80};
        int []newArr=new int[arr1.length+arr2.length];
        System.out.println(newArr.length);
        for(int i=0;i<arr1.length;i++){
            newArr[i]=arr1[i];
        }

        for(int i=0;i<arr2.length;i++){
            newArr[3+i]=arr2[i];
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void secondBiggestNum(){
    int arr[]= {1,5,7,3,0};
    Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]!=arr[arr.length-2]){
                System.out.println(arr[arr.length-2]);
                break;

            }
        }


    }


}
