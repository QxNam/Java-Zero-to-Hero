package org.example.lesson_01;

public class Operators {
    static void main() {
        float hight = 1.55f;
        int weight = 42;
        float bmi;

        bmi = weight / (hight * hight);
        IO.println(String.format("BMI = %.2f", bmi));
        // output: BMI = 17.48

        if (bmi >= 40) {
            IO.println("Béo phì nghiêm trọng (Severe Obesity)");
        }
        else if (bmi >= 30) {
            IO.println("Béo phì (Obesity)");
        }
        else if (bmi >= 25) {
            IO.println("Thừa cân (Overweight)");
        }
        else if (bmi >= 18.5) {
            IO.println("Khoẻ mạnh (Healthy Weight)");
        }
        else {
            IO.println("Thiếu cân (Underweight)");
        }
        // output: Thiếu cân (Underweight)

    }
}
