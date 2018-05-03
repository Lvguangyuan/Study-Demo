package jdk8NewFeatures.InterfaceDefaultandStaticMethods;

public interface InterfaceA {

    void methodA();

    void methodB();

    default void methodC(){
        System.out.println("This is methodC.");
    }
}
