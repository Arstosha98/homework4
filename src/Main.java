public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int temperature = -1;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        int age = 23;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int ageChild = 11;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + " , то ему нельзя кататься на аттракционе");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + " , то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + " , то ему можно кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        int sittingPlace = 102;
        if (sittingPlace >= 1 && sittingPlace <= 60) {
            System.out.println("Если ваше место " + sittingPlace + " ,то ваше место сидячее");
        }
        if (sittingPlace > 60 && sittingPlace <= 102) {
            System.out.println("Если ваше место " + sittingPlace + " ,то ваше место стоячее");
        } else {
            System.out.println("Если ваше место " + sittingPlace + " ,то мест для вас в вагоне нет");
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three ) {
            System.out.println("Большее число " + one);
        } else if (two > one && two > three){
            System.out.println("Большее число " + two);
        } else {
            System.out.println("Большее число " + three);
        }
    }
}