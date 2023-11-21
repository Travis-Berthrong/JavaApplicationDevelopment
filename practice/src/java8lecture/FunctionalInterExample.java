package java8lecture;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterExample {

    public static void main(String[] args) {
        Addition addition = (a, b) -> System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
        addition.add(10, 20);

        Addition addition2 = (a, b) -> {
            System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
            System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
        };
        addition2.add(20, 20);

        List<String> names = new ArrayList<String>();
        names.add("Name1");
        names.add("Name2");
        names.add("Name3");

        names.forEach((name) -> System.out.println(name));
    }
    
}

interface Addition{
    void add(int a, int b);
}
