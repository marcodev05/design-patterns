package com.patterns.creations.builder;

public class Burger {
    private String size;
    private boolean egg;

    private boolean extracCheese;

    private boolean mayonese;

    private boolean onion;

    private boolean lettuce;

    private Burger(BurgerBuilder burgerBuilder) {
        // Initialize fields or add validations
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isEgg() {
        return egg;
    }

    public void setEgg(boolean egg) {
        this.egg = egg;
    }

    public boolean isExtracCheese() {
        return extracCheese;
    }

    public void setExtracCheese(boolean extracCheese) {
        this.extracCheese = extracCheese;
    }

    public boolean isMayonese() {
        return mayonese;
    }

    public void setMayonese(boolean mayonese) {
        this.mayonese = mayonese;
    }

    public boolean isOnion() {
        return onion;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public static class BurgerBuilder {
        private String size;
        private boolean egg;
        private boolean extracCheese;
        private boolean mayonese;
        private boolean onion;
        private boolean lettuce;

        public BurgerBuilder size(String size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder egg(boolean egg) {
            this.egg = egg;
            return this;
        }

        public BurgerBuilder extracCheese(boolean extracCheese) {
            this.extracCheese = extracCheese;
            return this;
        }

        public BurgerBuilder mayonese(boolean mayonese) {
            this.mayonese = mayonese;
            return this;
        }

        public BurgerBuilder onion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public BurgerBuilder lettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }
    }

}
