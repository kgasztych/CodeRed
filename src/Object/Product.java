package Object;

public class Product {
    int quantity;
    int price;
    String name;

    public Product(int quantity, int price, String name) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    int totalPrice () {
        return quantity * price;
    }
    public String toString(){
        return "Name: " + name + ", quantity: " + quantity + ", price: " + price;
    }
}
