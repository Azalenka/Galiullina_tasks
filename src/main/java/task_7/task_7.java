package task_7;

import java.util.Scanner;
//С клавиатуры в консоль задается число n. Вывести в консоль все числа от n до 1 в строку через пробел при помощи рекурсии.
public class task_7 {

    public static int recursive(int n) {


            if (n == 1) { return 1;
            } else {recursive(n-1);}
           return recursive(n) ;
        }



    public static void main(String[] args) {
         task_7 ob= new task_7();
            System.out.println("Введите число в консоль: ");
            Scanner in= new Scanner(System.in);
            int n= in.nextInt();
            System.out.println("Число введенное в консоль  "+ n);
            System.out.println("В пределах от "+n+ "до 1" + " находятся  числа: " +task_7.recursive(n));
    }
}
