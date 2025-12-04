package Mentor.Lesson5;

import java.nio.Buffer;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class arrayScanner {
    static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int[] balanslar = {10,20,30,10,30,20,40,50,60,70,80,90,100,120,130,140};
        List<Integer> finalList = new ArrayList<>();
        Random rand = new Random();

        for (int i=0; i < 2000; i++){
            //1-den 100-e qeder edeleri tekrarla
            //List<Integer> temp = new ArrayList<>();
            //for (int j = 1; j <= 100; j++){
                //temp.add(j);
            int randomNumber = rand.nextInt(100) + 1; // 1-dən 100-ə qədər
            finalList.add(randomNumber);
            }
            //Random qarishdirir
            //Collections.shuffle(temp, rand);
            //Final Siyahiya elave et
            //finalList.addAll(temp);
        System.out.println("Final siyahının ölçüsü: " + finalList.size());

        Scanner sc = new Scanner(System.in);
        System.out.println("Liste 1-100-e qeder random ededler toplusu var!");
        System.out.println("Rəqəmləri daxil edin: ");
        //İstifadəçidən hədəf rəqəmi daxil etməsini istəyirik
        int reqem = sc.nextInt();
        //Massivi dövr edərək hədəf rəqəmin neçə dəfə təkrarlandığını hesablayırıq
        int say = 0;
        for (int k = 0; k < finalList.size(); k++){
            if (finalList.get(k) == reqem){
                say++;
            }
        }
        //System.out.println("Bu reqem " + say + " defe tekrarlanir " );
        System.out.println("Bu " + reqem + " reqem siyahida " + say + " defe tekrarlanir.");





    }
}

