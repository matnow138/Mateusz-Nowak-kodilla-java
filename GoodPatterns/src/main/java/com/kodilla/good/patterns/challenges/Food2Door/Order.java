package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Producer> producers = new ArrayList<>();



    public void addProducer(String name) {
        producers.add(new Producer(name));
    }

    public int getIndex(String producerName) {
        for (int i = 0; i <= producers.size(); i++) {
            Producer producer = producers.get(i);
            if (producerName.equals(producer.getName())) {
                return i;
            }
        }
        return -2;
    }

    public void addProducts(String producerName) {
        int index = getIndex(producerName);
        producers.get(index).addProducts("Apple", 6);
        producers.get(index).addProducts("Orange", 5);
    }

    public List<Producer> getProducers() {
        return producers;
    }
}
