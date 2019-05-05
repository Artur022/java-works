import java.util.Scanner;

public class InteractRunner {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        try {
            Calculator calc = new Calculator();
            String exit = "no";
            String fSave = "no";
            while (!exit.equals("yes")) {

                System.out.println("Hello! It is Calculator for DCP Peoples v2.0");
                System.out.println("Enter first arg : ");
                Integer first = Integer.valueOf(reader.next());

                while (!fSave.equals("yes")) {
                    System.out.println("Enter second arg : ");
                    Integer second = Integer.valueOf(reader.next());
                    System.out.println("Select operation +,-,*,/,^");
                    String operation = reader.next();

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
                        default:
                            System.out.println("Error operation! This operation is not found! Try again or close select 'yes' for exit!");
                            break;
                    }

                    System.out.println("Result : " + first + operation + second + " = " + calc.getResult());
                    System.out.println("Save last result? yes/no");
                    String save = reader.next();
                    if (save.equals("yes")) {
                        System.out.println("Save last result!");
                        first = calc.getResult();
                        calc.cleanResult();
                    }
                }

                System.out.println("exit yes/no");
                exit = reader.next();

            }
        } finally {
            reader.close();
        }

    }

}
