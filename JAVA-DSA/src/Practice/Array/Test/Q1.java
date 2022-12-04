package Practice.Array.Test;

import java.util.Scanner;

//Build Array from Permutation
public class Q1 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of element you want to enter :");
        int n= input.nextInt();

        int[] arr = new int[n];
        int[] tmp= new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the number of index "+i);
            arr[i]= input.nextInt();
        }

        for(int i=0;i<n;i++){
            tmp[i]=arr[arr[i]];
        }
        System.out.println("The array after Permutation is : ");
        for (int i=0;i<n;i++){
            System.out.println("array["+i+"] = "+tmp[i]);

        }

    }
}
