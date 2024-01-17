package Exercise1;

// Составить алгоритм: если введенное число больше 7, то вывести “Привет”


import java.util.Scanner;

public class MainClassFromExerciseOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scan.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}
