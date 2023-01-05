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
        Scanner scanner = new Scanner( System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while (scanner.hasNextInt()) {
          int temp = scanner.nextInt();
          System.out.println(temp);
          nums.add(Integer.valueOf(temp));
        }
        System.out.println("hi");
        scanner.close();
    }
}
