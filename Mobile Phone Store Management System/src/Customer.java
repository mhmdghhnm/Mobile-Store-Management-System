import java.util.List;

public class Customer {
    private String name;
    private String email;
    private String phone;
    private int loyaltyPoints;
    private String birthDate;
    private String location;
    private List<String> purchaseHistory;

    public Customer(String name, String email, String phone, int loyaltyPoints, String birthDate, String location, List<String> purchaseHistory) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.loyaltyPoints = loyaltyPoints;
        this.birthDate = birthDate;
        this.location = location;
        this.purchaseHistory = purchaseHistory;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getLocation() {
        return location;
    }

    public List<String> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void addPurchase(String purchase) {
        this.purchaseHistory.add(purchase);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Phone: " + phone + ", Loyalty Points: " + loyaltyPoints + ", Birthdate: " + birthDate + ", Location: " + location;
    }
}
