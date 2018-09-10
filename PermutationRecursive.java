package org.practice.courses.courseapi;

public class PermutationRecursive {
    int count= 0;

    public void swap (int[] arr, int k, int j){
        int t = arr[k];
        arr[k] = arr[j];
        arr[j] = t;
    }

    public void print(int[] arr){
        count++;
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public void permutations(int[] arr, int k, int n){
        if(k == n ){
            print(arr);
        }else{
            for(int i = k ; i<= n; i++){
                swap(arr, k , i);
                permutations(arr, k+1, n);
                swap(arr, i, k);
            }
        }
    }


    public static void main(String args[]){
        PermutationRecursive permutationRecursive = new PermutationRecursive();
        int[] arr = new int[] {1,2,3,6,4,5,9,10};
        String input = "ROAD";
        char[] input2 = input.toCharArray();
        permutationRecursive.permutations2(input2, 0, input2.length-1);
        System.out.println("Count is:" + permutationRecursive.count);
    }

    public void printChar(char[] arr){
        count++;
        for(char c : arr){
            System.out.print(c);
        }
        System.out.println();
    }

    public void swapChar(char[] arr, int k , int j){
        char t = arr[k];
        arr[k] = arr[j];
        arr[j] = t;
    }

    public void permutations2(char[] arr, int k , int n){
        if(k == n){
            printChar(arr);
        }else{
            for(int i =k; i <= n; i++){
                swapChar(arr, k, i);
                permutations2(arr, k+1, n);
                swapChar(arr, i, k);
            }
        }
    }
}
