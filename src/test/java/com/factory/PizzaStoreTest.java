package com.factory;

import org.junit.Test;

public class PizzaStoreTest {


    @Test
    public void test() {
        Store store = new PizzaStore(new VeggiePizzaFactory());
        store.orderPizza();

    }
}