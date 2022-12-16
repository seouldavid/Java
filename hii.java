import java.util.Scanner;
public class hii {
    public static void main(String[] args) {
        System.out.print("""
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
                Christmas is coming... what do you see in this ASCII ART? : """);
        Scanner scanner = new Scanner(System.in);
        // System.out.print("*** " + scanner.nextLine() + " ***");
        // int num = scanner.nextInt();
        // System.out.print("Result: " + num/2);
        int inputText = scanner.nextInt();
        if (inputText == 1) {
            System.out.println("That's right!");
        }
        System.out.println(inputText);


        scanner.close();
    }
}