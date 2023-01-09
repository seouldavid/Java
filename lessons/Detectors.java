package lessons;
import java.util.Scanner;


// --------About this program-----------
// A detector compares the size of parts produced by a machine with the reference standard.
// If the size of the part is larger, it cadn be sent to be fixed, and the detector prints the number 1.
// If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
// If the part is perfect, it is sent to the box with products, that are ready to ship, and the detector prints 0.
// Write a program, which takes the number of parts n as input, and then the sequence of detector prints. 
// The program should output numbers in a single line containing the number of parts ready to be shipped, the number of parts to be fixed, and the number of rejects.
//--------------------------------------

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        System.out.println("input accordingly- number of parts followed by detector points ex1) 3 -1 0 1 ex2) 4 0 -1 -1 0 :  \s");
        int numOfParts = scanner.nextInt();
        int ship = 0;
        int fixed = 0;
        int rejected = 0;
        for (int i = 1; i <= numOfParts; i++) {
            int pointOfDetector = scanner.nextInt();
            if (pointOfDetector == 1) {
                fixed += 1;
            } else if (pointOfDetector == 0) {
                ship += 1;
            } else if (pointOfDetector == -1) {
                rejected += 1;
            }
        }
        System.out.print(ship + " " + fixed + " " + rejected);
        scanner.close();
    }
}