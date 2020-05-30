package task_2;

import java.util.Scanner;

public class TwoNumbersArray {
    public static void main(String[] args) {

        System.out.println("Введите числа в консоль: ");
        Scanner in= new Scanner(System.in);
        int n1= in.nextInt();

        Scanner in2= new Scanner(System.in);
        int n2= in2.nextInt();
        int [][] arra= new int[n1][n2];
        System.out.println("В пределах от 1 до "+n1+ " находятся следующие простые числа: ");
        for (int i=1; i<n1; i++){
            if(!(i%2==0)) {
                System.out.println(i);}


        }
    }
}
