package com.epam.patterns.creational.abstractFactory;

class BusinessLunchPack {
    private FirstDish firstDish1;
    private FirstDish firstDish2;
    private SecondDish secondDish1;
    private SecondDish secondDish2;
    private Desert desert1;
    private Desert desert2;
    private Desert desert3;

    public BusinessLunchPack(FirstDish firstDish1, SecondDish secondDish1, Desert desert1) {
        this.firstDish1 = firstDish1;
        this.secondDish1 = secondDish1;
        this.desert1 = desert1;
    }

    private BusinessLunchPack(PackBuilder builder) {
        this.firstDish1 = builder.firstDish1;
        this.firstDish2 = builder.firstDish2;
        this.secondDish1 = builder.secondDish1;
        this.secondDish2 = builder.secondDish2;
        this.desert1 = builder.desert1;
        this.desert2 = builder.desert2;
        this.desert3 = builder.desert3;
    }

    public static class PackBuilder{
        private FirstDish firstDish1;
        private FirstDish firstDish2;
        private SecondDish secondDish1;
        private SecondDish secondDish2;
        private Desert desert1;
        private Desert desert2;
        private Desert desert3;

        public PackBuilder(FirstDish firstDish1, SecondDish secondDish1, Desert desert1) {
            this.firstDish1 = firstDish1;
            this.secondDish1 = secondDish1;
            this.desert1 = desert1;
        }

        public PackBuilder setFirstDish2(FirstDish firstDish2) {
            this.firstDish2 = firstDish2;
            return this;
        }

        public PackBuilder setSecondDish2(SecondDish secondDish2) {
            this.secondDish2 = secondDish2;
            return this;
        }

        public PackBuilder setDesert2(Desert desert2) {
            this.desert2 = desert2;
            return this;
        }

        public PackBuilder setDesert3(Desert desert3) {
            this.desert3 = desert3;
            return this;
        }

        public BusinessLunchPack build(){
            return new BusinessLunchPack(this);
        }
    }

    @Override
    public String toString() {
        return "BusinessLunchPack{" +
                "firstDish1=" + firstDish1 +
                ", firstDish2=" + firstDish2 +
                ", secondDish1=" + secondDish1 +
                ", secondDish2=" + secondDish2 +
                ", desert1=" + desert1 +
                ", desert2=" + desert2 +
                ", desert3=" + desert3 +
                '}';
    }
}
