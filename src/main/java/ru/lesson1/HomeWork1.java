package ru.lesson1;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println(calculate(2,3,2,1));
        System.out.println(between10and20(7,15));
        isNegativeOrPositive(7);
        System.out.println(isNegative(-5));
        name("Андрей");
        leapYear(1988);

    }
    public static float calculate (float a , float b , float c, float d ){

            return a * (b + (c / d));

    }
    public static boolean between10and20 (int x , int y){
        int sum = x + y;
        if ( sum >= 10 & sum <= 20) return true;
        else return false;

    }
    public static void isNegativeOrPositive (int r){
        if (r >= 0 )
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }
    public static boolean isNegative(int q){
        if (q < 0 ) return true;
        else return false;
    }
    public static void name(String name){
        System.out.println("Привет" + ", " + name + "!");
    }
    public static void leapYear ( int year) {
        if (!(year % 4 == 0 ) || (( year % 100 == 0) && !(year % 400 ==0)))
            System.out.println(year + " " + "год не високосный");
        else System.out.println(year + " " + " високосный год");

    }

}
