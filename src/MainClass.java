import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите выражение [x +-*/ 'x'], [x + x + x]");
        String userInput = scanner.nextLine();
        //длины инпута должны быть 3 || 5

        try {
            String[] symbols = userInput.split(" ");
            //Проверка на длину инпута
            if (symbols.length == 0 || symbols.length > 5) {
                throw new CalcException("More values than expected");
            }

            if (symbols.length == 3) {
                //Метод Парсинга чисел
                int a = InputCheck.NumCheck(symbols[0]);
                int b = InputCheck.NumCheck(symbols[2]);
                //Метод Вычисления
                System.out.println(Calculator.CalcTwoNumbers(a, b, symbols[1]));



            } else if (symbols.length == 5) {
                //Метод Парсинга чисел
                int a = InputCheck.NumCheck(symbols[0]);
                int b = InputCheck.NumCheck(symbols[2]);
                int c = InputCheck.NumCheck(symbols[4]);
                //Метод Вычисления
                System.out.println(Calculator.doCalcThreeNumbers(a,b,c,symbols[1],symbols[3]));

            } else {
                throw new CalcException("Wrong Input");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
