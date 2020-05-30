package task_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//При помощи операций агреггирования и лямбда выражений отфильтровать все строки в списке List, длина которых меньше 4 символов.
public class Lamda {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("куча");
        list.add("море");
        list.add("стол");
        list.add("стул");
        System.out.println(list);
//        list.removeIf();
        list.stream().filter(function->function.length()<4).collect(Collectors.toList());

        System.out.println(list);
    }
}
