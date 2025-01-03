import java.util.Date;

public class Order {
    private String orderId;
    private String customerId;
    private Date orderDate;
    private String status; // E.g., "Shipped", "Delivered", "Pending"
    private MobilePhone phone;
    private int quantity;
    private double totalAmount;

    public Order(String orderId, String customerId, Date orderDate, String status, MobilePhone phone, int quantity) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.status = status;
        this.phone = phone;
        this.quantity = quantity;
        this.totalAmount = phone.getPrice() * quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    public MobilePhone getPhone() {
        return phone;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Customer ID: " + customerId + ", Phone: " + phone.getModel() + ", Quantity: " + quantity + ", Status: " + status + ", Total Amount: $" + totalAmount;
    }
}
