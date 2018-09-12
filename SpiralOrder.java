package com.iheartmedia.salesforce.config.handler;

public class SpiralOrder {
    public void printSpiral(int n){

        int minRow = 0;
        int maxRow = n-1;
        int minCol = 0;
        int maxCol = n-1;

        int value = 1;

        int[][] spiral = new int[n][n];
        while(value <= n*n){
            for(int i = minCol ; i <= maxCol; i++){
                spiral[minRow][i] = value;
                value++;
            }

            for(int i = minRow + 1; i <= maxRow; i++){
                spiral[i][maxCol] = value;
                value++;
            }

            for(int i = maxCol - 1; i >= minCol; i--){
                spiral[maxRow][i] = value;
                value++;
            }

            for(int i = maxRow - 1; i >= minRow+1; i--){
                spiral[i][minCol] = value;
                value++;
            }

            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }

        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        SpiralOrder spiralOrder = new SpiralOrder();
        spiralOrder.printSpiral(4);
    }
}
