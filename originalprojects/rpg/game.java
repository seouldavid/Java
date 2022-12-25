package originalprojects.rpg;
import java.util.Scanner;
import originalprojects.rpg.Characters;
public class Game {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Please choose one of the options : createCharacters/exit");
    try {
        String option = scanner.nextLine();
        errorCapture(option);
    } catch (Exception e) {

    }
}
