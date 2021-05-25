public class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FAIR = 5;

    public double calculateFair(double distance, int time) {
        double totalFair = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        if (totalFair < MINIMUM_FAIR)
            return MINIMUM_FAIR;
        return totalFair;
    }
}
