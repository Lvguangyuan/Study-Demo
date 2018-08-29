package lombok;

@Builder
@Getter
@ToString
public class TestBuilder {

    private String name;
    @Setter(AccessLevel.PACKAGE) private int age;

}
