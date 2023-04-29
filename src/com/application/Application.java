package com.application;

import java.util.List;

import com.domain.Cart;
import com.domain.Product;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product product = new Product("Apple Pencil");
        cart.add(product);

        System.out.println("Cart = " + cart);
        List<Product> products = cart.getProducts();

        System.out.println("----------------------------------------");
        System.out.println("products = " + products);
        System.out.println("----------------------------------------");

    }
}
