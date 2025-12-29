package org.example.lesson_02;

public class ControlStructure {
    static void condition(int count) {
        if (count > 2) {
            IO.println("Count is higher than 2");
        } else {
            IO.println("Count is lower or equal than 2");
        }
    }

    static void ternary(int count) {
        IO.println(count > 2 ? "Count is higher than 2" : "Count is lower or equal than 2");
    }

    static void switch_number() {
        int count = 3;
        switch (count) {
            case 0:
                System.out.println("Count is equal to 0");
                break;
            case 1:
                System.out.println("Count is equal to 1");
                break;
            default:
                System.out.println("Count is either negative, or higher than 1");
                break;
        }
    }

    static int for_loop(){
        int tong = 0;
        for (int i = 1; i <= 10; i++) {
            tong += i;
        }
        return tong;
    }

    static int while_loop() {
        double eps = 0.01;
        float total = 1;
        int count = 0;
        while (total > eps) {
            total /= 2;
            count += 1;
        }
        return count;
    }

    static void break_test() {
        int count = 10;
        while (count > 6){
            IO.println("Lap lan " + count);
            count -= 1;
        }
    }

    static void continue_test() {
        for (int i=1; i<11; i++) {
            if (i%2 == 0) {
                IO.println(i);
            }
        }
    }

    static void main() {
        int count = 10; // Define it here
        condition(count);
        ternary(count);
        switch_number();
        IO.println("Tong la:" + for_loop());
        IO.println("So lan lap:" + while_loop());
        break_test();
        continue_test();
    }
}
