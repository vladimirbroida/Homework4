//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен, " + age + " то  он совершеннолетний");


        } else {
            System.out.println("Если возраст человека равен, " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
        //задача 2
        int streetTemp = 0;
        if (streetTemp < 5) {
            System.out.println("На улице " + streetTemp + " градусов,нужно надеть шапку");
        } else {
            System.out.println("На улице " + streetTemp + " градусов,можно идти без шапки");


        }
        //задача 3
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость, " + speed + " то  придется заплатить штраф");
        } else {
            System.out.println("Если скорость, " + speed + " то можно ездить спокойно");
        }
        //задача 4
        int age2 = 106;
        if (age2 > 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен, " + age2 + " то ему нужно ходить в детский сад");
        }
        if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен, " + age2 + " то ему нужно ходить в школу");
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен, " + age2 + " то ему нужно ходить в университет");
        }
        if (age2 > 24) {
            System.out.println("Если возраст человека равен, " + age2 + " то ему нужно ходить на работу");
        }
        //задача 5
        int age3 = 15;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен, " + age3 + " то ему нельзя кататься на аттракционе");
        }
        if (age3 >= 5 && age3 <= 14) {
            System.out.println("Если возраст ребенка равен, " + age3 + " то ему можно кататься на аттракционе в сопровождении ");

        } else {
            System.out.println("Если возраст ребенка равен, " + age3 + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        //задача 6
        int passangers = 70;
        if (passangers < 60) {
            System.out.println("Sits avaliable");

        } else if (passangers >= 60 && passangers <= 102) {
            System.out.println("Standing places avaliable");
        } else {
            System.out.println("Train is full");
        }
        //задача 7
        int one = 10;
        int two = 20;
        int three = 30;
        if (one > two && one > three) {
            System.out.println("One - самое большое число");
        }
        if (two > one && two > three) {
            System.out.println("Two - самое большое число ");
        } else {
            System.out.println("Three - самое большое число");
        }
    }
}