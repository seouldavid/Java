package lessons;
import java.util.Scanner;


// Write a program that reads an array of ints and an integer number n.

// The program must check how many times n occurs in the array.

// Input data format
// The first line contains the size of the input array.

// The second line contains elements of the array separated by spaces.

// The third line contains n.

// Output data format

// The result is only a single non-negative integer number.

// Sample Input 1:
// 6
// 1 2 3 4 2 1
// 2

// Sample Output 1:
// 2
class arrayreader {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] numbers = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            numbers[i] = scanner.nextInt();
        }
        int compare = scanner.nextInt();
        int counter = 0;
        for (int j = 0; j < sizeOfArray; j++) {
            if (numbers[j] == compare) {
                counter++;
            }
        }
        System.out.print(counter);
        scanner.close();
    }
}
