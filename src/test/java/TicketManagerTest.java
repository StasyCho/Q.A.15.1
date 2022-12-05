import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {
    TicketRepository repo = new TicketRepository();
    TicketManager manager = new TicketManager(repo);

    Ticket t1 = new Ticket(1, 300, "MOW", "LED", 90);
    Ticket t2 = new Ticket(2, 500, "MOW", "LED", 90);
    Ticket t3 = new Ticket(3, 100, "MOW", "OVB", 240);
    Ticket t4 = new Ticket(4, 300, "MOW", "LED", 90);
    Ticket t5 = new Ticket(5, 900, "MOW", "LED", 90);
    Ticket t6 = new Ticket(6, 800, "OVB", "MOW", 240);
    Ticket t7 = new Ticket(7, 100, "MOW", "LED", 90);
    Ticket t8 = new Ticket(8, 600, "MOW", "LED", 90);

    @BeforeEach
    public void setup() {
        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);
        manager.add(t7);
        manager.add(t8);
    }

    @Test
    public void searchByDeparture() {

        Ticket[] expected = {t7, t1, t4, t2, t8, t5};
        Ticket[] actual = manager.searchByDeparture("MOW", "LED", );

        Assertions.assertArrayEquals(expected, actual);

    }
}

