
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        SportbikeShop sportbikeShop = new SportbikeShop();

        sportbikeShop.getProducts().forEach((k, v) -> System.out.println("Артикул " + k + v));
        System.out.println();

        sportbikeShop.print();
        System.out.println();

        System.out.println(sportbikeShop.getProduct("Av777"));


    }
}