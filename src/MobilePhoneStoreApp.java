import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MobilePhoneStoreApp {
    private Store store;

    public static void main(String[] args) {
        new MobilePhoneStoreApp().createUI();
    }

    public MobilePhoneStoreApp() {
        store = new Store("MobileWorld", "123 Tech St");

        // Sample Data
        store.addPhone(new MobilePhone("Apple", "iPhone 14", "128GB, A15 Bionic", 999.99, 10, "1234567890"));
        store.addPhone(new MobilePhone("Samsung", "Galaxy S23", "256GB, Snapdragon 8 Gen 2", 799.99, 3, "0987654321"));

        
        store.addCustomer(new Customer("John Doe", "john@example.com", "555-1234", 200, "2020-01-01", "USA", new ArrayList<>()));
        store.addCustomer(new Customer("Jane Smith", "jane@example.com", "555-5678", 150, "2019-05-10", "UK", new ArrayList<>()));
    }

    public void createUI() {
        JFrame frame = new JFrame("Mobile Store Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(new FlowLayout());

        // Buttons
        JButton inventoryManagementButton = new JButton("Inventory Management");
        JButton orderManagementButton = new JButton("Order Management");
        JButton discountManagementButton = new JButton("Discount & Promo Code Management");
        JButton customerDatabaseButton = new JButton("Customer Database");

        // Add action listeners to buttons
        inventoryManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showInventoryManagementOptions();
            }
        });

        orderManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showOrderManagementOptions();
            }
        });

        discountManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDiscountManagementOptions();
            }
        });

        customerDatabaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCustomerDatabaseOptions();
            }
        });

        // Add buttons to frame
        frame.add(inventoryManagementButton);
        frame.add(orderManagementButton);
        frame.add(discountManagementButton);
        frame.add(customerDatabaseButton);

        frame.setVisible(true);
    }

    // Methods to show specific management options
    private void showInventoryManagementOptions() {
        String[] options = {"Stock Tracking", "Low Stock Alert", "Add New Phone"};
        String choice = (String) JOptionPane.showInputDialog(null, "Select an option:", "Inventory Management",
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        switch (choice) {
            case "Stock Tracking":
                displayInventory();
                break;
            case "Low Stock Alert":
                showLowStockPhones();
                break;
            case "Add New Phone":
                addNewPhone();
                break;
        }
    }

    private void displayInventory() {
        StringBuilder inventoryDisplay = new StringBuilder();
        for (MobilePhone phone : store.getInventory()) {
            inventoryDisplay.append(phone.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, inventoryDisplay.toString(), "Inventory", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showLowStockPhones() {
        StringBuilder lowStockPhones = new StringBuilder("Low Stock Phones (less than 5 in stock):\n");
        for (MobilePhone phone : store.getInventory()) {
            if (phone.getStockQuantity() < 5) {
                lowStockPhones.append(phone.toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, lowStockPhones.toString(), "Low Stock", JOptionPane.INFORMATION_MESSAGE);
    }

    private void addNewPhone() {
        String brand = JOptionPane.showInputDialog("Enter phone brand:");
        String model = JOptionPane.showInputDialog("Enter phone model:");
        String specs = JOptionPane.showInputDialog("Enter phone specs:");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter phone price:"));
        int stockQuantity = Integer.parseInt(JOptionPane.showInputDialog("Enter phone stock quantity:"));
        String barcode = JOptionPane.showInputDialog("Enter phone barcode:");

        MobilePhone newPhone = new MobilePhone(brand, model, specs, price, stockQuantity, barcode);
        store.addPhone(newPhone);
        JOptionPane.showMessageDialog(null, "New phone added to inventory!");
    }

    private void showOrderManagementOptions() {
        String[] options = {"Order Tracking", "Order History", "Return and Refund Management"};
        String choice = (String) JOptionPane.showInputDialog(null, "Select an option:", "Order Management",
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        switch (choice) {
            case "Order Tracking":
                trackOrder();
                break;
            case "Order History":
                showOrderHistory();
                break;
            case "Return and Refund Management":
                manageReturnsAndRefunds();
                break;
        }
    }

    private void trackOrder() {
        // For simplicity, assume we have order tracking logic here
        JOptionPane.showMessageDialog(null, "Order tracking functionality (Not implemented in demo).", "Order Tracking", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showOrderHistory() {
        // Displaying some sample order history
        JOptionPane.showMessageDialog(null, "Sample Order History:\n1. Order #123 (Completed)\n2. Order #124 (Shipped)", "Order History", JOptionPane.INFORMATION_MESSAGE);
    }

    private void manageReturnsAndRefunds() {
        // Handling return/refund logic here
        JOptionPane.showMessageDialog(null, "Return and Refund management functionality (Not implemented in demo).", "Return & Refund Management", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showDiscountManagementOptions() {
        String[] options = {"Create Discount Code", "Seasonal Offers"};
        String choice = (String) JOptionPane.showInputDialog(null, "Select an option:", "Discount Management",
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        switch (choice) {
            case "Create Discount Code":
                createDiscountCode();
                break;
            case "Seasonal Offers":
                createSeasonalOffer();
                break;
        }
    }

    private void createDiscountCode() {
        String code = JOptionPane.showInputDialog("Enter discount code:");
        double discountPercentage = Double.parseDouble(JOptionPane.showInputDialog("Enter discount percentage (e.g., 10 for 10%):"));

        JOptionPane.showMessageDialog(null, "Discount code " + code + " created with " + discountPercentage + "% off!");
    }

    private void createSeasonalOffer() {
        String offerName = JOptionPane.showInputDialog("Enter offer name:");
        String startDate = JOptionPane.showInputDialog("Enter start date (YYYY-MM-DD):");
        String endDate = JOptionPane.showInputDialog("Enter end date (YYYY-MM-DD):");

        JOptionPane.showMessageDialog(null, "Seasonal offer " + offerName + " created from " + startDate + " to " + endDate + "!");
    }

    private void showCustomerDatabaseOptions() {
        String[] options = {"Customer Profiles", "Add New Customer"};
        String choice = (String) JOptionPane.showInputDialog(null, "Select an option:", "Customer Database",
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        switch (choice) {
            case "Customer Profiles":
                displayCustomerProfiles();
                break;
            case "Add New Customer":
                addNewCustomer();
                break;
        }
    }

    private void displayCustomerProfiles() {
        StringBuilder customerProfiles = new StringBuilder("Customer Profiles:\n");
        for (Customer customer : store.getCustomers()) {
            customerProfiles.append(customer.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, customerProfiles.toString(), "Customer Profiles", JOptionPane.INFORMATION_MESSAGE);
    }

    private void addNewCustomer() {
        String name = JOptionPane.showInputDialog("Enter customer name:");
        String email = JOptionPane.showInputDialog("Enter customer email:");
        String phone = JOptionPane.showInputDialog("Enter customer phone:");
        int loyaltyPoints = Integer.parseInt(JOptionPane.showInputDialog("Enter loyalty points:"));
        String birthDate = JOptionPane.showInputDialog("Enter customer birth date (YYYY-MM-DD):");
        String location = JOptionPane.showInputDialog("Enter customer location:");

        Customer newCustomer = new Customer(name, email, phone, loyaltyPoints, birthDate, location, new ArrayList<>());
        store.addCustomer(newCustomer);
        JOptionPane.showMessageDialog(null, "New customer added!");
    }
}
     