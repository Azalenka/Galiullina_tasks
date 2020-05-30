package task_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;

public class MinMaxArray {
    public static void main(String[] args) {
        Integer [] arra= {1,2,3,5,6,19,8,9,10,13};
        System.out.println(Arrays.toString(arra));
        int min = Collections.min(Arrays.asList(arra));
        int max= Collections.max(Arrays.asList(arra));

        double averagevalue=0;


        for(int i: arra) { averagevalue += i ;   }
        System.out.println("Минимальное число "+ min+", максимальное число в массиве "+ max+" , среднее число "+averagevalue);}

}
