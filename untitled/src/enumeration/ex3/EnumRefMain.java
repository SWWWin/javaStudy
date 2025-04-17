package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + refvalue(Grade.BASIC));
        System.out.println("ref GOLD = " + refvalue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refvalue(Grade.DIAMOND));

    }

    private static String refvalue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
