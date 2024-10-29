package collention.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartmap = new HashMap<>();

    public void add(Product product, int addQuantity) {
        int existingQuantity = cartmap.getOrDefault(product, 0);
        cartmap.put(product, existingQuantity + addQuantity);
    }

    public void minus(Product product, int minusQuantity) {
        int existingQuantity = cartmap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - minusQuantity;
        if (newQuantity <= 0) {
            cartmap.remove(product);
        } else {
            cartmap.put(product, newQuantity);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartmap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }
}
