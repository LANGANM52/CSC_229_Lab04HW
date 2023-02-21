/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.csc229_lab04hw;

/**
 *
 * @author mattl
 */
public class CSC229_Lab04HW {

    public static void main(String[] args) {
        helloWorld(50);  //prints Hello World 50 times
        System.out.println(sum(28));  //sum of all numbers between 7 and 28 that are multiples of 7

        //Binary search initialization
        int arr[] = {7, 14, 384, 127, 54, 97, 47, 73, 96, 25, 65, 88, 42};        
        int x = 65;       
        int start = 0, end = arr.length - 1, index = -1;

        //Selection sort example
        int outer, inner, min, size = arr.length;
        for (outer = 0; outer < size - 1; outer++) {
            min = outer;
            for (inner = outer + 1; inner < size; inner++) {
                if (arr[inner] < arr[min]) {
                    min = inner;
                }
            }
            int temp = arr[outer];
            arr[outer] = arr[min];
            arr[min] = temp;
        }
        //Binary search recursively example
        if (start > end) {
            System.out.println("False");
        } 
        else {
            int m = (start + end) / 2;
            if (arr[m] < x)
                start = m + 1;
            else if (arr[m] > x)
                end = m - 1;
            else {
                index = m;
                
        }
        if (index == -1) {
            System.out.println("Number searched was not found");
        }
        else {
            System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5] + " " + arr[6] + " " + arr[7] + " " + arr[8] + " " + arr[9] + " " + arr[10] + " " + arr[11]);
            System.out.println(x + " was found at the position " + index);
        }
        
    }
    }

    public static void helloWorld(int count) {          //function that prints "Hello World" n times recursively
        System.out.println("Hello World!");
        if (count <= 1) {
            return;
        }
        helloWorld(count - 1);
    }

    public static int sum(int num) {        //function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion
        int result;
        if (num == 7) {
            result = 7;
        } else {
            result = num + sum(num - 7);
        }
        return result;
    }

}
