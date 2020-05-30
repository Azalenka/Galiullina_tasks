package task_6;

import com.sun.source.tree.IfTree;

//Task 6
//        Описать класс фигуру прямоугольник:
//        * класс  имеет поля длина и ширина
//        * у класса есть метод определения является ли прямоугольник квадратом
public class Rectangle {
     int length=2;
      int width=2;


    public boolean mayBeRectangle(int length, int width) {
         boolean result= true;
        if (length==width){
            result= true;System.out.println("Прямоугольник является квадратом");}
        else {result=false; System.out.println("Прямоугольник не является квадратом");}
return result;

    }
}
