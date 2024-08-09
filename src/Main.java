import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("\t\t\t***Добро пожаловать в конвертер валют***");
        System.out.println("Не забывайте при вводе чисел с плавающей точкой ставить знак \",\"\n");
        System.out.println("Введите сумму в российских рублях:");

        double rub = new Scanner(System.in).nextDouble();

        System.out.println("Введите актуальный курс доллара: ");
        double dol = new Scanner(System.in).nextDouble();

        System.out.println("Введите актуальный курс евро: ");
        double eur = new Scanner(System.in).nextDouble();


        System.out.println("В долларах: " + (rub * dol));
        System.out.println("В евро: " + (rub * eur));
    }

}
