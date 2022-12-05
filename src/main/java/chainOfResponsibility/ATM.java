package chainOfResponsibility;

import java.util.HashMap;

public class ATM {
    public static void process(int amount) {
        Handler handler5 = new Handler5();
        Handler handler20 = new Handler20();
        Handler handler50 = new Handler50();
        handler50.setNext(handler20);
        handler20.setNext(handler5);
        handler50.process(amount);
    }
    public static void main(String[] args) {
        ATM.process(126);
    }
}
