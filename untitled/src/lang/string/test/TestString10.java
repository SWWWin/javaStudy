package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] farr = fruits.split(",");

        for(String a : farr) {
            System.out.println(a);
        }

        String joinarr = String.join("->", farr);
        System.out.println("joinedString = " + joinarr);
    }
}
