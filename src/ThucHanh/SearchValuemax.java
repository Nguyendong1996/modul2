package ThucHanh;

import java.util.Scanner;

public class SearchValuemax {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter a size");
            size = sc.nextInt();
            if(size>20){
                System.out.println("Do dai mang khong vuot qua 20");
            }
        }
        while (size>20);
        array =new int[size];
       for (int i =0;i< array.length;i++){
            System.out.println("nhap vao phan tu cua mang"+ i +"");
            array[i] = sc.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("số lớn nhất trong mảng là :" + max);


    }
}
