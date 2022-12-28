package original.oop_games;
import java.lang.reflect.Method;
import java.util.Scanner;

import original.oop_games.Characters;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose one of the options : createCharacters/exit");
        String option = scanner.nextLine();
        switch(option) {
            case "createCharacters":
            Characters character = new Characters();
            break;
            case "exit":
            break;
        }

    
    }
}
