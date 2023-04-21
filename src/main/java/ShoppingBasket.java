package shop;

import java.util.HashMap;
import java.util.Map;

public interface ShoppingBasket {

    Map<Integer, Products> addProduct(Map<Integer, Products> products, int numberProduct, int count);

    Map<Integer, Products> deleteProduct(Map<Integer, Products> products, int numberProduct);
    String toString(HashMap<Integer, Products> goodsToBuy);

}

// todo I - принцип сегрегации (разделения) интерфейса (Interface Segregation Principle)
// todo Много интерфейсов, специально предназначенных для клиентов, лучше, чем один   интерфейс общего назначения.
