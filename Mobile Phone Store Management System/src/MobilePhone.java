public class MobilePhone {
    private String brand;
    private String model;
    private String specs;
    private double price;
    private int stockQuantity;
    private String barcode;

    public MobilePhone(String brand, String model, String specs, double price, int stockQuantity, String barcode) {
        this.brand = brand;
        this.model = model;
        this.specs = specs;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.barcode = barcode;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSpecs() {
        return specs;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getBarcode() {
        return barcode;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Specs: " + specs + ", Price: $" + price + ", Stock: " + stockQuantity + ", Barcode: " + barcode;
    }

	public void updateStock(int i) {
		// TODO Auto-generated method stub
		
	}
}
