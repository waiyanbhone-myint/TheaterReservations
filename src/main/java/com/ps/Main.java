package com.ps;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        System.out.println("Welcome To Theater Reservation!");

        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        String inputDate = scanner.nextLine();

        System.out.print("How many tickets would you like?: ");
        int ticketCount = Integer.parseInt(scanner.next());

        if (ticketCount > 1){
            sb.append(ticketCount).append(" tickets reserved for ");
            sb.append(inputDate).append(" under ").append(fullName);
            System.out.println(sb.toString());
        }
        else if (ticketCount < 0) {
            System.out.println("Please only enter valid ticket number.");

        } else{
            sb.append(ticketCount).append(" ticket reserved for ");
            sb.append(inputDate).append(" under ").append(fullName);
            System.out.println(sb.toString());
        }



    }
}