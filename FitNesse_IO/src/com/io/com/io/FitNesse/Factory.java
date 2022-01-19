package com.io.com.io.FitNesse;

public class Factory {

    public static Product createProduct(String name, float value, Integer quantity) {

            try {

                return new Product( name, value, quantity);
            }
            catch(IllegalArgumentException e) {


            }

            return null;
    }
}
