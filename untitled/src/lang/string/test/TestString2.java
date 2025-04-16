package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int length = 0;
        for(int i = 0; i < 5; i ++) {
            System.out.println(arr[i] + ":" + arr[i].length());
            length += arr[i].length();
        }
        System.out.println("sum = " + length);
    }
}
