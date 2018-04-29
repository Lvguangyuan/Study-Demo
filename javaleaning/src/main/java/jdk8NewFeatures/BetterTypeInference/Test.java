package jdk8NewFeatures.BetterTypeInference;

public class Test {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.t = "aaaa";
        fruit.inpsect(123);
    }
}
