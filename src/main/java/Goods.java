package shop;

import java.util.HashMap;
import java.util.Map;

public interface Goods {

    Map<Integer, Products> getGoods();

    Map<Integer, Products> filterPrice(Map<Integer, Products> products, Integer maxPrice);

    Map<Integer, Products> filterManufacturer(Map<Integer, Products> products, String manufacturer);

    Map<Integer, Products> filterKeyword(Map<Integer, Products> products, String keyword);

    String toString(HashMap<Integer, Products> goods);
}

// todo I - принцип сегрегации (разделения) интерфейса (Interface Segregation Principle)  Много интерфейсов, специально предназначенных для клиентов, лучше, чем один
//        интерфейс общего назначения.
