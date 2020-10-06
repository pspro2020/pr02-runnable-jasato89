package pr2.jasato;

public class Pow implements Runnable {

    private final double number;

    Pow(double number) {
        this.number = number;
    }


    @Override
    public void run() {
        for (double i = 1; i <=10; i++) {
            System.out.printf("%s: %.0f ^ %.0f = %.0f\n", Thread.currentThread().getName(), number, i, Math.pow(number, i));
        }


    }
}
