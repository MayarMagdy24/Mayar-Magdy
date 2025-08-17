//part 2 task 1
public class Product {
    private String productId;
    private String productName;
    private double price;
    private boolean inStock;

    // Constructor to initialize product details
    public Product(String productId, String productName, double price, boolean inStock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.inStock = inStock;
    }

    //getter method for productId,productName,price,inStock
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }
//setter method for productId,productName,price,inStock

    public void setPrice(double newprice) {
        System.out.println("Current Price: " + price);
        if (newprice < 0){
            System.out.println("Error: Price cannot be negative.");
        } else {
            this.price = newprice;
            System.out.println("Updated Price: " + price);
        }
    }
    public void setInStock(boolean inStock) {
        System.out.println("Product in stock: " + inStock);
        this.inStock = inStock;
        System.out.println("New in stock status: " + inStock);

    }

}




