package lang.immutable.address;

public class ImmutableAddress {
    private final String value; //값을 생상한 뒤에는 바꾸는 게 불가능

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
