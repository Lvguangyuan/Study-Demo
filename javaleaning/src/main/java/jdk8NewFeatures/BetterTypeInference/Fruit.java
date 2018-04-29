package jdk8NewFeatures.BetterTypeInference;

public class Fruit<T> {

    T t;

    <U> void inpsect(U u) {
        System.out.println("U: "+u.getClass().getName());
        System.out.println("T: "+t.getClass().getName());
    }

    public T getWeight() {
        return t;
    }

    public void setWeight(T weight) {
        this.t = t;
    }
}

class Apple extends Fruit {

}

class Orange extends Fruit {

}
