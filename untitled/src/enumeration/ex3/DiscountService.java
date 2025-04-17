package enumeration.ex3;


import static enumeration.ex3.Grade.*;
import static enumeration.ex3.Grade.BASIC;

public class DiscountService {

     public int discount(Grade classGrade, int price) {
        int discountPercent = 0;

        //x001
        if(classGrade == BASIC){
            discountPercent = 10;
        } else if (classGrade == GOLD) {//x002
            discountPercent = 20;
        } else if (classGrade == DIAMOND) {//x003
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }
        return price * discountPercent / 100;
    }
}
