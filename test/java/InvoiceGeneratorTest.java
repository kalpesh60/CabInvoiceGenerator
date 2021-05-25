import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {

    @Test
    void givenDistanceAndTimeShouldReturnTotalFair() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 3.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFair(distance,time);
        Assertions.assertEquals(35,fare);
    }
}
