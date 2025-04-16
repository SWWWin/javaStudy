package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int ex = str.indexOf(ext);

        System.out.println("finename = " + str.substring(0, ex));
        System.out.println("extName = " + str.substring(ex));
    }
}
