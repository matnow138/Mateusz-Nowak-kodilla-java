package com.kodilla.patterns.builder.bigmac;

public class Bun {
    public static final String BUN_WITH_SESAME = "Bun with sesame";
    public static final String BUN_WITHOUT_SESAME = "Bun without sesame";
    public static final String ROLL = "Roll";
    private final String bun;

    public Bun(String bun) {
        if (bun.equals(BUN_WITH_SESAME) || bun.equals(BUN_WITHOUT_SESAME) || bun.equals(ROLL)) {
            this.bun = bun;
        } else {
            throw new IllegalStateException("You need to choose bun!");
        }
    }

    public String getBun() {
        return bun;
    }

    public String toString() {
        return bun;
    }

}

