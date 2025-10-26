package krsnaSolved;

import java.util.Scanner;

public class viewsYT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long views = scanner.nextLong();
        veiwsPrinter(views);
    }

    private static void veiwsPrinter(long views) {
        if(views > 0 && views < 1000){
            System.out.println(views);
        } else if (views >= 1000 && views <= 9999) {
            views = views / 100;
            if(views % 10 == 0){
                long v = views / 10;
                System.out.println(v +"k");
            }
            else{
                double f = views / 10.0;
                System.out.println(f + "k");
            }
        } else if (views >= 100000000 && views <= 999999999) {
            double v = views / 1000000.0;
            if (v % 1 == 0) {
                System.out.println((long)v + "M");
            } else {
                System.out.println(Math.round(v * 10.0) / 10.0 + "M");
            }
        }
    }
}
