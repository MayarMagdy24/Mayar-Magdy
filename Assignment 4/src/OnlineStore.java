//part 2 task 2
public class OnlineStore {
    public static void main (String[] args) {
        //product object using constructor
        Product product1 = new Product("P001", "Laptop", 12000.00, true);

       //getter to print initial outputs
        System.out.println("ProductId:"+product1.getProductId());
        System.out.println("ProductName:"+product1.getProductName());
        System.out.println("Price:"+product1.getPrice());
        System.out.println("InStock:"+product1.isInStock());

//call on price twice
        product1.setPrice(11000.00); // Update price
        product1.setPrice(-5000.00);  // Attempt to set a negative price
        product1.setInStock(true); // Update in-stock status

        System.out.println("Updated Product Details:");
        System.out.println("ProductId:"+product1.getProductId());
        System.out.println("ProductName:"+product1.getProductName());
        System.out.println("Price:"+product1.getPrice());
        System.out.println("InStock:"+(product1.isInStock()?"Yes":"No"));




    }


}


