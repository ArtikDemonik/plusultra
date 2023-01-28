package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type array size: ");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            System.out.printf("Type %d elem: ", i);
            array[i] = in.nextInt();
        }
        int max = 0, max2 = 0;
        for(int i: array){
            if ( i > max )
                max = i;
        }
        for (int i: array){
            if(i > max2 & i != max){
                max2 = i;
            }
        }
        System.out.printf("Max: %d\nMax2: %d", max, max2);
    }
}