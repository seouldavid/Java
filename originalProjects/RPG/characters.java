package originalprojects.RPG;
import java.util.Scanner;
//practicing Object-Oriented-Programming!
public class characters {
    String[] inventory;
    String name;
    int level;
    
    public void levelUp() {
        this.level += 1;
    }
    public void setUpName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats is your name? : ");
        this.name = scanner.nextLine();
        scanner.close();
    }
}
