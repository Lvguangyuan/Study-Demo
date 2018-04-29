package jdk8NewFeatures.ComplierParameterNames;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterNames {

    public void methodA(int a) {

    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = ParameterNames.class.getMethod("methodA", int.class);
        for (final Parameter parameter:method.getParameters()) {
            System.out.println("parameter: "+parameter.getName());
        }
    }
}
