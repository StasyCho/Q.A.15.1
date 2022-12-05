import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketRepositoryTest {

    @Test
    public void removeBiId() {
        TicketRepository repo = new TicketRepository();

        Ticket t1 = new Ticket(1, 300, "MOW", "LED", 90);
        Ticket t2 = new Ticket(2, 500, "MOW", "LED", 90);
        Ticket t3 = new Ticket(3, 100, "MOW", "OVB", 240);
        Ticket t4 = new Ticket(4, 400, "MOW", "LED", 90);
        Ticket t5 = new Ticket(5, 900, "MOW", "LED", 90);
        Ticket t6 = new Ticket(6, 800, "OVB", "MOW", 240);
        Ticket t7 = new Ticket(7, 100, "MOW", "LED", 90);
        Ticket t8 = new Ticket(8, 600, "MOW", "LED", 90);

        repo.save(t1);
        repo.save(t2);
        repo.save(t3);
        repo.save(t4);
        repo.save(t5);
        repo.save(t6);
        repo.save(t7);
        repo.save(t8);
        repo.removeById(t2.getId());

        Ticket[] expected = {t1, t3, t4, t5, t6, t7, t8};
        Ticket[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
