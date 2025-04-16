package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        Double answer = 0.0;
        for(String i : array) {
            answer += Double.parseDouble(i);
        }

        System.out.println("sum = " + answer);
    }
}
