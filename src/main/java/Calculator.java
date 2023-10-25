import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculator {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product){                                                        //method for add new product in array
        this.products.add(product);
    }

    public float getFinalPrice(){                                                                   //method using for get final price
        float sum = 0;
        for(int i = 0; i <= products.size() - 1; i++){
            sum = sum + products.get(i).price;
        }
        return sum;
    }

    public void printAllProducts(){                                                                 //method using for get all list of products
        for(int i = 0; i <= products.size() - 1; i++){
            System.out.println(products.get(i).name);
        }
    }


}
