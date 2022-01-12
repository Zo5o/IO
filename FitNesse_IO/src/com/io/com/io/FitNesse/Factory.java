package com.io.com.io.FitNesse;

public class Factory {

    public static Product createProduct(Integer id, String name, float value, Integer quantity) {

            try {

                return new Product(id, name, value, quantity);
            }
            catch(IllegalArgumentException e) {


            }

            return null;
    }
}
