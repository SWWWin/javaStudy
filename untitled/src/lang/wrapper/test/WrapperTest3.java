package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        //String -> Integer
        Integer changeInt1 = Integer.parseInt(str);

        //Integer -> int
        int toInt = changeInt1.intValue();

        //int -> Integer
        Integer changeInt2 = Integer.valueOf(toInt);

        System.out.println("integer1 = " + changeInt1);
        System.out.println("intValue = " + toInt);
        System.out.println("integer2 = " + changeInt2);
    }
}
