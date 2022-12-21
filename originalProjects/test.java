package originalProjects;
import java.util.Scanner;
// package cinema;

public class test {
    //1.input & create cinema
//2.show the menu
    //print menu and return input
    public static int chooseMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        return scanner.nextInt();
    }

    //buy ticket
    public static int buyTicket(int rowNumber,int colNumber,String[][] seats) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int priceOfTicket = 0;
        while (loop) {
            System.out.println("Enter a row number:");
            int rowChosen = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            int colChosen = scanner.nextInt();

            if (rowChosen <= 0 || rowChosen > rowNumber || colChosen <= 0 || colChosen > colNumber) {
                System.out.print("Wrong input!");
                continue;
            } else if (seats[rowChosen - 1][colChosen - 1].equals("B")) {
                System.out.print("That ticket has already been purchased!");
                continue;
            } else {
                loop = false;
                System.out.println();
                if (rowChosen <= rowNumber/2 && rowNumber * colNumber > 60) {
                    System.out.println("Ticket price: $10");
                    priceOfTicket = 10;
                } else if (rowChosen > rowNumber/2 && rowNumber * colNumber > 60) {
                    System.out.println("Ticket price: $8");
                    priceOfTicket = 8;
                } else {
                    System.out.println("Ticket price: $10");
                    priceOfTicket = 10;
                }
                System.out.println();
                seats[rowChosen - 1][colChosen - 1] = "B";
            }
        }
        return priceOfTicket;
    }

    // show current seat status
    public static void showSeatStatus(int rowNumber, int colNumber, String[][] seats) {
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 0; i < colNumber; i++) {
            System.out.print( (i+1) + " ");
        }
        System.out.println();
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (j == 0) {
                    System.out.print((i+1) + " ");
                }
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void calculateStatistics(int rowNumber,int colNumber,String[][] seats,int buyCount,int currentIncome) {
        String ticket = "Number of purchased tickets: %d%n";
        String percentage = "Percentage: %.2f%%%n";
        String current = "Current income: $%d%n";
        String total = "Total income: $%d%n";
        int maxIncome = 0;
        float calcPercentage = buyCount / (rowNumber * colNumber) * 100;
        if (rowNumber * colNumber <= 60) {
            maxIncome = 10 * rowNumber * colNumber;
        } else {
            if (rowNumber % 2 == 0) {
                maxIncome = rowNumber/2 * colNumber * (10 + 8);
            } else {
                maxIncome = rowNumber/2 * colNumber * 10 + (rowNumber/2 + 1) * colNumber * 8;
            }
        }
        System.out.printf(ticket + percentage + current + total, buyCount,(double) buyCount / (rowNumber * colNumber) * 100, currentIncome, maxIncome);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rowNumber = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int colNumber = scanner.nextInt();

        String[][] seats = new String [rowNumber][colNumber];
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                seats[i][j] = "S";
            }
        }
        int buyCount = 0;
        int currentIncome = 0;
        int choice = chooseMenu();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    showSeatStatus(rowNumber,colNumber,seats);
                    choice = chooseMenu();
                    break;
                case 2:
                    currentIncome += buyTicket(rowNumber,colNumber, seats);
                    buyCount++;
                    choice = chooseMenu();
                    break;
                case 3:
                    calculateStatistics(rowNumber,colNumber, seats, buyCount, currentIncome);
                    choice = chooseMenu();
                    break;
            }
        }
    }
}