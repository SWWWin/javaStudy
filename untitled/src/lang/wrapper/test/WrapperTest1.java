package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";
        Integer i1 = Integer.parseInt(str1);
        Integer i2 = Integer.parseInt(str2);
        int answer = i1 + i2;
        System.out.println("두 수의 합: " + answer);
    }
}
