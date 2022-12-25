package originalprojects.rpg;
import java.util.Scanner;
import java.util.Arrays;
//practicing Object-Oriented-Programming!
public class Characters {
    String[] inventory;
    String name;
    int level;


    Characters() {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
        System.out.printf("%nWelcome, %s", this.name);
        this.inventory = new String[] {"old wooden sword","red potion", "blue potion"};
        this.level = 1;
        System.out.printf("%nYour level: %d %nYour inventory: %s", this.level, Arrays.toString(this.inventory));
        scanner.close();


    }


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
