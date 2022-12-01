package org.example;

public class TicketManager {

    private TicketRepository repo;

    public TicketManager(TicketRepository repo) {
        this.repo = repo;
    }

    public void add(Ticket item) {
        repo.save(item);
    }

    public Ticket[] findAll(String from, String to) {
        Ticket[] all = repo.findAll();
        return all;
    }

    public Ticket[] searchByDeparture(String text) {
        Ticket[] result = new Ticket[0];
        for (Ticket item : repo.findAll()) {
            if (matches1(item, text)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[result.length] = item;
                result = tmp;
            }
        }
        return result;
    }
    public boolean matches1(Ticket product, String search) {
        if (product.matches1(search)) {
            return true;
        } else {
            return false;
        }
    }

    public Ticket[] searchByArrival(String text) {
        Ticket[] result = new Ticket[0];
        for (Ticket item : repo.findAll()) {
            if (matches2(item, text)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[result.length] = item;
                result = tmp;
            }
        }
        return result;
    }
    public boolean matches2(Ticket product, String search) {
        if (product.matches2(search)) {
            return true;
        } else {
            return false;
        }
    }
}

