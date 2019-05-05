public class Calculator {

    private int result;

    /* + */
    public void add (int a, int b) {
            this.result = a+b;
    }

    /* - */

    public void minus (int a, int b) {
        this.result = a-b;
    }

    /* * */

    public void umnoz (int a, int b) {
            this.result = a*b;
    }

    /* / */

    public void div (int a, int b) {
            this.result = a/b;
    }

    /* ^ */

    public void mStpn (int a, int b) {
            this.result = Stepen(a,b);
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


    public int getResult() {
        return this.result;
    }

    public void cleanResult() {
        this.result = 0;
    }
}
