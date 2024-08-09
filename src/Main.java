import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t*** Welcome to calculator!***\n");

        System.out.println("Введите первое число: ");
        double firstNumber = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число: ");
        double secondNumber = new Scanner(System.in).nextDouble();

        System.out.println("Сумма двух чисел:\n" + firstNumber + "+" + secondNumber + "="
                + (firstNumber + secondNumber) );
        System.out.println("Разность двух чисел:\n" + firstNumber + "-" + secondNumber + "="
                + (firstNumber - secondNumber) );
        System.out.println("Частное двух чисел:\n" + firstNumber + "/" + secondNumber + "="
                + (firstNumber / secondNumber) + "\n");

        System.out.println("\t\t\t***Программа заверщена***");
    }
}
