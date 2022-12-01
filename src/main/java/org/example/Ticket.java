package org.example;

public class Ticket implements Comparable<Ticket>{

    private int id;
    private int price;
    private String departureAirport; // аэропорт вылета
    private String arrivalAirport; // аэропорт прилёта
    private int time;

    public Ticket(int id, int price, String departureAirport, String arrivalAirport, int time) {
        this.id = id;
        this.price = price;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.time = time;
    }

    public boolean matches1(String search) {
        if (departureAirport.contains(search)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean matches2(String search) {
        if (arrivalAirport.contains(search)) {
            return true;
        } else {
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public int getTime() {
        return time;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
