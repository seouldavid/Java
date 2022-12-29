import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class Test {
  public static void main(String[] args) {
    File file = new File("dataset4.txt");
    int total = 0;
    try(Scanner scanner = new Scanner(file)) {
      while(scanner.hasNext()) {
        int temp = scanner.nextInt();
        if (temp > total) {
          total = temp; 
        }
      }

    } catch (FileNotFoundException e) {
      System.out.println("file not found");
    }
    System.out.println(total);
  }
}