package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1;
        int size2;
        int size;
        int[] array1;
        int[] array2;
        int[] array;
        System.out.println("Enter a size1 :");
        size1 = scanner.nextInt();
        System.out.println("Enter a size2 :");
        size2 =scanner.nextInt();
        size = size1+size2;
        if (size>20){
            System.out.println("retype a size1 and size2");
        }
        while (size>20);
        array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter a array1 rank " +i );
            array1[i]= scanner.nextInt();
        }
        array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter a array2 rank " +i );
            array2[i]= scanner.nextInt();
        }
        array = new int[size];
        System.out.printf("%-20s%s", "Elements in array1: ", "");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
            array[i]=array1[i];
        }
        System.out.println();
        System.out.printf("%-20s%s", "Elements in array2: ", "");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
            array[i+size1]=array2[i];
        }
        System.out.println();
        System.out.printf("%-20s%s", "Elements in array: ", "");
        System.out.println(Arrays.toString(array));
    }
}
