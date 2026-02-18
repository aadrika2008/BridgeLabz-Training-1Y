package com.gla.String.Level2;
import java.util.Scanner;
public class RockPaperScissors { public static String getComputerChoice() {

    int choice = (int)(Math.random() * 3);

    if (choice == 0) return "rock";
    if (choice == 1) return "paper";
    return "scissors";
}

    public static String findWinner(String user, String computer) {

        if (user.equals(computer))
            return "Draw";

        if ((user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0, compWins = 0;

        for (int i = 1; i <= games; i++) {

            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();

            String computer = getComputerChoice();

            String winner = findWinner(user, computer);

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) compWins++;

            System.out.println("Computer: " + computer + " | Winner: " + winner);
        }

        double userPercent = (userWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;

        System.out.println("\nResults:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("User Win %: " + userPercent);
        System.out.println("Computer Win %: " + compPercent);

        sc.close();
    }
}
