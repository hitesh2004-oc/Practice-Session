package Day17;

// OrderService class handles order-related operations
public class OrderService {
    // Minimum order value constant (cannot be changed)
    private static final int value = 500;
    /**
     * This method checks whether the order amount meets
     * the minimum required value.
     * If not, it throws a custom exception.
     */
    public static void placeOrder(int orderAmount) throws MinimumOrderException {
        // Check if the order amount is less than the minimum value
        if (orderAmount < value) {

            // Throw custom exception with an informative message
            throw new MinimumOrderException(
                "Minimum order amount is 500. Your order amount is " + orderAmount
            );
        }
        // Executes only if orderAmount is valid
        System.out.println("Order placed successfully!");
    }

    // Main method: program execution starts here
    public static void main(String[] args) {

        try {
            // Attempt to place an order with amount 300
            placeOrder(300);

        } catch (MinimumOrderException e) {
            // Catch and display the exception message
            System.out.println("Error: " + e.getMessage());
        }
    }
}
