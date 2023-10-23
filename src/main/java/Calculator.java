import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculator {
    ArrayList<String> products = new ArrayList<>();
    ArrayList<Integer> prices = new ArrayList<>();

    public void addProduct(String product, int price){
        this.products.add(product);
        this.prices.add(price);
    }

    public ArrayList<String> getProducts(){
        return this.products;
    }
}
