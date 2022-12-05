import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ticket t1 = new Ticket(1, 300, "MOW", "LED", 90);

        Ticket t2 = new Ticket(3, 100, "MOW", "OVB", 240);

        System.out.println(t1.compareTo(t2));
        System.out.println(t2.compareTo(t1));
        Ticket[] tickets = {t1, t2};
        Arrays.sort(tickets);
    }
}