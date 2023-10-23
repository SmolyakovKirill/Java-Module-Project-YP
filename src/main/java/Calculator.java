import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculator {
    ArrayList<String> products = new ArrayList<>();
    float price;

    public void addProduct(String product, float price){
        this.products.add(product);
        this.price = this.price + price;
    }

    public ArrayList<String> getProducts(){
        return this.products;
    }

    public float getFinalPrice(){
        return this.price;
    }
}
