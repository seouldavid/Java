package originalprojects.rpg;
import java.util.Scanner;
//practicing Object-Oriented-Programming!
public class Characters {
    String[] inventory;
    String name;
    int level;
    
    void levelUp() {
        this.level += 1;
    }
    void setUpName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats is your name? : ");
        this.name = scanner.nextLine();
        scanner.close();
    }
}
