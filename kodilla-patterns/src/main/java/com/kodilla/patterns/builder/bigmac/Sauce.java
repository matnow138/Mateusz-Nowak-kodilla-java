package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    public static final String STANDARD = "Standard";
    public static final String ISLAND_SAUCE = "1000 Island sauce";
    public static final String BARBECUE = "Barbecue";
    public static final String NO_SAUCE = "No sauce";

    private final String sauce;

    public Sauce(String sauce) {
        if (sauce.equals(STANDARD) || sauce.equals(ISLAND_SAUCE) || sauce.equals(BARBECUE) || sauce.equals(NO_SAUCE)) {
            this.sauce = sauce;
        } else {
            throw new IllegalStateException("Please choose correct option for sauce");
        }
    }

    public String getSauce() {
        return sauce;
    }

    public String toString() {
        return sauce;
    }
}
