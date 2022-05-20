package _12_map.bai_tap.array_list.utils;

import _12_map.bai_tap.array_list.model.Product;

import java.util.Comparator;

public class SortProductsDescending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() > o2.getPrice()) {
            return -1;
        } else {
            return 1;
        }
    }
}
