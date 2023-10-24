import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculator {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        this.products.add(product);
    }

    public ArrayList<Product> getProducts(){
        return this.products;
    }

    public float getFinalPrice(){
        float sum = 0;
        for(int i = 0; i <= products.size() - 1; i++){
            sum = sum + products.get(i).price;
        }
        return sum;
    }

    public void printAllProducts(){
        for(int i = 0; i <= products.size() - 1; i++){
            System.out.println(products.get(i).name);
        }
    }


}
