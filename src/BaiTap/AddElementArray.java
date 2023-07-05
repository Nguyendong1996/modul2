package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        int index;
        do{
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("nhap lai size");
            }
        }while (size>20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter Element a array rank :" +i );
            array[i]=scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array : ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        do {
            System.out.println();
        System.out.println("Nhập vị trí cần thêm");
        index = scanner.nextInt();
        if (index> array.length-1||index<-1){
            System.out.println("vi tri vua nhap khong the them vao mang array");
        }
        }while (index> array.length||index<-1);
        System.out.println("Nhap so can them");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(i==index){
                array[i]= number;
            }
        }
        System.out.printf("%-20s%s", "Elements in array new : ", "");
        System.out.println(Arrays.toString(array));
    }
}
