import java.util.Scanner;
public class hii {
    public static void main(String[] args) {
        System.out.print("imput number to divide by 2 :");
        Scanner scanner = new Scanner(System.in);
        // System.out.print("*** " + scanner.nextLine() + " ***");
        int num = scanner.nextInt();
        System.out.print("Result: " + num/2);
        scanner.close();
    }
}