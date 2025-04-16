package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4,"Java")
                .delete(4,8)
                .reverse()
                .toString();
//        sb.append("A");
//        sb.append("B");
//        sb.append("C");
//        sb.append("D");
//        System.out.println("sb = " + sb);
//
//        sb.insert(4,"Java");
//        System.out.println("insert = " + sb);
//
//        sb.delete(4,8);
//        System.out.println("delete = " + sb);
//
//        sb.reverse();
//        System.out.println("reverse = " + sb);
//
//        //StringBuilder - > String
//        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
