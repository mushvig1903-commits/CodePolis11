package week1;

public class task5 {
    public static void main(String[] args) {
        //İnstagram Filter AI
//        Filter gücünü hesablayan mini proqram yazın:
//
//        - brightness → int
//        - contrast → int
//        - filterName → String
//                - isPremium → boolean
//
//        Əgər `isPremium = true → contrast + 20` olsun
//
//        Əks halda contrast olduğu kimi qalsın.
        String filterName = "Rainbow";
        System.out.println("Applied Filter:" + filterName);
        int brigthness = 40;
        System.out.println("Brigthness Level: " + brigthness);
        int contrast =  30;
        System.out.println("Contrast Level: " + contrast);
        boolean isPremium = true;
        if (isPremium == true){
            contrast += 20;
        } else {
            System.out.println(contrast);
        }
        System.out.println ("New Contrast Level: " + contrast);
        System.out.println("Is Premium User?: " + isPremium);
    }
}
