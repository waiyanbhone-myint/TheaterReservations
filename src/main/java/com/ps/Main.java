package com.ps;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Please enter a game score: ");
        String gameScore = scanner.next();

        String[] gameList = gameScore.trim().split("\\|");

        String teams = gameList[0];
        String scores = gameList[1];

        String[] gameTeams = teams.split(":");
        String[] teamScores = scores.split(":");

        int homeScore = Integer.parseInt(teamScores[0]);
        int awayScore = Integer.parseInt(teamScores[1]);

        if (homeScore > awayScore){

            System.out.println("Winner: " + gameTeams[0]);
        }
        else if (homeScore < awayScore) {

            System.out.println("Winner: " + gameTeams[1]);
        }
        else{
            System.out.println("Draw");;
        }

    }
}