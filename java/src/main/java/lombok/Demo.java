package lombok;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<TestBuilder> testBuilders = new ArrayList<>();

        testBuilders.add(TestBuilder.builder().name("Sunny").age(21).build());
        testBuilders.add(TestBuilder.builder().name("Fancy").age(25).build());

        System.out.println(testBuilders);

        List<TestBuilder> newTestBuilders = new ArrayList<>();
        for (TestBuilder testBuilder : testBuilders) {
            testBuilder.setAge(40);
        }

        System.out.println(testBuilders);
    }

}
