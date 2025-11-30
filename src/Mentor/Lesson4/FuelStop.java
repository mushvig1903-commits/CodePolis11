package Mentor.Lesson4;

import java.util.Scanner;

public class FuelStop {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("YDM-siz yanaq vurun ");

        int depo = 20;
        while (true){
            int fuel = sc.nextInt();
            depo = depo+fuel;
            System.out.println("Sizin yanacaq ceniniz " +depo+ " L");
            if (depo>=80){
                System.out.println("Yanacaq hədəfə çatdı. Səfərə davam! hazirda yanacaginiz" + depo + "L");
                break;
            } else {
                System.out.println("Yanacaq yenə də azdır. Növbəti məntəqəyə gedirik.. ");
            }
        }
    }
}
