package chainOfResponsibility;

public class Handler {
    private Handler next;
    private final int quantity;
    public Handler(int quantity) {
        this.quantity = quantity;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public void process(int amount) {
        if (amount % quantity > 0){
            throw new IllegalArgumentException();
        }
        else if (next != null) {
            next.process(amount % quantity);
        }
        System.out.println(amount / quantity + " * " + quantity);
    }
}
