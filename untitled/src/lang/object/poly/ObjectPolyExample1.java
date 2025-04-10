package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();


        Object o = dog;


        action(dog);
        action(car);
    }

    private static  void action(Object obj) {
        //obj.sound(); //컴파일 오류, Ojbect는 sound가 없다
        //obj.move(); //컴파일 오류, Object는 move()가 없다

        //객체에 맞는 다운캐스팅이 필요
        if (obj instanceof  Dog dog) {
            ((Dog)obj).sound();//dog.sound()와 동일
        } else if( obj instanceof Car car) {
            car.move();
        }
    }
}
