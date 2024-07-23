package Generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        Box<Integer> integerBox = new Box<>();
        integerBox.printNum(123);
       List<Object> list = new ArrayList<>();
       list.add(10);
       list.add(10.0);
       integerBox.  rintListOfNumber(list);
    }
}
