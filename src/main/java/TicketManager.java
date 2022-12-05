import java.util.Arrays;

public class TicketManager {

    private TicketRepository repo;

    public TicketManager(TicketRepository repo) {
        this.repo = repo;
    }

    public void add(Ticket item) {
        repo.save(item);
    }

    public Ticket[] searchByDeparture(String from, String to) {
        Ticket[] result = new Ticket[0];
        for (Ticket item : repo.findAll()) {
            if (matches(item, from, to)) {
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

    public boolean matches(Ticket ticket, String from, String to) {
        if (ticket.getTo().equals(to)) {
            if (ticket.getFrom().equals(from)) {
                return true;
            }
        }
        return false;
    }
}

