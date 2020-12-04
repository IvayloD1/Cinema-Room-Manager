import java.util.Scanner;

public class Cinema {

  static final Scanner sc = new Scanner(System.in);

  static char[][] seats;
  static int rows = 0;
  static int seatsPerRows = 0;
  static int totalSeats = 0;

  static int purchasedTickets = 0;
  static int currentIncome = 0;

  static boolean exit = false;

  public static void main(String[] args) {
    System.out.println("Enter the number of rows:");
    rows = sc.nextInt();
    System.out.println("Enter the number of seats in each row:");
    seatsPerRows = sc.nextInt();
    seats = new char[rows][seatsPerRows];
    totalSeats = rows * seatsPerRows;

    while (!exit) {
      printMenu();
    }
  }

  static void printMenu() {
    System.out.println();
    System.out.println("1. Show the seats");
    System.out.println("2. Buy a ticket");
    System.out.println("3. Statistics");
    System.out.println("0. Exit");
    switch (sc.nextInt()) {
      case 0 -> exit = true;
      case 1 -> showSeats();
      case 2 -> buyTicket();
      case 3 -> printStatistics();
      default -> {
        System.out.println("Invalid number!");
        printMenu();
      }
    }
  }

  static void showSeats() {
    System.out.println();
    System.out.println("Cinema:");
    for (int i = 0; i <= rows; i++) {
      for (int j = 0; j <= seatsPerRows; j++) {
        if (i == 0) {
          System.out.print(j == 0 ? "  " : j + " ");
        } else if (j == 0) {
          System.out.print(i + " ");
        } else {
          if (seats[i - 1][j - 1] == 0) {
            seats[i - 1][j - 1] = 'S';
          }
          System.out.print(seats[i - 1][j - 1] + " ");
        }
      }
      System.out.println();
    }
  }

  static void buyTicket() {
    System.out.println();
    System.out.println("Enter a row number:");
    final int rowNumber = sc.nextInt();
    System.out.println("Enter a seat number in that row:");
    final int seatNumber = sc.nextInt();
    if (seatNumber > seatsPerRows || rowNumber > rows) {
      System.out.println("Wrong input!");
      buyTicket();
    } else if (seats[rowNumber - 1][seatNumber - 1] == 'B') {
      System.out.println("That ticket has already been purchased!");
      buyTicket();
    } else {
      System.out.println("Ticket price: $" + (totalSeats < 60 || rowNumber <= (rows / 2) ? 10 : 8));
      currentIncome += totalSeats < 60 || rowNumber <= (rows / 2) ? 10 : 8;
      seats[rowNumber - 1][seatNumber - 1] = 'B';
      purchasedTickets++;
    }
  }

  static void printStatistics() {
    System.out.println();
    System.out.println("Number of purchased tickets: " + purchasedTickets);
    System.out.printf("Percentage: %.2f%%\n", (float) purchasedTickets / (float) totalSeats * 100);
    System.out.println("Current income: $" + currentIncome);
    // Total income - if all seats are sold.
    System.out.println("Total income: $" + (totalSeats < 60 ? totalSeats * 10
        : (rows / 2 * seatsPerRows * 10) + ((rows / 2 + rows % 2) * seatsPerRows * 8)));
  }
}

