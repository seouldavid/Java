import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class Test {
  public static void main(String[] args) {
    File file = new File("dataset.txt");
    int total = 0;
    try(Scanner scanner = new Scanner(file)) {
      while(scanner.hasNext()) {
        int temp = scanner.nextInt();
        if (temp == 0) {
          break;
        }
        if (temp % 2 == 0) {
          total += 1;
        }
      }

    } catch (FileNotFoundException e) {
      System.out.println("file not found");
    }
    System.out.println(total);
  }
}