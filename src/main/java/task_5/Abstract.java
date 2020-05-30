package task_5;
//Описать абстрактный класс фигура:
//        * класс имеет свойство цвет
//        * класс имеет нереализованное поведение рассчитать площадь
//        * класс имеет нереализованное поведение рассчитать периметр
public abstract class  Abstract {
     String color;
    double num;
    double num2;
      public Abstract(String color, double num, double num2) {
          this.num= num;
                   this.num2=num2;
          this.color= color;
      }
     public abstract double calcArea( );

     public abstract double calcPerimetr( );
}
