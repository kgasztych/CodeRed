package Object;

public class ProductIndex {
    public static void main(String[] args) {

        //Product shoes = new Product();
        //shoes.price = 5;
        //shoes.quantity = 10;
        //shoes.name = "Mokasyny";
        //System.out.println("Price of shoes in store is " + shoes.totalPrice());


        Product boots = new Product( 12, 23, "Baletki");
        Product heels = new Product(3, 40,"Szpilki");
        Product flipflops = new Product(7,19,"Klapki");

        //Product[] products = new Product[3];
        Product[] products = {boots, heels,flipflops};
        Product x = new Product(10,23, "test");
        int grandTotalPrice = 0;
        for (int i = 0; i < 3; i++){
            //grandTotalPrice = grandTotalPrice + boots.totalPrice() + heels.totalPrice() + flipflops.totalPrice();
            System.out.println(products[i]);
            grandTotalPrice = grandTotalPrice + products[i].totalPrice();
        }
        System.out.println("Price of all profucts in the shop: " + grandTotalPrice);

    }
}
