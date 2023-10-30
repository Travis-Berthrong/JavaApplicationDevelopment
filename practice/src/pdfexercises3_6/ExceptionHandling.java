package pdfexercises3_6;

public class ExceptionHandling {
    public static void main(String args[]) {
        int d = 42;
        int a = 0;
        try {
            int c = d / a;
            System.out.println("The value of c :" + c);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error");
        }
    }

}
