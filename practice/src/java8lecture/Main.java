package java8lecture;

public class Main {
    public static void main(String[] args) {
        FunctionalInterfaceExample f = (name, value) -> {
            System.out.println("Name: " + name + " Value: " + value);
        };
        f.test("Hello", 10);
    }
    
}
