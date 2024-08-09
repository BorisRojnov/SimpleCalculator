import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("\t\t\t***Добро пожаловать в конвертер валют***");
        System.out.println("Введите сумму в российских рублях:");

        double rub = new Scanner(System.in).nextDouble();


        System.out.println("В долларах: " + (rub * 0.012));
        System.out.println("В евро: " + (rub * 0.011));
    }

}
