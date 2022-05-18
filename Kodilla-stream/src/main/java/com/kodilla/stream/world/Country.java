package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal peoplequantity;

    public Country(BigDecimal peoplequantity) {
        this.peoplequantity = peoplequantity;
    }

    public BigDecimal getPeoplequantity() {
        return peoplequantity;
    }
}
