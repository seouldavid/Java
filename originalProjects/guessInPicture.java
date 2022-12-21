package originalProjects;
import java.util.Scanner;
public class guessInPicture {
    static final String ASCII_PICTURE = """
            \\  |  /         ___________
            ____________  \\ \\_# /         |  ___      |       _________
           |            |  \\  #/          | |   |     |      | = = = = |
           | |   |   |  |   \\#           | |`v'|     |      |         |
           |            |    \\#  //       |  --- ___  |      | |  || | |
           | |   |   |  |     #_//        |     |   | |      |         |
           |            |  \\ #_/_______  |     |   | |      | |  || | |
           | |   |   |  |   \\# /_____/ \\ |      ---  |      |         |
           |            |    \\# |+ ++|  | |  |^^^^^^| |      | |  || | |
           |            |    \\# |+ ++|  | |  |^^^^^^| |      | |  || | |
        ^^^|    (^^^^^) |^^^^^#^| H  |_ |^|  | |||| | |^^^^^^|         |
           |    ( ||| ) |     # ^^^^^^    |  | |||| | |      | ||||||| |
           ^^^^^^^^^^^^^________/  /_____ |  | |||| | |      | ||||||| |
                `v'-                      ^^^^^^^^^^^^^      | ||||||| |
                 || |`.      (__)    (__)                          ( )
                             (oo)    (oo)                       /---V
                      /-------\\/      \\/ --------\\             * |  |
                     / |     ||        ||_______| \\
                    *  ||W---||        ||      ||  *
                       ^^    ^^        ^^      ^^
                Christmas is coming... what do you see in this ASCII ART? : """;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loopOrNot = true;
        while (loopOrNot){
            try {
                Thread.sleep(2000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.print(ASCII_PICTURE);

        String inputText = scanner.nextLine();
        String[] figures = new String[] {"deer","deers","male deer","female deer","tree","house","animals","animal","building","buildings","exit"};
        boolean checker = false;

        for (String figure: figures) {
            if (figure.equals("exit")) {
                System.out.println("Exit program");
                loopOrNot = false;
                checker = true;
                break;
            } else if (figure.equals(inputText)) {
                System.out.println("You are correct!");
                checker = true;
                break;
            }
        }
        if (!checker) {
            System.out.println("You are incorrect!");
        }
        }


        scanner.close();
    }
}