package original.oop_games;
import java.util.Scanner;
import java.util.Arrays;
//practicing Object-Oriented-Programming!
public class Characters {
    String[] inventory;
    String[] skills;
    String name;
    int level = 1;


    Characters() {
        setUpName();
        setFirstInventory();
        setSkills();
        System.out.printf("%nYour level: %d %nYour inventory: %s %n Your skills: %s"
        , this.level, Arrays.toString(this.inventory),Arrays.toString(this.skills));


    }


    void levelUp() {
        this.level += 1;
    }

    void showLevel() {
        System.out.println(this.level);
    }

    void setUpName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats is your name? : ");
        this.name = scanner.nextLine();
        System.out.printf("%nWelcome, %s", this.name);
        scanner.close();
    }
    void setFirstInventory() {
        this.inventory = new String[] {"old wooden sword","red potion", "blue potion"};
    }

    void setSkills() {
        this.skills =new String[] {"wield-beginnerLevel"};
    }


}
