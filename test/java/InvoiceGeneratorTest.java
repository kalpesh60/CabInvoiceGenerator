import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {

    @Test
    void givenDistanceAndTimeShouldReturnTotalFair() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 3.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(35,fare);
    }

    @Test
    void givenDistanceOrTimeShouldReturnMinimumFair() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.2;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(5,fare);
    }

    @Test
    void givenMultipleRidesShouldReturnInvoiceSummary() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = { new Ride(2.0,5), new Ride(0.1,1)};
        InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2,30.0);
        Assertions.assertEquals(expectedInvoiceSummary, summary);
    }
}
