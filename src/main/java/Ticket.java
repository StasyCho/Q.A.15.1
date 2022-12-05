public class Ticket implements Comparable<Ticket> {

    private int id;
    private int price;
    private String from; // аэропорт вылета
    private String to; // аэропорт прилёта
    private int time;



    public Ticket(int id, int price, String from, String to, int time) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
    public int getTime() {
        return time;
    }



    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.getPrice()) {
            return -1;
        } else if (this.price > o.getPrice()) {
            return 1;
        } else {
            return 0;
        }
        // return Integer.compare(this.price, o.getPrice());
    }

}
