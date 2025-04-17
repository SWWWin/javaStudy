package enumeration.ex2;


public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        //x001
        if(classGrade == ClassGrade.BASIC){
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {//x002
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {//x003
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }
        return price * discountPercent / 100;
    }
}
