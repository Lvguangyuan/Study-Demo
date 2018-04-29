package jdk8NewFeatures.InterfaceDefaultandStaticMethods;

public class TestA implements InterfaceA {
    public void methodA() {

    }

    public void methodB() {

    }

    public static void main(String[] args) {
        TestA testA = new TestA();
        testA.methodC();
    }
}
