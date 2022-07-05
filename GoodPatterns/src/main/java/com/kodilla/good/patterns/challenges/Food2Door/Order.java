package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Producer> producers = new ArrayList<>();



    public void addProducer(Producer producer) {
        producers.add(producer);
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

    public List<Producer> getProducers() {
        return producers;
    }
}
