/* Импорт модуля для работы Scanner'a */
import java.util.Scanner;

public class InteractRunner {

    /* Главный метод main */
    public static void main(String[] args) {

        /* Создание объекта класса Scanner */
        Scanner reader = new Scanner(System.in);


        try {

            /* Создание объекта класса Calculator */
            Calculator calc = new Calculator();

            /* Инициализация псевдо-флагов для контроля сохранения результата и выхода из программы*/
            String exit = "no";
            String fSave = "no";

            /* Цикл, пока пользователь не сказал заканчивать */
            while (!exit.equals("yes")) {

                System.out.println("Hello! It is Calculator for DCP Peoples v2.0");

                /* Спрашиваем и запоминаем первый аргумент операции */
                System.out.println("Enter first arg : ");
                Integer first = Integer.valueOf(reader.next());

                /* Цикл, пока пользователь не указал, чтобы НЕ сохранять результат */
                while (!fSave.equals("yes")) {

                    /* Спрашиваем и запоминаем второй аргумент */
                    System.out.println("Enter second arg : ");
                    Integer second = Integer.valueOf(reader.next());

                    /* Спрашиваем и запоминаем действие операции */
                    System.out.println("Select operation +,-,*,/,^");
                    String operation = reader.next();

                    /* Выбор нужной операции */
                    switch (operation) {
                        case "+":
                            calc.add(first,second);
                            break;
                        case "-":
                            calc.minus(first,second);
                            break;
                        case "*":
                            calc.umnoz(first,second);
                            break;
                        case "/":
                            calc.div(first,second);
                            break;
                        case "^":
                            calc.mStpn(first,second);
                            break;
                        /* На случай, если пользователь указал несуществующую операцию */
                        default:
                            System.out.println("Error operation! This operation is not found! Try again or close select 'yes' for exit!");
                            break;
                    }

                    /* Формируем результатирующую строку */
                    System.out.println("Result : " + first + operation + second + " = " + calc.getResult());

                    /* Спрашиваем нужно ли запоминать результат */
                    System.out.println("Save last result? yes/no");
                    String save = reader.next();

                    /* Запоминаем последний результат, если пользователь ответил "yes" */
                    if (save.equals("yes")) {
                        System.out.println("Save last result...");

                        /* Запоминаем последний результат в переменную First для дальнейшего использования */
                        first = calc.getResult();

                        /* Чистим свойство результата */
                        calc.cleanResult();
                    }
                }

                /* Спрашиваем выходить или нет */
                System.out.println("exit yes/no");
                exit = reader.next();

            }
        } finally {
            /* Закрываем Reader */
            reader.close();
        }

    }

}
