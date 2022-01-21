import java.util.*;
import java.util.stream.Collectors;

public class SportbikeShop {
    private Map<String, Product> products = new HashMap<>();

    public SportbikeShop() {
        products.put("Bp068", new Product("Подшибник", 16));
        products.put("Bs084", new Product("Спица", 180));
        products.put("Bk113", new Product("Колесо", 30));
        products.put("Bt698", new Product("Тормоза", 54));
        products.put("Av777", new Product("Тросс", 8));
        products.put("Br006", new Product("Рама", 4));
        products.put("Bs075", new Product("Шина", 12));
        products.put("Ba106", new Product("Амортизотор", 3));
        products.put("Bp305", new Product("Педаль", 91));
        products.put("Bс066", new Product("Цепь", 19));
    }

    public Map<String, Product> getProducts() {
        return products;
    }

    public Map.Entry<String,Product> getProduct(String id) {
        for(Map.Entry<String, Product> map: products.entrySet()) {
            if (map.getKey().equals(id))
                return map;
        }
        return null;
    }

    public void print() {
//        Set<Product> set = new TreeSet<>(products.values());
//        Iterator iterator = set.iterator();
//        Map<String, Product> temp = new HashMap<>(products.size());
//        while (iterator.hasNext()) {
//            for (Map.Entry<String, Product> map: products.entrySet()) {
//                Product product = map.getValue();
//                if (product.compareTo((Product) iterator.next()) == 0) {
//                    temp.put(map.getKey(), map.getValue());
//                }
//            }
//        }

        Map<String, Product> temp = products.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (t1, t2) -> t1, LinkedHashMap::new));
        temp.forEach((k, v) -> System.out.println("Артикул " + k + v));
    }

}

