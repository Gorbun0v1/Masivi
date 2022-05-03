public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы ч.1");
        // Объявите три массива:
        //
        //1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        //    - Подсказка
        //
        //        ```java
        //        //объявление массива из 12-ти элементов, заполненного нулями
        //
        //        int [] weight = new int [12];
        //        ```
        //
        //2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        //    - Подсказка
        //
        //        ```java
        //        //объявление целочисленного массива, заполненного 12 элементами
        //
        //        int [] weight = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
        //        ```
        //
        //3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        System.out.println("Задание 1.");
        int[] three = new int[3];
        three[0] = 1;
        three[1] = 2;
        three[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(three[i]);
        }
        double[] drob = {1.57, 7.654, 9.986};
        drob[0] = 1.57;
        drob[1] = 7.654;
        drob[2] = 9.986;
        for (int i = 0; i < drob.length; i++) {
            System.out.println(drob[i]);
        }
        int[] OP = new int[2];
        OP[1] = 2;
        OP[0] = 3;
        System.out.println(OP[0]);
        System.out.println(OP[1]);
        System.out.println("Задание №2");
        System.out.println(three[0] + ", " + three[1] + ", " + three[2]);
        System.out.println(drob[0] + ", " + drob[1] + ", " + drob[2]);
        System.out.println(OP[0] + ", " + OP[1]);
        System.out.println("Задание №3");
        System.out.println(three[2] + ", " + three[1] + ", " + three[0]);
        System.out.println(drob[2] + ", " + drob[1] + ", " + drob[0]);
        System.out.println(OP[1] + ", " + OP[0]);
        System.out.println("Задание №4");
        for (int i = 0; i < three.length; i++) {
            if (three[i] % 2 == 1){
                three[i] = three[i] + 1;
            }
            System.out.println(three[i]);
        }

    }
}