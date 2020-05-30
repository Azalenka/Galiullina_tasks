package task_3;

import java.util.Scanner;

//Написать программу, которая:
//        * просить ввести слово, начинающееся на букву "А" в консоль
//        * проверяет слово на наличие букву "А" в начале
//        * если слово начинается не на "А" - просит ввести повторно, пока не будет введено требуемое слово
//        * если слово начинается на "А" - благодарит и завершает исполение
public class StartWithA {
    public static void main(String[] args) {

        System.out.println("Введите  слово, начинающееся на букву \"А\" в консоль: ");
        Scanner in= new Scanner(System.in);
        String str= in.nextLine();
         if (str.startsWith("A",0)|| str.startsWith("а",0)){
             System.out.println("Благодарю, слово начинается на \"А\"");
                      } else  { System.out.println("слово  не начинается на \"А\", введите слово повторно");

        }

    }
}
