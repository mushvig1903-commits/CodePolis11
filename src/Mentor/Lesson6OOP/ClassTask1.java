package Mentor.Lesson6OOP;

public class ClassTask1 {
    static void main(String[] args) {
        // Multi Dimesional Arrays
        // Data_Type [][] variables = new Data_Type[][];

        int [][] arrays = new int[3][3];
//        for (int i =0; i< arrays.length; i++){
//            for (int j = 0; j<arrays[i].length; j++){
//                System.out.printf("Elemenet [%d][%d]", i, j);
//            }
//            System.out.println();
//        }
        //int [] ar = new int[4];

        for (int[] arr : arrays){
            for (int arr1 :  arr ){
                System.out.print(arr1 + " ");
            }
            System.out.println();
        }







    }
}
