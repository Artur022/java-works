public class Main {

    public static void main(String[] args) {

        System.out.println("Calculate for dauns...");
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        int step = Integer.valueOf(args[2]);
        int sum = first + second;

        System.out.println("+: " + first + " + " + second + " = " + sum);

        int minus = first - second;
        System.out.println("-: " + first + " - " + second + " = " + minus);

        int umn = first * second;
        System.out.println("*: " + first + " * " + second + " = " + umn);

        float div = first / second;
        System.out.println("/: " + first + " / " + second + " = " + div);

        int stp = Stepen(first,step);
        System.out.println("^: " + first + "^" + step + " = " + stp);


    }

    public static int Stepen(int a, int b) {

        int first = a;
        int stpn = b;
        int result = first;
        for (int i = 1; i<stpn; i++){
            result = result * first;
        }
        return result;
    }

}
