package guidedprojects;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '0' || temp.charAt(i) == ' ' ) {
            } else {
                 System.out.println("Arithmetic");
                 throw new ArithmeticException();
            }
        }
        scanner.close();
    }
}
