public class Calculator {

    /* Свойство хранящее результат операции */
    private int result;

    /* Операция сложения */
    public void add (int a, int b) {
            this.result = a+b;
    }

    /* Операция вычитания */
    public void minus (int a, int b) {
        this.result = a-b;
    }

    /* Операция умножения */
    public void umnoz (int a, int b) {
            this.result = a*b;
    }

    /* Операция деления */
    public void div (int a, int b) {
            this.result = a/b;
    }

    /* Возведение в степень */
    public void mStpn (int a, int b) {
            this.result = Stepen(a,b);
    }

    /* Метод возведения числа A в степень B. Можно вместо нее использовать Math.Power*/
    public static int Stepen(int a, int b) {

        int first = a;
        int stpn = b;
        int result = first;
        for (int i = 1; i<stpn; i++){
            result = result * first;
        }
        return result;
    }

    /* Метод получения результата */
    public int getResult() {
        return this.result;
    }

    /* Метод для очисткики резульатата */
    public void cleanResult() {
        this.result = 0;
    }
}
