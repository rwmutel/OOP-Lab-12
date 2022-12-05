package chainOfResponsibility;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    @Test
    void process() {
        assertThrows(IllegalArgumentException.class, () -> ATM.process(126));
    }
}