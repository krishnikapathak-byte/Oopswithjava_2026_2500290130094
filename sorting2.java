import java.util.*;

class Product implements Comparable<Product> {

    int productId;
    String productName;
    int price;

    Product(int id, String name, int p) {
        this.productId = id;
        this.productName = name;
        this.price = p;
    }

    @Override
    public int compareTo(Product o) {
        return this.productId - o.productId;
    }

    @Override
    public String toString() {
        return productId + " " + productName + " " + price;
    }
}

class CustomComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.price != o2.price)
            return o2.price - o1.price;

        return o1.productName.compareTo(o2.productName);
    }
}

class NameComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.productName.compareTo(o2.productName);
    }
}

public class sorting2 {

    public static void main(String[] args) {

        ArrayList<Product> p = new ArrayList<>();

        p.add(new Product(101, "Laptop", 60000));
        p.add(new Product(102, "Mobile", 60000));
        p.add(new Product(103, "Tablet", 30000));
        p.add(new Product(104, "Mouse", 1000));

        p.sort(null);
        System.out.println(p);

        p.sort(new CustomComparator());
        System.out.println(p);

        p.sort(new NameComparator());
        System.out.println(p);
    }
}