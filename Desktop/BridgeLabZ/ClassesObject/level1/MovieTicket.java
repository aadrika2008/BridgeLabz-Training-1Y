package com.gla.ClassesObject.level1;

public class MovieTicket {String movieName;
    int seatNumber;
    double price;

    void bookTicket(String name, int seat, double ticketPrice) {
        movieName = name;
        seatNumber = seat;
        price = ticketPrice;
    }

    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket();
        t1.bookTicket("Avengers", 12, 250);
        t1.displayTicket();
    }
}
