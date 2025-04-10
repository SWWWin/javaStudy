package lang.object;

public class ObjectMain {
//psvm: 메인 클래스 만들어 줌
    public static void main(String[] args) {
        Child child =  new Child();
        child.childMethod();;
        child.parentMethod();


        //toString()은 Object 클래스의 매서드
        String string = child.toString(); //객체에 대한 정보 제공
        System.out.println(string);
    }
}
