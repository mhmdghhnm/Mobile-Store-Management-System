public class SalesTransaction {
    private static int transactionCounter = 0;
    private int transactionID;
    private Customer customerName;
    private MobilePhone phoneSold;
    private int quantity;
    private double totalPrice;

    public SalesTransaction(Customer customer, MobilePhone phoneSold, int quantity) {
        this.transactionID = ++transactionCounter;
        this.customerName = customer;
        this.phoneSold = phoneSold;
        this.quantity = quantity;
        this.totalPrice = phoneSold.getPrice() * quantity;
    }

    public void processSale() {
        phoneSold.updateStock(-quantity);
        System.out.println("Sale processed for " + customerName + ". Transaction ID: " + transactionID);
    }

    public void generateInvoice() {
        System.out.println("Invoice for " + customerName);
        System.out.println("Phone: " + phoneSold.getModel() + ", Quantity: " + quantity + ", Total: $" + totalPrice);
    }

    public String getInvoiceDetails() {
        return String.format("Transaction ID: %d\nCustomer: %s\nPhone: %s\nQuantity: %d\nTotal Price: $%.2f",
                transactionID, customerName, phoneSold.getModel(), quantity, totalPrice);
    }
}
