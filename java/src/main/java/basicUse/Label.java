package basicUse;

public class Label {


    public static void main(String[] args) {


        labelOne:
        for (int i = 1; i < 5; i++) {
            labelTwo:
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if(i==j && i==k) {
                        System.out.print("     ");
                        break labelTwo;
                    }
                    System.out.print(""+i+j+k+"  ");
                }
                System.out.println("Second loop end");
            }
            System.out.println("First loop end");
        }


    }



}
