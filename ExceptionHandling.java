import java.io.ArithmeticException;
import java.io.IOException;
import java.io.ArrayIndexOutOfBoundsException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.printLn("Enter a number: ");
            int divisor = sc.nextInt();
            double result = 1000 / divisor;
            System.out.printLn("Result: " + result);

            int[] arr = {1, 2, 3};
            System.out.println("Array element: " + arr[4]);
        } catch(ArithmeticException e) {
            System.out.println("Error");
            e.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
            e.printStackTrace();
        } finally {
            System.out.println("Code finished");
        }
    }
}