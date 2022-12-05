import java.util.Arrays;

public class TicketRepository {

    private Ticket[] items = new Ticket[0];

    public void save(Ticket item) {
        Ticket[] tmp = new Ticket[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public Ticket[] findAll() {
        return items;
    }

    public void removeById(int id) {
        if (findById(id) == null) {
            throw new NotFoundException(id);
        }
        Ticket[] tmp = new Ticket[items.length - 1];
        int copyToIndex = 0;
        for (Ticket item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }
    private Ticket findById(int id) {
        for (Ticket product : items) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
