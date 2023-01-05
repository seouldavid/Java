package guided;
import java.util.*;

public class Test {
    public static int abs(int a, int b) {
        if (a - b < 0) {
            return -1 * (a - b);
        } else {
            return a - b;
        }
    }
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numList = line.split(" ");
        System.out.println(numList.toString());
    }
}