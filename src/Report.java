import java.util.*;

import javax.swing.JOptionPane;

public class Report {
    public static void generateSalesReport(List<SalesTransaction> transactions) {
        StringBuilder sb = new StringBuilder();
        sb.append("Sales Report:\n");
        for (SalesTransaction transaction : transactions) {
            sb.append(transaction.getInvoiceDetails()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Sales Report", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void generateInventoryReport(Store store) {
        StringBuilder sb = new StringBuilder();
        sb.append("Inventory Report:\n");
        store.getInventory();
    }
}
