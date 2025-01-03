import java.util.ArrayList;
import java.util.List;

public class Store {
    private String storeName;
    private String storeLocation;
    private List<MobilePhone> inventory;
    private List<Customer> customers;
    private List<Order> orders;

    public Store(String storeName, String storeLocation) {
        this.storeName = storeName;
        this.storeLocation = storeLocation;
        this.inventory = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    // Inventory Management
    public void addPhone(MobilePhone phone) {
        inventory.add(phone);
    }

    public List<MobilePhone> getInventory() {
        return inventory;
    }

    // Customer Management
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    // Order Management
    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public MobilePhone getPhoneByBarcode(String barcode) {
        for (MobilePhone phone : inventory) {
            if (phone.getBarcode().equals(barcode)) {
                return phone;
            }
        }
        return null;  // If not found
    }

    @Override
    public String toString() {
        return "Store Name: " + storeName + ", Location: " + storeLocation;
    }
}
